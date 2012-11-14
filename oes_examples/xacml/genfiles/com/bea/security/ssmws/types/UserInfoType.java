/**
 * UserInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class UserInfoType  implements java.io.Serializable {
    private java.lang.String[] qualifiedGroupNameList;
    private java.lang.String qualifiedUserName;

    public UserInfoType() {
    }

    public UserInfoType(
           java.lang.String[] qualifiedGroupNameList,
           java.lang.String qualifiedUserName) {
           this.qualifiedGroupNameList = qualifiedGroupNameList;
           this.qualifiedUserName = qualifiedUserName;
    }


    /**
     * Gets the qualifiedGroupNameList value for this UserInfoType.
     * 
     * @return qualifiedGroupNameList
     */
    public java.lang.String[] getQualifiedGroupNameList() {
        return qualifiedGroupNameList;
    }


    /**
     * Sets the qualifiedGroupNameList value for this UserInfoType.
     * 
     * @param qualifiedGroupNameList
     */
    public void setQualifiedGroupNameList(java.lang.String[] qualifiedGroupNameList) {
        this.qualifiedGroupNameList = qualifiedGroupNameList;
    }

    public java.lang.String getQualifiedGroupNameList(int i) {
        return this.qualifiedGroupNameList[i];
    }

    public void setQualifiedGroupNameList(int i, java.lang.String _value) {
        this.qualifiedGroupNameList[i] = _value;
    }


    /**
     * Gets the qualifiedUserName value for this UserInfoType.
     * 
     * @return qualifiedUserName
     */
    public java.lang.String getQualifiedUserName() {
        return qualifiedUserName;
    }


    /**
     * Sets the qualifiedUserName value for this UserInfoType.
     * 
     * @param qualifiedUserName
     */
    public void setQualifiedUserName(java.lang.String qualifiedUserName) {
        this.qualifiedUserName = qualifiedUserName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserInfoType)) return false;
        UserInfoType other = (UserInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qualifiedGroupNameList==null && other.getQualifiedGroupNameList()==null) || 
             (this.qualifiedGroupNameList!=null &&
              java.util.Arrays.equals(this.qualifiedGroupNameList, other.getQualifiedGroupNameList()))) &&
            ((this.qualifiedUserName==null && other.getQualifiedUserName()==null) || 
             (this.qualifiedUserName!=null &&
              this.qualifiedUserName.equals(other.getQualifiedUserName())));
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
        if (getQualifiedGroupNameList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQualifiedGroupNameList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQualifiedGroupNameList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQualifiedUserName() != null) {
            _hashCode += getQualifiedUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "UserInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifiedGroupNameList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "QualifiedGroupNameList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifiedUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "QualifiedUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
