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

#ifndef PEPREQUEST_H
#define PEPREQUEST_H

#include "DecisionHandler.h"
#include "AzService.h"
#include "PepRequestQueryType.h"
#include "SimpleConcreteDummyService.h"  // note:  use appropriate shim

using namespace stdext;

INTERFACE AbstractService;

class PepRequest  : DecisionHandler 
{
	public:
		PepRequest(AbstractService* pService);
		PepRequest(AzRequestContext* ctx, PepRequestOperation* operation);
		PepRequest();

		virtual ~PepRequest() {};

		virtual PepRequestOperation getOperation();
		virtual void setOperation(PepRequestOperation operation);

		virtual string getScope();

		virtual bool isQueryForAllowedResults();

		virtual AzObject getActionObject(AzResourceActionAssociation azRaa);

		virtual string getResourceObject(AzResourceActionAssociation azRaa);

		virtual void setResourceAction(AzObject resource, AzObject action);    // throw(PepException)
		virtual void setResourceAction(string resource, string action);        //  throw(PepException)

		virtual void setBulkResourceActions(vector<string>* resourceObjects, vector<string>* actionObjects) /* throw(PepException) */ ;

		virtual void setAccessSubject(AzObject subject);                       //  throw(PepException)
		virtual void setAccessSubject(hash_map<string, string> subjectObj);    //   throw(PepException)

		virtual void setEnvironment(AzObject envObject);					   //  throw(PepException)
		virtual void setEnvironment(string envTag, string envValue);		   //   throw(PepException)
		virtual void setEnvironment(hash_map<string, string> environmentObj);  //   throw(PepException)
		
		virtual void setScope(string inScope);

		virtual void setQueryReturnAllowed(bool inQueryReturnAllowed);

		AzRequestContext* getAzRequestContext();
		void setAzRequestContext(AzRequestContext* pAzReqCtx);


		// PepRequestFactory functions:

		PepRequest* newBulkPepRequest(
			hash_map<string, string> subjectObj, 
			vector<string> actionObjects, 
			vector<string> resourceObjects, 
			hash_map<string, string> environmentObj);
		PepRequest* newBulkPepRequest(
			hash_map<string, string> subjectObj, 
			vector<string> actionResourceObjects, 
			hash_map<string, string> environmentObj);
		PepRequest* newPepRequest(
			hash_map<string, string>  subjectObj, 
			string actionResourceObject, 
			hash_map<string, string> environmentObj);
		PepRequest* newPepRequest(
			hash_map<string, string> subjectObj, 
			string actionObj, 
			string resourceObj, 
			hash_map<string, string> environmentObj);
		PepRequest* newPepRequest(
			string subjectName, 
			string actionId, 
			string resourceId);
		PepRequest* newQueryPepRequest(
			hash_map<string, string> subjectObj, 
			hash_map<string, string> environmentObj, 
			string scope, 
			PepRequestQueryType queryType);
		
		hash_map<string, string>*  getPreDecisionHandlers();
		// not implemented:  DecisionHandler* getDecisionHandler();
		hash_map<string, string>*  getPostDecisionHandlers();
		AzService* getAzService();
		string getProviderClassName();
		string getContainerName();

		// implementation of abstract class:
		PepResponse* decide(PepRequest* request) {return NULL;}; // throw(PepException)	
		PepResponse* decide();  //throw(PepException)

		void setService(AbstractService* pService) 
		{
			m_pService = pService;
		};

	private:
		hash_map<string, string> environment;
		hash_map<string, string> subject;
		vector<string> actionList;
		vector<string> resourceList;
		vector<string> bulkResourceObjects;
		vector<string> bulkActionObjects;   
		string Resource;
		string Action;
		string defaultContainerName;
	    PepRequestOperation operation;
		string scope;
		bool queryReturnAllowed;

		AbstractService* m_pService;
		PepRequestOperation m_PepRequestOperation;
		AzRequestContext* m_pAzRequestContext;

};

#endif // PEPREQUEST_H
