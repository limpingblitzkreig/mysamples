/**
 * ProxyRestrictionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class ProxyRestrictionType  extends assertion._0._2.SAML.tc.names.oasis.ConditionAbstractType  implements java.io.Serializable {
    private org.apache.axis.types.URI[] audience;
    private org.apache.axis.types.NonNegativeInteger count;  // attribute

    public ProxyRestrictionType() {
    }

    public ProxyRestrictionType(
           org.apache.axis.types.URI[] audience,
           org.apache.axis.types.NonNegativeInteger count) {
           this.audience = audience;
           this.count = count;
    }


    /**
     * Gets the audience value for this ProxyRestrictionType.
     * 
     * @return audience
     */
    public org.apache.axis.types.URI[] getAudience() {
        return audience;
    }


    /**
     * Sets the audience value for this ProxyRestrictionType.
     * 
     * @param audience
     */
    public void setAudience(org.apache.axis.types.URI[] audience) {
        this.audience = audience;
    }

    public org.apache.axis.types.URI getAudience(int i) {
        return this.audience[i];
    }

    public void setAudience(int i, org.apache.axis.types.URI _value) {
        this.audience[i] = _value;
    }


    /**
     * Gets the count value for this ProxyRestrictionType.
     * 
     * @return count
     */
    public org.apache.axis.types.NonNegativeInteger getCount() {
        return count;
    }


    /**
     * Sets the count value for this ProxyRestrictionType.
     * 
     * @param count
     */
    public void setCount(org.apache.axis.types.NonNegativeInteger count) {
        this.count = count;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProxyRestrictionType)) return false;
        ProxyRestrictionType other = (ProxyRestrictionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.audience==null && other.getAudience()==null) || 
             (this.audience!=null &&
              java.util.Arrays.equals(this.audience, other.getAudience()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAudience() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAudience());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAudience(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProxyRestrictionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "ProxyRestrictionType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("count");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Count"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audience");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Audience"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
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
