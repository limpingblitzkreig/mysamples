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

// The following ifdef block is standard for creating macros for exporting 
// from a DLL. Files within this DLL are compiled with the OPENAZLIBRARY_EXPORTS
// symbol defined.  Other projects which include this file see OPENAZAPI functions 
// as being imported from a DLL, and this DLL sees symbols defined with this macro as exported.
//
#ifdef OPENAZLIBRARY_EXPORTS
#define OPENAZAPI __declspec(dllexport)
#else
#define OPENAZAPI __declspec(dllimport)
#endif

#define _tmain wmain

////////////////////////////////////////////////////////////////////////////////
// COM-Like abstract interface.
// This interface doesn't require __declspec(dllexport/dllimport) specifier.
// Any C++ compiler can use it.
struct IOpenAzClib
{
    virtual int SampleCall(int n) = 0;
    virtual void Release() = 0;
};

// Regular C++ class.
// The __declspec specifier is required fot clients to be able to
// call methods of the class.
// Both DLL and EXE must use the same compiler.
//
class OPENAZAPI COpenAzClib
{
public:
    int SampleCall(int n);
};

// Handle type. In C++ language the interface type is used.
typedef IOpenAzClib* OPENAZHANDLE;

////////////////////////////////////////////////////////////////////////////////
// Function that creates instance of the OpenAzClib object.
extern "C" OPENAZAPI OPENAZHANDLE __stdcall GetOpenAzClib(void);

////////////////////////////////////////////////////////////////////////////////
// Generic C interface.
// These functions can be used with any compiler that can call an exported C routine.
//
extern "C" OPENAZAPI int __stdcall OpenAzClibSampleCall(OPENAZHANDLE handle, int n);
extern "C" OPENAZAPI void __stdcall OpenAzClibRelease(OPENAZHANDLE handle);
