
/* Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved. */

package oracle.security.jps.xacml.sample;

import com.bea.security.ssmws.service.*;
import com.bea.security.ssmws.types.IdentityAssertionType;
import com.bea.security.ssmws.types.PrincipalInfoType;
import com.bea.security.ssmws.types.PrincipalsInfoType;
import com.bea.security.ssmws.types.context.*;
import com.bea.security.ssmws.types.holders.ChallengeTypeHolder;
import com.bea.security.ssmws.types.holders.IdentityAssertionTypeHolder;
import com.bea.security.ssmws.types.policy.AttributeAssignmentType;
import com.bea.security.ssmws.types.policy.ObligationType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.apache.axis.message.MessageElement;
import org.apache.axis.message.Text;
import org.apache.axis.types.URI;
import org.w3.www._2001.XMLSchema.holders.StringArrayHolder;

public class XacmlSample {

        static final String XACML_NAMESPACE = "http://security.bea.com/ssmws/ssm-ws-1.0.wsdl#";
        static final String XML_STRING_TYPE = "http://www.w3.org/2001/XMLSchema#string";
        static final String XML_INTEGER_TYPE = "http://www.w3.org/2001/XMLSchema#integer";
        static final String ACTION_ID = "urn:oasis:names:tc:xacml:1.0:action:action-id";
        static final String RESOURCE_ID = "urn:oasis:names:tc:xacml:2.0:resource:resource-id";
        static final String SUBJECT_ID = "urn:oasis:names:tc:xacml:1.0:subject:subject-id";
        static final String OES_ASSERTION_TYPE = "OESIdentityAssertion";
        static final String OES_CREDENTIAL_ID = XACML_NAMESPACE + OES_ASSERTION_TYPE;
        static final String USER_PRINCIPAL_CLASS = "weblogic.security.principal.WLSUserImpl";
        static final String GROUP_PRINCIPAL_CLASS = "weblogic.security.principal.WLSGroupImpl";
        static final String ENV_ATTRIBUTE = XACML_NAMESPACE + "key";

    public static void main(String[] args) throws Exception {

    	// Actions in policy.
    	ActionType actionWrite;
    	// Resources in policy
    	ResourceType resTest1;
	EnvironmentType emptyEnv;

    	// Service end-point stubs.
    	XACMLPort xacmlSvc;
    	AuthorizationPort atzSvc;
	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String baseURL = System.getProperty("wssm.url") + "/";

        //XACML Service endpoint.
        XACMLServiceLocator xacmlLocater = new XACMLServiceLocator();
        URL xacmlURL = new URL(baseURL + xacmlLocater.getXACMLAuthorizationWSDDServiceName());
        System.out.println("XACML URL: " + xacmlURL);
        xacmlSvc = xacmlLocater.getXACMLAuthorization(xacmlURL);

        //OES Session establishment endpoint
        SsmwsLocator authLocator = new SsmwsLocator();
        URL authURL = new URL(baseURL + authLocator.getAuthorizationWSDDServiceName());
        System.out.println("Authorization URL: " + authURL);
        atzSvc = authLocator.getAuthorization(authURL);

        //Initialize request parameters.
        emptyEnv = new EnvironmentType();
        actionWrite = createAction("write");
        resTest1 = createResource("HelloOESworld/MyResourceType/MyResource");

        SubjectType sbjct = establishSession("weblogic", new String[]{"Administrators"}, atzSvc);

        AttributeType envAttr = createXacmlAttribute("101", ENV_ATTRIBUTE, XML_INTEGER_TYPE);
        EnvironmentType env = new EnvironmentType(new AttributeType[]{envAttr});

        RequestType req = new RequestType(new SubjectType[]{sbjct}, new ResourceType[]{resTest1}, actionWrite, env);
        
        //Send XACML authorization request.
        ResultType result = xacmlSvc.authorize(req).getResult(0);
        
        //Print result and obligations.
        System.out.println("\nAuthentication Decision: " + result.getDecision());
        System.out.println("Result Status: " + result.getStatus().getStatusCode().getValue());
    }

    private static ActionType createAction(String act) throws Exception {
        AttributeType attr = createXacmlAttribute(act, ACTION_ID, XML_STRING_TYPE);
        return (new ActionType(new AttributeType[]{attr}));
    }

    private static ResourceType createResource(String res) throws Exception {
        AttributeType attr = createXacmlAttribute(res, RESOURCE_ID, XML_STRING_TYPE);
        return (new ResourceType(null, new AttributeType[]{attr}));
    }

    private static AttributeType createXacmlAttribute(String content,
            String attributeId, String dataType) throws Exception {
        Text text = new Text(content);
        MessageElement element = new MessageElement(text);
        return createXacmlAttribute(new MessageElement[]{element}, attributeId,
                dataType);
    }

    private static AttributeType createXacmlAttribute(MessageElement[] content,
            String id, String type) throws Exception {
        AttributeValueType value = new AttributeValueType(content);
        return new AttributeType(new AttributeValueType[]{value},
                new URI(id), new URI(type), null);
    }

    private static SubjectType establishSession(String username, String[] groups, AuthorizationPort atzSvc) throws Exception {
        PrincipalInfoType principalInfoUser = new PrincipalInfoType();
        principalInfoUser.setPrincipalName(username);
        principalInfoUser.setPrincipalJavaClass(USER_PRINCIPAL_CLASS);
       
        List<PrincipalInfoType> principals = new ArrayList<PrincipalInfoType>();
        principals.add(principalInfoUser);
        
        for (int i = 0; i < groups.length; i++) {
            principalInfoUser = new PrincipalInfoType();
            principalInfoUser.setPrincipalName(groups[i]);
            principalInfoUser.setPrincipalJavaClass(GROUP_PRINCIPAL_CLASS);
            principals.add(principalInfoUser);
        }

        //Principals for session establishment.
        PrincipalsInfoType principalsInfo = new PrincipalsInfoType(principals.toArray(new PrincipalInfoType[0]));

        // Holders for result.
        IdentityAssertionTypeHolder iath = new IdentityAssertionTypeHolder();
        ChallengeTypeHolder challenge = new ChallengeTypeHolder();
        StringArrayHolder status = new StringArrayHolder();
        
        //Session establishment call.
        atzSvc.establishSession(principalsInfo, OES_ASSERTION_TYPE, null, iath, challenge, status);
        IdentityAssertionType identity = iath.value;
        AttributeType attr = createXacmlAttribute(identity.get_any(), SUBJECT_ID,
                OES_CREDENTIAL_ID);
        return (new SubjectType(new AttributeType[]{attr}, null));
    }
}

