/**
 * ChallengeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class ChallengeType  implements java.io.Serializable {
    private org.apache.axis.types.NCName challengeCode;
    private java.lang.String challengeState;
    private byte[] blob;

    public ChallengeType() {
    }

    public ChallengeType(
           org.apache.axis.types.NCName challengeCode,
           java.lang.String challengeState,
           byte[] blob) {
           this.challengeCode = challengeCode;
           this.challengeState = challengeState;
           this.blob = blob;
    }


    /**
     * Gets the challengeCode value for this ChallengeType.
     * 
     * @return challengeCode
     */
    public org.apache.axis.types.NCName getChallengeCode() {
        return challengeCode;
    }


    /**
     * Sets the challengeCode value for this ChallengeType.
     * 
     * @param challengeCode
     */
    public void setChallengeCode(org.apache.axis.types.NCName challengeCode) {
        this.challengeCode = challengeCode;
    }


    /**
     * Gets the challengeState value for this ChallengeType.
     * 
     * @return challengeState
     */
    public java.lang.String getChallengeState() {
        return challengeState;
    }


    /**
     * Sets the challengeState value for this ChallengeType.
     * 
     * @param challengeState
     */
    public void setChallengeState(java.lang.String challengeState) {
        this.challengeState = challengeState;
    }


    /**
     * Gets the blob value for this ChallengeType.
     * 
     * @return blob
     */
    public byte[] getBlob() {
        return blob;
    }


    /**
     * Sets the blob value for this ChallengeType.
     * 
     * @param blob
     */
    public void setBlob(byte[] blob) {
        this.blob = blob;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChallengeType)) return false;
        ChallengeType other = (ChallengeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.challengeCode==null && other.getChallengeCode()==null) || 
             (this.challengeCode!=null &&
              this.challengeCode.equals(other.getChallengeCode()))) &&
            ((this.challengeState==null && other.getChallengeState()==null) || 
             (this.challengeState!=null &&
              this.challengeState.equals(other.getChallengeState()))) &&
            ((this.blob==null && other.getBlob()==null) || 
             (this.blob!=null &&
              java.util.Arrays.equals(this.blob, other.getBlob())));
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
        if (getChallengeCode() != null) {
            _hashCode += getChallengeCode().hashCode();
        }
        if (getChallengeState() != null) {
            _hashCode += getChallengeState().hashCode();
        }
        if (getBlob() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlob());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlob(), i);
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
        new org.apache.axis.description.TypeDesc(ChallengeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ChallengeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ChallengeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "NCName"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("challengeState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ChallengeState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Blob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
