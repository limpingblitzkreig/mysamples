/**
 * XACMLAuthorizationBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.service;

public class XACMLAuthorizationBindingStub extends org.apache.axis.client.Stub implements com.bea.security.ssmws.service.XACMLPort {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("xacmlAuthzDecisionQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:oasis:xacml:2.0:saml:protocol:schema:os", "XACMLAuthzDecisionQuery"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:oasis:xacml:2.0:saml:protocol:schema:os", "XACMLAuthzDecisionQueryType"), os.schema.protocol.saml._0._2.xacml.oasis.XACMLAuthzDecisionQueryType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "ResponseType"));
        oper.setReturnClass(protocol._0._2.SAML.tc.names.oasis.ResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "xacmlFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("authorize");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "RequestType"), com.bea.security.ssmws.types.context.RequestType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "ResponseType"));
        oper.setReturnClass(com.bea.security.ssmws.types.context.ResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "xacmlFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "serviceFailure"),
                      "com.bea.security.ssmws.types.FaultInfoType",
                      new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "FaultInfoType"), 
                      true
                     ));
        _operations[1] = oper;

    }

    public XACMLAuthorizationBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public XACMLAuthorizationBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public XACMLAuthorizationBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
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

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "CanonicalizationMethodType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.CanonicalizationMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "DigestMethodType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.DigestMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "DSAKeyValueType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.DSAKeyValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "KeyInfoType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.KeyInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "KeyValueType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.KeyValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "ManifestType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.ManifestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "ObjectType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.ObjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "PGPDataType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.PGPDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "ReferenceType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.ReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "RetrievalMethodType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.RetrievalMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "RSAKeyValueType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.RSAKeyValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureMethodType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SignatureMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignaturePropertiesType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SignaturePropertiesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignaturePropertyType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SignaturePropertyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SignatureType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignatureValueType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SignatureValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SignedInfoType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SignedInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "SPKIDataType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.SPKIDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "TransformsType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.TransformsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "TransformType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.TransformType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "X509DataType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.X509DataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "X509IssuerSerialType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2000._09.xmldsig.X509IssuerSerialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", ">ReferenceList");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2001._04.xmlenc.ReferenceList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "AgreementMethodType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2001._04.xmlenc.AgreementMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "CipherDataType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2001._04.xmlenc.CipherDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "CipherReferenceType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2001._04.xmlenc.CipherReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
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
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptedDataType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2001._04.xmlenc.EncryptedDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptedKeyType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2001._04.xmlenc.EncryptedKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptedType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2001._04.xmlenc.EncryptedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptionMethodType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2001._04.xmlenc.EncryptionMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptionPropertiesType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2001._04.xmlenc.EncryptionPropertiesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "EncryptionPropertyType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2001._04.xmlenc.EncryptionPropertyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "ReferenceType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2001._04.xmlenc.ReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/04/xmlenc#", "TransformsType");
            cachedSerQNames.add(qName);
            cls = org.w3.www._2001._04.xmlenc.TransformsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "ActionType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.ActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AdviceType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.AdviceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AssertionType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.AssertionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AttributeStatementType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.AttributeStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AttributeType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.AttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AudienceRestrictionType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.AudienceRestrictionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnContextType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.AuthnContextType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthnStatementType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.AuthnStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AuthzDecisionStatementType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.AuthzDecisionStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "BaseIDAbstractType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.BaseIDAbstractType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "ConditionAbstractType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.ConditionAbstractType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "ConditionsType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.ConditionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "DecisionType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.DecisionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedElementType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.EncryptedElementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EvidenceType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.EvidenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "NameIDType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.NameIDType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplesf);
            cachedDeserFactories.add(simpledf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "OneTimeUseType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.OneTimeUseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "ProxyRestrictionType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.ProxyRestrictionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "StatementAbstractType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.StatementAbstractType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectConfirmationDataType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.SubjectConfirmationDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectConfirmationType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.SubjectConfirmationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectLocalityType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.SubjectLocalityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectType");
            cachedSerQNames.add(qName);
            cls = assertion._0._2.SAML.tc.names.oasis.SubjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "ExtensionsType");
            cachedSerQNames.add(qName);
            cls = protocol._0._2.SAML.tc.names.oasis.ExtensionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "RequestAbstractType");
            cachedSerQNames.add(qName);
            cls = protocol._0._2.SAML.tc.names.oasis.RequestAbstractType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "ResponseType");
            cachedSerQNames.add(qName);
            cls = protocol._0._2.SAML.tc.names.oasis.ResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "StatusCodeType");
            cachedSerQNames.add(qName);
            cls = protocol._0._2.SAML.tc.names.oasis.StatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "StatusDetailType");
            cachedSerQNames.add(qName);
            cls = protocol._0._2.SAML.tc.names.oasis.StatusDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "StatusResponseType");
            cachedSerQNames.add(qName);
            cls = protocol._0._2.SAML.tc.names.oasis.StatusResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "StatusType");
            cachedSerQNames.add(qName);
            cls = protocol._0._2.SAML.tc.names.oasis.StatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "ActionType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.ActionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "AttributeType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.AttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "AttributeValueType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.AttributeValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "DecisionType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.DecisionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "EnvironmentType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.EnvironmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "MissingAttributeDetailType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.MissingAttributeDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "RequestType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.RequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "ResourceContentType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.ResourceContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "ResourceType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.ResourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "ResponseType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.ResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "ResultType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.ResultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "StatusCodeType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.StatusCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "StatusDetailType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.StatusDetailType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "StatusType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.StatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "SubjectType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.context.SubjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:os", "AttributeAssignmentType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.policy.AttributeAssignmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:os", "AttributeValueType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.policy.AttributeValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:os", "EffectType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.policy.EffectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:os", "ObligationsType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.policy.ObligationsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:os", "ObligationType");
            cachedSerQNames.add(qName);
            cls = com.bea.security.ssmws.types.policy.ObligationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:xacml:2.0:saml:assertion:schema:os", "XACMLAuthzDecisionStatementType");
            cachedSerQNames.add(qName);
            cls = os.schema.assertion.saml._0._2.xacml.oasis.XACMLAuthzDecisionStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:xacml:2.0:saml:protocol:schema:os", "XACMLAuthzDecisionQueryType");
            cachedSerQNames.add(qName);
            cls = os.schema.protocol.saml._0._2.xacml.oasis.XACMLAuthzDecisionQueryType.class;
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

    public protocol._0._2.SAML.tc.names.oasis.ResponseType xacmlAuthzDecisionQuery(os.schema.protocol.saml._0._2.xacml.oasis.XACMLAuthzDecisionQueryType param) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ssmws:xacml:xacmlAuthzDecisionQuery");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "xacmlAuthzDecisionQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (protocol._0._2.SAML.tc.names.oasis.ResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (protocol._0._2.SAML.tc.names.oasis.ResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, protocol._0._2.SAML.tc.names.oasis.ResponseType.class);
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

    public com.bea.security.ssmws.types.context.ResponseType authorize(com.bea.security.ssmws.types.context.RequestType param) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType, com.bea.security.ssmws.types.FaultInfoType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ssmws:xacml:authorization");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "authorize"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {param});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.bea.security.ssmws.types.context.ResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.bea.security.ssmws.types.context.ResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.bea.security.ssmws.types.context.ResponseType.class);
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
