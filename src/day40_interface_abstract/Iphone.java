package day40_interface_abstract;

public class Iphone implements Alarm{
// one class can only extend another class/ but one class can implements more than one interface.

	public void call() {
		System.out.println("Calling TechCircle");
	}
	
	public void attendingZoomMeeting() {
		System.out.println("Iphone Zoom app is processing");
	}
	
	public void setAlarm() {
        System.out.println("5AM alarm set ");
    }
}
