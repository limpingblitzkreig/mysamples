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

// OpenAzClib.cpp : Defines the OpenAzClib implementation.

#include "OpenAzClib.h"

////////////////////////////////////////////////////////////////////////////////
// Implementation of the IOpenAzClib interface.
//
// ToDo : this is to be replaced with the PEP library calls.
//        The following are just example usages


class OpenAzClibImpl : public IOpenAzClib
{
    int SampleCall(int n);
    void Release();
};

int OpenAzClibImpl::SampleCall(int n)
{
    return n * n + n;
}

void OpenAzClibImpl::Release()
{
    delete this;
}

////////////////////////////////////////////////////////////////////////////////
// Factory function that creates instances if the OpenAzClib object.
//
// Export both decorated and undecorated names.
//   GetOpenAzClib     - Undecorated name, used with the GetProcAddress Win32 function.
//   _GetOpenAzClib@0  - Common name decoration for __stdcall functions in C.
#pragma comment(linker, "/export:GetOpenAzClib=_GetOpenAzClib@0")

OPENAZAPI OPENAZHANDLE __stdcall GetOpenAzClib()
{
	return new OpenAzClibImpl;
}

////////////////////////////////////////////////////////////////////////////////
// Regular C++ class implementation (exported)
// 
int COpenAzClib::SampleCall(int n)
{
    return n * n + n;
}

////////////////////////////////////////////////////////////////////////////////
// C interface implementation.
// Written with C++ and uses OpenAzClibImpl instance.
//
OPENAZAPI int __stdcall OpenAzClibSampleCall(OPENAZHANDLE handle, int n)
{
    int nResult = -1;

    if(handle)
    {
        nResult = handle->SampleCall(n);
    }

    return nResult;
}

OPENAZAPI void __stdcall OpenAzClibRelease(OPENAZHANDLE handle)
{
    if(handle)
        handle->Release();
}
