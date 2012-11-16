/**
 * RequestedActionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class RequestedActionsType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.RuntimeActionType[] actions;

    public RequestedActionsType() {
    }

    public RequestedActionsType(
           com.bea.security.ssmws.types.RuntimeActionType[] actions) {
           this.actions = actions;
    }


    /**
     * Gets the actions value for this RequestedActionsType.
     * 
     * @return actions
     */
    public com.bea.security.ssmws.types.RuntimeActionType[] getActions() {
        return actions;
    }


    /**
     * Sets the actions value for this RequestedActionsType.
     * 
     * @param actions
     */
    public void setActions(com.bea.security.ssmws.types.RuntimeActionType[] actions) {
        this.actions = actions;
    }

    public com.bea.security.ssmws.types.RuntimeActionType getActions(int i) {
        return this.actions[i];
    }

    public void setActions(int i, com.bea.security.ssmws.types.RuntimeActionType _value) {
        this.actions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestedActionsType)) return false;
        RequestedActionsType other = (RequestedActionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actions==null && other.getActions()==null) || 
             (this.actions!=null &&
              java.util.Arrays.equals(this.actions, other.getActions())));
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
        if (getActions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActions(), i);
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
        new org.apache.axis.description.TypeDesc(RequestedActionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RequestedActionsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Actions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RuntimeActionType"));
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
