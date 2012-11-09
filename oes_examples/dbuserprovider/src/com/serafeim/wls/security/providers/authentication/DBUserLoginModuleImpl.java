package com.serafeim.wls.security.providers.authentication;


import java.io.IOException;

import java.util.Enumeration;
import java.util.Map;
import java.util.Vector;

import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;

import weblogic.logging.NonCatalogLogger;

import weblogic.security.principal.WLSGroupImpl;
import weblogic.security.principal.WLSUserImpl;


/**
 * This is a login module for database users. It is based on the
 * simple sample authenticator's login module implementation of BEA.<br>
 *
 * For more info of the original implementation refer to sample code center
 * of Oracle->Weblogic->S224.
 *
 *
 * @author Serafeim Karapatis (serafeim.karapatis@gmail.com)
 */
final public class DBUserLoginModuleImpl implements LoginModule {
    /**
     * Instance logger.
     */
    private NonCatalogLogger logger = new NonCatalogLogger("DBUSERSEC");

    private Subject subject; // the subject for this login
    private CallbackHandler callbackHandler; // where to get user names, passwords, ... for this login
    private DatabaseAuthenticatorHelper database; // manages the user and group definitions for this provider
    private boolean isIdentityAssertion; // are we in authentication or identity assertion mode?

    // Authentication status
    private boolean loginSucceeded; // have we successfully logged in?
    private boolean principalsInSubject; // did we add principals to the subject?
    private Vector principalsForSubject =
        new Vector(); // if so, what principals did we add to the subject
    // (so we can remove the principals we added if the login is aborted)

    /**
     * Initialize a login attempt.
     *
     * @param subject the Subject this login attempt will populate.
     *
     * @param callbackHandler the CallbackHandler that can be used to
     * get the user name, and in authentication mode, the user's password
     *
     * @param sharedState A Map containing data shared between login
     * modules when there are multiple authenticators configured.  This
     * simple sample does not use this parameter.
     *
     * @param options A Map containing options that the authenticator's
     * authentication provider impl wants to pass to its login module impl.
     * For example, it can be used to pass in configuration data (where
     * is the database holding user and group info) and to pass in whether
     * the login module is used for authentication or to complete identity
     * assertion.
     * The SimpleSampleAuthenticationProviderImpl adds an option named "database".
     * The value is a DatabaseAuthenticatorUtil object.  It gives the
     * login module access to the user and group definitions.
     * When the authenticator is being used in identity assertion mode,
     * the SimpleSampleAuthenticationProviderImpl also adds an option named
     * "IdentityAssertion".  It indicates that the login module should only
     * verify that the user exists (vs. checking the password too).  If
     * this option is not specified (or is set to false), then the
     * login module checks the user's password too (that is, it assumes
     * authentication mode).
     */
    public void initialize(Subject subject, CallbackHandler callbackHandler,
                           Map sharedState, Map options) {
        // only called (once!) after the constructor and before login

        logger.debug("DBUserLoginModuleImpl.initialize");
        this.subject = subject;
        this.callbackHandler = callbackHandler;

        // Determine if we're in identity assertion or authentication mode
        isIdentityAssertion =
                "true".equalsIgnoreCase((String)options.get("IdentityAssertion"));

        // Get the object that manages the user and group definitions
        database = (DatabaseAuthenticatorHelper)options.get("database");
    }

    /**
     * Attempt to login.
     *
     * If we're in authentication mode, extract the user name and password
     * from the callback handler.  If the user exists and the password matches,
     * then populate the subject with the user and the user's group.  Otherwise,
     * the login fails.
     *
     * If we're in identity assertion mode, extract the user name (only)
     * from the callback handler.  If the user exists, then populate the
     * subject with the user and the user's groups.  Otherwise, the
     * login fails.
     *
     * @return A boolean indicating whether or not the login for
     * this login module succeeded.
     */
    public boolean login() throws LoginException {
        // only called (once!) after initialize

        logger.debug("DBUserLoginModuleImpl.login");

        // loginSucceeded      should be false
        // principalsInSubject should be false

        // Call a method to get the callbacks.
        // For authentication mode, it will have one for the
        // username and one for the password.
        // For identity assertion mode, it will have one for
        // the user name.
        Callback[] callbacks = getCallbacks();

        // Get the user name.
        String userName = getUserName(callbacks);

        if (userName.length() > 0) {
            // We have a user name

            boolean success = database.verifyUser(userName, getPasswordHave(userName, callbacks));
            if (! success) {
                throwFailedLoginException("Authentication Failed: User " +
                                          userName + " doesn't exist or invalid password.");
            }
        }
        loginSucceeded = true;
        // since the login succeeded, add the user and its groups to the
        // list of principals we want to add to the subject.
        principalsForSubject.add(new WLSUserImpl(userName));
        addGroupsForSubject(userName);
        logger.info("Result of login:" + loginSucceeded);
        return loginSucceeded;
    }

