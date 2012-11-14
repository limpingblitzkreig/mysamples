################################################################
# Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved. 
################################################################
# Destroys test policy

# Connect to weblogic domain.
connect(sys.argv[1],sys.argv[2],sys.argv[3])

# Delete application policy
deleteAppPolicies(appStripe='xacml')

