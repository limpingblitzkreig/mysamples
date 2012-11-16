/**
 * AuthorizationBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.service;

public class AuthorizationBindingStub extends org.apache.axis.client.Stub implements com.bea.security.ssmws.service.AuthorizationPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getVersion");
        oper.setReturnType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ServiceVersionType"));
        oper.setReturnClass(com.bea.security.ssmws.types.ServiceVersionType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "getVersionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isCompatible");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ServiceVersion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ServiceVersionType"), com.bea.security.ssmws.types.ServiceVersionType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ServiceCompatibilityEnum"));
        oper.setReturnClass(com.bea.security.ssmws.types.ServiceCompatibilityEnum.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Value"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryActionsOnResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType"), com.bea.security.ssmws.types.IdentityAssertionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResource"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResourceType"), com.bea.security.ssmws.types.RuntimeResourceType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedActions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedActionsType"), com.bea.security.ssmws.types.RequestedActionsType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AppContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType"), com.bea.security.ssmws.types.ContextType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeEntitlement"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeEntitlementType"), com.bea.security.ssmws.types.RuntimeEntitlementType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResponseContext"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType"), com.bea.security.ssmws.types.ContextType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "authorizationFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("establishSession");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "PrincipalsInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "PrincipalsInfoType"), com.bea.security.ssmws.types.PrincipalsInfoType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedCredentialType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AppContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType"), com.bea.security.ssmws.types.ContextType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType"), com.bea.security.ssmws.types.IdentityAssertionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Challenge"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ChallengeType"), com.bea.security.ssmws.types.ChallengeType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "StatusInfo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "authorizationFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isChildResourceAccessAllowed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType"), com.bea.security.ssmws.types.IdentityAssertionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResourceAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResourceActionType"), com.bea.security.ssmws.types.ResourceActionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedCredentialType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AppContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType"), com.bea.security.ssmws.types.ContextType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ExtendedAuthorizationResultType"));
        oper.setReturnClass(com.bea.security.ssmws.types.ExtendedAuthorizationResultType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "authorizationFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isBulkAccessAllowed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType"), com.bea.security.ssmws.types.IdentityAssertionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResourceAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResourceActionType"), com.bea.security.ssmws.types.ResourceActionType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedCredentialType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AppContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType"), com.bea.security.ssmws.types.ContextType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ExtendedAuthorizationResultType"));
        oper.setReturnClass(com.bea.security.ssmws.types.ExtendedAuthorizationResultType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "authorizationFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isAccessAllowed");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType"), com.bea.security.ssmws.types.IdentityAssertionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResource"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResourceType"), com.bea.security.ssmws.types.RuntimeResourceType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeActionType"), com.bea.security.ssmws.types.RuntimeActionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedCredentialType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AppContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType"), com.bea.security.ssmws.types.ContextType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDirection"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDirectionEnum"), com.bea.security.ssmws.types.AtzDirectionEnum.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AccessAllowed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDecisionData"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDecisionDataType"), com.bea.security.ssmws.types.AtzDecisionDataType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRequests"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRequestsType"), com.bea.security.ssmws.types.ContextRequestsType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "authorizationFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServiceType");
        oper.setReturnType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ServiceTypeEnum"));
        oper.setReturnClass(com.bea.security.ssmws.types.ServiceTypeEnum.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ServiceType"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryActionsOnChildResource");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType"), com.bea.security.ssmws.types.IdentityAssertionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResource"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResourceType"), com.bea.security.ssmws.types.RuntimeResourceType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedActions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedActionsType"), com.bea.security.ssmws.types.RequestedActionsType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AppContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType"), com.bea.security.ssmws.types.ContextType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "EntitlementList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeEntitlementType"), com.bea.security.ssmws.types.RuntimeEntitlementType[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResponseContext"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType"), com.bea.security.ssmws.types.ContextType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "authorizationFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isAuthenticationRequired");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResource"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResourceType"), com.bea.security.ssmws.types.RuntimeResourceType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeActionType"), com.bea.security.ssmws.types.RuntimeActionType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "isAuthenticationRequiredResponse"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "authorizationFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isAccessAllowedDebug");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType"), com.bea.security.ssmws.types.IdentityAssertionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResource"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResourceType"), com.bea.security.ssmws.types.RuntimeResourceType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeAction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeActionType"), com.bea.security.ssmws.types.RuntimeActionType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedCredentialType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AppContext"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType"), com.bea.security.ssmws.types.ContextType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AccessAllowed"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDecisionData"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDecisionDataType"), com.bea.security.ssmws.types.AtzDecisionDataType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRequests"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRequestsType"), com.bea.security.ssmws.types.ContextRequestsType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DebugInfo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DebugInfoType"), com.bea.security.ssmws.types.DebugInfoType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "authorizationFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[10] = oper;

    }

    public AuthorizationBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AuthorizationBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AuthorizationBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AssertIdentityType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AssertIdentityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AssertionTokenSupportedResponseType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AssertionTokenSupportedResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AttributeAssignmentType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AttributeAssignmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AttributeValueType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AttributeValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDecisionDataType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AtzDecisionDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDirectionEnum");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AtzDirectionEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuditRecordType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AuditRecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuditSeverityEnum");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AuditSeverityEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthenticateType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AuthenticateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthenticationRequiredResponseType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AuthenticationRequiredResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthenticationResultType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AuthenticationResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthorizationDebugResultType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AuthorizationDebugResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthorizationPolicyType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AuthorizationPolicyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthorizationResultType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.AuthorizationResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "BulkAuthorizationResultType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.BulkAuthorizationResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "BulkChildAuthorizationResultType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.BulkChildAuthorizationResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ChallengeType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ChallengeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ComplexAnyURI");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ComplexAnyURI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ConstraintAttributeType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ConstraintAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRecordType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ContextRecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRequestsType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ContextRequestsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ContextType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "CredentialMethodEnum");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.CredentialMethodEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "CredentialType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.CredentialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "CredentialTypesType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.CredentialTypesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DebugInfoType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.DebugInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DoesServiceExistResponseType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.DoesServiceExistResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "EmptyAttributedType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.EmptyAttributedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "EstablishSessionType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.EstablishSessionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ExtendedAuthorizationResultType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ExtendedAuthorizationResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.FaultInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "GetCredentialsResultType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.GetCredentialsResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "GetCredentialsType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.GetCredentialsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "getParameterValueResponseType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.GetParameterValueResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "getParameterValueType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.GetParameterValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "GetRolesDebugResponseType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.GetRolesDebugResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "GetRolesDebugType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.GetRolesDebugType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "GetRolesType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.GetRolesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "GetServiceTypeReturnType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.GetServiceTypeReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.IdentityAssertionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityCredentialType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.IdentityCredentialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityRolesType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.IdentityRolesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityRoleType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.IdentityRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IsAccessAllowedDebugType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.IsAccessAllowedDebugType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IsAccessAllowedType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.IsAccessAllowedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IsAssertionTokenSupportedType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.IsAssertionTokenSupportedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IsAuthenticationRequiredType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.IsAuthenticationRequiredType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IsBulkAccessAllowedType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.IsBulkAccessAllowedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IsChildResourceAccessAllowedType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.IsChildResourceAccessAllowedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IsCompatibleReturnType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.IsCompatibleReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IsCompatibleType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.IsCompatibleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ObligationsType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ObligationsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ObligationType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ObligationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "PrincipalInfoType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.PrincipalInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "PrincipalsInfoType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.PrincipalsInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "QueryActionsOnChildResourceResultType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.QueryActionsOnChildResourceResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "QueryActionsOnChildResourceType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.QueryActionsOnChildResourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "QueryActionsOnResourceResultType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.QueryActionsOnResourceResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "QueryActionsOnResourceType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.QueryActionsOnResourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RecordEventResponseType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.RecordEventResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RecordEventType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.RecordEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedActionsType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.RequestedActionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResourceActionType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ResourceActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RolePolicyType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.RolePolicyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeActionType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.RuntimeActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeEntitlementType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.RuntimeEntitlementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeResourceType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.RuntimeResourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ServiceCompatibilityEnum");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ServiceCompatibilityEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ServiceTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ServiceTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ServiceVersionType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ServiceVersionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "SsmIdType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.SsmIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "UserInfoType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.UserInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ValidateIdentityResponseType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ValidateIdentityResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ValidateIdentityType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.ValidateIdentityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.bea.security.ssmws.types.ServiceVersionType getVersion() throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("security:ssmws:Authorization#getVersion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "getVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bea.security.ssmws.types.ServiceVersionType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bea.security.ssmws.types.ServiceVersionType) org.apache.axis.utils.JavaUtils.convert(_resp, com.bea.security.ssmws.types.ServiceVersionType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.bea.security.ssmws.types.ServiceCompatibilityEnum isCompatible(com.bea.security.ssmws.types.ServiceVersionType serviceVersion) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("security:ssmws:Authorization#isCompatible");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "isCompatible"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {serviceVersion});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bea.security.ssmws.types.ServiceCompatibilityEnum) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bea.security.ssmws.types.ServiceCompatibilityEnum) org.apache.axis.utils.JavaUtils.convert(_resp, com.bea.security.ssmws.types.ServiceCompatibilityEnum.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void queryActionsOnResource(com.bea.security.ssmws.types.IdentityAssertionType identityAssertion, com.bea.security.ssmws.types.RuntimeResourceType runtimeResource, com.bea.security.ssmws.types.RequestedActionsType requestedActions, com.bea.security.ssmws.types.ContextType appContext, com.bea.security.ssmws.types.holders.RuntimeEntitlementTypeHolder runtimeEntitlement, com.bea.security.ssmws.types.holders.ContextTypeHolder responseContext) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("security:ssmws:Authorization#queryActionsOnResource");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "queryActionsOnResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identityAssertion, runtimeResource, requestedActions, appContext});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                runtimeEntitlement.value = (com.bea.security.ssmws.types.RuntimeEntitlementType) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeEntitlement"));
            } catch (java.lang.Exception _exception) {
                runtimeEntitlement.value = (com.bea.security.ssmws.types.RuntimeEntitlementType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeEntitlement")), com.bea.security.ssmws.types.RuntimeEntitlementType.class);
            }
            try {
                responseContext.value = (com.bea.security.ssmws.types.ContextType) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResponseContext"));
            } catch (java.lang.Exception _exception) {
                responseContext.value = (com.bea.security.ssmws.types.ContextType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResponseContext")), com.bea.security.ssmws.types.ContextType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void establishSession(com.bea.security.ssmws.types.PrincipalsInfoType principalsInfo, java.lang.String requestedCredentialType, com.bea.security.ssmws.types.ContextType appContext, com.bea.security.ssmws.types.holders.IdentityAssertionTypeHolder identityAssertion, com.bea.security.ssmws.types.holders.ChallengeTypeHolder challenge, org.w3.www._2001.XMLSchema.holders.StringArrayHolder statusInfo) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("security:ssmws:Authorization#establishSession");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "establishSession"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {principalsInfo, requestedCredentialType, appContext});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                identityAssertion.value = (com.bea.security.ssmws.types.IdentityAssertionType) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"));
            } catch (java.lang.Exception _exception) {
                identityAssertion.value = (com.bea.security.ssmws.types.IdentityAssertionType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion")), com.bea.security.ssmws.types.IdentityAssertionType.class);
            }
            try {
                challenge.value = (com.bea.security.ssmws.types.ChallengeType) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Challenge"));
            } catch (java.lang.Exception _exception) {
                challenge.value = (com.bea.security.ssmws.types.ChallengeType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Challenge")), com.bea.security.ssmws.types.ChallengeType.class);
            }
            try {
                statusInfo.value = (java.lang.String[]) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "StatusInfo"));
            } catch (java.lang.Exception _exception) {
                statusInfo.value = (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "StatusInfo")), java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.bea.security.ssmws.types.ExtendedAuthorizationResultType[] isChildResourceAccessAllowed(com.bea.security.ssmws.types.IdentityAssertionType identityAssertion, com.bea.security.ssmws.types.ResourceActionType resourceAction, java.lang.String requestedCredentialType, com.bea.security.ssmws.types.ContextType appContext) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("security:ssmws:Authorization#isChildResourceAccessAllowed");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "isChildResourceAccessAllowed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identityAssertion, resourceAction, requestedCredentialType, appContext});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bea.security.ssmws.types.ExtendedAuthorizationResultType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bea.security.ssmws.types.ExtendedAuthorizationResultType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.bea.security.ssmws.types.ExtendedAuthorizationResultType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.bea.security.ssmws.types.ExtendedAuthorizationResultType[] isBulkAccessAllowed(com.bea.security.ssmws.types.IdentityAssertionType identityAssertion, com.bea.security.ssmws.types.ResourceActionType[] resourceAction, java.lang.String requestedCredentialType, com.bea.security.ssmws.types.ContextType appContext) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("security:ssmws:Authorization#isBulkAccessAllowed");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "isBulkAccessAllowed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identityAssertion, resourceAction, requestedCredentialType, appContext});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bea.security.ssmws.types.ExtendedAuthorizationResultType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bea.security.ssmws.types.ExtendedAuthorizationResultType[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.bea.security.ssmws.types.ExtendedAuthorizationResultType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void isAccessAllowed(com.bea.security.ssmws.types.IdentityAssertionType identityAssertion, com.bea.security.ssmws.types.RuntimeResourceType runtimeResource, com.bea.security.ssmws.types.RuntimeActionType runtimeAction, java.lang.String requestedCredentialType, com.bea.security.ssmws.types.ContextType appContext, com.bea.security.ssmws.types.AtzDirectionEnum atzDirection, javax.xml.rpc.holders.BooleanHolder accessAllowed, com.bea.security.ssmws.types.holders.AtzDecisionDataTypeHolder atzDecisionData, com.bea.security.ssmws.types.holders.ContextRequestsTypeHolder contextRequests) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("security:ssmws:Authorization#isAccessAllowed");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "isAccessAllowed"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identityAssertion, runtimeResource, runtimeAction, requestedCredentialType, appContext, atzDirection});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                accessAllowed.value = ((java.lang.Boolean) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AccessAllowed"))).booleanValue();
            } catch (java.lang.Exception _exception) {
                accessAllowed.value = ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AccessAllowed")), boolean.class)).booleanValue();
            }
            try {
                atzDecisionData.value = (com.bea.security.ssmws.types.AtzDecisionDataType) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDecisionData"));
            } catch (java.lang.Exception _exception) {
                atzDecisionData.value = (com.bea.security.ssmws.types.AtzDecisionDataType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDecisionData")), com.bea.security.ssmws.types.AtzDecisionDataType.class);
            }
            try {
                contextRequests.value = (com.bea.security.ssmws.types.ContextRequestsType) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRequests"));
            } catch (java.lang.Exception _exception) {
                contextRequests.value = (com.bea.security.ssmws.types.ContextRequestsType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRequests")), com.bea.security.ssmws.types.ContextRequestsType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.bea.security.ssmws.types.ServiceTypeEnum getServiceType() throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("security:ssmws:Authorization#getServiceType");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "getServiceType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bea.security.ssmws.types.ServiceTypeEnum) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bea.security.ssmws.types.ServiceTypeEnum) org.apache.axis.utils.JavaUtils.convert(_resp, com.bea.security.ssmws.types.ServiceTypeEnum.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void queryActionsOnChildResource(com.bea.security.ssmws.types.IdentityAssertionType identityAssertion, com.bea.security.ssmws.types.RuntimeResourceType runtimeResource, com.bea.security.ssmws.types.RequestedActionsType requestedActions, com.bea.security.ssmws.types.ContextType appContext, com.bea.security.ssmws.types.holders.RuntimeEntitlementTypeArrayHolder entitlementList, com.bea.security.ssmws.types.holders.ContextTypeHolder responseContext) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("security:ssmws:Authorization#queryActionsOnChildResource");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "queryActionsOnChildResource"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identityAssertion, runtimeResource, requestedActions, appContext});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                entitlementList.value = (com.bea.security.ssmws.types.RuntimeEntitlementType[]) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "EntitlementList"));
            } catch (java.lang.Exception _exception) {
                entitlementList.value = (com.bea.security.ssmws.types.RuntimeEntitlementType[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "EntitlementList")), com.bea.security.ssmws.types.RuntimeEntitlementType[].class);
            }
            try {
                responseContext.value = (com.bea.security.ssmws.types.ContextType) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResponseContext"));
            } catch (java.lang.Exception _exception) {
                responseContext.value = (com.bea.security.ssmws.types.ContextType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResponseContext")), com.bea.security.ssmws.types.ContextType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean isAuthenticationRequired(com.bea.security.ssmws.types.RuntimeResourceType runtimeResource, com.bea.security.ssmws.types.RuntimeActionType runtimeAction) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("security:ssmws:Authorization#isAuthenticationRequired");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "isAuthenticationRequired"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {runtimeResource, runtimeAction});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void isAccessAllowedDebug(com.bea.security.ssmws.types.IdentityAssertionType identityAssertion, com.bea.security.ssmws.types.RuntimeResourceType runtimeResource, com.bea.security.ssmws.types.RuntimeActionType runtimeAction, java.lang.String requestedCredentialType, com.bea.security.ssmws.types.ContextType appContext, javax.xml.rpc.holders.BooleanHolder accessAllowed, com.bea.security.ssmws.types.holders.AtzDecisionDataTypeHolder atzDecisionData, com.bea.security.ssmws.types.holders.ContextRequestsTypeHolder contextRequests, com.bea.security.ssmws.types.holders.DebugInfoTypeHolder debugInfo) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("security:ssmws:Authorization#isAccessAllowedDebug");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "isAccessAllowedDebug"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {identityAssertion, runtimeResource, runtimeAction, requestedCredentialType, appContext});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                accessAllowed.value = ((java.lang.Boolean) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AccessAllowed"))).booleanValue();
            } catch (java.lang.Exception _exception) {
                accessAllowed.value = ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AccessAllowed")), boolean.class)).booleanValue();
            }
            try {
                atzDecisionData.value = (com.bea.security.ssmws.types.AtzDecisionDataType) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDecisionData"));
            } catch (java.lang.Exception _exception) {
                atzDecisionData.value = (com.bea.security.ssmws.types.AtzDecisionDataType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDecisionData")), com.bea.security.ssmws.types.AtzDecisionDataType.class);
            }
            try {
                contextRequests.value = (com.bea.security.ssmws.types.ContextRequestsType) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRequests"));
            } catch (java.lang.Exception _exception) {
                contextRequests.value = (com.bea.security.ssmws.types.ContextRequestsType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRequests")), com.bea.security.ssmws.types.ContextRequestsType.class);
            }
            try {
                debugInfo.value = (com.bea.security.ssmws.types.DebugInfoType) _output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DebugInfo"));
            } catch (java.lang.Exception _exception) {
                debugInfo.value = (com.bea.security.ssmws.types.DebugInfoType) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DebugInfo")), com.bea.security.ssmws.types.DebugInfoType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.bea.security.ssmws.types.FaultInfoType) {
              throw (com.bea.security.ssmws.types.FaultInfoType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
