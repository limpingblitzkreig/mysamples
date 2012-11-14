/**
 * Ssmws.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.service;

public interface Ssmws extends javax.xml.rpc.Service {
    public java.lang.String getAuthorizationAddress();

    public com.bea.security.ssmws.service.AuthorizationPort getAuthorization() throws javax.xml.rpc.ServiceException;

    public com.bea.security.ssmws.service.AuthorizationPort getAuthorization(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
