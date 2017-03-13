/**
 * VoteRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class VoteRecord  implements java.io.Serializable {
    private int motionID;

    private boolean passed;

    private com.granicus.xsd.VoteEntry[] votes;

    public VoteRecord() {
    }

    public VoteRecord(
           int motionID,
           boolean passed,
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
    public int getMotionID() {
        return motionID;
    }


    /**
     * Sets the motionID value for this VoteRecord.
     * 
     * @param motionID
     */
    public void setMotionID(int motionID) {
        this.motionID = motionID;
    }


    /**
     * Gets the passed value for this VoteRecord.
     * 
     * @return passed
     */
    public boolean isPassed() {
        return passed;
    }


    /**
     * Sets the passed value for this VoteRecord.
     * 
     * @param passed
     */
    public void setPassed(boolean passed) {
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
            this.motionID == other.getMotionID() &&
            this.passed == other.isPassed() &&
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
        _hashCode += getMotionID();
        _hashCode += (isPassed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Passed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("votes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Votes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "VoteEntry"));
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
