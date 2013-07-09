package com.granicus.soap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import com.granicus.xsd.*;

/**
 * Created with IntelliJ IDEA.
 * User: javier
 * Date: 7/8/13
 * Time: 5:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlatformClientTest {
    PlatformClient client;
    String username;
    String password;
    String host;

    @Before
    public void setUp() throws Exception {
        username = "chad";
        password = "1234";
        host = "gainesville.qa.granicus.com";
        client = new PlatformClient(host);
        client.login(username,password);
    }

    @After
    public void tearDown() throws Exception {
        client.logout();
    }

    @Test
    public void testLogin() throws Exception {
        Assert.assertEquals(username.toLowerCase(), client.getCurrentUserLogon().toLowerCase());
    }

    @Test
    public void testImpersonation() throws Exception {
        PlatformClient client2 = new PlatformClient(host);
        client2.setToken(client.getToken());
        Assert.assertEquals(username.toLowerCase(), client.getCurrentUserLogon().toLowerCase());
    }

    @Test
    public void testGetFolders() throws Exception {
        FolderData[] folders = client.getFolders();
        for(FolderData folder : folders)
        {
            System.out.println(folder.getName());
        }
        Assert.assertNotSame(0, folders.length);
    }
    @Test
    public void testGetEvents() throws Exception {
        EventData[] events = client.getEvents();
        for(EventData event : events)
        {
            System.out.println(event.getName());
        }
        Assert.assertNotSame(0, events.length);
    }

    @Test
    public void testGetEvent() throws Exception {
        EventData[] events = client.getEvents();
        EventData event = client.getEvent(events[0].getID());
        Assert.assertEquals(event,events[0]);
    }

    @Test
    public void testGetEventMetaData() throws Exception {
        EventData[] events = client.getEvents();
        MetaDataData[] meta = client.getEventMetaData(events[0].getID());
    }
}
