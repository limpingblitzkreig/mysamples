/**
 * ObligationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types.policy;

public class ObligationType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.policy.AttributeAssignmentType[] attributeAssignment;
    private org.apache.axis.types.URI obligationId;  // attribute
    private com.bea.security.ssmws.types.policy.EffectType fulfillOn;  // attribute

    public ObligationType() {
    }

    public ObligationType(
           com.bea.security.ssmws.types.policy.AttributeAssignmentType[] attributeAssignment,
           org.apache.axis.types.URI obligationId,
           com.bea.security.ssmws.types.policy.EffectType fulfillOn) {
           this.attributeAssignment = attributeAssignment;
           this.obligationId = obligationId;
           this.fulfillOn = fulfillOn;
    }


    /**
     * Gets the attributeAssignment value for this ObligationType.
     * 
     * @return attributeAssignment
     */
    public com.bea.security.ssmws.types.policy.AttributeAssignmentType[] getAttributeAssignment() {
        return attributeAssignment;
    }


    /**
     * Sets the attributeAssignment value for this ObligationType.
     * 
     * @param attributeAssignment
     */
    public void setAttributeAssignment(com.bea.security.ssmws.types.policy.AttributeAssignmentType[] attributeAssignment) {
        this.attributeAssignment = attributeAssignment;
    }

    public com.bea.security.ssmws.types.policy.AttributeAssignmentType getAttributeAssignment(int i) {
        return this.attributeAssignment[i];
    }

    public void setAttributeAssignment(int i, com.bea.security.ssmws.types.policy.AttributeAssignmentType _value) {
        this.attributeAssignment[i] = _value;
    }


    /**
     * Gets the obligationId value for this ObligationType.
     * 
     * @return obligationId
     */
    public org.apache.axis.types.URI getObligationId() {
        return obligationId;
    }


    /**
     * Sets the obligationId value for this ObligationType.
     * 
     * @param obligationId
     */
    public void setObligationId(org.apache.axis.types.URI obligationId) {
        this.obligationId = obligationId;
    }


    /**
     * Gets the fulfillOn value for this ObligationType.
     * 
     * @return fulfillOn
     */
    public com.bea.security.ssmws.types.policy.EffectType getFulfillOn() {
        return fulfillOn;
    }


    /**
     * Sets the fulfillOn value for this ObligationType.
     * 
     * @param fulfillOn
     */
    public void setFulfillOn(com.bea.security.ssmws.types.policy.EffectType fulfillOn) {
        this.fulfillOn = fulfillOn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObligationType)) return false;
        ObligationType other = (ObligationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributeAssignment==null && other.getAttributeAssignment()==null) || 
             (this.attributeAssignment!=null &&
              java.util.Arrays.equals(this.attributeAssignment, other.getAttributeAssignment()))) &&
            ((this.obligationId==null && other.getObligationId()==null) || 
             (this.obligationId!=null &&
              this.obligationId.equals(other.getObligationId()))) &&
            ((this.fulfillOn==null && other.getFulfillOn()==null) || 
             (this.fulfillOn!=null &&
              this.fulfillOn.equals(other.getFulfillOn())));
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
        if (getAttributeAssignment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributeAssignment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributeAssignment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObligationId() != null) {
            _hashCode += getObligationId().hashCode();
        }
        if (getFulfillOn() != null) {
            _hashCode += getFulfillOn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObligationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:os", "ObligationType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("obligationId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ObligationId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fulfillOn");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FulfillOn"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:os", "EffectType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeAssignment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:os", "AttributeAssignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:os", "AttributeAssignmentType"));
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
