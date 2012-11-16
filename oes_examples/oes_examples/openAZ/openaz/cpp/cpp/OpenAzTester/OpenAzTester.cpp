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

#include <tchar.h>

#include <windows.h>  // this is the for messagebox, take it out later

#include "SimpleConcreteDummyService.h"
#include "AzXacmlStrings.h"

//const static string SAMPLE_SESSION_AUTH_METHOD = "password";

// For windows, to get rid of the console box, use the following:
//#pragma comment(linker, "/SUBSYSTEM:WINDOWS")
//int WINAPI WinMain(HINSTANCE hInstance,
//                   HINSTANCE hPrevInstance,
//                   LPSTR lpCmdLine,
//                   int nCmdShow)
//{

int _tmain(int argc, _TCHAR* argv[])
{
    //printf ("OpenAz C++\n");

////Debugging/Test messages:
#define MSGSIZE 5000
char strMessage[MSGSIZE];
strMessage[0] = 0;
strcpy_s(strMessage,MSGSIZE,"Results from OpenAzTester:\r\n");
////
	SimpleConcreteDummyService* pNewService = new SimpleConcreteDummyService();

////Debugging/Test messages:
if (pNewService == NULL)
	strcat_s(strMessage,MSGSIZE,"-> Service could not be created.\r\n");
else
	strcat_s(strMessage,MSGSIZE,"-> Service created.\r\n");
////
	
	PepRequest* pNewReq = new PepRequest((AbstractService*) pNewService);
	pNewReq->setAzRequestContext(pNewService->createAzRequestContext());

////Debugging/Test messages:
if (pNewReq == NULL)
	strcat_s(strMessage,MSGSIZE,"-> Error Creating PEP Request.\r\n");
else
	strcat_s(strMessage,MSGSIZE,"-> PEP Request and Context created.\r\n");
////
	string resourceName = "file\\\\toplevel";
	string actions[] = {"read","write","delete","read","write","delete"};
	
	for (unsigned int i = 0; i < actions->length(); i++)
	{ 
		//tm date = ;
		hash_map<string, string> subject;

		typedef pair <string, string> String_Pair;
		subject.insert(String_Pair(X_ATTR_SUBJECT_ID, "sydney"));
		subject.insert(String_Pair(X_ATTR_SUBJECT_AUTHN_LOC_AUTHENTICATION_METHOD, "sydney"));

		hash_map<string, string> environment;
		environment.insert(String_Pair(X_ATTR_ENV_CURRENT_DATE, "12.12.2012"));
		PepRequest* req = pNewReq->newPepRequest(subject,actions[i],resourceName, environment);

////Debugging/Test messages:
if (req == NULL)
	strcat_s(strMessage,MSGSIZE,"-> Error Creating Qualified PEP Request.\r\n");
else
{
	strcat_s(strMessage,MSGSIZE,"-> Qualified PEP Request created :\r\n");
	if (i == 0)
	{
	strcat_s(strMessage,MSGSIZE," * Subject = ");
	strcat_s(strMessage,MSGSIZE,subject.begin()->first.c_str());
	strcat_s(strMessage,MSGSIZE," = ");
	strcat_s(strMessage,MSGSIZE,subject.begin()->second.c_str());
	strcat_s(strMessage,MSGSIZE,"\r\n");
	strcat_s(strMessage,MSGSIZE," * Subject = ");
	strcat_s(strMessage,MSGSIZE,(++subject.begin())->first.c_str());
	strcat_s(strMessage,MSGSIZE," = ");
	strcat_s(strMessage,MSGSIZE,(++subject.begin())->second.c_str());
	strcat_s(strMessage,MSGSIZE,"\r\n");
	}
	strcat_s(strMessage,MSGSIZE," * Action = ");
	strcat_s(strMessage,MSGSIZE,actions[i].c_str());
	strcat_s(strMessage,MSGSIZE,"\r\n");
	if (i == 0)
	{
	strcat_s(strMessage,MSGSIZE," * Resource = ");
	strcat_s(strMessage,MSGSIZE,resourceName.c_str());
	strcat_s(strMessage,MSGSIZE,"\r\n");
	strcat_s(strMessage,MSGSIZE," * Environment = ");
	strcat_s(strMessage,MSGSIZE,environment.begin()->first.c_str());
	strcat_s(strMessage,MSGSIZE," = ");
	strcat_s(strMessage,MSGSIZE,environment.begin()->second.c_str());
	strcat_s(strMessage,MSGSIZE,"\r\n");
	}
	else
	{
	strcat_s(strMessage,MSGSIZE,"* ...\r\n");
	}
}
////
		// CM - redundant?
		req->setAzRequestContext(pNewReq->getAzRequestContext());
		req->setService((AbstractService*) pNewService);

		PepResponse* resp = req->decide();
		bool allowed = resp->allowed();

		hash_map<string,Obligation>* Obligations = resp->getObligations();

////Debugging/Test messages:
if (resp == NULL)
	strcat_s(strMessage,MSGSIZE,"-> Error Calling Decide.\r\n");
else
{
	strcat_s(strMessage,MSGSIZE,"-> Decide() method called : ");
	strcat_s(strMessage,MSGSIZE," RESULT = ");
	if(allowed)
		strcat_s(strMessage,MSGSIZE,"Allowed\r\n");
	else
		strcat_s(strMessage,MSGSIZE,"Denied\r\n");
	strcat_s(strMessage,MSGSIZE,"-> Obligations : \r\n");
	hash_map<string,Obligation>::iterator it = Obligations->begin();
	do {
		strcat_s(strMessage,MSGSIZE,"* ");
		strcat_s(strMessage,MSGSIZE,it->first.c_str());  // print out Obligation descr
		strcat_s(strMessage,MSGSIZE,"\r\n");
	} while (++it != Obligations->end());

}
////

		// clean up
		delete resp;
		delete req;
	}

//Debugging/Test messages:
MessageBoxA(NULL,strMessage,"Test Results",NULL);

	// clean up
	delete pNewReq;
	delete pNewService;

	return 0;
}

