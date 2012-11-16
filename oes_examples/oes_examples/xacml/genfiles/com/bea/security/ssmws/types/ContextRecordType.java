/**
 * ContextRecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class ContextRecordType  implements java.io.Serializable {
    private javax.xml.namespace.QName recordName;
    private java.lang.String stringValue;
    private java.lang.Boolean boolValue;
    private java.util.Calendar dateTimeValue;
    private org.apache.axis.types.Time timeValue;
    private java.lang.Integer intValue;
    private java.lang.String ipValue;

    public ContextRecordType() {
    }

    public ContextRecordType(
           javax.xml.namespace.QName recordName,
           java.lang.String stringValue,
           java.lang.Boolean boolValue,
           java.util.Calendar dateTimeValue,
           org.apache.axis.types.Time timeValue,
           java.lang.Integer intValue,
           java.lang.String ipValue) {
           this.recordName = recordName;
           this.stringValue = stringValue;
           this.boolValue = boolValue;
           this.dateTimeValue = dateTimeValue;
           this.timeValue = timeValue;
           this.intValue = intValue;
           this.ipValue = ipValue;
    }


    /**
     * Gets the recordName value for this ContextRecordType.
     * 
     * @return recordName
     */
    public javax.xml.namespace.QName getRecordName() {
        return recordName;
    }


    /**
     * Sets the recordName value for this ContextRecordType.
     * 
     * @param recordName
     */
    public void setRecordName(javax.xml.namespace.QName recordName) {
        this.recordName = recordName;
    }


    /**
     * Gets the stringValue value for this ContextRecordType.
     * 
     * @return stringValue
     */
    public java.lang.String getStringValue() {
        return stringValue;
    }


    /**
     * Sets the stringValue value for this ContextRecordType.
     * 
     * @param stringValue
     */
    public void setStringValue(java.lang.String stringValue) {
        this.stringValue = stringValue;
    }


    /**
     * Gets the boolValue value for this ContextRecordType.
     * 
     * @return boolValue
     */
    public java.lang.Boolean getBoolValue() {
        return boolValue;
    }


    /**
     * Sets the boolValue value for this ContextRecordType.
     * 
     * @param boolValue
     */
    public void setBoolValue(java.lang.Boolean boolValue) {
        this.boolValue = boolValue;
    }


    /**
     * Gets the dateTimeValue value for this ContextRecordType.
     * 
     * @return dateTimeValue
     */
    public java.util.Calendar getDateTimeValue() {
        return dateTimeValue;
    }


    /**
     * Sets the dateTimeValue value for this ContextRecordType.
     * 
     * @param dateTimeValue
     */
    public void setDateTimeValue(java.util.Calendar dateTimeValue) {
        this.dateTimeValue = dateTimeValue;
    }


    /**
     * Gets the timeValue value for this ContextRecordType.
     * 
     * @return timeValue
     */
    public org.apache.axis.types.Time getTimeValue() {
        return timeValue;
    }


    /**
     * Sets the timeValue value for this ContextRecordType.
     * 
     * @param timeValue
     */
    public void setTimeValue(org.apache.axis.types.Time timeValue) {
        this.timeValue = timeValue;
    }


    /**
     * Gets the intValue value for this ContextRecordType.
     * 
     * @return intValue
     */
    public java.lang.Integer getIntValue() {
        return intValue;
    }


    /**
     * Sets the intValue value for this ContextRecordType.
     * 
     * @param intValue
     */
    public void setIntValue(java.lang.Integer intValue) {
        this.intValue = intValue;
    }


    /**
     * Gets the ipValue value for this ContextRecordType.
     * 
     * @return ipValue
     */
    public java.lang.String getIpValue() {
        return ipValue;
    }


    /**
     * Sets the ipValue value for this ContextRecordType.
     * 
     * @param ipValue
     */
    public void setIpValue(java.lang.String ipValue) {
        this.ipValue = ipValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContextRecordType)) return false;
        ContextRecordType other = (ContextRecordType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.recordName==null && other.getRecordName()==null) || 
             (this.recordName!=null &&
              this.recordName.equals(other.getRecordName()))) &&
            ((this.stringValue==null && other.getStringValue()==null) || 
             (this.stringValue!=null &&
              this.stringValue.equals(other.getStringValue()))) &&
            ((this.boolValue==null && other.getBoolValue()==null) || 
             (this.boolValue!=null &&
              this.boolValue.equals(other.getBoolValue()))) &&
            ((this.dateTimeValue==null && other.getDateTimeValue()==null) || 
             (this.dateTimeValue!=null &&
              this.dateTimeValue.equals(other.getDateTimeValue()))) &&
            ((this.timeValue==null && other.getTimeValue()==null) || 
             (this.timeValue!=null &&
              this.timeValue.equals(other.getTimeValue()))) &&
            ((this.intValue==null && other.getIntValue()==null) || 
             (this.intValue!=null &&
              this.intValue.equals(other.getIntValue()))) &&
            ((this.ipValue==null && other.getIpValue()==null) || 
             (this.ipValue!=null &&
              this.ipValue.equals(other.getIpValue())));
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
        if (getRecordName() != null) {
            _hashCode += getRecordName().hashCode();
        }
        if (getStringValue() != null) {
            _hashCode += getStringValue().hashCode();
        }
        if (getBoolValue() != null) {
            _hashCode += getBoolValue().hashCode();
        }
        if (getDateTimeValue() != null) {
            _hashCode += getDateTimeValue().hashCode();
        }
        if (getTimeValue() != null) {
            _hashCode += getTimeValue().hashCode();
        }
        if (getIntValue() != null) {
            _hashCode += getIntValue().hashCode();
        }
        if (getIpValue() != null) {
            _hashCode += getIpValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContextRecordType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextRecordType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RecordName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "QName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "StringValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boolValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "BoolValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DateTimeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "TimeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IntValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IpValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
