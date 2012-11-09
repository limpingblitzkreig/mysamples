package oracle.security.example;

import java.io.IOException;
import java.io.PrintWriter;

import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import oracle.security.jps.JpsContext;
import oracle.security.jps.JpsContextFactory;
import oracle.security.jps.service.policystore.*;
import oracle.security.jps.service.policystore.entitymanager.*;
import oracle.security.jps.service.policystore.info.*;
import oracle.security.jps.service.policystore.info.resource.ResourceActionsEntry;
import oracle.security.jps.service.policystore.info.resource.ResourceEntry;
import oracle.security.jps.service.policystore.info.resource.ResourceTypeEntry;
import weblogic.security.principal.WLSGroupImpl;
import oracle.security.jps.service.policystore.info.Expression;

/**
 * PepSamplePolicy is a servlet which provisions policy for application
 * <b>PepSamplePolicy</b> into the policy store: <p>
 *
 * a. Creates an application policy with application name "PepSamplePolicy", it would clean up
 *  the existing policy first if exists. <br>
 * b. Creates resource type called "PepResourceType" with 2 actions "read" and "write".<br>
 * c. Creates an resource instance "PepResource" with type "PepResourceType"  <br>
 * d. Creates a BooleanExpressionEntry condition where AttributeEntry "myAttr" would equal "hello".  <br>
 * e. Creates an obligation called "BasicObligation" with these attributes: attr_string=World,
 * attr_boolean=false, attr_integer=33.<br>
 * f. Grants to group "GroupA" on "PepResource" with "read" action and obligation (created in e)
   under specific condition (d). <br>
 * <p>
 *
 */
public class PepSamplePolicy extends HttpServlet {

    private static final String CONTENT_TYPE = "text/html; charset=US-ASCII";
    private String APP_NAME = "PepSamplePolicy";
    private ApplicationPolicy appPolicy = null;

    private static final String RESOURCE_TYPE = "PepResourceType";
    private static final String RESOURCE_NAME = "PepResource";
    private static final String PERMISSION_SET_NAME = "PepPermissionSet";
    private static final String ACTION_READ = "read";
    private static final String ACTION_WRITE = "write";
    private static final String GROUP_NAME = "GroupA";
    private static final String PEP_POLICY = "pep_policy";
    private static final String PEP_POLICY_RULE = "pep_policy_rule";
    private static final String PEP_ATTR = "PepAttr";

    /*
    * Process the HTTP doGet request.
    */

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
            IOException {
        response.setContentType(CONTENT_TYPE);
        addPolicy(response.getWriter());

    }


    public void addPolicy(PrintWriter out) {
        try {

            /*
             * Deletes the policy for application <b>PepSamplePolicy</b> if it exists,
             * then creates a new one.
             */
            AccessController.doPrivileged(new PrivilegedExceptionAction<Boolean>() {
                public Boolean run() throws Exception {
                    JpsContextFactory ctxFact = JpsContextFactory.getContextFactory();
                    JpsContext ctx = ctxFact.getContext();
                    PolicyStore policyStore = ctx.getServiceInstance(PolicyStore.class);
                    try {
                  
                        policyStore.deleteApplicationPolicy(APP_NAME);

                    } catch (PolicyObjectNotFoundException ok) {
                    }
                    appPolicy = policyStore.createApplicationPolicy(APP_NAME);
                    return true;
                }
            });


            ResourceTypeManager resTypeMgr = appPolicy.getResourceTypeManager();

            /* Creates an actions list for action "read" and "write" */
            List<String> actions = new ArrayList<String>();
            actions.add(ACTION_READ);
            actions.add(ACTION_WRITE);


            /* Creates a ResourceTypeEntry with the actions list */
            ResourceTypeEntry type = resTypeMgr.createResourceType(
                    RESOURCE_TYPE, RESOURCE_TYPE, RESOURCE_TYPE, actions, null, ",");

            /* Obtain an instance of ExtensionManager */
            ExtensionManager extensionMgr = appPolicy.getExtensionManager();

            AttributeEntry<OpssString> attrEntry = extensionMgr.createAttribute(
                    PEP_ATTR, PEP_ATTR, PEP_ATTR,
                    OpssString.class, AttributeEntry.AttributeCategory.DYNAMIC, true);

            FunctionEntry strEqFunc = extensionMgr.getFunction(RuleExpressionEntry.BuiltInFunctions.STRING_EQUAL.toString());

            Expression expr = new Expression(strEqFunc);
            expr.addExpressionComponent(attrEntry);
            expr.addExpressionComponent(new OpssString("hello"));

            BooleanExpressionEntry condition = new BooleanExpressionEntry(expr);


            ResourceManager resMgr = appPolicy.getResourceManager();
            /* Creates a ResourceEntry for the ResourceTypeEntry "type" */
            ResourceEntry pepResource = resMgr.createResource(RESOURCE_NAME, RESOURCE_NAME, RESOURCE_NAME, type, null);


            /* Create permission set */
            PermissionSetManager psm = appPolicy.getPermissionSetManager();
            List<ResourceActionsEntry> resActsList = new ArrayList<ResourceActionsEntry>();
            actions = new ArrayList<String>();
            actions.add(ACTION_READ);
            //uncomment the following line to grant "write" action 
            //actions.add(ACTION_WRITE);
            resActsList.add(new BasicResourceActionsEntry(pepResource, actions));
            PermissionSetEntry permSet = psm.createPermissionSet(PERMISSION_SET_NAME, PERMISSION_SET_NAME, PERMISSION_SET_NAME, resActsList);

            List<PermissionSetEntry> permSets = new ArrayList<PermissionSetEntry>();
            permSets.add(permSet);


            //create policy rule
            @SuppressWarnings("unchecked")
            PolicyRuleEntry grantRule = new BasicPolicyRuleEntry(PEP_POLICY_RULE, PEP_POLICY_RULE, PEP_POLICY_RULE, PolicyRuleEntry.EffectType.GRANT, condition);

            List<PrincipalEntry> principalList = new ArrayList<PrincipalEntry>();
            PrincipalEntry principalEntry = new BasicPrincipalEntry(WLSGroupImpl.class.getName(), GROUP_NAME);
            principalList.add(principalEntry);


            // obligations
            List<ObligationEntry> obs = new ArrayList<ObligationEntry>();
            {
                List<AttributeAssignment<? extends DataType>> assignments = new ArrayList<AttributeAssignment<? extends DataType>>();
                assignments.add(new AttributeAssignment<OpssString>("attr_string", new OpssString("World")));
                assignments.add(new AttributeAssignment<OpssInteger>("attr_integer", new OpssInteger(33)));
                assignments.add(new AttributeAssignment<OpssBoolean>("attr_boolean", new OpssBoolean(false)));
                ObligationEntry obligation = new BasicObligationEntry("BasicObligation", "String displayName", "String description", assignments);
                obs.add(obligation);
            }
           

            // creates policy
            PolicyManager pm = appPolicy.getPolicyManager();
            pm.createPolicy(PEP_POLICY, PEP_POLICY, PEP_POLICY, grantRule, permSets, principalList, obs);
            out.println("The policies have been successfully created.");

        } catch (Exception e) {
            out.println("<p>");
            e.printStackTrace(out);
            out.println("<p>");
        }

    }

}
