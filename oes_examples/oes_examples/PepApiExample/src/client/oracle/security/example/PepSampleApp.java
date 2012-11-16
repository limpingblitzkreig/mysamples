/* $Header: entsec/oes/examples/PepApiExample/src/client/oracle/security/example/PepSampleApp.java /entsec_11.1.1.4.0_dwg/1 2011/06/07 21:58:51 pichan Exp $ */

/* Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved. */

/*
   DESCRIPTION
    <short description of component this file declares/defines>

   PRIVATE CLASSES
    <list of private classes defined - with one-line descriptions>

   NOTES
    <other useful comments, qualifications, etc.>

   MODIFIED    (MM/DD/YY)
    pichan      04/25/11 - Creation
 */

/**
 *  @version $Header: PepSampleApp.java 25-apr-2011.13:57:40 pichan   Exp $
 *  @author pichan
 *  @since release specific (what release of product did this appear in)
 */

package oracle.security.example;

import java.util.*;

import org.openliberty.openaz.azapi.constants.PepRequestQueryType;
import org.openliberty.openaz.azapi.pep.*;
import com.bea.security.RuntimeAction;
import oracle.security.jps.openaz.pep.*;

import weblogic.security.principal.WLSUserImpl;
import weblogic.security.principal.WLSGroupImpl;


import javax.security.auth.Subject;

/**
 * PepSampleApp is a simple j2se application which demonstrates using PepApi for authorization decisions.
 * Please deploy PepSamplePolicy.ear to server first to provision the policy required for this application.
 */

public class PepSampleApp {

    private static final String APPLICATION_NAME = "PepSamplePolicy";
    private static final String RESOURCE_TYPE = "PepResourceType";
    private static final String RESOURCE_NAME = "PepResource";
    private static final String ACTION_READ = "read";
    private static final String ACTION_WRITE = "write";
    private static final String PEP_ATTR = "PepAttr";
    private static final String USER_NAME = "UserA";
    private static final String GROUP_NAME = "GroupA";
    // Resource being accessed AppName/ResourceType/ResouceName
    private static final String RESOURCE_STRING = APPLICATION_NAME + "/" + RESOURCE_TYPE + "/" + RESOURCE_NAME;

    private static Subject subject;
    private static PepRequestFactory pepFactory;

    public static void main(String[] args) throws Exception {
        System.out.println("Starting the PepApi Sample Application");
        PepSampleApp app = new PepSampleApp();
        app.run();
        System.exit(0);
    }


