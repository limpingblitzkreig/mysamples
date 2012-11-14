/**
 * XACMLServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.service;

public class XACMLServiceLocator extends org.apache.axis.client.Service implements com.bea.security.ssmws.service.XACMLService {

    public XACMLServiceLocator() {
    }


    public XACMLServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public XACMLServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for XACMLAuthorization
    private java.lang.String XACMLAuthorization_address = "http://localhost:9000/XACMLAuthorization";

    public java.lang.String getXACMLAuthorizationAddress() {
        return XACMLAuthorization_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String XACMLAuthorizationWSDDServiceName = "XACMLAuthorization";

    public java.lang.String getXACMLAuthorizationWSDDServiceName() {
        return XACMLAuthorizationWSDDServiceName;
    }

    public void setXACMLAuthorizationWSDDServiceName(java.lang.String name) {
        XACMLAuthorizationWSDDServiceName = name;
    }

    public com.bea.security.ssmws.service.XACMLPort getXACMLAuthorization() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(XACMLAuthorization_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getXACMLAuthorization(endpoint);
    }

    public com.bea.security.ssmws.service.XACMLPort getXACMLAuthorization(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bea.security.ssmws.service.XACMLAuthorizationBindingStub _stub = new com.bea.security.ssmws.service.XACMLAuthorizationBindingStub(portAddress, this);
            _stub.setPortName(getXACMLAuthorizationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setXACMLAuthorizationEndpointAddress(java.lang.String address) {
        XACMLAuthorization_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bea.security.ssmws.service.XACMLPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bea.security.ssmws.service.XACMLAuthorizationBindingStub _stub = new com.bea.security.ssmws.service.XACMLAuthorizationBindingStub(new java.net.URL(XACMLAuthorization_address), this);
                _stub.setPortName(getXACMLAuthorizationWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("XACMLAuthorization".equals(inputPortName)) {
            return getXACMLAuthorization();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-ws-1.0.wsdl", "XACMLService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-ws-1.0.wsdl", "XACMLAuthorization"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("XACMLAuthorization".equals(portName)) {
            setXACMLAuthorizationEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
