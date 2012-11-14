/**
 * AudienceRestrictionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package assertion._0._2.SAML.tc.names.oasis;

public class AudienceRestrictionType  extends assertion._0._2.SAML.tc.names.oasis.ConditionAbstractType  implements java.io.Serializable {
    private org.apache.axis.types.URI[] audience;

    public AudienceRestrictionType() {
    }

    public AudienceRestrictionType(
           org.apache.axis.types.URI[] audience) {
           this.audience = audience;
    }


    /**
     * Gets the audience value for this AudienceRestrictionType.
     * 
     * @return audience
     */
    public org.apache.axis.types.URI[] getAudience() {
        return audience;
    }


    /**
     * Sets the audience value for this AudienceRestrictionType.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AudienceRestrictionType)) return false;
        AudienceRestrictionType other = (AudienceRestrictionType) obj;
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
              java.util.Arrays.equals(this.audience, other.getAudience())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AudienceRestrictionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "AudienceRestrictionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audience");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:SAML:2.0:assertion", "Audience"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
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
