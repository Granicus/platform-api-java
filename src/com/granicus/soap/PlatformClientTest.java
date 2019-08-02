package com.granicus.soap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import com.granicus.xsd.*;

import javax.print.attribute.standard.DateTimeAtCompleted;

import java.rmi.RemoteException;
import java.util.*;

/**
 * Created with IntelliJ IDEA. User: javier Date: 7/8/13 Time: 5:03 PM To change
 * this template use File | Settings | File Templates.
 */
public class PlatformClientTest {
	PlatformClient client;
	String username;
	String password;
	String host;

	@Before
	public void setUp() throws Exception {
		username = "testuser";
		password = "";
		host = "crumpets.qa.granicus.com";

		client = new PlatformClient(host);
		client.login(username, password);
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
		for (FolderData folder : folders) {
			System.out.println(folder.getName());
		}
		Assert.assertNotSame(0, folders.length);
	}

	@Test
	public void testGetCameras() throws Exception {
		CameraData[] cams = client.getCameras();
		for (CameraData cam : cams) {
			System.out.println(cam.getName());
		}
		Assert.assertNotSame(0, cams.length);
	}

	@Test
	public void testGetEvents() throws Exception {
		EventData[] events = client.getEvents();
		for (EventData event : events) {
			System.out.println(event.getName());
		}
		Assert.assertNotSame(0, events.length);
	}

	@Test
	public void testGetEventsByDateRange() throws Exception {
		
		Calendar currTime = Calendar.getInstance();
		Calendar pastTime = Calendar.getInstance();
		pastTime.add(Calendar.YEAR, -1);
		Calendar futureTime = Calendar.getInstance();
		futureTime.add(Calendar.YEAR, 1);
		
		EventData newEvent = MakeNewEvent(currTime);
		client.createEvent(newEvent);

		EventData[] events = client.getEventsByDateRange(pastTime, futureTime);
		Assert.assertTrue("At least one event created in last year", events.length > 0);
	}

	@Test
	public void testGetEvent() throws Exception {
		EventData[] events = client.getEvents();
		EventData event = client.getEvent(events[0].getID());
		Assert.assertEquals(event, events[0]);
	}

	@Test
	public void testGetEventMetaData() throws Exception {
		EventData[] events = client.getEvents();
		MetaDataData[] meta = client.getEventMetaData(events[0].getID());
	}

	@Test
	public void TestGetEventsByForeignID() throws Exception {
		
		int foreignID = 99999;
		EventData[] events = client.getEventsByForeignID(foreignID);
		
		if(events == null || events.length <= 0) {
			
			EventData event = MakeNewEvent(Calendar.getInstance());
			event.setForeignID(foreignID);
			int eventID = client.createEvent(event);
			events = client.getEventsByForeignID(foreignID);
		}
		
		Assert.assertTrue("Event with foreign ID retrieved", events.length > 0);
	}

	@Test
	public void UpdateClipDate() throws Exception {
		
		ClipData clip = FindFirstClip();
		Calendar new_date = clip.getDate();
		new_date.add(Calendar.HOUR_OF_DAY, 1);
		new_date.add(Calendar.DAY_OF_YEAR, 1);

		clip.setStartTime(new_date);

		client.updateClip(clip);
	}

	@Test
	public void UpdateClipDuration() throws Exception {

		ClipData clip = FindFirstClip();

		clip.setDuration(clip.getDuration() + 60);

		client.updateClip(clip);
	}

	private ClipData FindFirstClip() throws Exception {

		ClipData clip = null;

		FolderData[] folders = client.getFolders();

		for (FolderData folder : folders) {

			ClipData[] clips = client.getClips(folder.getID());
			if (clip == null && clips != null && clips.length > 1) {
				clip = clips[0];
			} else {
				break;
			}
		}

		return clip;

	}

	@Test
	public void testGetEventByUID_NotFound() throws Exception {
		EventData event = client.getEventByUID("12345678-1234-1234-1234-012345678901");
		Assert.assertEquals(event, null);
	}

	@Test
	public void testCreateDeleteEvent() throws Exception {

		EventData event = MakeNewEvent(Calendar.getInstance());
		int eventID = client.createEvent(event);
		EventData getEvent = client.getEvent(eventID);
		
		Assert.assertEquals(getEvent.getName(), event.getName());
		client.deleteEvent(eventID);
		
	}
	
	private EventData MakeNewEvent(Calendar meetingDate) throws Exception {
		
		// get the prerequisite data
		CameraData[] cams = client.getCameras();
		FolderData[] folders = client.getFolders();
		
		EventData event = new EventData();

		event.setStartTime(meetingDate);
		event.setMeetingTime(meetingDate);
		event.setDescription("Test description");
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
		
		return event;
	}

	@Test
	public void testGetUserDetail() throws Exception {

	}

	@Test
	public void testUpdateEvent() throws Exception {

		EventData[] events = client.getEvents();
		EventData event = events[events.length - 1];
		client.updateEvent(event);

	}
}
