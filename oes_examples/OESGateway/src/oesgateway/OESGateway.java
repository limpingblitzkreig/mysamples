package oesgateway;

import com.sun.jersey.api.Responses;

//import com.sun.jersey.json.impl.provider.entity.JSONArrayProvider;

import java.net.URLDecoder;

import java.util.Collections;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

// OES
import java.util.Map;

import java.security.Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import java.util.Set;

import javax.security.auth.Subject;

import javax.ws.rs.PathParam;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MultivaluedMap;

import javax.ws.rs.core.Response;

import oracle.security.idm.Identity;
import oracle.security.idm.IdentityStore;
import oracle.security.idm.ObjectNotFoundException;
import oracle.security.idm.Role;
import oracle.security.idm.RoleManager;
import oracle.security.idm.SearchParameters;
import oracle.security.idm.SearchResponse;
import oracle.security.idm.SimpleSearchFilter;
import oracle.security.idm.UserProfile;
import oracle.security.jps.JpsContext;
import oracle.security.jps.JpsContextFactory;
import oracle.security.jps.JpsException;
import oracle.security.jps.internal.idstore.ldap.LdapIdentityStore;
import oracle.security.jps.openaz.pep.PepRequestFactoryImpl;

import oracle.security.jps.service.idstore.IdentityStoreService;
import oracle.security.jps.soap.stub.pd.client.Status;

//import org.codehaus.jettison.json.JSONArray;

import org.openliberty.openaz.azapi.pep.Obligation;
import org.openliberty.openaz.azapi.pep.PepException;
import org.openliberty.openaz.azapi.pep.PepResponse;

import weblogic.security.principal.WLSUserImpl;
import weblogic.security.principal.WLSGroupImpl;


//OES

/** This class implements the server side of a sample REST interface to call an OES Security Module.<br><br>
 * 
 * It will process an incoming http GET for a URI as follows:
 * <ul>
 * <li>the last element of the path is taken to be the <i>action</i></li>
 * <li>the path from the context root to the action is taken to be the <i>Resource</i></li>
 * <li>the user is assumed to be passsed as a query attribute with name  <i>user</i></li>
 * <li>all other query attributes are passed on to OES as the context.  
 * Any multi-value query parameters values are concatenated with ';' in order to form one String value</li>
 * <li>the isAllowed() method calls in to OES for an authorization decision and to recover any relevant obligations.</li>
 * </ul>
 * So for example to ask whether user <i>weblogic</i> with attributes <i>level=4</i> and
 * <i>location=Grenoble</i> can write to the resource <i>HelloOesResource/MyResourceType/MyResource</i> you would
 * access the URL <i>http://machine_name:port/oesgateway/HelloOesResource/MyResourceType/MyResource/write?user=weblogic&level=4&location=Grenoble</i>
 * <br><br>
 * The value returned from isAllowed() is a String representation of the decision and any obligations concatenated together.
 * For example:
 * <ul><li>[true]</li>
 * <li>[false]</li>
 * <li>[true, [TableContrainsts, [scott.emp, (sal<2000), scott.dept, (loc='DALLAS' or loc='CHIGAGO')]]]</li>
 * </ul>
 * Representing the data as a String makes it easy to pass back to the client and then for the client to pass it
 * on, for example to a database stored procedure.  To complete this we should also implement some custom classes to pass the data
 * back in a structured manner.
 * <br><br>
 * The sayHello() method does not call OES, it is for pinging the OESGateway for testing purposes.
 * <br><br>
 * One difficulty here is to create a suitable object of type Subject containing all the Principals assigned
 * to the user whose authorization we are querying for.  Typically if we are querying on behalf of the
 * currently logged in user then we use the weblogic.security.Security.getCurrentSubject() method.  However
 * the OESGateway needs to recover a valid subject for an arbitrary user.  we can do this by querying the WLS
 * Identity store and recovering the assigned WLS groups.  The code for this is in the getSubjectWithRoles()
 * method.  Note the mandatory use of WLSUserImpl() and WLSGroupImpl() to build the subject.
 * 
 * @author      Rob Byrne
 * @version     0.2                         
 */@Path("/")
public class OESGateway {
  @Context
  private UriInfo context;

  public OESGateway() {
  }

  // Specifies that the method processes HTTP GET requests

  @GET
  @Path("sayHello")
  @Produces("text/plain")
  public String sayHello() {
    return "Hello World!";
  }

  // Specifies that the method processes HTTP GET requests

  @GET
  @Path("sayHelloWithName")
  @Produces("text/plain")
  public String sayHelloWithName(@QueryParam("name")
    String name) {
    return "Hello " + name + "!";
  }

  // Specifies that the method processes HTTP GET requests
  /* @GET
  @Path("sayHelloWithNamesJSON")
  @Produces("application/json")
  public JSONArray sayHelloWithNamesJSON(@Context UriInfo ui) {

    // Get all the non 'name' query parameters into a Map for
    // passing in as the context to OES
    MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
    System.out.println(queryParams);

    Map contextMap = new HashMap();
    contextMap = multivaluedMapToMap(queryParams);
    List a = mapToList(contextMap);
    JSONArray ja = new JSONArray(a);
    System.out.println(contextMap);

    return ja;
  }*/

