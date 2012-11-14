/**
 * DebugInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package com.bea.security.ssmws.types;

public class DebugInfoType  implements java.io.Serializable {
    private com.bea.security.ssmws.types.AuthorizationPolicyType[] authorizationPolicyList;
    private java.lang.String[] grantedRoleList;
    private com.bea.security.ssmws.types.RolePolicyType[] rolePolicyList;
    private com.bea.security.ssmws.types.UserInfoType userInfo;
    private java.lang.Boolean resourceLocated;

    public DebugInfoType() {
    }

    public DebugInfoType(
           com.bea.security.ssmws.types.AuthorizationPolicyType[] authorizationPolicyList,
           java.lang.String[] grantedRoleList,
           com.bea.security.ssmws.types.RolePolicyType[] rolePolicyList,
           com.bea.security.ssmws.types.UserInfoType userInfo,
           java.lang.Boolean resourceLocated) {
           this.authorizationPolicyList = authorizationPolicyList;
           this.grantedRoleList = grantedRoleList;
           this.rolePolicyList = rolePolicyList;
           this.userInfo = userInfo;
           this.resourceLocated = resourceLocated;
    }


    /**
     * Gets the authorizationPolicyList value for this DebugInfoType.
     * 
     * @return authorizationPolicyList
     */
    public com.bea.security.ssmws.types.AuthorizationPolicyType[] getAuthorizationPolicyList() {
        return authorizationPolicyList;
    }


    /**
     * Sets the authorizationPolicyList value for this DebugInfoType.
     * 
     * @param authorizationPolicyList
     */
    public void setAuthorizationPolicyList(com.bea.security.ssmws.types.AuthorizationPolicyType[] authorizationPolicyList) {
        this.authorizationPolicyList = authorizationPolicyList;
    }

    public com.bea.security.ssmws.types.AuthorizationPolicyType getAuthorizationPolicyList(int i) {
        return this.authorizationPolicyList[i];
    }

    public void setAuthorizationPolicyList(int i, com.bea.security.ssmws.types.AuthorizationPolicyType _value) {
        this.authorizationPolicyList[i] = _value;
    }


    /**
     * Gets the grantedRoleList value for this DebugInfoType.
     * 
     * @return grantedRoleList
     */
    public java.lang.String[] getGrantedRoleList() {
        return grantedRoleList;
    }


    /**
     * Sets the grantedRoleList value for this DebugInfoType.
     * 
     * @param grantedRoleList
     */
    public void setGrantedRoleList(java.lang.String[] grantedRoleList) {
        this.grantedRoleList = grantedRoleList;
    }

    public java.lang.String getGrantedRoleList(int i) {
        return this.grantedRoleList[i];
    }

    public void setGrantedRoleList(int i, java.lang.String _value) {
        this.grantedRoleList[i] = _value;
    }


    /**
     * Gets the rolePolicyList value for this DebugInfoType.
     * 
     * @return rolePolicyList
     */
    public com.bea.security.ssmws.types.RolePolicyType[] getRolePolicyList() {
        return rolePolicyList;
    }


    /**
     * Sets the rolePolicyList value for this DebugInfoType.
     * 
     * @param rolePolicyList
     */
    public void setRolePolicyList(com.bea.security.ssmws.types.RolePolicyType[] rolePolicyList) {
        this.rolePolicyList = rolePolicyList;
    }

    public com.bea.security.ssmws.types.RolePolicyType getRolePolicyList(int i) {
        return this.rolePolicyList[i];
    }

    public void setRolePolicyList(int i, com.bea.security.ssmws.types.RolePolicyType _value) {
        this.rolePolicyList[i] = _value;
    }


    /**
     * Gets the userInfo value for this DebugInfoType.
     * 
     * @return userInfo
     */
    public com.bea.security.ssmws.types.UserInfoType getUserInfo() {
        return userInfo;
    }


    /**
     * Sets the userInfo value for this DebugInfoType.
     * 
     * @param userInfo
     */
    public void setUserInfo(com.bea.security.ssmws.types.UserInfoType userInfo) {
        this.userInfo = userInfo;
    }


    /**
     * Gets the resourceLocated value for this DebugInfoType.
     * 
     * @return resourceLocated
     */
    public java.lang.Boolean getResourceLocated() {
        return resourceLocated;
    }


    /**
     * Sets the resourceLocated value for this DebugInfoType.
     * 
     * @param resourceLocated
     */
    public void setResourceLocated(java.lang.Boolean resourceLocated) {
        this.resourceLocated = resourceLocated;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebugInfoType)) return false;
        DebugInfoType other = (DebugInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authorizationPolicyList==null && other.getAuthorizationPolicyList()==null) || 
             (this.authorizationPolicyList!=null &&
              java.util.Arrays.equals(this.authorizationPolicyList, other.getAuthorizationPolicyList()))) &&
            ((this.grantedRoleList==null && other.getGrantedRoleList()==null) || 
             (this.grantedRoleList!=null &&
              java.util.Arrays.equals(this.grantedRoleList, other.getGrantedRoleList()))) &&
            ((this.rolePolicyList==null && other.getRolePolicyList()==null) || 
             (this.rolePolicyList!=null &&
              java.util.Arrays.equals(this.rolePolicyList, other.getRolePolicyList()))) &&
            ((this.userInfo==null && other.getUserInfo()==null) || 
             (this.userInfo!=null &&
              this.userInfo.equals(other.getUserInfo()))) &&
            ((this.resourceLocated==null && other.getResourceLocated()==null) || 
             (this.resourceLocated!=null &&
              this.resourceLocated.equals(other.getResourceLocated())));
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
        if (getAuthorizationPolicyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorizationPolicyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorizationPolicyList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrantedRoleList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrantedRoleList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrantedRoleList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRolePolicyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRolePolicyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRolePolicyList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserInfo() != null) {
            _hashCode += getUserInfo().hashCode();
        }
        if (getResourceLocated() != null) {
            _hashCode += getResourceLocated().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebugInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "DebugInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationPolicyList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthorizationPolicyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "AuthorizationPolicyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantedRoleList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "GrantedRoleList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rolePolicyList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RolePolicyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "RolePolicyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "UserInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "UserInfoType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceLocated");
        elemField.setXmlName(new javax.xml.namespace.QName("http://security.bea.com/ssmws/ssm-soap-types-1.0.xsd", "ResourceLocated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
