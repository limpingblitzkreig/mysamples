/**
 * AttributeStatementType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class AttributeStatementType  extends assertion._0._2.SAML.tc.names.oasis.StatementAbstractType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedAttribute;
    private assertion._0._2.SAML.tc.names.oasis.AttributeType attribute;

    public AttributeStatementType() {
    }

    public AttributeStatementType(
           assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedAttribute,
           assertion._0._2.SAML.tc.names.oasis.AttributeType attribute) {
           this.encryptedAttribute = encryptedAttribute;
           this.attribute = attribute;
    }


    /**
     * Gets the encryptedAttribute value for this AttributeStatementType.
     * 
     * @return encryptedAttribute
     */
    public assertion._0._2.SAML.tc.names.oasis.EncryptedElementType getEncryptedAttribute() {
        return encryptedAttribute;
    }


    /**
     * Sets the encryptedAttribute value for this AttributeStatementType.
     * 
     * @param encryptedAttribute
     */
    public void setEncryptedAttribute(assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedAttribute) {
        this.encryptedAttribute = encryptedAttribute;
    }


    /**
     * Gets the attribute value for this AttributeStatementType.
     * 
     * @return attribute
     */
    public assertion._0._2.SAML.tc.names.oasis.AttributeType getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this AttributeStatementType.
     * 
     * @param attribute
     */
    public void setAttribute(assertion._0._2.SAML.tc.names.oasis.AttributeType attribute) {
        this.attribute = attribute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AttributeStatementType)) return false;
        AttributeStatementType other = (AttributeStatementType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.encryptedAttribute==null && other.getEncryptedAttribute()==null) || 
             (this.encryptedAttribute!=null &&
              this.encryptedAttribute.equals(other.getEncryptedAttribute()))) &&
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              this.attribute.equals(other.getAttribute())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEncryptedAttribute() != null) {
            _hashCode += getEncryptedAttribute().hashCode();
        }
        if (getAttribute() != null) {
            _hashCode += getAttribute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AttributeStatementType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AttributeStatementType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedAttribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedElementType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AttributeType"));
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
