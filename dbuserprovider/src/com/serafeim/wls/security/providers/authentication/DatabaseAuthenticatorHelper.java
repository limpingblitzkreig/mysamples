package com.serafeim.wls.security.providers.authentication;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.util.Enumeration;

import java.util.StringTokenizer;


import weblogic.logging.NonCatalogLogger;

import weblogic.management.utils.NotFoundException;

import weblogic.security.providers.authentication.CustomDBMSAuthenticatorMBean;


/**
 * Database helper functions. Essentially, it tries to connect to the database using
 * the submitted username/password.
 */
public class DatabaseAuthenticatorHelper {
    /**
     * Instance logger.
     */
    private NonCatalogLogger logger = new NonCatalogLogger("DBUSERSEC");

    /**
     * Database URL to check for database user existence.
     */
    private String dbURL;

    /**
     * Constructor.
     * @param mbean
     */
    public DatabaseAuthenticatorHelper(DBUserAuthenticatorMBean mbean) {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());            
        }
        catch (Exception exc) {
            logger.error("Cannot instantiate Oracle driver.", exc);
        }

        dbURL = ((DBUserAuthenticatorMBean)mbean).getDbURL();
        logger.info("DB URL for dbuser authentication was set to:" + dbURL);
    }


    /**
     * Not used.
     * @param userName
     * @return
     */
    public boolean userExists(String userName) {
        return true;
    }

    /**
     * Not used.
     * @param userName
     * @return
     * @throws NotFoundException
     */
    public String getUserPassword(String userName) throws NotFoundException {
        return null;
    }

    /**
     * Not used.
     * @param userName
     * @return
     */
    public Enumeration getUserGroups(String userName) {
        return new StringTokenizer("");
    }


    /**
     * Test connectivity to an Oracle instance.
     * @param username is the db schema to connect.
     * @param password is the schema password.
     * @param jdbcURL is the JDBC URL connectivity details.
     * @throws Exception in case of error or no connection.
     */
    public void testConnection(String username, String password,
                               String jdbcURL) throws Exception {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(jdbcURL, username, password);
        } catch (Exception e) {
            throw e; // Re-throw exception.
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException sqle) {
                    logger.warning("Error in closing database connection.",
                                   sqle);
                }
            }
        }
    }

    /**
     * Verify connectivity to the database using the submitted username and password.
     * @param userName is the submitted username.
     * @param password is the submitted password.
     * @return an indication whether the connection was successful or not.
     */
    public boolean verifyUser(String userName, String password) {
        boolean result = false;
        try {
            testConnection(userName, password, dbURL);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("DBUserAuthenticator:Verifying user:" + userName +
                    "\t password:" + password + " at jdbc url:" + dbURL +
                    ".Result:" + result);
        return result;
    }
}
