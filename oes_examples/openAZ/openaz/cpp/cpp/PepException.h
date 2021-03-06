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

#ifndef PEPEXCEPTION_H
#define PEPEXCEPTION_H

#include "Pep.h"

#pragma warning(disable : 4290)

using namespace std;

class PepException  : public exception
{ 
	public:
		PepException();							// : exception("PEP Exception");
		PepException(string msg);			// : exception(msg.c_str());
		PepException(PepException& exc);		// : exception(exc.what());
		PepException(PepException& exc, std::string msg);  // : exception(exc.what())

	private:
	    static const long serialVersionUID = 1L;
		
};

#endif PEPEXCEPTION_H
