//
// Copyright 2011 NextLabs, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License"); 
// you may not use this file except in compliance with the License. 
// You may obtain a copy of the License at 
//   http://www.apache.org/licenses/LICENSE-2.0 
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, 
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
// See the License for the specific language governing permissions and 
// limitations under the License.
//
// Translation of original OpenAz java source code
// from Josh Bregman, Rich Levinson, Prateek Mishra
// Into a C++ PEP layer interpretation
// By NextLabs Inc. San Mateo CA. 
// Corbin Miller
//
// <-------------------------------------------------------------------->


This readme file accompanies the C++ OpenAz project listed under
http://openaz.svn.sourceforge.net/viewvc/openaz/cpp/

The code is intended to be platform-independent, but has been released as a Microsoft Visual C++ solution split into 4 projects:

OpenAz - the Main implementation files and headers for the C++ OpenAz PEP interface.
Service - A sample Shim which would be replaced with a vendor shim and wrapper.
OpenAzTester - a test implementation of this code
Example C++ Lib implementation - a simple shell as an example for users that want to make their own interface in a different method (COM, C++, C).  It is just an example for how such would be started.

Keep in mind this PEP interpretation is a subset of the original Java OpenAz project.  Much of the original Java project is not inside this C++, and some of it is not fully implemented.  In a few cases, the original java code is referred to within comments.  A user may want to refer to the original java OpenAz project as a reference.  

The main functions of the C++ implementation:
- Request, with associated Action, Resource, Subject, and Environment objects.
- Decide, with a corresponding Response return
- Result (permit, deny) from the Response
In some cases, prototypes of the original java OpenAz project have been included, but not yet implemented.  These are included to facilitate expansion of this above functionality should the user desire to do so for their implementation.


Some of the key differences between the Java OpenAz project and the C++ OpenAz translation:

- Strings have been used for the data types in most cases.  
- C++ needed pointers to objects to be passed in many / most functions.
- The concept of "interface" does not exist in generic C++, so these had to be generally implemented at virtual base classes.
- There are implementation .cpp files for most of OpenAZ functionality, and a larger number of .h header files for interface prototypes.


The following is a description of the elements of the project:

AzService:
----------
AbstractService.h and AzService.h : Implementation for the generic Service object.  A customer shim wrapper should derive from this.  (See the implementation of SimpleConcreteDummyService.cpp in the service project as an example.)  The AzService class implements:
    - decide();
    - query();

OpenAz:
-------
AzAttribute.h : "Interface" class for AzAttribute. (not fully implemented)
AzAttributeFinder.h : Definition of "Interface" template AzAttributeFinder <AzCategoryId>
AzAttributeValue.h : Prototypes for AzAttributeValue.

AzCategoryId.h : Definition of AzCategoryId enum (AzCategoryIdAction, AzCategoryIdEnvironment, AzCategoryIdResource, etc...), as well as string equivalents.
AzDataTypeId.h : Definition structure for AzDataTypeId, which for now is just String for this implementation.
AzDecision.h : Definition of the AzDecision enum and corresponding strings (AZ_PERMIT, AZ_DENY, etc.)

AzEntity.h : Definition of the AzEntity interface.  This includes createAzAttribute(), addAzAttribute().  Note that the large number of datatypes of the original java version are not implemented, just basically string is in this version.
AzObligations.h : Interface definition of AzObligations;  includes addAzObligation(), azResultIterator().
AzRequestContext.h : Impmentats createNewAzEntity(), getAssociations(), addResourceActionAssociation(), etc.

AzResourceActionAssociation.h : AzResourceActionAssociation prototype;  some not implemented.
AzResourceActionAssociationId.h : AzResourceActionAssociationId prototype;  some not implemented.
AzResponseContext.h : implementation of AzResponseContext interface including an azResults collection, an azResultIterator, and addResult().
AzResult.h : implementation for AzResult interface;  several functions of these are in the implementation file.

AzStatusCode.h : stores enum code and strings for AzStatus (AZ_OK, etc.)
AzStatusMessage.h : a few various StatusMessages
AzXacmlStrings.h : a few various XACML strings
DecisionHandler.h : DecisionHandler prototype (not implemented)
Obligation.h : interface base class for Obligation
OpenAzResourceDirectory : just a prototype for OpenAzResourceDirectory interface
OpenAzResourceQueryBuilder : stored getScopedAzRequestContext (not implemented)

OpenAzXacmlObject.h : function prototype for OpenAzXacmlObject
Pep.h : just a header for now;  could be used to abstract just PEP calls
PepException.h : implementation of an exception class.  Could be expanded.
PepRequest.h : inherits from DecisionHandler and has several important functions detailed in the implementation file.
PepRequestQueryType.h : simple definition of Query types enum

PepResponse.h : header for functions for the PepResponse class, within implementation file.
PepResponseBehavior.h : simple enum of PepResonse results
Types.h : header for a variety of things including PepRequestOperation enum, some virtual destructors.

AzEntity.cpp : Implementation file for AzEntity.   Includes a variety of AzAttribute functions.
AzResult.cpp : Basic AzResult functions;  not all are implemented.
PepException.cpp : Implementation for an exception class
PepRequest.cpp : Implements various PepRequest constructors, Decide(), and helpers for setting Resource, Environment, etc.  A few functions are not implemented.
PepResponse.cpp : Implements allowed(), functions for obligations, etc. for a Response

Service:
--------
SimpleConcreteDummyService.h - inherited from AbstractService
SimpleConcreteDummyService.cpp - implementation which includes decide(), query(), createAzRequestContext().


OpenAzTester:
-------------
OpenAzTester.cpp : contains a simple testing function for OpenAz.  A MessageDialog (for Windows) is created that shows progress and results.  It basically:
    - Creates a service,
    - Creates a request, and sets the context
    - Sets Resource
    - Sets a group of test actions (read, write, delete)
    - For all of these, sets a subject and a qualified PepRequest
    - Calls Decide()
    - Checks allowed()
    - Gets Obligations in the response.


Example C++ Lib Implementation : 
--------------------------------
OpenAzClib.h : prototypes for 3 varieties of functions or abstract base classes to define a LIB style implementation that could be used
OpenAzClib.cpp : OpenAzClibImpl shows example implementation of a LIB sytle implementation.  This could be a wrapper to the service shim, or could be implemented therein.
DllMain.cpp : simple shell needed for implementation
OpenAzClibExecutable.cpp : Examples for 3 varieties of how an executable would call the Library functions of OpenAzClib.



Of Further Note and Disclaimer:
-------------------------------
Note that this is an abbreviated interpretation of the larger OpenAz project, and is intended to aid a user in plugging in their Shim to this C++ PEP implementation.  Note that not all functions of the OpenAz project are implemented, but in some cases their prototypes have been added for future expansion or original java code added for reference.

Many objects had to be created and passed as pointers;  many of these are not cleaned up properly and are the 
responsibility of the caller (function/object) to maintain cleanup of these.

The project was created with the intention that it be portable to other ISO C++ compilers and operating systems;  but in most cases a new makefile / project for such would have to be created.

Note that most documentation for the original java OpenAz project should be referred to for most of these objects and interfaces, and implementation.

This cpp project originated from NextLabs, Inc. and is released into public doman / OpenSource for general use, testing and revision;  NextLabs assumes no responsibility for its thorough validity and implementation : i.e. the enduser should thoroughly test his/her shim as it is integrated.  It is expected that, as the OpenSource paradigm implies, that the using public will maintain and expand it as needs change and OpenAz itself evolves.

