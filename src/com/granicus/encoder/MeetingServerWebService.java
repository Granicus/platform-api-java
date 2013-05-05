/**
 * MeetingServerWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.encoder;

public interface MeetingServerWebService extends javax.xml.rpc.Service {
    public java.lang.String getMeetingServerWebServiceSoapAddress();

    public com.granicus.encoder.MeetingServerWebServiceSoap_PortType getMeetingServerWebServiceSoap() throws javax.xml.rpc.ServiceException;

    public com.granicus.encoder.MeetingServerWebServiceSoap_PortType getMeetingServerWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
