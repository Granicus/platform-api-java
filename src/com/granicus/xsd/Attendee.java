/**
 * Attendee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class Attendee  implements java.io.Serializable {
    private java.lang.Integer ID;

    private java.lang.String name;

    private java.lang.Integer orderID;

    private java.lang.Boolean voting;

    private java.lang.Boolean chair;

    private java.lang.String personUID;

    public Attendee() {
    }

    public Attendee(
           java.lang.Integer ID,
           java.lang.String name,
           java.lang.Integer orderID,
           java.lang.Boolean voting,
           java.lang.Boolean chair,
           java.lang.String personUID) {
           this.ID = ID;
           this.name = name;
           this.orderID = orderID;
           this.voting = voting;
           this.chair = chair;
           this.personUID = personUID;
    }


    /**
     * Gets the ID value for this Attendee.
     *
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Attendee.
     *
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the name value for this Attendee.
     *
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Attendee.
     *
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the orderID value for this Attendee.
     *
     * @return orderID
     */
    public java.lang.Integer getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this Attendee.
     *
     * @param orderID
     */
    public void setOrderID(java.lang.Integer orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the voting value for this Attendee.
     *
     * @return voting
     */
    public java.lang.Boolean getVoting() {
        return voting;
    }


    /**
     * Sets the voting value for this Attendee.
     *
     * @param voting
     */
    public void setVoting(java.lang.Boolean voting) {
        this.voting = voting;
    }


    /**
     * Gets the chair value for this Attendee.
     *
     * @return chair
     */
    public java.lang.Boolean getChair() {
        return chair;
    }


    /**
     * Sets the chair value for this Attendee.
     *
     * @param chair
     */
    public void setChair(java.lang.Boolean chair) {
        this.chair = chair;
    }


    /**
     * Gets the personUID value for this Attendee.
     *
     * @return personUID
     */
    public java.lang.String getPersonUID() {
        return personUID;
    }


    /**
     * Sets the personUID value for this Attendee.
     *
     * @param personUID
     */
    public void setPersonUID(java.lang.String personUID) {
        this.personUID = personUID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Attendee)) return false;
        Attendee other = (Attendee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.ID==null && other.getID()==null) ||
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.name==null && other.getName()==null) ||
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.orderID==null && other.getOrderID()==null) ||
             (this.orderID!=null &&
              this.orderID.equals(other.getOrderID()))) &&
            ((this.voting==null && other.getVoting()==null) ||
             (this.voting!=null &&
              this.voting.equals(other.getVoting()))) &&
            ((this.chair==null && other.getChair()==null) ||
             (this.chair!=null &&
              this.chair.equals(other.getChair()))) &&
            ((this.personUID==null && other.getPersonUID()==null) ||
             (this.personUID!=null &&
              this.personUID.equals(other.getPersonUID())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOrderID() != null) {
            _hashCode += getOrderID().hashCode();
        }
        if (getVoting() != null) {
            _hashCode += getVoting().hashCode();
        }
        if (getChair() != null) {
            _hashCode += getChair().hashCode();
        }
        if (getPersonUID() != null) {
            _hashCode += getPersonUID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Attendee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "Attendee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Voting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chair");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Chair"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PersonUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personUID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PersonUID"));
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
