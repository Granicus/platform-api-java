/**
 * KeyMapping.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class KeyMapping  implements java.io.Serializable {
    private java.lang.Integer foreignID;

    private java.lang.Integer granicusID;

    public KeyMapping() {
    }

    public KeyMapping(
           java.lang.Integer foreignID,
           java.lang.Integer granicusID) {
           this.foreignID = foreignID;
           this.granicusID = granicusID;
    }


    /**
     * Gets the foreignID value for this KeyMapping.
     * 
     * @return foreignID
     */
    public java.lang.Integer getForeignID() {
        return foreignID;
    }


    /**
     * Sets the foreignID value for this KeyMapping.
     * 
     * @param foreignID
     */
    public void setForeignID(java.lang.Integer foreignID) {
        this.foreignID = foreignID;
    }


    /**
     * Gets the granicusID value for this KeyMapping.
     * 
     * @return granicusID
     */
    public java.lang.Integer getGranicusID() {
        return granicusID;
    }


    /**
     * Sets the granicusID value for this KeyMapping.
     * 
     * @param granicusID
     */
    public void setGranicusID(java.lang.Integer granicusID) {
        this.granicusID = granicusID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KeyMapping)) return false;
        KeyMapping other = (KeyMapping) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.foreignID==null && other.getForeignID()==null) || 
             (this.foreignID!=null &&
              this.foreignID.equals(other.getForeignID()))) &&
            ((this.granicusID==null && other.getGranicusID()==null) || 
             (this.granicusID!=null &&
              this.granicusID.equals(other.getGranicusID())));
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
        if (getForeignID() != null) {
            _hashCode += getForeignID().hashCode();
        }
        if (getGranicusID() != null) {
            _hashCode += getGranicusID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KeyMapping.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "KeyMapping"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foreignID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ForeignID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("granicusID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GranicusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