    @SuppressWarnings("unchecked")
    public void run() {
        // For simplicity, creates a Subject instead of doing authentication to obtain the Subject
        // Subject initiating Authorization request
        subject = new Subject();
        //add user and group to the Subject
        subject.getPrincipals().add(new WLSUserImpl(USER_NAME));
        subject.getPrincipals().add(new WLSGroupImpl(GROUP_NAME));
        System.out.println("PepSampleApp: subject: " + subject);

        pepFactory = PepRequestFactoryImpl.getPepRequestFactory();

        try {
            //sleep time is added for policy distribution to update the local policy cache
            Thread.sleep(30000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        test1();
        test2();
        test3();
        test4();

        System.out.println("PepSampleApp has completed.");
    }


    /*
     * Test if subject is authorized to access resource string with "read" action,
     * with "myAttr" set to "hello" in the environment.
     * Authorization result is expected to be true,
     * Obligation should be returned.
     */

    public void test1() {
        System.out.println("*** PepSampleApp: test1 begin *** ");

        try {
            Map<String, String> env = new HashMap<String, String>();
            env.put(PEP_ATTR, "hello");

            //Creates a PepRequest object by passing Subject, action, resource string and environment
            PepRequest pepRequest = pepFactory.newPepRequest(
                    subject,
                    ACTION_READ,
                    RESOURCE_STRING,
                    env);

            // Retrieves the PepResponse object
            PepResponse pepResponse = pepRequest.decide();

            //get obligations from PepResponse
            Map<String, Obligation> obligations = pepResponse.getObligations();

            //PepResponse.isAllowed() is expected to return true which means the authorization request is authorized
            System.out.println("PepSampleApp: PepResponse.isAllowed(): " + pepResponse.allowed());

            if (obligations != null) {
                for (String name : obligations.keySet()) {
                    System.out.println("obligation: name = " + name + ", values = " + obligations.get(name).getStringValues());
                }
                System.out.println("");
            }

        } catch (Exception e) {
            System.out.println("PepSampleApp.test1: Exception: " + e);
            e.printStackTrace();
        }
    }

    /*
    * Test if subject is authorized to access resource string with "read" action,
    * with "myAttr" set to "nothing" in the environment.
    * Authorization result is expected to be false because
    * the policy is granted with "myAttr" set to "hello"
    * Obligation should not be returned.
    * <p>
    */

    public void test2() {
        System.out.println("*** PepSampleApp: test2 begin  *** ");

        try {
            Map<String, String> env = new HashMap<String, String>();
            env.put(PEP_ATTR, "nothing");

            //Creates a PepRequest object by passing Subject, action, resource string and environment
            PepRequest pepRequest = pepFactory.newPepRequest(
                    subject,
                    ACTION_READ,
                    RESOURCE_STRING,
                    env);

            // Retrieves the PepResponse object
            PepResponse pepResponse = pepRequest.decide();

            //PepResponse.isAllowed() is expected to return false which means the authorization request is denied
            System.out.println("PepSampleApp: PepResponse.isAllowed() : " + pepResponse.allowed());

            Map<String, Obligation> obligations = pepResponse.getObligations();

            //obligations is expected to be null because authorization request is denied
            System.out.println("PepSampleApp: obligations: " + obligations);
            System.out.println("");

        } catch (Exception e) {
            System.out.println("PepSampleApp.test2: Exception: " + e);
            e.printStackTrace();
        }
    }

    /*
    * Test if subject is authorized to access resource string with "write" action,
    * with "myAttr" set to "hello" in the environment.
    * Authorization result is expected to be false because
    * the subject is granted with "read" action only.
    * Obligation should not be returned.
    */

    public void test3() {
        System.out.println("*** PepSampleApp: test3 begin  *** ");

        try {
            Map<String, String> env = new HashMap<String, String>();
            env.put(PEP_ATTR, "hello");

            //Creates a PepRequest object by passing Subject, action, resource string and environment            
            PepRequest pepRequest = pepFactory.newPepRequest(
                    subject,
                    ACTION_WRITE,
                    RESOURCE_STRING,
                    env);

            // Retrieves the PepResponse object
            PepResponse pepResponse = pepRequest.decide();

            //PepResponse.isAllowed() is expected to return false which means the authorization request is denied
            System.out.println("PepSampleApp: PepResponse.isAllowed() : " + pepResponse.allowed());
            Map<String, Obligation> obligations = pepResponse.getObligations();

            //obligations is expected to be null because authorization request is denied            
            System.out.println("PepSampleApp: obligations: " + obligations);
            System.out.println("");

        } catch (Exception e) {
            System.out.println("PepSampleApp.test3: Exception: " + e);
            e.printStackTrace();
        }
    }

    /*
     * A query request.
     * Granted action is expected to be "read", denied action is expected to be "write"
     */

    public void test4() {
        try {

            System.out.println("*** PepSampleApp: test4 (query request) begin  *** ");

            Map<String, String> env = new HashMap<String, String>();
            env.put(PEP_ATTR, "hello");

            /*
             * A query scope string has following definition:
             * resource = <resourceString>,actions = <actionString1, actionString2, actionString3>, searchscope = <immediate/children>
             * resourceString is required and the rest are optional, please refer to document for more details.
             * For simplicity of this example, scope contains only resource string. 
             */
            String scope = "resource=" + RESOURCE_STRING;
            System.out.println("PepSampleApp: query scope is: " + scope);

            //invoke newPepQueryRequest passing Subject, enviornment, scope and PepRequestQueryType 
            PepRequest pepRequest = pepFactory.newQueryPepRequest(subject, env, scope, PepRequestQueryType.VERBOSE);

            // Retrieves the PepResponse object
            PepResponse pepResponse = pepRequest.decide();
            pepResponse.next();

            //retrieve the list of actions from the PepResponse
            ArrayList arrayList = (ArrayList) pepResponse.getAction();
            List grantedActions = null;
            List deniedActions = null;

            if (arrayList != null) {
                //grantedActions is returned as the first element of the list
                grantedActions = (List) arrayList.get(0);
                //deniedActions is returned as the second element of the list
                deniedActions = (List) arrayList.get(1);
            }

            if (grantedActions != null) {
                Iterator iterator = grantedActions.iterator();
                while (iterator.hasNext()) {
                    System.out.println("PepSampleApp: granted action:  " + ((RuntimeAction) iterator.next()).getAction());

                }
            }

            if (grantedActions != null) {
                Iterator iterator = deniedActions.iterator();
                while (iterator.hasNext()) {
                    System.out.println("PepSampleApp: denied action:  " + ((RuntimeAction) iterator.next()).getAction());
                }
            }

            System.out.println("");
        } catch (Exception e) {
            System.out.println("PepSampleApp.test4: Exception: " + e);
            e.printStackTrace();
        }
    }


}
