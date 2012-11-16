################################################################
# Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved. 
################################################################
# Seeds policy for test

# Connect to weblogic domain
connect(sys.argv[1],sys.argv[2],sys.argv[3])

# Test application properties
appStripe='xacml'
resType='FILE'
empPrincipals='Employee:oracle.security.jps.service.policystore.ApplicationRole'
adminPrincipals='Admin:oracle.security.jps.service.policystore.ApplicationRole'

# Create the application policy.
createApplicationPolicy(appStripe=appStripe)

# Create Application roles for the users.
createAppRole(appStripe=appStripe, appRoleName='Admin')
grantAppRole(appStripe=appStripe, appRoleName='Admin', principalClass='weblogic.security.principal.WLSGroupImpl', principalName='Administrators')
createAppRole(appStripe=appStripe, appRoleName='Employee')
grantAppRole(appStripe=appStripe, appRoleName='Employee', principalClass='weblogic.security.principal.WLSGroupImpl', principalName='AppTesters')

# Create Resources
createResourceType(appStripe=appStripe, resourceTypeName=resType, displayName='File resource type', description='Test resource type', allowedActions='read,write,execute',matcher='')
createResource(appStripe=appStripe, name='file1', type=resType, displayName='Test resource 1', description='Test resource 1')
createResource(appStripe=appStripe, name='file2', type=resType, displayName='Test resource 2', description='Test resource 2')

# Create Attributes
createAttribute(appStripe=appStripe, attributeName='codeWord', displayName='code word', description='code word to access the resource', type='string', category='resource', isSingle='true')
createAttribute(appStripe=appStripe, attributeName='key', displayName='resource key', description='key to the resource', type='int', category='dynamic', isSingle='true')

# Add attributes to resources.
updateResourceType(appStripe=appStripe, resourceTypeName=resType, attributes='codeWord')
updateResource(appStripe=appStripe, resourceName='file1', type=resType, attributes='codeWord:Open Sesame!!!')
updateResource(appStripe=appStripe, resourceName='file2', type=resType, attributes='codeWord:Red Rose')

# Create Authorization Policies.
createPolicy(appStripe=appStripe, policyName='pol_roleMap', displayName='Simple role-mapping access test', description='Simple access policy to test role-mapping', ruleExpression='roleMap:grant:', resourceActions='FILE:file1(write)', principals=adminPrincipals)

createPolicy(appStripe=appStripe, policyName='pol_resAttr', displayName='Resource Attribute for access', description='Access policy with resource attributes', ruleExpression='resAttr:grant: (codeWord == "Open Sesame!!!")', resourceActions='FILE:file1(read),FILE:file2(read)', principals=empPrincipals)

createPolicy(appStripe=appStripe, policyName='pol_envAttr', displayName='Environment attribute for access', description='Access policy with environment attribute', ruleExpression='envAttr:grant: (key > 101)', resourceActions='FILE:file2(write)', principals=empPrincipals)

createPolicy(appStripe=appStripe, policyName='pol_predicate', displayName='Optional attributes for access', description='Access policy with predicate and obligations', ruleExpression='predicate:grant: (codeWord == "Red Rose") || (key == 108)', resourceActions='FILE:file1(execute),FILE:file2(execute)', principals=empPrincipals, obligations='email(eml:"user@example.org"),subject(sub:"treasure found")')

