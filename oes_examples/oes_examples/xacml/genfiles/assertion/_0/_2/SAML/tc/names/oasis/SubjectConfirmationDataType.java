/**
 * SubjectConfirmationDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class SubjectConfirmationDataType  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType, org.apache.axis.encoding.MixedContentType {
    private org.apache.axis.message.MessageElement [] _any;
    private java.util.Calendar notBefore;  // attribute
    private java.util.Calendar notOnOrAfter;  // attribute
    private org.apache.axis.types.URI recipient;  // attribute
    private org.apache.axis.types.NCName inResponseTo;  // attribute
    private java.lang.String address;  // attribute

    public SubjectConfirmationDataType() {
    }

    public SubjectConfirmationDataType(
           org.apache.axis.message.MessageElement [] _any,
           java.util.Calendar notBefore,
           java.util.Calendar notOnOrAfter,
           org.apache.axis.types.URI recipient,
           org.apache.axis.types.NCName inResponseTo,
           java.lang.String address) {
           this._any = _any;
           this.notBefore = notBefore;
           this.notOnOrAfter = notOnOrAfter;
           this.recipient = recipient;
           this.inResponseTo = inResponseTo;
           this.address = address;
    }


    /**
     * Gets the _any value for this SubjectConfirmationDataType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this SubjectConfirmationDataType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }


    /**
     * Gets the notBefore value for this SubjectConfirmationDataType.
     * 
     * @return notBefore
     */
    public java.util.Calendar getNotBefore() {
        return notBefore;
    }


    /**
     * Sets the notBefore value for this SubjectConfirmationDataType.
     * 
     * @param notBefore
     */
    public void setNotBefore(java.util.Calendar notBefore) {
        this.notBefore = notBefore;
    }


    /**
     * Gets the notOnOrAfter value for this SubjectConfirmationDataType.
     * 
     * @return notOnOrAfter
     */
    public java.util.Calendar getNotOnOrAfter() {
        return notOnOrAfter;
    }


    /**
     * Sets the notOnOrAfter value for this SubjectConfirmationDataType.
     * 
     * @param notOnOrAfter
     */
    public void setNotOnOrAfter(java.util.Calendar notOnOrAfter) {
        this.notOnOrAfter = notOnOrAfter;
    }


    /**
     * Gets the recipient value for this SubjectConfirmationDataType.
     * 
     * @return recipient
     */
    public org.apache.axis.types.URI getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this SubjectConfirmationDataType.
     * 
     * @param recipient
     */
    public void setRecipient(org.apache.axis.types.URI recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the inResponseTo value for this SubjectConfirmationDataType.
     * 
     * @return inResponseTo
     */
    public org.apache.axis.types.NCName getInResponseTo() {
        return inResponseTo;
    }


    /**
     * Sets the inResponseTo value for this SubjectConfirmationDataType.
     * 
     * @param inResponseTo
     */
    public void setInResponseTo(org.apache.axis.types.NCName inResponseTo) {
        this.inResponseTo = inResponseTo;
    }


    /**
     * Gets the address value for this SubjectConfirmationDataType.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this SubjectConfirmationDataType.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubjectConfirmationDataType)) return false;
        SubjectConfirmationDataType other = (SubjectConfirmationDataType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any()))) &&
            ((this.notBefore==null && other.getNotBefore()==null) || 
             (this.notBefore!=null &&
              this.notBefore.equals(other.getNotBefore()))) &&
            ((this.notOnOrAfter==null && other.getNotOnOrAfter()==null) || 
             (this.notOnOrAfter!=null &&
              this.notOnOrAfter.equals(other.getNotOnOrAfter()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.inResponseTo==null && other.getInResponseTo()==null) || 
             (this.inResponseTo!=null &&
              this.inResponseTo.equals(other.getInResponseTo()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotBefore() != null) {
            _hashCode += getNotBefore().hashCode();
        }
        if (getNotOnOrAfter() != null) {
            _hashCode += getNotOnOrAfter().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getInResponseTo() != null) {
            _hashCode += getInResponseTo().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubjectConfirmationDataType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "SubjectConfirmationDataType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notBefore");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotBefore"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("notOnOrAfter");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NotOnOrAfter"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("recipient");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Recipient"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("inResponseTo");
        attrField.setXmlName(new javax.xml.namespace.QName("", "InResponseTo"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "NCName"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("address");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Address"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