  @GET
  @Path("sayHelloWithNames")
  @Produces("text/plain")
  public String sayHelloWithNames(@Context
    UriInfo ui) {

    // Get all the non 'name' query parameters into a Map for
    // passing in as the context to OES
    MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
    System.out.println(queryParams);

    Map contextMap = new HashMap();
    contextMap = multivaluedMapToMap(queryParams);
    System.out.println(contextMap);

    return "Hello " + contextMap.toString() + "!";
  }

  //OES
  // Specifies that the method processes HTTP GET requests

  @GET
  @Path("{resource:.*}/{action}")
  @Produces("text/plain")
  public String isAllowed(@PathParam("resource")
    String resource, @PathParam("action")
    String action, @QueryParam("user")
    String user, @Context
    UriInfo ui) throws WebApplicationException {

    String retCode = "false";
    ArrayList retList = new ArrayList();
    retList.add(retCode);

    // Validate the input params: if any error log it but we fail safely, returning 'false'
    String paramCheck = paramsInvalid(resource, action, user);
    if ( paramCheck!= null && paramCheck.length()>0) {
      System.out.println("OESGateway: error in parameters: " + paramCheck + ".  Will not call on to OES.");
      return (retList.toString());
    }

    System.out.println("OESGateway: isAllowed():user=" + user + " resource=" + resource + " action=" + action);
                                                                                                         
    // Get all the non 'name' query parameters into a Map for
    // passing in as the context to OES
    MultivaluedMap<String, String> queryParams = ui.getQueryParameters();
    System.out.println("OESGateway:context attributes:" + queryParams);
    queryParams.remove("user"); // 'user' as a query name is reserved for the user name.

    Map contextMap = new HashMap();
    contextMap = multivaluedMapToMap(queryParams);
    //System.out.println(contextMap);

    // user initiating Authorization request
    /*Principal p = new WLSUserImpl(user);
    Set<Principal> principals = subject.getPrincipals().add(p);
    System.out.println("Retriving principals for user:" + user + " (" + principals.size() + ")");
    Iterator it = principals.iterator();
    while( it.hasNext()){
          Principal pi = (Principal)it.next();   
    }*/
    
    Subject subject = getSubjectWithRoles(user);
    Set<Principal> principals = subject.getPrincipals();
    System.out.println("OESGateway: Showing principals for user:" + user + " (" + principals.size() + ")");
    Iterator it = principals.iterator();
    while( it.hasNext()){
            Principal pi = (Principal)it.next();   
            System.out.println("  principal:" + pi.getName());
    }
    
    // Resource being accessed AppName/ResourceType/ResouceName
    String _resourceString = resource;

    // Action initiated by the user
    String _action = action;

    // Environmental/Context attributes

    try {
      // get Authorization response from OES
      PepResponse response =
        PepRequestFactoryImpl.getPepRequestFactory().newPepRequest(subject,
                                                                   _action,
                                                                   _resourceString,
                                                                   contextMap).decide();

      System.out.println("OESGateway: Response from OES for request: {" + user + ", " + action + ", " +
                         resource + "} \n  Result: " + response.allowed());

      retCode = Boolean.toString(response.allowed());
      retList.set(0, retCode);
      Map<String, Obligation> obligations = response.getObligations();

      if (obligations != null && obligations.size() > 0) {
        System.out.println("OESGateway: Raw Obligations: " + response.getObligations());
        obligationsToList(obligations, retList);

      } else {
        System.out.println("OESGateway: No Obligations");
      }

    } catch (PepException e) {
      System.out.println("OESGateway: ***** Caught exception: " + e.getMessage());
      //e.printStackTrace();
    }

    System.out.println("OESGateway: result:" + retList);
    return (retList.toString());

  }

  private List mapToList(Map m) {

    Set keys = m.keySet();
    Iterator it = keys.iterator();

    ArrayList a = new ArrayList();
    while (it.hasNext()) {

      String key = (String)it.next();
      String value = (String)m.get(key);

      a.add(key);
      a.add(value);
    }
    return (a);
  }
  //OES

  private String paramsInvalid(String resource, String action, String user) {
    String retCode = "";

    if (resource == null || resource.length() == 0) {
      retCode += "invalid 'resource' parameter:" + quoteString(resource);
    }
    if (action == null || action.length() == 0) {
      retCode += "invalid 'action' parameter:" + quoteString(action);
    }
    if (user == null || user.length() == 0) {
      retCode += "invalid 'user' parameter: " + quoteString(user);
    }

    return (retCode);
  }
  
  private String quoteString(String s){
    return("'" + s + "'");
  }

