==========================================================================
README for PEP API Sample Application, AS11gR1 11.1.1.5.0 release
 Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved. 
==========================================================================



-----------------------------------------------------------------------------
INTRODUCTION :

This example has been created to illustrate the functionality of PEP API
for making authorization request against the policy Store.

It contains a servlet, developed to be deployed on Weblogic Server, for
creating the application policy needed for the example.
And a client application for making calls to PEP API for authorization decisions.

-----------------------------------------------------------------------------
CODE ORGANIZATION :

The entire package is inside a directory named PepApiExample. The code
organization is as follows :

PepApiExample/
    |
    |-----> README : The README file for PepApiExample.
    |-----> src : contains the Java source files for the servlet and client code
    |-----> web : web source files for building PepSamplePolicy.ear
    |-----> lib: PepSamplePolicy.ear and PepSampleApp.jar
    |-----> scripts
            |--->build.properties : user should modify this for local environment
            |--->build.xml : for building PepSamplePolicy.ear and PepSampleApp.jar
            |--->run.sh : for running the JSE client PepSampleApp against a Java SM instance

----------------------------------------------------------------------------------------------------
ASSUMPTION

Users are expected to have installed  AS11gR1 11.1.1.5.0 shiphome and created a Java SM client instance
with controlled mode.  For the illustration purpose of this README, the Java SM instance name
is assumed to be called "MySM_Java".

----------------------------------------------------------------------------------------------------
1. BUILDING INSTRUCTIONS :

This package contains the binaries in the lib directory, it is not required to
rebuild the applications unless the applications are modified.

NOTE: Set ANT_HOME, JAVA_HOME properly before running ant command. Make sure
$ANT_HOME/bin|%ANT_HOME%\bin and $JAVA_HOME/bin|%ANT_HOME%\bin added in PATH

a. Modify variables in scripts/build.properties to point to your local environment
b. Modify PepSamplePolicy.java if you wish to change the application policy.
c. Modify PepSampleApp.java if you wish to change the client code.
d. Change directory to "scripts" directory, then execute "ant build" command. It
will create a new directory called "build" which contains the new compiled bits.
e. Please copy PepSamplePolicy.ear and PepSampleApp.jar from "build" to the "lib"
directory before running the application again because
the "run" target picks up the libraries from the lib directory.
f. If you have modified the servlet after deploying it, please undeploy it and deploy it
again using the Administration Console.  Basically, you need to repeat steps 2 to 4.

NOTE: If the application policy has been modified and distributed to the JAVA SM
but does not seems to be in effect, then try to remove the policy cache files (remove files under
config/work directory in the SM instance) and re-run the application.

-----------------------------------------------------------------------------------
2. DEPLOY and INVOKE the servlet(PepSamplePolicy.ear) :

a. Deploy PepSamplePolicy.ear from the lib directory
   e.g. Goto http://myhost:7001/console to use the Administration Console for
   deploying the application

b. Invoke the servlet from a WEB browser
   e.g. http://myhost:7001/PepSamplePolicy/PepSamplePolicy

   A message "The policies have been successfully created." should be displayed.


-----------------------------------------------------------------------------------
3. DISTRIBUTE THE APPLICATION POLICY

Use Application Policy Manager (APM) to distribute policy

a. Login to APM from a WEB browser: e.g. http://myhost:7001/apm
b. Goto "System Configuration", create a new security module called "MySM_Java".
Note, this name should match the name of the SM instance that has been created.
c. Bound "PepSamplePolicy" application to this SM
d. Goto "Authorization Management" tab -> open the application "PepSamplePolicy"
-> go to "Policy Distribution" -> clicks the "Distribute" button


-----------------------------------------------------------------------------------
4. RUN THE CLIENT APPLICATION (PepSampleApp)

a. Modify variables in scripts/build.properties to point to your local environment
b. Change directory to "scripts" directory
c. Execute "ant" command to run PepSampleApp.
Alternatively, a shell script "run.sh" is provided for your convenience for running the application.

************************************************
Expected screen output from running PepSampleApp
************************************************
Starting the PepApi J2SE Sample Application
PepSampleApp: subject: Subject:
        Principal: UserA
        Principal: GroupA

*** PepSampleApp: test1 begin ***
PepSampleApp: PepResponse.isAllowed(): true
obligation: name = BasicObligation, values = {attr_string=World, attr_boolean=false, attr_integer=33}

*** PepSampleApp: test2 begin  ***
PepSampleApp: PepResponse.isAllowed() : false
PepSampleApp: obligations: null

*** PepSampleApp: test3 begin  ***
PepSampleApp: PepResponse.isAllowed() : false
PepSampleApp: obligations: null

*** PepSampleApp: test4 begin  ***
PepSampleApp: query scope is: resource=PepSamplePolicy/PepResourceType/PepResource
PepSampleApp: granted action:  read
PepSampleApp: denied action: write

PepSampleApp has completed.


---------------------------------------------------------------------------------
DETAILS:

PepSamplePolicy is a servlet which creates the following application policy:

a. Creates an application policy with application name "PepSamplePolicy", it would clean up
   the existing policy first if exists.
b. Creates resource type called "PepResourceType" with 2 actions "read" and "write".
c. Creates an resource instance "PepResource" with type "PepResourceType"
d. Creates a BooleanExpressionEntry condition where AttributeEntry "PepAttr" would equal "hello".
e. Creates an obligation called "BasicObligation" with these attributes: attr_string=World,
  attr_boolean=false, attr_integer=33.
f. Grants to group "GroupA" on "PepResource" with "read" action and obligation (created in e)
   under specific condition (d).

2. PepSampleApp
PepSampleApp is J2SE application which demonstrates use of PEP API for authorization decisions.

It creates a subject that contain "UserA" and "GroupA"
and make authorization request for application "PepSamplePolicy".

a. test1
Invokes PEP API with authorization request passing the subject, resource "PepResource", action "read",
environment containing name/value pairs with "PepAttr" set to "hello".
Authorization result should be true and  obligation should be returned.

b. test2
Invokes PEP API with authorization request passing the subject, resource "PepResource", action "read",
environment containing name/value pairs with "PepAttr" set to "nothing".
Since the policy granted to Subject ("GroupA") has "PepAttr" equals to "hello",
authorization result should be denied and no obligation is returned.

c. test3
Invokes PEP API with authorization request passing the subject, resource "PepResource", action "write",
environment containing name/value pairs with "PepAttr" set to "hello".
Since Subject ("GroupA") is not granted "write" action to the "PepResource",
authorization result should be denied and no obligation is returned.

d. test4
This invokes the PEP Query Request API passing subject, environment
containing name/value pairs with "PepAttr" set to "hello", scope is defined as
"resource=PepResource", PepRequestQueryType is set to VERBOSE.
This means both grant and denied actions will be returned.
The result is expected to return a granted action "read" and denied action "write".

 
