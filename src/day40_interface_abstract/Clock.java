package day40_interface_abstract;

import java.time.LocalTime;

public class Clock implements Alarm{
	
	    public void showCurrerntTime() {
	        System.out.println("It's "+ LocalTime.now());
	    }
	    
	    public void setAlarm() {
	        System.out.println("Clock: is setting an alarm for 7 AM" );
	    }
	    
	
}
