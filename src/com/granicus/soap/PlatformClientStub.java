package com.granicus.soap;

import java.net.MalformedURLException;
import javax.xml.soap.*;
import org.apache.axis.*;
import org.apache.axis.client.*;
import org.apache.axis.transport.http.*;

public class PlatformClientStub extends UserSDKBindingStub {

    private String SessionCookieKey = "PHPSESSID";

    public PlatformClientStub(String site) throws AxisFault, MalformedURLException {
        // construct using a new locator and set the port name and cached endpoint
        super(new UserSDKServiceLocator());
        super.setPortName(((UserSDKServiceLocator) super.service).getUserSDKPortWSDDServiceName());
        super.cachedEndpoint = new java.net.URL("http://" + site + "/SDK/user/index.php");
    }

    public void setToken(String token)
    {
        setCookie(SessionCookieKey + "=" + token + ";");
    }

    public String getToken()
    {
        String cookie = (String) ((Stub) this)._getProperty(HTTPConstants.HEADER_COOKIE);
        String[] cookies = cookie.split(";");

        for(int i = 0; i < cookies.length; i++)
        {
            String[] parts = cookies[i].split("=");
            if(parts[0].equals(SessionCookieKey))
            {
                return parts[1];
            }
        }
        return null;
    }

    public void setCookie(String cookie)
    {
        ((Stub) this)._setProperty(Call.SESSION_MAINTAIN_PROPERTY, new Boolean(true));
        ((Stub) this)._setProperty(HTTPConstants.HEADER_COOKIE, cookie);
    }

    public String getCookiesFromResponse()
    {
        // get the cookie from the response and return it
        MessageContext context = ((Stub) this)._getCall().getMessageContext();
        SOAPMessage message = context.getMessage();
        MimeHeaders headers = message.getMimeHeaders();
        String[] cookies = headers.getHeader("set-cookie");
        String cookie = "";
        for(int i = 0; i < cookies.length; i++)
        {
            cookies[i] = cookies[i].split(";")[0];
            cookie = cookie.concat(cookies[i]);
            if(i < (cookies.length - 1))
            {
                cookie = cookie.concat(";");
            }
        }
        return cookie;
    }
}