  private Map multivaluedMapToMap(MultivaluedMap<String, String> queryParams) {
    Map m = new HashMap();

    Set<String> keys = queryParams.keySet();
    Iterator it = keys.iterator();
    while (it.hasNext()) {
      String key = (String)it.next();
      List l = queryParams.get(key);
      if (l == null || l.size() == 0) {
        ;
      } else if (l.size() == 1) {
        m.put(key, l.get(0));
      } else if (l.size() > 1) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < l.size()) {
          sb.append(l.get(i) + ";");
          i++;
        }
        sb.deleteCharAt(sb.length() - 1);
        m.put(key, sb.toString());
      }

    }
    return (m);
  }

  private void obligationsToList(Map<String, Obligation> obligations,
                                 List retList) {

    if (null != obligations) {

      int i = 0;
      for (String name : obligations.keySet()) {
        ArrayList strs = new ArrayList();
        Obligation o = obligations.get(name);
        Map<String, String> valuesMap = o.getStringValues();

        //System.out.println("name = " + name + ", values = " + valuesMap);

        strs.add(name);
        strs.add(mapToList(obligations.get(name).getStringValues()));

        retList.add(strs);

        //System.out.println("Cooked Obligations: " + retList);
        i++;
      }
    }
  }
  
  /** Build a subject which we can pass to the OES PEP API that contains all the Principals for
     * this user.
     * Note:
     * <ul>
     * <li>that if we don't use WLSUserImpl() and WLSGroupImpl() to create the principals
     * then OES does not seem to take them into account.
     * </li>
     * <li>in order to be able to reference the id store as we do below then the appropriate
     * config needs to be in place in the managed server's jps-config.xml file.  For a WLS SM
     * managed server this seems to be missing and we needed to add it:
     * <serviceProvider type="IDENTITY_STORE" name="idstore.ldap.provider" class="oracle.security.jps.internal.idstore.ldap.LdapIdentityStoreProvider">             <description>LDAP-based IdentityStore Provider</description>
     * </serviceProvider>
     *
     * <serviceInstance name="idstore.ldap" provider="idstore.ldap.provider">
     * <property name="idstore.config.provider" value="oracle.security.jps.wls.internal.idstore.WlsLdapIdStoreConfigProvider"/>
     * <property name="CONNECTION_POOL_CLASS" value="oracle.security.idm.providers.stdldap.JNDIPool"/>
     * </serviceInstance>
     *
     * <serviceInstanceRef ref="idstore.ldap"/>
     * </li>
     * <li> The javadoc for the OPSS User/Role API is here:
     * http://docs.oracle.com/cd/E15523_01/core.1111/e10043/apreferences.htm
     * </li>
     * </ul>
     * @param user
     * @return
     */
  protected Subject getSubjectWithRoles(String user ){
      Subject retSubject = new Subject();
      if (user.equalsIgnoreCase("anonymous")){
          retSubject.getPrincipals().add(new WLSUserImpl("anonymous"));
      } else {
      try {
          
          JpsContextFactory ctxFactory = JpsContextFactory.getContextFactory();
          JpsContext ctx = ctxFactory.getContext();
          LdapIdentityStore idstoreService = (LdapIdentityStore)ctx.getServiceInstance(IdentityStoreService.class);
          IdentityStore idStore = idstoreService.getIdmStore();
          
          //Find the user we are interested in
          java.security.Principal userPrincipal = null;
          System.out.println("OESGateway: Searching WLS Identity Store for the user:" + user);
          SimpleSearchFilter simplefilter = idStore.getSimpleSearchFilter(
                      UserProfile.USER_NAME, SimpleSearchFilter.TYPE_EQUAL, user);
          SearchParameters params =
                      new SearchParameters(simplefilter, SearchParameters.SEARCH_USERS_ONLY);
          try{
              SearchResponse sr = idStore.searchProfiles(params);
               while (sr.hasNext()) {
                      Identity id = sr.next();
                      UserProfile profile = (UserProfile)id;
                      String userId = profile.getUserID();
                      System.out.println("  Found user " + userId);
                      userPrincipal = id.getPrincipal();
                      // Here, we must use WLSUserImpl() to build the Principal otherwise
                      // OES does not recognize it.
                      retSubject.getPrincipals().add(new WLSUserImpl(id.getPrincipal().getName()));
              }
          }catch(Exception ex) {
             System.out.println("Got exception searching for user") ;
          }
          //
              
          RoleManager roleManager = idStore.getRoleManager();
          SearchResponse grantedRoles = null;
          try{
              System.out.println("OESGateway: Retrieving granted WLS roles for user " + userPrincipal.getName());
              grantedRoles = roleManager.getGrantedRoles(userPrincipal, false);
              while( grantedRoles.hasNext()){
                    Identity id = grantedRoles.next();
                    System.out.println("  disp name=" + id.getDisplayName() + 
                               " Name=" + id.getName() + 
                               " Principal=" + id.getPrincipal() + 
                               "Unique Name=" + id.getUniqueName());
                   // Here, we must use WLSGroupImpl() to build the Principal otherwise
                   // OES does not recognize it.
                    retSubject.getPrincipals().add(new WLSGroupImpl(id.getPrincipal().getName()));

               }
              
          }catch(Exception ex) {
              System.out.println("OESGateway: Error getting roles for user " + ex.getMessage());
              ex.printStackTrace();
              
          }
      }catch(Exception ex) {
          System.out.println("OESGateway: Got exception instantiating idstore reference");
      }
      }//if anonymous
        return(retSubject);
  }
  
}
