package com.granicus.soap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import com.granicus.xsd.*;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.*;



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
        host = "lmcc.qa.granicus.com";

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
    public void testGetCameras() throws Exception {
        CameraData[] cams = client.getCameras();
        for(CameraData cam : cams)
        {
            System.out.println(cam.getName());
        }
        Assert.assertNotSame(0, cams.length);
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
    public void testGetEventsByDateRange() throws Exception {
        Calendar s_time = Calendar.getInstance();
        s_time.clear();
        s_time.set(Calendar.YEAR, 2013);
        s_time.set(Calendar.MONTH, 6);
        s_time.set(Calendar.DATE, 30);

        java.util.Calendar e_time = java.util.Calendar.getInstance();
        e_time.clear();
        e_time.set(Calendar.YEAR, 2013);
        e_time.set(Calendar.MONTH, 7);
        e_time.set(Calendar.DATE, 30);

        EventData[] events = client.getEventsByDateRange(s_time,e_time);
        Assert.assertEquals(events.length,10);
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

    @Test
    public void TestGetEventsByForeignID()    throws Exception {
        EventData[] events = client.getEventsByForeignID(1447);
        Assert.assertEquals(1, events.length);
    }

    @Test
    public void UpdateClipDate() throws Exception {
        ClipData clip = client.getClip(2818);
        Calendar new_date =   clip.getDate();
        new_date.add(Calendar.HOUR_OF_DAY, 1);
        new_date.add(Calendar.DAY_OF_YEAR, 1);

        clip.setStartTime(new_date);

        client.updateClip(clip);
    }

    @Test
    public void UpdateClipDuration() throws Exception {
        ClipData clip = client.getClip(2818);

        clip.setDuration(clip.getDuration() + 60);

        client.updateClip(clip);
    }

    @Test
    public void testGetEventByUID_NotFound() throws Exception {
        EventData event = client.getEventByUID("12345678-1234-1234-1234-012345678901");
        Assert.assertEquals(event, null);
    }

    @Test
    public void testCreateDeleteEvent() throws Exception {
        // get the prerequisite data
        CameraData[] cams = client.getCameras();
        FolderData[] folders = client.getFolders();

        EventData event = new EventData();
        event.setName("Unit Test Event");
        event.setDuration(3600);
        event.setCameraID(cams[0].getID());
        event.setFolderID(folders[0].getID());
        Attendee[] attendees = new Attendee[3];
        attendees[0] = new Attendee();
        attendees[1] = new Attendee();
        attendees[2] = new Attendee();
        attendees[0].setName("Tom Spengler");
        attendees[1].setName("Emery Jones");
        attendees[2].setName("Javier Muniz");
        event.setAttendees(attendees);
        int eventID = client.createEvent(event);
        EventData getEvent = client.getEvent(eventID);
        Assert.assertEquals(getEvent.getName(),event.getName());
        client.deleteEvent(eventID);
    }

    @Test
    public void   testGetUserDetail() throws Exception {
        client.
    }

    @Test
    public void testUpdateEvent() throws Exception {
        EventData event = client.getEvent(5868);
        client.updateEvent(event);
    }
}
