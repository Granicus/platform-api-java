/**
 * VoteRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class VoteRecord  implements java.io.Serializable {
    private java.lang.Integer motionID;

    private java.lang.Boolean passed;

    private com.granicus.xsd.VoteEntry[] votes;

    public VoteRecord() {
    }

    public VoteRecord(
           java.lang.Integer motionID,
           java.lang.Boolean passed,
           com.granicus.xsd.VoteEntry[] votes) {
           this.motionID = motionID;
           this.passed = passed;
           this.votes = votes;
    }


    /**
     * Gets the motionID value for this VoteRecord.
     * 
     * @return motionID
     */
    public java.lang.Integer getMotionID() {
        return motionID;
    }


    /**
     * Sets the motionID value for this VoteRecord.
     * 
     * @param motionID
     */
    public void setMotionID(java.lang.Integer motionID) {
        this.motionID = motionID;
    }


    /**
     * Gets the passed value for this VoteRecord.
     * 
     * @return passed
     */
    public java.lang.Boolean getPassed() {
        return passed;
    }


    /**
     * Sets the passed value for this VoteRecord.
     * 
     * @param passed
     */
    public void setPassed(java.lang.Boolean passed) {
        this.passed = passed;
    }


    /**
     * Gets the votes value for this VoteRecord.
     * 
     * @return votes
     */
    public com.granicus.xsd.VoteEntry[] getVotes() {
        return votes;
    }


    /**
     * Sets the votes value for this VoteRecord.
     * 
     * @param votes
     */
    public void setVotes(com.granicus.xsd.VoteEntry[] votes) {
        this.votes = votes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VoteRecord)) return false;
        VoteRecord other = (VoteRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.motionID==null && other.getMotionID()==null) || 
             (this.motionID!=null &&
              this.motionID.equals(other.getMotionID()))) &&
            ((this.passed==null && other.getPassed()==null) || 
             (this.passed!=null &&
              this.passed.equals(other.getPassed()))) &&
            ((this.votes==null && other.getVotes()==null) || 
             (this.votes!=null &&
              java.util.Arrays.equals(this.votes, other.getVotes())));
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
        if (getMotionID() != null) {
            _hashCode += getMotionID().hashCode();
        }
        if (getPassed() != null) {
            _hashCode += getPassed().hashCode();
        }
        if (getVotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVotes(), i);
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
        new org.apache.axis.description.TypeDesc(VoteRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "VoteRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MotionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Passed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("votes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Votes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "VoteEntry"));
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
