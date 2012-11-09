package oracle.iam.examples.adfsecurity.beans;
import java.util.*;
import com.bea.security.*;
import java.io.Serializable;
import oracle.security.jps.util.SubjectUtil;


import weblogic.security.*;
import weblogic.security.principal.*;
import javax.security.auth.*;

import oracle.security.jps.openaz.pep.*;
import org.openliberty.openaz.azapi.pep.*;
public class OESSecurityExamplePEPApi  implements Serializable {

        private boolean hasCreateUserPrivilege;

        // Generic utility method to check if the currently logged
        // in user has access to an Feature/Action combination

        private boolean privilegeCheck(String featureId, String actionId) {
          // user initiating Authorization request


          Subject user ;
          user = Security.getCurrentSubject();


          // Resource being accessed AppName/ResourceType/ResouceName
          String resourceString = featureId ;

          // Action initiated by the user
          String action = actionId;

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
                return response.allowed();        
             } catch (PepException e) {
                System.out.println("***** Caught exception: "
                                    + e.getMessage());
                e.printStackTrace();
                System.exit(1);
                
             }


          
        }
          
        }


        public void setHasCreateUserPrivilege(boolean hasCreateUserPrivilege) {
            this.hasCreateUserPrivilege = hasCreateUserPrivilege;
        }

        // Example method to check if the currently logged in user
        // has access to the Create privilege on the User Management feature
        //
        // Refer to oracle.iam.authzpolicydefn.api.FeatureManagerContants
        // for the full set of available OES permissions
        public boolean isHasCreateUserPrivilege() {
            hasCreateUserPrivilege = privilegeCheck("captestapp/button/approvebutton",
                                     "click");
            return hasCreateUserPrivilege;
        }
}
