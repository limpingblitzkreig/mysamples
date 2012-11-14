/**
 * ResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package protocol._0._2.SAML.tc.names.oasis;

public class ResponseType  extends protocol._0._2.SAML.tc.names.oasis.StatusResponseType  implements java.io.Serializable {
    private assertion._0._2.SAML.tc.names.oasis.AssertionType assertion;
    private assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedAssertion;

    public ResponseType() {
    }

    public ResponseType(
           assertion._0._2.SAML.tc.names.oasis.AssertionType assertion,
           assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedAssertion) {
           this.assertion = assertion;
           this.encryptedAssertion = encryptedAssertion;
    }


    /**
     * Gets the assertion value for this ResponseType.
     * 
     * @return assertion
     */
    public assertion._0._2.SAML.tc.names.oasis.AssertionType getAssertion() {
        return assertion;
    }


    /**
     * Sets the assertion value for this ResponseType.
     * 
     * @param assertion
     */
    public void setAssertion(assertion._0._2.SAML.tc.names.oasis.AssertionType assertion) {
        this.assertion = assertion;
    }


    /**
     * Gets the encryptedAssertion value for this ResponseType.
     * 
     * @return encryptedAssertion
     */
    public assertion._0._2.SAML.tc.names.oasis.EncryptedElementType getEncryptedAssertion() {
        return encryptedAssertion;
    }


    /**
     * Sets the encryptedAssertion value for this ResponseType.
     * 
     * @param encryptedAssertion
     */
    public void setEncryptedAssertion(assertion._0._2.SAML.tc.names.oasis.EncryptedElementType encryptedAssertion) {
        this.encryptedAssertion = encryptedAssertion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseType)) return false;
        ResponseType other = (ResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assertion==null && other.getAssertion()==null) || 
             (this.assertion!=null &&
              this.assertion.equals(other.getAssertion()))) &&
            ((this.encryptedAssertion==null && other.getEncryptedAssertion()==null) || 
             (this.encryptedAssertion!=null &&
              this.encryptedAssertion.equals(other.getEncryptedAssertion())));
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
        if (getAssertion() != null) {
            _hashCode += getAssertion().hashCode();
        }
        if (getEncryptedAssertion() != null) {
            _hashCode += getEncryptedAssertion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:protocol", "ResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assertion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Assertion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Assertion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptedAssertion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedAssertion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "EncryptedAssertion"));
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