    /**
     * Completes the login by adding the user and the user's groups
     * to the subject.
     *
     * @return A boolean indicating whether or not the commit succeeded.
     */
    public boolean commit() throws LoginException {
        // only called (once!) after login

        // loginSucceeded      should be true or false
        // principalsInSubject should be false
        // user  should be null if !loginSucceeded, null or not-null otherwise
        // group should be null if user == null,    null or not-null otherwise

        logger.debug("DBUserLoginModule.commit");
        if (loginSucceeded) {
            // put the user and the user's groups (computed during the
            // login method and stored in the principalsForSubject object)
            // into the subject.
            subject.getPrincipals().addAll(principalsForSubject);
            principalsInSubject = true;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Aborts the login attempt.  Remove any principals we put
     * into the subject during the commit method from the subject.
     *
     * @return A boolean indicating whether or not the abort succeeded.
     */
    public boolean abort() throws LoginException {
        // only called (once!) after login or commit
        // or may be? called (n times) after abort

        // loginSucceeded should be true or false
        // principalsInSubject should be false if user is null, otherwise true or false

        logger.debug("DBUserLoginModuleImpl.abort");
        if (principalsInSubject) {
            subject.getPrincipals().removeAll(principalsForSubject);
            principalsInSubject = false;
        }
        return true;
    }

    /**
     * Logout.  This should never be called.
     *
     * @return A boolean indicating whether or not the logout succeeded.
     */
    public boolean logout() throws LoginException {
        // should never be called
        logger.debug("DBUserLoginModuleImpl.logout");
        return true;
    }

    /**
     * Throw an invalid login exception.
     *
     * @param msg A String containing the text of the LoginException.
     *
     * @throws LoginException
     */
    private void throwLoginException(String msg) throws LoginException {
        logger.warning("Throwing LoginException(" + msg + ")");
        throw new LoginException(msg);
    }

    /**
     * Throws a failed login excception.
     *
     * @param msg A String containing the text of the FailedLoginException.
     *
     * @throws LoginException
     */
    private void throwFailedLoginException(String msg) throws FailedLoginException {
        logger.warning("Throwing FailedLoginException(" + msg + ")");
        throw new FailedLoginException(msg);
    }

    /**
     * Get the list of callbacks needed by the login module.
     *
     * @return The array of Callback objects by the login module.
     * Returns one for the user name and password if in authentication mode.
     * Returns one for the user name if in identity assertion mode.
     */
    private Callback[] getCallbacks() throws LoginException {
        if (callbackHandler == null) {
            throwLoginException("No CallbackHandler Specified");
        }

        if (database == null) {
            throwLoginException("database not specified");
        }

        Callback[] callbacks;
        if (isIdentityAssertion) {
            callbacks = new Callback[1]; // need one for the user name
        } else {
            callbacks =
                    new Callback[2]; // need one for the user name and one for the password

            // add in the password callback
            callbacks[1] = new PasswordCallback("password: ", false);
        }

        // add in the user name callback
        callbacks[0] = new NameCallback("username: ");

        // Call the callback handler, who in turn, calls back to the
        // callback objects, handing them the user name and password.
        // These callback objects hold onto the user name and password.
        // The login module retrieves the user name and password from them later.
        try {
            callbackHandler.handle(callbacks);
        } catch (IOException e) {
            throw new LoginException(e.toString());
        } catch (UnsupportedCallbackException e) {
            throwLoginException(e.toString() + " " +
                                e.getCallback().toString());
        }

        return callbacks;
    }

    /**
     * Get the user name from the callbacks (that the callback handler
     * has already handed the user name to).
     *
     * @param callbacks The array of Callback objects used by this login module.
     * The first in the list must be the user name callback object.
     *
     * @return A String containing the user name (from the user name callback object)
     */
    private String getUserName(Callback[] callbacks) throws LoginException {
        String userName = ((NameCallback)callbacks[0]).getName();
        if (userName == null) {
            throwLoginException("Username not supplied.");
        }
        logger.info("\tuserName\t= " + userName);
        return userName;
    }

    /**
     * Add the user's groups to the list of principals to be added to the subject.
     *
     * @param userName A String containing the user name the user's name.
     */
    private void addGroupsForSubject(String userName) {
        // Get the user's list of groups (recursively - so, if user1 is a member
        // of group1 and group1 is a member of group2, then it returns group1 and
        // group2).  Iterate over the groups, adding each to the list of principals
        // to add to the subject.
        for (Enumeration e = database.getUserGroups(userName);
             e.hasMoreElements(); ) {
            String groupName = (String)e.nextElement();
            logger.info("\tgroupName\t= " + groupName);
            principalsForSubject.add(new WLSGroupImpl(groupName));
        }
    }

    /**
     * Get the password from the callbacks (that the callback handler
     * has already handed the password to) - that is, the password from
     * the login attempt.  Must only be used for authentication mode, not
     * for identity assertion mode.
     *
     * @param userName A String containing the name of the user
     * (already retrieved from the callbacks).  Only passed in
     * so that we can print a better error message if the password
     * is bogus.
     *
     * @param callbacks The array of Callback objects used by this login module.
     * The second in the list must be the password callback object.
     *
     * @return A String containing the password from the login attempt
     *
     * @throws LoginException if no password was supplied in the login attempt.
     */
    private String getPasswordHave(String userName,
                                   Callback[] callbacks) throws LoginException {
        PasswordCallback passwordCallback = (PasswordCallback)callbacks[1];
        char[] password = passwordCallback.getPassword();
        passwordCallback.clearPassword();
        if (password == null || password.length < 1) {
            throwLoginException("Authentication Failed: User " + userName +
                                ".  Password not supplied");
        }
        String passwd = new String(password);
        logger.info("\tpasswordHave\t= " + passwd);
        return passwd;
    }
}
