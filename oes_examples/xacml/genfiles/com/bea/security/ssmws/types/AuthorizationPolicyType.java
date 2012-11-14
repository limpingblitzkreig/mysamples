/**
 * AuthorizationPolicyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class AuthorizationPolicyType  implements java.io.Serializable {
    private boolean policyEvaluationResult;
    private java.lang.String policyType;
    private java.lang.String privilege;
    private java.lang.String resource;
    private java.lang.String subject;
    private java.lang.String constraints;
    private java.lang.String delegator;
    private java.lang.String notes;
    private com.bea.security.ssmws.types.ConstraintAttributeType[] attributeList;

    public AuthorizationPolicyType() {
    }

    public AuthorizationPolicyType(
           boolean policyEvaluationResult,
           java.lang.String policyType,
           java.lang.String privilege,
           java.lang.String resource,
           java.lang.String subject,
           java.lang.String constraints,
           java.lang.String delegator,
           java.lang.String notes,
           com.bea.security.ssmws.types.ConstraintAttributeType[] attributeList) {
           this.policyEvaluationResult = policyEvaluationResult;
           this.policyType = policyType;
           this.privilege = privilege;
           this.resource = resource;
           this.subject = subject;
           this.constraints = constraints;
           this.delegator = delegator;
           this.notes = notes;
           this.attributeList = attributeList;
    }


    /**
     * Gets the policyEvaluationResult value for this AuthorizationPolicyType.
     * 
     * @return policyEvaluationResult
     */
    public boolean isPolicyEvaluationResult() {
        return policyEvaluationResult;
    }


    /**
     * Sets the policyEvaluationResult value for this AuthorizationPolicyType.
     * 
     * @param policyEvaluationResult
     */
    public void setPolicyEvaluationResult(boolean policyEvaluationResult) {
        this.policyEvaluationResult = policyEvaluationResult;
    }


    /**
     * Gets the policyType value for this AuthorizationPolicyType.
     * 
     * @return policyType
     */
    public java.lang.String getPolicyType() {
        return policyType;
    }


    /**
     * Sets the policyType value for this AuthorizationPolicyType.
     * 
     * @param policyType
     */
    public void setPolicyType(java.lang.String policyType) {
        this.policyType = policyType;
    }


    /**
     * Gets the privilege value for this AuthorizationPolicyType.
     * 
     * @return privilege
     */
    public java.lang.String getPrivilege() {
        return privilege;
    }


    /**
     * Sets the privilege value for this AuthorizationPolicyType.
     * 
     * @param privilege
     */
    public void setPrivilege(java.lang.String privilege) {
        this.privilege = privilege;
    }


    /**
     * Gets the resource value for this AuthorizationPolicyType.
     * 
     * @return resource
     */
    public java.lang.String getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this AuthorizationPolicyType.
     * 
     * @param resource
     */
    public void setResource(java.lang.String resource) {
        this.resource = resource;
    }


    /**
     * Gets the subject value for this AuthorizationPolicyType.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this AuthorizationPolicyType.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the constraints value for this AuthorizationPolicyType.
     * 
     * @return constraints
     */
    public java.lang.String getConstraints() {
        return constraints;
    }


    /**
     * Sets the constraints value for this AuthorizationPolicyType.
     * 
     * @param constraints
     */
    public void setConstraints(java.lang.String constraints) {
        this.constraints = constraints;
    }


    /**
     * Gets the delegator value for this AuthorizationPolicyType.
     * 
     * @return delegator
     */
    public java.lang.String getDelegator() {
        return delegator;
    }


    /**
     * Sets the delegator value for this AuthorizationPolicyType.
     * 
     * @param delegator
     */
    public void setDelegator(java.lang.String delegator) {
        this.delegator = delegator;
    }


    /**
     * Gets the notes value for this AuthorizationPolicyType.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this AuthorizationPolicyType.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the attributeList value for this AuthorizationPolicyType.
     * 
     * @return attributeList
     */
    public com.bea.security.ssmws.types.ConstraintAttributeType[] getAttributeList() {
        return attributeList;
    }


    /**
     * Sets the attributeList value for this AuthorizationPolicyType.
     * 
     * @param attributeList
     */
    public void setAttributeList(com.bea.security.ssmws.types.ConstraintAttributeType[] attributeList) {
        this.attributeList = attributeList;
    }

    public com.bea.security.ssmws.types.ConstraintAttributeType getAttributeList(int i) {
        return this.attributeList[i];
    }

    public void setAttributeList(int i, com.bea.security.ssmws.types.ConstraintAttributeType _value) {
        this.attributeList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthorizationPolicyType)) return false;
        AuthorizationPolicyType other = (AuthorizationPolicyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.policyEvaluationResult == other.isPolicyEvaluationResult() &&
            ((this.policyType==null && other.getPolicyType()==null) || 
             (this.policyType!=null &&
              this.policyType.equals(other.getPolicyType()))) &&
            ((this.privilege==null && other.getPrivilege()==null) || 
             (this.privilege!=null &&
              this.privilege.equals(other.getPrivilege()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              this.resource.equals(other.getResource()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.constraints==null && other.getConstraints()==null) || 
             (this.constraints!=null &&
              this.constraints.equals(other.getConstraints()))) &&
            ((this.delegator==null && other.getDelegator()==null) || 
             (this.delegator!=null &&
              this.delegator.equals(other.getDelegator()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.attributeList==null && other.getAttributeList()==null) || 
             (this.attributeList!=null &&
              java.util.Arrays.equals(this.attributeList, other.getAttributeList())));
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
        _hashCode += (isPolicyEvaluationResult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPolicyType() != null) {
            _hashCode += getPolicyType().hashCode();
        }
        if (getPrivilege() != null) {
            _hashCode += getPrivilege().hashCode();
        }
        if (getResource() != null) {
            _hashCode += getResource().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getConstraints() != null) {
            _hashCode += getConstraints().hashCode();
        }
        if (getDelegator() != null) {
            _hashCode += getDelegator().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getAttributeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthorizationPolicyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthorizationPolicyType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyEvaluationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "PolicyEvaluationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "PolicyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privilege");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Privilege"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Resource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constraints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Constraints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Delegator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AttributeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ConstraintAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
