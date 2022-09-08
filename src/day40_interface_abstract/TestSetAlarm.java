package day40_interface_abstract;

import java.util.ArrayList;

public class TestSetAlarm {

	public static void main(String[] args) {
		
		Iphone phone = new Iphone();
		Alexa alexa = new Alexa();
		Clock clock = new Clock();
		
		phone.attendingZoomMeeting();
		phone.call();
		phone.setAlarm();
		
		System.out.println();
		alexa.alexaWhatTimeIsIt();
		alexa.setAlarm();
		
		System.out.println();
		clock.showCurrerntTime();
		clock.setAlarm();
		
		Alarm a = new Iphone();
		Alarm b = new Alexa();
		Alarm c = new Clock();
		
		System.out.println();
//		a.call();  => can't be call because Alarm interface has no method name call
		a.setAlarm();
//		a.name = "Luke"; => any variable in the interface is final so you can't change the value.
		
		ArrayList<Alarm>list = new ArrayList<>();
		list.add(alexa);
		list.add(phone);
		list.add(clock);
		
		list.add(a);
		list.add(b);
		list.add(c);
		
		System.out.println();
		for(Alarm alarm : list) {
			alarm.setAlarm();	
		}
		
		testSetAlarm(phone);
		
		testSetAlarm(alexa);
	
	}
	
	private static void testSetAlarm(Alarm a) {
		a.setAlarm();
	}
	
//	private static void testSetAlarm(Iphone a) {
//		a.setAlarm();
//	}
//	
//	private static void testSetAlarm(Alexa a) {
//		a.setAlarm();
//	}

}
