package com.granicus.accelerator;
import org.apache.axis.AxisFault;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import javax.xml.soap.*;
import org.apache.axis.*;
import org.apache.axis.client.*;
import org.apache.axis.transport.http.*;
import com.granicus.xsd.*;

/**
 * Created with IntelliJ IDEA.
 * User: javier
 * Date: 5/4/13
 * Time: 9:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class AcceleratorClient extends MediaVaultSDKServiceProxySoap_BindingStub {

    public AcceleratorClient(String acceleratorHost) throws AxisFault, MalformedURLException
    {
        this(acceleratorHost, "443");
    }

    public AcceleratorClient(ServerInterfaceData serverInterfaceData) throws AxisFault, MalformedURLException
    {
        this(serverInterfaceData.getHost(), serverInterfaceData.getControlPort());
    }

    public AcceleratorClient(String acceleratorHost, String controlPort) throws AxisFault, MalformedURLException
    {
        // construct ourselves using a new locator and a url endpoint getMeetingServerWebServiceSoapWSDDServiceName
        super(new MediaVaultSDKServiceProxyLocator());
        super.setPortName(((MediaVaultSDKServiceProxyLocator) super.service).getMediaVaultSDKServiceProxySoapWSDDServiceName());
        super.cachedEndpoint = new java.net.URL("http://" + acceleratorHost + ":" + controlPort + "/MediaVault/SDK.asmx");
    }
}