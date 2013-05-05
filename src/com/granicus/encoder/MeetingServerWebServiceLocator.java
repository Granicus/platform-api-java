/**
 * MeetingServerWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.encoder;

public class MeetingServerWebServiceLocator extends org.apache.axis.client.Service implements com.granicus.encoder.MeetingServerWebService {

    public MeetingServerWebServiceLocator() {
    }


    public MeetingServerWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MeetingServerWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MeetingServerWebServiceSoap
    private java.lang.String MeetingServerWebServiceSoap_address = "http://10.100.0.32/outcast/meetingserverwebservice.asmx";

    public java.lang.String getMeetingServerWebServiceSoapAddress() {
        return MeetingServerWebServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MeetingServerWebServiceSoapWSDDServiceName = "MeetingServerWebServiceSoap";

    public java.lang.String getMeetingServerWebServiceSoapWSDDServiceName() {
        return MeetingServerWebServiceSoapWSDDServiceName;
    }

    public void setMeetingServerWebServiceSoapWSDDServiceName(java.lang.String name) {
        MeetingServerWebServiceSoapWSDDServiceName = name;
    }

    public com.granicus.encoder.MeetingServerWebServiceSoap_PortType getMeetingServerWebServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MeetingServerWebServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMeetingServerWebServiceSoap(endpoint);
    }

    public com.granicus.encoder.MeetingServerWebServiceSoap_PortType getMeetingServerWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.granicus.encoder.MeetingServerWebServiceSoap_BindingStub _stub = new com.granicus.encoder.MeetingServerWebServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getMeetingServerWebServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMeetingServerWebServiceSoapEndpointAddress(java.lang.String address) {
        MeetingServerWebServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.granicus.encoder.MeetingServerWebServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.granicus.encoder.MeetingServerWebServiceSoap_BindingStub _stub = new com.granicus.encoder.MeetingServerWebServiceSoap_BindingStub(new java.net.URL(MeetingServerWebServiceSoap_address), this);
                _stub.setPortName(getMeetingServerWebServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MeetingServerWebServiceSoap".equals(inputPortName)) {
            return getMeetingServerWebServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://granicus.com/lacity/", "MeetingServerWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://granicus.com/lacity/", "MeetingServerWebServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MeetingServerWebServiceSoap".equals(portName)) {
            setMeetingServerWebServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
