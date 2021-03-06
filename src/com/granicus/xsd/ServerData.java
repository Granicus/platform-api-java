/**
 * ServerData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.xsd;

public class ServerData  implements java.io.Serializable {
    private int ID;

    private java.lang.String name;

    private int controlPort;

    private boolean firewallCompatibility;

    private boolean multicast;

    private int loadBalancerScore;

    private java.lang.String replicationUN;

    private java.lang.String replicationPW;

    private java.util.Calendar createdDate;

    public ServerData() {
    }

    public ServerData(
           int ID,
           java.lang.String name,
           int controlPort,
           boolean firewallCompatibility,
           boolean multicast,
           int loadBalancerScore,
           java.lang.String replicationUN,
           java.lang.String replicationPW,
           java.util.Calendar createdDate) {
           this.ID = ID;
           this.name = name;
           this.controlPort = controlPort;
           this.firewallCompatibility = firewallCompatibility;
           this.multicast = multicast;
           this.loadBalancerScore = loadBalancerScore;
           this.replicationUN = replicationUN;
           this.replicationPW = replicationPW;
           this.createdDate = createdDate;
    }


    /**
     * Gets the ID value for this ServerData.
     * 
     * @return ID
     */
    public int getID() {
        return ID;
    }


    /**
     * Sets the ID value for this ServerData.
     * 
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }


    /**
     * Gets the name value for this ServerData.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ServerData.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the controlPort value for this ServerData.
     * 
     * @return controlPort
     */
    public int getControlPort() {
        return controlPort;
    }


    /**
     * Sets the controlPort value for this ServerData.
     * 
     * @param controlPort
     */
    public void setControlPort(int controlPort) {
        this.controlPort = controlPort;
    }


    /**
     * Gets the firewallCompatibility value for this ServerData.
     * 
     * @return firewallCompatibility
     */
    public boolean isFirewallCompatibility() {
        return firewallCompatibility;
    }


    /**
     * Sets the firewallCompatibility value for this ServerData.
     * 
     * @param firewallCompatibility
     */
    public void setFirewallCompatibility(boolean firewallCompatibility) {
        this.firewallCompatibility = firewallCompatibility;
    }


    /**
     * Gets the multicast value for this ServerData.
     * 
     * @return multicast
     */
    public boolean isMulticast() {
        return multicast;
    }


    /**
     * Sets the multicast value for this ServerData.
     * 
     * @param multicast
     */
    public void setMulticast(boolean multicast) {
        this.multicast = multicast;
    }


    /**
     * Gets the loadBalancerScore value for this ServerData.
     * 
     * @return loadBalancerScore
     */
    public int getLoadBalancerScore() {
        return loadBalancerScore;
    }


    /**
     * Sets the loadBalancerScore value for this ServerData.
     * 
     * @param loadBalancerScore
     */
    public void setLoadBalancerScore(int loadBalancerScore) {
        this.loadBalancerScore = loadBalancerScore;
    }


    /**
     * Gets the replicationUN value for this ServerData.
     * 
     * @return replicationUN
     */
    public java.lang.String getReplicationUN() {
        return replicationUN;
    }


    /**
     * Sets the replicationUN value for this ServerData.
     * 
     * @param replicationUN
     */
    public void setReplicationUN(java.lang.String replicationUN) {
        this.replicationUN = replicationUN;
    }


    /**
     * Gets the replicationPW value for this ServerData.
     * 
     * @return replicationPW
     */
    public java.lang.String getReplicationPW() {
        return replicationPW;
    }


    /**
     * Sets the replicationPW value for this ServerData.
     * 
     * @param replicationPW
     */
    public void setReplicationPW(java.lang.String replicationPW) {
        this.replicationPW = replicationPW;
    }


    /**
     * Gets the createdDate value for this ServerData.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ServerData.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServerData)) return false;
        ServerData other = (ServerData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ID == other.getID() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.controlPort == other.getControlPort() &&
            this.firewallCompatibility == other.isFirewallCompatibility() &&
            this.multicast == other.isMulticast() &&
            this.loadBalancerScore == other.getLoadBalancerScore() &&
            ((this.replicationUN==null && other.getReplicationUN()==null) || 
             (this.replicationUN!=null &&
              this.replicationUN.equals(other.getReplicationUN()))) &&
            ((this.replicationPW==null && other.getReplicationPW()==null) || 
             (this.replicationPW!=null &&
              this.replicationPW.equals(other.getReplicationPW()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate())));
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
        _hashCode += getID();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getControlPort();
        _hashCode += (isFirewallCompatibility() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMulticast() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getLoadBalancerScore();
        if (getReplicationUN() != null) {
            _hashCode += getReplicationUN().hashCode();
        }
        if (getReplicationPW() != null) {
            _hashCode += getReplicationPW().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServerData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://granicus.com/xsd", "ServerData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ControlPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firewallCompatibility");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FirewallCompatibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multicast");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Multicast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadBalancerScore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LoadBalancerScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replicationUN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReplicationUN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replicationPW");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ReplicationPW"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
