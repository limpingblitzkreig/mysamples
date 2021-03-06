import java.util.*;
import com.bea.security.*;
import weblogic.security.principal.*;
import javax.security.auth.*;
import java.security.*;
import oracle.security.jps.openaz.pep.*;
import org.openliberty.openaz.azapi.pep.*;

public class HelloOESworld {

   public static void main(String[] args) {

      // user initiating Authorization request
      Principal p = new WLSUserImpl("weblogic");

      Subject user = new Subject();
      user.getPrincipals().add(p);

      // Resource being accessed AppName/ResourceType/ResouceName
      String resourceString = "test/assets/pdfs";

      // Action initiated by the user
      String action = "access";

      // Environmental/Context attributes
      Map<String, String> env = new HashMap<String, String>();
      env.put("l", "London");
      while (true)
      {
         try {
            // get Authorization response from OES
            PepResponse response =
                PepRequestFactoryImpl.getPepRequestFactory()
                        .newPepRequest(
                                user,
                                action,
                                resourceString,
                                env).decide();

            System.out.println("Request: {weblogic, " + action + ", "
                     + resourceString
                     + "} \nResult: " + response.allowed());

         } catch (PepException e) {
            System.out.println("***** Caught exception: "
                                + e.getMessage());
            e.printStackTrace();
            System.exit(1);
         }

         System.out.println("sleeping 5 sec. Hit Ctrl-C to quit\n");

         try {
            Thread.currentThread().sleep(5000);
         } catch (Exception e) {}
      }
   };
};


