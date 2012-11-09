package com.serafeim.wls.security.providers.authentication;


import java.util.HashMap;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag;

import weblogic.logging.NonCatalogLogger;

import weblogic.management.security.ProviderMBean;

import weblogic.security.provider.PrincipalValidatorImpl;
import weblogic.security.spi.AuthenticationProviderV2;
import weblogic.security.spi.IdentityAsserterV2;
import weblogic.security.spi.PrincipalValidator;
import weblogic.security.spi.SecurityServices;

import weblogic.security.principal.WLSGroupImpl;
import weblogic.security.principal.WLSUserImpl;

/**
 * The DBUserAuthentication provider implementation based on the 
 * simple sample authenticator's runtime implementation and performs
 * authentication based on the Oracle's database users dictionary.
 *
 * It also provides its own login module implementation
 * (DBUserLoginModuleImpl).
 *
 *
 * Rather than write its own principal and principal validator
 * implementations, it uses the standard weblogic ones:
 * - weblogic.security.principal.WLSGroupImpl
 * - weblogic.security.principal.WLSUserImpl
 * - weblogic.security.provider.PrincipalValidatorImpl
 *
 *
 * @author Serafeim Karapatis (serafeim.karapatis@gmail.com)
 */

public class DBUserAuthenticationProviderImpl implements AuthenticationProviderV2 {
    /**
     * Instance logger.
     */
    private NonCatalogLogger logger = new NonCatalogLogger("DBUSERSEC");

    private String description; // a description of this provider
    private DatabaseAuthenticatorHelper database; // manages the user and group definitions for this provider
    private LoginModuleControlFlag controlFlag; // how this provider's login module should be used during the JAAS login

    /**
     * Initialize the authenticator.
     *     *
     * @param mbean A ProviderMBean that holds the simple sample authenticator's
     * configuration data.  This mbean must be an instance of the
     * authenticator's mbean.
     *
     * @param services The SecurityServices gives access to the auditor
     * so that the provider can to post audit events.
     * The simple sample authenticator doesn't use this parameter.
     *
     * @see SecurityProvider
     */
    public void initialize(ProviderMBean mbean, SecurityServices services) {
        logger.debug("DBUserAuthenticationProviderImpl.initialize");

        // Cast the mbean from a generic ProviderMBean to a SimpleSampleAuthenticatorMBean.
        DBUserAuthenticatorMBean myMBean =
            (DBUserAuthenticatorMBean)mbean;

        // Set the description to the simple sample authenticator's mbean's description and version
        description = myMBean.getDescription() + "\n" +
                myMBean.getVersion();

        // Instantiate the helper that manages this provider's user and group definitions
        database = new DatabaseAuthenticatorHelper(myMBean);

        // Extract the JAAS control flag from the simple sample authenticator's mbean.
        // This flag controls how the simple sample authenticator's login module is used
        // by the JAAS login, both for authentication and for identity assertion.
        String flag = myMBean.getControlFlag();
        if (flag.equalsIgnoreCase("REQUIRED")) {
            controlFlag = LoginModuleControlFlag.REQUIRED;
        } else if (flag.equalsIgnoreCase("OPTIONAL")) {
            controlFlag = LoginModuleControlFlag.OPTIONAL;
        } else if (flag.equalsIgnoreCase("REQUISITE")) {
            controlFlag = LoginModuleControlFlag.REQUISITE;
        } else if (flag.equalsIgnoreCase("SUFFICIENT")) {
            controlFlag = LoginModuleControlFlag.SUFFICIENT;
        } else {
            throw new IllegalArgumentException("invalid flag value" + flag);
        }
    }

    /**
     * Get the authenticator's description.
     *
     * @return A String containing a brief description of the simple sample authenticator.
     *
     * @see SecurityProvider
     */
    public String getDescription() {
        return description;
    }

    /**
     * Shutdown the authenticator.
     *
     * A no-op.
     *
     * @see SecurityProvider
     */
    public void shutdown() {
        logger.debug("DBUserAuthenticationProviderImpl.shutdown");
    }

    /**
     * Create a JAAS AppConfigurationEntry (which tells JAAS
     * how to create the login module and how to use it).
     * This helper method is used both for authentication mode
     * and identity assertion mode.
     *
     * @param options A HashMap containing the options to pass to the
     * simple sample authenticator's login module.  This method adds the
     * "database helper" object to the options.  This allows the
     * login module to access the users and groups.
     *
     * @return An AppConfigurationEntry that tells JAAS how to use the 
     * authenticator's login module.
     */
    private AppConfigurationEntry getConfiguration(HashMap options) {
        // add the "database helper" object to the options so that the
        // login module can access the user and group definitions
        options.put("database", database);

        // make sure to specify the simple sample authenticator's login module
        // and to use the control flag from the simple sample authenticator's mbean.
        return new AppConfigurationEntry("com.serafeim.wls.security.providers.authentication.DBUserLoginModuleImpl",
                                         controlFlag, options);
    }

    /**
     * Create a JAAS AppConfigurationEntry (which tells JAAS
     * how to create the login module and how to use it) when
     * the authenticator is used to authenticate (vs. to
     * complete identity assertion).
     *
     * @return An AppConfigurationEntry that tells JAAS how to use the
     * authenticator's login module for authentication.
     */
    public AppConfigurationEntry getLoginModuleConfiguration() {
        // Don't pass in any special options.
        // By default, the simple sample authenticator's login module
        // will authenticate (by checking that the passwords match).
        HashMap options = new HashMap();
        return getConfiguration(options);
    }

    /**
     * Create a JAAS AppConfigurationEntry (which tells JAAS
     * how to create the login module and how to use it) when
     * the simple sample authenticator is used to complete identity
     * assertion (vs. to authenticate).
     *
     * @return An AppConfigurationEntry that tells JAAS how to use the 
     * authenticator's login module for identity assertion.
     */
    public AppConfigurationEntry getAssertionModuleConfiguration() {
        // Pass an option indicating that we're doing identity
        // assertion (vs. authentication) therefore the login module
        // should only check that the user exists (instead of checking
        // the password)
        HashMap options = new HashMap();
        options.put("IdentityAssertion", "true");
        return getConfiguration(options);
    }

    /**
     * Return the principal validator that can validate the
     * principals that the authenticator's login module
     * puts into the subject.
     *
     * Since the authenticator uses the built in
     * WLSUserImpl and WLSGroupImpl principal classes, just
     * returns the built in PrincipalValidatorImpl that knows
     * how to handle these kinds of principals.
     *
     * @return A PrincipalValidator that can validate the
     * principals that the simple sample authenticator's login module
     * puts in the subject.
     */
    public PrincipalValidator getPrincipalValidator() {
        return new PrincipalValidatorImpl();
    }

    /**
     * Returns this providers identity asserter object.
     *
     * @return null since the authenticator doesn't
     * support identity assertion (that is, mapping a token
     * to a user name).  Do not confuse this with using a
     * login module in identity assertion mode where the
     * login module shouldn't try to validate the user.
     */
    public IdentityAsserterV2 getIdentityAsserter() {
        return null;
    }
}


