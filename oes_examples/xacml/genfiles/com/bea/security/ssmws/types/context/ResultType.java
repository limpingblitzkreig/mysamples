/**
 * ResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types.context;

public class ResultType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.context.DecisionType decision;
    private com.bea.security.ssmws.types.context.StatusType status;
    private com.bea.security.ssmws.types.policy.ObligationsType obligations;
    private java.lang.String resourceId;  // attribute

    public ResultType() {
    }

    public ResultType(
           com.bea.security.ssmws.types.context.DecisionType decision,
           com.bea.security.ssmws.types.context.StatusType status,
           com.bea.security.ssmws.types.policy.ObligationsType obligations,
           java.lang.String resourceId) {
           this.decision = decision;
           this.status = status;
           this.obligations = obligations;
           this.resourceId = resourceId;
    }


    /**
     * Gets the decision value for this ResultType.
     * 
     * @return decision
     */
    public com.bea.security.ssmws.types.context.DecisionType getDecision() {
        return decision;
    }


    /**
     * Sets the decision value for this ResultType.
     * 
     * @param decision
     */
    public void setDecision(com.bea.security.ssmws.types.context.DecisionType decision) {
        this.decision = decision;
    }


    /**
     * Gets the status value for this ResultType.
     * 
     * @return status
     */
    public com.bea.security.ssmws.types.context.StatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ResultType.
     * 
     * @param status
     */
    public void setStatus(com.bea.security.ssmws.types.context.StatusType status) {
        this.status = status;
    }


    /**
     * Gets the obligations value for this ResultType.
     * 
     * @return obligations
     */
    public com.bea.security.ssmws.types.policy.ObligationsType getObligations() {
        return obligations;
    }


    /**
     * Sets the obligations value for this ResultType.
     * 
     * @param obligations
     */
    public void setObligations(com.bea.security.ssmws.types.policy.ObligationsType obligations) {
        this.obligations = obligations;
    }


    /**
     * Gets the resourceId value for this ResultType.
     * 
     * @return resourceId
     */
    public java.lang.String getResourceId() {
        return resourceId;
    }


    /**
     * Sets the resourceId value for this ResultType.
     * 
     * @param resourceId
     */
    public void setResourceId(java.lang.String resourceId) {
        this.resourceId = resourceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultType)) return false;
        ResultType other = (ResultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.decision==null && other.getDecision()==null) || 
             (this.decision!=null &&
              this.decision.equals(other.getDecision()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.obligations==null && other.getObligations()==null) || 
             (this.obligations!=null &&
              this.obligations.equals(other.getObligations()))) &&
            ((this.resourceId==null && other.getResourceId()==null) || 
             (this.resourceId!=null &&
              this.resourceId.equals(other.getResourceId())));
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
        if (getDecision() != null) {
            _hashCode += getDecision().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getObligations() != null) {
            _hashCode += getObligations().hashCode();
        }
        if (getResourceId() != null) {
            _hashCode += getResourceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "ResultType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("resourceId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ResourceId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Decision"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "DecisionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:os", "StatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obligations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:os", "Obligations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:os", "Obligations"));
        elemField.setMinOccurs(0);
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
