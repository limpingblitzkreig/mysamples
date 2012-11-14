/**
 * GetRolesDebugResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class GetRolesDebugResponseType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.IdentityRoleType[] roles;
    private com.bea.security.ssmws.types.DebugInfoType debugInfo;
    private java.lang.Integer rolesTtlAdvice;

    public GetRolesDebugResponseType() {
    }

    public GetRolesDebugResponseType(
           com.bea.security.ssmws.types.IdentityRoleType[] roles,
           com.bea.security.ssmws.types.DebugInfoType debugInfo,
           java.lang.Integer rolesTtlAdvice) {
           this.roles = roles;
           this.debugInfo = debugInfo;
           this.rolesTtlAdvice = rolesTtlAdvice;
    }


    /**
     * Gets the roles value for this GetRolesDebugResponseType.
     * 
     * @return roles
     */
    public com.bea.security.ssmws.types.IdentityRoleType[] getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this GetRolesDebugResponseType.
     * 
     * @param roles
     */
    public void setRoles(com.bea.security.ssmws.types.IdentityRoleType[] roles) {
        this.roles = roles;
    }

    public com.bea.security.ssmws.types.IdentityRoleType getRoles(int i) {
        return this.roles[i];
    }

    public void setRoles(int i, com.bea.security.ssmws.types.IdentityRoleType _value) {
        this.roles[i] = _value;
    }


    /**
     * Gets the debugInfo value for this GetRolesDebugResponseType.
     * 
     * @return debugInfo
     */
    public com.bea.security.ssmws.types.DebugInfoType getDebugInfo() {
        return debugInfo;
    }


    /**
     * Sets the debugInfo value for this GetRolesDebugResponseType.
     * 
     * @param debugInfo
     */
    public void setDebugInfo(com.bea.security.ssmws.types.DebugInfoType debugInfo) {
        this.debugInfo = debugInfo;
    }


    /**
     * Gets the rolesTtlAdvice value for this GetRolesDebugResponseType.
     * 
     * @return rolesTtlAdvice
     */
    public java.lang.Integer getRolesTtlAdvice() {
        return rolesTtlAdvice;
    }


    /**
     * Sets the rolesTtlAdvice value for this GetRolesDebugResponseType.
     * 
     * @param rolesTtlAdvice
     */
    public void setRolesTtlAdvice(java.lang.Integer rolesTtlAdvice) {
        this.rolesTtlAdvice = rolesTtlAdvice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRolesDebugResponseType)) return false;
        GetRolesDebugResponseType other = (GetRolesDebugResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              java.util.Arrays.equals(this.roles, other.getRoles()))) &&
            ((this.debugInfo==null && other.getDebugInfo()==null) || 
             (this.debugInfo!=null &&
              this.debugInfo.equals(other.getDebugInfo()))) &&
            ((this.rolesTtlAdvice==null && other.getRolesTtlAdvice()==null) || 
             (this.rolesTtlAdvice!=null &&
              this.rolesTtlAdvice.equals(other.getRolesTtlAdvice())));
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
        if (getRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDebugInfo() != null) {
            _hashCode += getDebugInfo().hashCode();
        }
        if (getRolesTtlAdvice() != null) {
            _hashCode += getRolesTtlAdvice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRolesDebugResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "GetRolesDebugResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "Roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "IdentityRoleType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debugInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DebugInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DebugInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolesTtlAdvice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RolesTtlAdvice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
