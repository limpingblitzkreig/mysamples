/**
 * RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types.context;

public class RequestType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.context.SubjectType[] subject;
    private com.bea.security.ssmws.types.context.ResourceType[] resource;
    private com.bea.security.ssmws.types.context.ActionType action;
    private com.bea.security.ssmws.types.context.EnvironmentType environment;

    public RequestType() {
    }

    public RequestType(
           com.bea.security.ssmws.types.context.SubjectType[] subject,
           com.bea.security.ssmws.types.context.ResourceType[] resource,
           com.bea.security.ssmws.types.context.ActionType action,
           com.bea.security.ssmws.types.context.EnvironmentType environment) {
           this.subject = subject;
           this.resource = resource;
           this.action = action;
           this.environment = environment;
    }


    /**
     * Gets the subject value for this RequestType.
     * 
     * @return subject
     */
    public com.bea.security.ssmws.types.context.SubjectType[] getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this RequestType.
     * 
     * @param subject
     */
    public void setSubject(com.bea.security.ssmws.types.context.SubjectType[] subject) {
        this.subject = subject;
    }

    public com.bea.security.ssmws.types.context.SubjectType getSubject(int i) {
        return this.subject[i];
    }

    public void setSubject(int i, com.bea.security.ssmws.types.context.SubjectType _value) {
        this.subject[i] = _value;
    }


    /**
     * Gets the resource value for this RequestType.
     * 
     * @return resource
     */
    public com.bea.security.ssmws.types.context.ResourceType[] getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this RequestType.
     * 
     * @param resource
     */
    public void setResource(com.bea.security.ssmws.types.context.ResourceType[] resource) {
        this.resource = resource;
    }

    public com.bea.security.ssmws.types.context.ResourceType getResource(int i) {
        return this.resource[i];
    }

    public void setResource(int i, com.bea.security.ssmws.types.context.ResourceType _value) {
        this.resource[i] = _value;
    }


    /**
     * Gets the action value for this RequestType.
     * 
     * @return action
     */
    public com.bea.security.ssmws.types.context.ActionType getAction() {
        return action;
    }


    /**
     * Sets the action value for this RequestType.
     * 
     * @param action
     */
    public void setAction(com.bea.security.ssmws.types.context.ActionType action) {
        this.action = action;
    }


    /**
     * Gets the environment value for this RequestType.
     * 
     * @return environment
     */
    public com.bea.security.ssmws.types.context.EnvironmentType getEnvironment() {
        return environment;
    }


    /**
     * Sets the environment value for this RequestType.
     * 
     * @param environment
     */
    public void setEnvironment(com.bea.security.ssmws.types.context.EnvironmentType environment) {
        this.environment = environment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestType)) return false;
        RequestType other = (RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              java.util.Arrays.equals(this.subject, other.getSubject()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              java.util.Arrays.equals(this.resource, other.getResource()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.environment==null && other.getEnvironment()==null) || 
             (this.environment!=null &&
              this.environment.equals(other.getEnvironment())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSubject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubject(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getEnvironment() != null) {
            _hashCode += getEnvironment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "SubjectType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Resource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "ResourceType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "ActionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Environment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "EnvironmentType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
