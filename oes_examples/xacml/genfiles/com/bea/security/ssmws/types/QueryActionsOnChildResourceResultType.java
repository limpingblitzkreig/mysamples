/**
 * QueryActionsOnChildResourceResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class QueryActionsOnChildResourceResultType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.RuntimeEntitlementType[] entitlementList;
    private com.bea.security.ssmws.types.ContextType responseContext;

    public QueryActionsOnChildResourceResultType() {
    }

    public QueryActionsOnChildResourceResultType(
           com.bea.security.ssmws.types.RuntimeEntitlementType[] entitlementList,
           com.bea.security.ssmws.types.ContextType responseContext) {
           this.entitlementList = entitlementList;
           this.responseContext = responseContext;
    }


    /**
     * Gets the entitlementList value for this QueryActionsOnChildResourceResultType.
     * 
     * @return entitlementList
     */
    public com.bea.security.ssmws.types.RuntimeEntitlementType[] getEntitlementList() {
        return entitlementList;
    }


    /**
     * Sets the entitlementList value for this QueryActionsOnChildResourceResultType.
     * 
     * @param entitlementList
     */
    public void setEntitlementList(com.bea.security.ssmws.types.RuntimeEntitlementType[] entitlementList) {
        this.entitlementList = entitlementList;
    }

    public com.bea.security.ssmws.types.RuntimeEntitlementType getEntitlementList(int i) {
        return this.entitlementList[i];
    }

    public void setEntitlementList(int i, com.bea.security.ssmws.types.RuntimeEntitlementType _value) {
        this.entitlementList[i] = _value;
    }


    /**
     * Gets the responseContext value for this QueryActionsOnChildResourceResultType.
     * 
     * @return responseContext
     */
    public com.bea.security.ssmws.types.ContextType getResponseContext() {
        return responseContext;
    }


    /**
     * Sets the responseContext value for this QueryActionsOnChildResourceResultType.
     * 
     * @param responseContext
     */
    public void setResponseContext(com.bea.security.ssmws.types.ContextType responseContext) {
        this.responseContext = responseContext;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryActionsOnChildResourceResultType)) return false;
        QueryActionsOnChildResourceResultType other = (QueryActionsOnChildResourceResultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitlementList==null && other.getEntitlementList()==null) || 
             (this.entitlementList!=null &&
              java.util.Arrays.equals(this.entitlementList, other.getEntitlementList()))) &&
            ((this.responseContext==null && other.getResponseContext()==null) || 
             (this.responseContext!=null &&
              this.responseContext.equals(other.getResponseContext())));
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
        if (getEntitlementList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntitlementList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntitlementList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponseContext() != null) {
            _hashCode += getResponseContext().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryActionsOnChildResourceResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "QueryActionsOnChildResourceResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "EntitlementList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeEntitlementType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseContext");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResponseContext"));
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
