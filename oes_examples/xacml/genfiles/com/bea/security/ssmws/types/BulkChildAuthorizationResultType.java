/**
 * BulkChildAuthorizationResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class BulkChildAuthorizationResultType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.ExtendedAuthorizationResultType[] atzResult;

    public BulkChildAuthorizationResultType() {
    }

    public BulkChildAuthorizationResultType(
           com.bea.security.ssmws.types.ExtendedAuthorizationResultType[] atzResult) {
           this.atzResult = atzResult;
    }


    /**
     * Gets the atzResult value for this BulkChildAuthorizationResultType.
     * 
     * @return atzResult
     */
    public com.bea.security.ssmws.types.ExtendedAuthorizationResultType[] getAtzResult() {
        return atzResult;
    }


    /**
     * Sets the atzResult value for this BulkChildAuthorizationResultType.
     * 
     * @param atzResult
     */
    public void setAtzResult(com.bea.security.ssmws.types.ExtendedAuthorizationResultType[] atzResult) {
        this.atzResult = atzResult;
    }

    public com.bea.security.ssmws.types.ExtendedAuthorizationResultType getAtzResult(int i) {
        return this.atzResult[i];
    }

    public void setAtzResult(int i, com.bea.security.ssmws.types.ExtendedAuthorizationResultType _value) {
        this.atzResult[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BulkChildAuthorizationResultType)) return false;
        BulkChildAuthorizationResultType other = (BulkChildAuthorizationResultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atzResult==null && other.getAtzResult()==null) || 
             (this.atzResult!=null &&
              java.util.Arrays.equals(this.atzResult, other.getAtzResult())));
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
        if (getAtzResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAtzResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAtzResult(), i);
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
        new org.apache.axis.description.TypeDesc(BulkChildAuthorizationResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "BulkChildAuthorizationResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AtzResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ExtendedAuthorizationResultType"));
        elemField.setNillable(true);
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
