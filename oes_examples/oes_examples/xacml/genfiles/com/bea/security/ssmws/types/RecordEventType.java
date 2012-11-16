/**
 * RecordEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class RecordEventType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.AuditRecordType auditRecord;
    private com.bea.security.ssmws.types.IdentityAssertionType identityAssertion;
    private com.bea.security.ssmws.types.ContextType appContext;

    public RecordEventType() {
    }

    public RecordEventType(
           com.bea.security.ssmws.types.AuditRecordType auditRecord,
           com.bea.security.ssmws.types.IdentityAssertionType identityAssertion,
           com.bea.security.ssmws.types.ContextType appContext) {
           this.auditRecord = auditRecord;
           this.identityAssertion = identityAssertion;
           this.appContext = appContext;
    }


    /**
     * Gets the auditRecord value for this RecordEventType.
     * 
     * @return auditRecord
     */
    public com.bea.security.ssmws.types.AuditRecordType getAuditRecord() {
        return auditRecord;
    }


    /**
     * Sets the auditRecord value for this RecordEventType.
     * 
     * @param auditRecord
     */
    public void setAuditRecord(com.bea.security.ssmws.types.AuditRecordType auditRecord) {
        this.auditRecord = auditRecord;
    }


    /**
     * Gets the identityAssertion value for this RecordEventType.
     * 
     * @return identityAssertion
     */
    public com.bea.security.ssmws.types.IdentityAssertionType getIdentityAssertion() {
        return identityAssertion;
    }


    /**
     * Sets the identityAssertion value for this RecordEventType.
     * 
     * @param identityAssertion
     */
    public void setIdentityAssertion(com.bea.security.ssmws.types.IdentityAssertionType identityAssertion) {
        this.identityAssertion = identityAssertion;
    }


    /**
     * Gets the appContext value for this RecordEventType.
     * 
     * @return appContext
     */
    public com.bea.security.ssmws.types.ContextType getAppContext() {
        return appContext;
    }


    /**
     * Sets the appContext value for this RecordEventType.
     * 
     * @param appContext
     */
    public void setAppContext(com.bea.security.ssmws.types.ContextType appContext) {
        this.appContext = appContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecordEventType)) return false;
        RecordEventType other = (RecordEventType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.auditRecord==null && other.getAuditRecord()==null) || 
             (this.auditRecord!=null &&
              this.auditRecord.equals(other.getAuditRecord()))) &&
            ((this.identityAssertion==null && other.getIdentityAssertion()==null) || 
             (this.identityAssertion!=null &&
              this.identityAssertion.equals(other.getIdentityAssertion()))) &&
            ((this.appContext==null && other.getAppContext()==null) || 
             (this.appContext!=null &&
              this.appContext.equals(other.getAppContext())));
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
        if (getAuditRecord() != null) {
            _hashCode += getAuditRecord().hashCode();
        }
        if (getIdentityAssertion() != null) {
            _hashCode += getIdentityAssertion().hashCode();
        }
        if (getAppContext() != null) {
            _hashCode += getAppContext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecordEventType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RecordEventType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuditRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuditRecordType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityAssertion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityAssertionType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AppContext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ContextType"));
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
