/**
 * Note.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class Note  implements java.io.Serializable {
    private java.lang.String noteText;

    private java.lang.String editorsNotes;

    private java.lang.Boolean _private;

    public Note() {
    }

    public Note(
           java.lang.String noteText,
           java.lang.String editorsNotes,
           java.lang.Boolean _private) {
           this.noteText = noteText;
           this.editorsNotes = editorsNotes;
           this._private = _private;
    }


    /**
     * Gets the noteText value for this Note.
     * 
     * @return noteText
     */
    public java.lang.String getNoteText() {
        return noteText;
    }


    /**
     * Sets the noteText value for this Note.
     * 
     * @param noteText
     */
    public void setNoteText(java.lang.String noteText) {
        this.noteText = noteText;
    }


    /**
     * Gets the editorsNotes value for this Note.
     * 
     * @return editorsNotes
     */
    public java.lang.String getEditorsNotes() {
        return editorsNotes;
    }


    /**
     * Sets the editorsNotes value for this Note.
     * 
     * @param editorsNotes
     */
    public void setEditorsNotes(java.lang.String editorsNotes) {
        this.editorsNotes = editorsNotes;
    }


    /**
     * Gets the _private value for this Note.
     * 
     * @return _private
     */
    public java.lang.Boolean get_private() {
        return _private;
    }


    /**
     * Sets the _private value for this Note.
     * 
     * @param _private
     */
    public void set_private(java.lang.Boolean _private) {
        this._private = _private;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Note)) return false;
        Note other = (Note) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.noteText==null && other.getNoteText()==null) || 
             (this.noteText!=null &&
              this.noteText.equals(other.getNoteText()))) &&
            ((this.editorsNotes==null && other.getEditorsNotes()==null) || 
             (this.editorsNotes!=null &&
              this.editorsNotes.equals(other.getEditorsNotes()))) &&
            ((this._private==null && other.get_private()==null) || 
             (this._private!=null &&
              this._private.equals(other.get_private())));
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
        if (getNoteText() != null) {
            _hashCode += getNoteText().hashCode();
        }
        if (getEditorsNotes() != null) {
            _hashCode += getEditorsNotes().hashCode();
        }
        if (get_private() != null) {
            _hashCode += get_private().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Note.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "Note"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteText");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NoteText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorsNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EditorsNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_private");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Private"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
