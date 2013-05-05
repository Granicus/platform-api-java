/**
 * MeetingServerWebServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.encoder;

public interface MeetingServerWebServiceSoap_PortType extends java.rmi.Remote {
    public void loadMeeting(java.lang.String documentId) throws java.rmi.RemoteException;
    public void closeMeeting() throws java.rmi.RemoteException;
    public com.granicus.encoder.Document[] getDocuments() throws java.rmi.RemoteException;
    public com.granicus.encoder.Status getStatus() throws java.rmi.RemoteException;
    public void startMeeting() throws java.rmi.RemoteException;
    public void stopMeeting() throws java.rmi.RemoteException;
    public java.lang.String recordItem(java.lang.String body, java.lang.String foreignId) throws java.rmi.RemoteException;
    public java.lang.String recordNonIndexedItem(java.lang.String body, java.lang.String foreignId) throws java.rmi.RemoteException;
    public void setSuspendRecordItem(boolean value) throws java.rmi.RemoteException;
}
