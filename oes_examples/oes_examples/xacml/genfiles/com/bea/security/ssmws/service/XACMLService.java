/**
 * XACMLService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.service;

public interface XACMLService extends javax.xml.rpc.Service {
    public java.lang.String getXACMLAuthorizationAddress();

    public com.bea.security.ssmws.service.XACMLPort getXACMLAuthorization() throws javax.xml.rpc.ServiceException;

    public com.bea.security.ssmws.service.XACMLPort getXACMLAuthorization(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
