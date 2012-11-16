/**
 * AtzDecisionDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class AtzDecisionDataType  implements java.io.Serializable {
    private java.lang.Integer atzTtlAdvice;
    private com.bea.security.ssmws.types.IdentityAssertionType identityAssertion;
    private com.bea.security.ssmws.types.IdentityRolesType identityRoles;
    private com.bea.security.ssmws.types.ContextType responses;
    private java.lang.String reason;
    private com.bea.security.ssmws.types.ObligationsType obligations;

    public AtzDecisionDataType() {
    }

    public AtzDecisionDataType(
           java.lang.Integer atzTtlAdvice,
           com.bea.security.ssmws.types.IdentityAssertionType identityAssertion,
           com.bea.security.ssmws.types.IdentityRolesType identityRoles,
           com.bea.security.ssmws.types.ContextType responses,
           java.lang.String reason,
           com.bea.security.ssmws.types.ObligationsType obligations) {
           this.atzTtlAdvice = atzTtlAdvice;
           this.identityAssertion = identityAssertion;
           this.identityRoles = identityRoles;
           this.responses = responses;
           this.reason = reason;
           this.obligations = obligations;
    }


    /**
     * Gets the atzTtlAdvice value for this AtzDecisionDataType.
     * 
     * @return atzTtlAdvice
     */
    public java.lang.Integer getAtzTtlAdvice() {
        return atzTtlAdvice;
    }


    /**
     * Sets the atzTtlAdvice value for this AtzDecisionDataType.
     * 
     * @param atzTtlAdvice
     */
    public void setAtzTtlAdvice(java.lang.Integer atzTtlAdvice) {
        this.atzTtlAdvice = atzTtlAdvice;
    }


    /**
     * Gets the identityAssertion value for this AtzDecisionDataType.
     * 
     * @return identityAssertion
     */
    public com.bea.security.ssmws.types.IdentityAssertionType getIdentityAssertion() {
        return identityAssertion;
    }


    /**
     * Sets the identityAssertion value for this AtzDecisionDataType.
     * 
     * @param identityAssertion
     */
    public void setIdentityAssertion(com.bea.security.ssmws.types.IdentityAssertionType identityAssertion) {
        this.identityAssertion = identityAssertion;
    }


    /**
     * Gets the identityRoles value for this AtzDecisionDataType.
     * 
     * @return identityRoles
     */
    public com.bea.security.ssmws.types.IdentityRolesType getIdentityRoles() {
        return identityRoles;
    }


    /**
     * Sets the identityRoles value for this AtzDecisionDataType.
     * 
     * @param identityRoles
     */
    public void setIdentityRoles(com.bea.security.ssmws.types.IdentityRolesType identityRoles) {
        this.identityRoles = identityRoles;
    }


    /**
     * Gets the responses value for this AtzDecisionDataType.
     * 
     * @return responses
     */
    public com.bea.security.ssmws.types.ContextType getResponses() {
        return responses;
    }


    /**
     * Sets the responses value for this AtzDecisionDataType.
     * 
     * @param responses
     */
    public void setResponses(com.bea.security.ssmws.types.ContextType responses) {
        this.responses = responses;
    }


    /**
     * Gets the reason value for this AtzDecisionDataType.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this AtzDecisionDataType.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the obligations value for this AtzDecisionDataType.
     * 
     * @return obligations
     */
    public com.bea.security.ssmws.types.ObligationsType getObligations() {
        return obligations;
    }


    /**
     * Sets the obligations value for this AtzDecisionDataType.
     * 
     * @param obligations
     */
    public void setObligations(com.bea.security.ssmws.types.ObligationsType obligations) {
        this.obligations = obligations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtzDecisionDataType)) return false;
        AtzDecisionDataType other = (AtzDecisionDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atzTtlAdvice==null && other.getAtzTtlAdvice()==null) || 
             (this.atzTtlAdvice!=null &&
              this.atzTtlAdvice.equals(other.getAtzTtlAdvice()))) &&
            ((this.identityAssertion==null && other.getIdentityAssertion()==null) || 
             (this.identityAssertion!=null &&
              this.identityAssertion.equals(other.getIdentityAssertion()))) &&
            ((this.identityRoles==null && other.getIdentityRoles()==null) || 
             (this.identityRoles!=null &&
              this.identityRoles.equals(other.getIdentityRoles()))) &&
            ((this.responses==null && other.getResponses()==null) || 
             (this.responses!=null &&
              this.responses.equals(other.getResponses()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.obligations==null && other.getObligations()==null) || 
             (this.obligations!=null &&
              this.obligations.equals(other.getObligations())));
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
        if (getAtzTtlAdvice() != null) {
            _hashCode += getAtzTtlAdvice().hashCode();
        }
        if (getIdentityAssertion() != null) {
            _hashCode += getIdentityAssertion().hashCode();
        }
        if (getIdentityRoles() != null) {
            _hashCode += getIdentityRoles().hashCode();
        }
        if (getResponses() != null) {
            _hashCode += getResponses().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getObligations() != null) {
            _hashCode += getObligations().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtzDecisionDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzDecisionDataType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atzTtlAdvice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzTtlAdvice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityAssertion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityRolesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Responses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obligations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Obligations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ObligationsType"));
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
