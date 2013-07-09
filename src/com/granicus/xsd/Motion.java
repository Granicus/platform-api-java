/**
 * Motion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class Motion  implements java.io.Serializable {
    private java.lang.String mover;

    private java.lang.String seconder;

    private java.lang.String type;

    private java.lang.String motionText;

    public Motion() {
    }

    public Motion(
           java.lang.String mover,
           java.lang.String seconder,
           java.lang.String type,
           java.lang.String motionText) {
           this.mover = mover;
           this.seconder = seconder;
           this.type = type;
           this.motionText = motionText;
    }


    /**
     * Gets the mover value for this Motion.
     * 
     * @return mover
     */
    public java.lang.String getMover() {
        return mover;
    }


    /**
     * Sets the mover value for this Motion.
     * 
     * @param mover
     */
    public void setMover(java.lang.String mover) {
        this.mover = mover;
    }


    /**
     * Gets the seconder value for this Motion.
     * 
     * @return seconder
     */
    public java.lang.String getSeconder() {
        return seconder;
    }


    /**
     * Sets the seconder value for this Motion.
     * 
     * @param seconder
     */
    public void setSeconder(java.lang.String seconder) {
        this.seconder = seconder;
    }


    /**
     * Gets the type value for this Motion.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Motion.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the motionText value for this Motion.
     * 
     * @return motionText
     */
    public java.lang.String getMotionText() {
        return motionText;
    }


    /**
     * Sets the motionText value for this Motion.
     * 
     * @param motionText
     */
    public void setMotionText(java.lang.String motionText) {
        this.motionText = motionText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Motion)) return false;
        Motion other = (Motion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mover==null && other.getMover()==null) || 
             (this.mover!=null &&
              this.mover.equals(other.getMover()))) &&
            ((this.seconder==null && other.getSeconder()==null) || 
             (this.seconder!=null &&
              this.seconder.equals(other.getSeconder()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.motionText==null && other.getMotionText()==null) || 
             (this.motionText!=null &&
              this.motionText.equals(other.getMotionText())));
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
        if (getMover() != null) {
            _hashCode += getMover().hashCode();
        }
        if (getSeconder() != null) {
            _hashCode += getSeconder().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getMotionText() != null) {
            _hashCode += getMotionText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Motion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "Motion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mover");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Mover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seconder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Seconder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motionText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MotionText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
