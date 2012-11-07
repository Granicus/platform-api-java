/**
 * Rollcall.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class Rollcall  implements java.io.Serializable {
    private com.granicus.xsd.AttendeeStatus[] attendees;

    public Rollcall() {
    }

    public Rollcall(
           com.granicus.xsd.AttendeeStatus[] attendees) {
           this.attendees = attendees;
    }


    /**
     * Gets the attendees value for this Rollcall.
     * 
     * @return attendees
     */
    public com.granicus.xsd.AttendeeStatus[] getAttendees() {
        return attendees;
    }


    /**
     * Sets the attendees value for this Rollcall.
     * 
     * @param attendees
     */
    public void setAttendees(com.granicus.xsd.AttendeeStatus[] attendees) {
        this.attendees = attendees;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rollcall)) return false;
        Rollcall other = (Rollcall) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attendees==null && other.getAttendees()==null) || 
             (this.attendees!=null &&
              java.util.Arrays.equals(this.attendees, other.getAttendees())));
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
        if (getAttendees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttendees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttendees(), i);
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
        new org.apache.axis.description.TypeDesc(Rollcall.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "Rollcall"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendees");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attendees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "AttendeeStatus"));
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
