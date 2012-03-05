package oracle.iam.examples.adfsecurity.beans;

import java.io.Serializable;

import oracle.iam.authzpolicydefn.api.FeatureManagerConstants;
import oracle.iam.identity.usermgmt.api.UserManagerConstants;
import oracle.iam.platform.Platform;
import oracle.iam.platform.authz.api.AuthorizationResult;
import oracle.iam.platform.authz.api.AuthorizationService;
import oracle.iam.platform.context.ContextManager;

public class OESSecurityExampleBean implements Serializable {
    private String loggedInUserKey;
    private transient AuthorizationService authorizationService;
    private boolean hasCreateUserPrivilege;

    // Generic utility method to check if the currently logged
    // in user has access to an Feature/Action combination

    private boolean privilegeCheck(String featureId, String actionId) {
        AuthorizationResult authzResult =
            getAuthorizationService().hasAccess(getLoggedInUserKey(),
                                                featureId, actionId);

        return authzResult.isAllowed();
    }

    // Helper method to find the currently logged in user

    private String getLoggedInUserKey() {
        if (loggedInUserKey == null) {
            loggedInUserKey =
                    (String)ContextManager.getUserPreference(ContextManager.USERDETAILS.KEY.getKey());
        }

        return loggedInUserKey;
    }

    private AuthorizationService getAuthorizationService() {
        if (authorizationService == null) {
            authorizationService =
                    Platform.getService(AuthorizationService.class);
        }

        return authorizationService;
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
        hasCreateUserPrivilege = privilegeCheck(FeatureManagerConstants.Features.USER_MGMT.getId(),
                                 UserManagerConstants.Privilege.CREATE.getId());
        return hasCreateUserPrivilege;
    }
}
