/**
 * PublishClipData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class PublishClipData  implements java.io.Serializable {
    private int clipID;

    private boolean _public;

    private java.lang.String name;

    private java.lang.String title;

    private java.lang.String textField;

    private int templateID;

    private int metaID;

    public PublishClipData() {
    }

    public PublishClipData(
           int clipID,
           boolean _public,
           java.lang.String name,
           java.lang.String title,
           java.lang.String textField,
           int templateID,
           int metaID) {
           this.clipID = clipID;
           this._public = _public;
           this.name = name;
           this.title = title;
           this.textField = textField;
           this.templateID = templateID;
           this.metaID = metaID;
    }


    /**
     * Gets the clipID value for this PublishClipData.
     * 
     * @return clipID
     */
    public int getClipID() {
        return clipID;
    }


    /**
     * Sets the clipID value for this PublishClipData.
     * 
     * @param clipID
     */
    public void setClipID(int clipID) {
        this.clipID = clipID;
    }


    /**
     * Gets the _public value for this PublishClipData.
     * 
     * @return _public
     */
    public boolean is_public() {
        return _public;
    }


    /**
     * Sets the _public value for this PublishClipData.
     * 
     * @param _public
     */
    public void set_public(boolean _public) {
        this._public = _public;
    }


    /**
     * Gets the name value for this PublishClipData.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PublishClipData.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the title value for this PublishClipData.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PublishClipData.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the textField value for this PublishClipData.
     * 
     * @return textField
     */
    public java.lang.String getTextField() {
        return textField;
    }


    /**
     * Sets the textField value for this PublishClipData.
     * 
     * @param textField
     */
    public void setTextField(java.lang.String textField) {
        this.textField = textField;
    }


    /**
     * Gets the templateID value for this PublishClipData.
     * 
     * @return templateID
     */
    public int getTemplateID() {
        return templateID;
    }


    /**
     * Sets the templateID value for this PublishClipData.
     * 
     * @param templateID
     */
    public void setTemplateID(int templateID) {
        this.templateID = templateID;
    }


    /**
     * Gets the metaID value for this PublishClipData.
     * 
     * @return metaID
     */
    public int getMetaID() {
        return metaID;
    }


    /**
     * Sets the metaID value for this PublishClipData.
     * 
     * @param metaID
     */
    public void setMetaID(int metaID) {
        this.metaID = metaID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublishClipData)) return false;
        PublishClipData other = (PublishClipData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.clipID == other.getClipID() &&
            this._public == other.is_public() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.textField==null && other.getTextField()==null) || 
             (this.textField!=null &&
              this.textField.equals(other.getTextField()))) &&
            this.templateID == other.getTemplateID() &&
            this.metaID == other.getMetaID();
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
        _hashCode += getClipID();
        _hashCode += (is_public() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTextField() != null) {
            _hashCode += getTextField().hashCode();
        }
        _hashCode += getTemplateID();
        _hashCode += getMetaID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublishClipData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "PublishClipData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clipID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ClipID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_public");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Public"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TextField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TemplateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MetaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
