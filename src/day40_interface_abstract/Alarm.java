package day40_interface_abstract;

public interface Alarm {

	// All the variable in interface by default final
	
	String name = "TechCircle";
	int value = 9;
	
	// All the method in interface has no method body.
	
	public void setAlarm(); // abstract method, has not method body,
	// just method signature.
}
