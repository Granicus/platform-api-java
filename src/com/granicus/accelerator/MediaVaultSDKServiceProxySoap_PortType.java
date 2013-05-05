/**
 * MediaVaultSDKServiceProxySoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.granicus.accelerator;

public interface MediaVaultSDKServiceProxySoap_PortType extends java.rmi.Remote {
    public int uploadFile(int folderID, java.lang.String newFileName, byte[] bytes) throws java.rmi.RemoteException;
    public void trimClip(int clipID, int startSeconds, int endSeconds) throws java.rmi.RemoteException;
    public java.lang.String startUpload() throws java.rmi.RemoteException;
    public java.lang.String sendChunk(java.lang.String GUID, long chunkPosition, byte[] bytes) throws java.rmi.RemoteException;
    public long finishUpload(java.lang.String GUID) throws java.rmi.RemoteException;
    public void abortUpload(java.lang.String GUID) throws java.rmi.RemoteException;
    public void beginFileUpload(java.lang.String clipGUID, java.lang.String extension) throws java.rmi.RemoteException;
    public void endFileUpload(java.lang.String clipGUID, java.lang.String fileGUID) throws java.rmi.RemoteException;
    public int registerUploadedFile(java.lang.String GUID, int folderID, java.lang.String name, java.lang.String extension) throws java.rmi.RemoteException;
    public void assignUploadedFile(java.lang.String GUID, java.lang.String clipUID, java.lang.String extension) throws java.rmi.RemoteException;
}
