package oesclient;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import java.util.ArrayList;


import javax.ws.rs.core.MultivaluedMap;
public class callauthservice {
    public callauthservice() {

    }
    /**
     * Simple GET on the hard coded resource http://192.168.2.128:9610/oesgateway/sayHello
     * that does not call in to OES (for testing).
     *
     * @return Returns the string returned when the 'sayHello' resource is accessed.
     */
    public static String sayHello() {

      Client c = Client.create();
      System.out.println("** OESClient.sayHello(): Simple GET request .... **");
      WebResource resource =
        c.resource("http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway/sayHello");
    //    http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway
      String response = resource.get(String.class);

      return (response);
    }

    /**
     * Simple GET on the resource built up from the parameters that will
     * call on to OES for an authorization check. 
     * 
     * The resource to access is constructed as follows: url + "/" + resource + "/" + action.
     * The user is passed in as a query parameter.  So the url we access looks like this, for example:
     * htp://192.168.2.128:9610/oesgateway/HelloOesWorld/MyResourceType/MyResource/write?user=weblogic
     *
     * @param user     the name of the user.          example: "weblogic"
     * @param url      the url to access the server.  example: "htp://192.168.2.128:9610/oesgateway"
     * @param resource the resource to access.        example: "HelloOesWorld/MyResourceType/MyResource"
     * @param action   the action to test for.        example: "write"
     * @param attrs    the context Map of attributes  example: [["level","4","5"],["speciality","Cardiology"]]
     * @return Returns the string returned when the 'sayHello' resource is accessed.
     */
    public static String isAllowed(String user, String url, String resource,
                                   String action, MultivaluedMap attrs) {

      String response = "NO RESPONSE";
      ArrayList responseList = new ArrayList();
      
      Client c = Client.create();
      System.out.println("** OESClient.isAllowed(): Simple GET on resource with user as a query param **");
      WebResource r = c.resource(url + "/" + resource + "/" + action);
        
      attrs.add("user", user);
      r= r.queryParams(attrs);
      System.out.println("URI "+ r.toString());
      //response = r.queryParams(attrs).get(String.class);
        response = r.get(String.class);
      return (response);
    }
    
    /**
     * Simple GET on the resource built up from the parameters that will
     * call on to OES for an authorization check that is easy to call from a stored procedure running
     * in a database.
     * 
     * This method is designed to be easy to call from the Oracle DB, as the context map is passed as an array of strings.
     * The array is a 'flattened' map wher each succeeding pair of elements represents the
     * (key,value) pair.  Otherwise it is the same as the isAllowed) method that takes the context as a MultiValuedMap.
     *
     * @param user     the name of the use.           example: "weblogic"
     * @param url      the url to access the server.  example: "htp://192.168.2.128:9610/oesgateway"
     * @param resource the resource to access.        example: "HelloOesWorld/MyResourceType/MyResource"
     * @param action   the action to test for.        example: "write"
     * @param attrs    the context attributes as a list example: ["level","4","speciality","Cardiology"]
     * @return Returns the string returned when the 'sayHello' resource is accessed.
     */
    public static String isAllowed(String user, String url,
                                  String resource,
                                  String action, java.sql.Array attrs) {

      String response = "NO RESPONSE";
      ArrayList responseList = new ArrayList();
      MultivaluedMap attrsMap;

      attrsMap = sqlArrayToMultivaluedMap(attrs);
      response = isAllowed(user,url,resource,action,attrsMap);
     
      return (response);
    }
    
    /**
     * Convert a java.sql.Array to a MultivaluedMap.
     *
     * The mapping is done be supposing that each pair of elements in the array
     * represents a (key,value) pair to be added to the MultivaluedMap.  So for example
     * ["level","4","speciality","Cardiology","speciality","ENT"] is converted to
     * [["level","4"],["speciality",["Cardiology","ENT"]].  <br><br>
     * 
     * If there are an odd numer of elements in the array we complete it with an empty string.
     *
     * @param attrs    the array of strings as a java.sql.Array with each pair representing
     * a (key,value) pair to be added to the map
     * @return Returns the MultivaluedMap
     */
    private static MultivaluedMap sqlArrayToMultivaluedMap(java.sql.Array attrs){
      
      MultivaluedMap retMap = new MultivaluedMapImpl();
      
      try {
        Object obj = attrs.getArray();
        String[] strArray = (String[])obj; // cast it to an array of String
        int i = 0;

        while (i < strArray.length) {
          String key = strArray[i];
          String value = "";
          if (i + 1 >= strArray.length) {
            System.out.println("Error: missing value for '" + key +
                               "' setting to empty string");
          } else {
            value = strArray[i + 1];
          }
          retMap.add(key, value);
          i+= 2;  // processing in pairs
        }
      } catch (Exception ex) {
        System.out.println("Error calling out to OES " + ex.getMessage());
      }

      return(retMap);
      
    }
    
    public static void main(String[] args) {

        
        System.out.println("Server sayHello() says: " + sayHello());
        
       MultivaluedMap attrs = new MultivaluedMapImpl();
       // attrs.add("level", "4");
       // attrs.add("speciality", "Cardiology");

        attrs.add("selectedorg","1775301");
      //  attrs.add("qtracks_dataentry","1775301");
     //   String user = "shetzel";
       // String user = "1054708";
           String  user = "1080062";
          //  String user = "1103587";
        String resource="CAP/cap/application/rfentr/portal/qtrack/result-form-online-activity-log/view-response-data";
        String privilege = "exec";
        String response = isAllowed(user,"http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway",
                        resource, privilege,attrs);
        System.out.println("Server isAllowed() says: " + response);
  //      System.out.println("Server isAllowed() says: " + isAllowed("weblogic","http://cappoes00.cap.org:5001/CapRestWebServicePOC/oesgateway",
 //                                    "HelloOesWorld/MyResourceType/MyResource", "write",attrs));

    }
}
