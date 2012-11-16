/**
 * XACMLPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.service;

public interface XACMLPort extends java.rmi.Remote {
    public protocol._0._2.SAML.tc.names.oasis.ResponseType xacmlAuthzDecisionQuery(os.schema.protocol.saml._0._2.xacml.oasis.XACMLAuthzDecisionQueryType param) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType, com.bea.security.ssmws.types.FaultInfoType;
    public com.bea.security.ssmws.types.context.ResponseType authorize(com.bea.security.ssmws.types.context.RequestType param) throws java.rmi.RemoteException, com.bea.security.ssmws.types.FaultInfoType, com.bea.security.ssmws.types.FaultInfoType;
}
