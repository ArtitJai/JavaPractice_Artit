package day11_HW;

public class Task7_AlarmClock {

	public static void main(String[] args) {
		
		int day = 1;

		boolean vacation = false;
		
		
		if (((day==0)||(day==6))&&(!vacation)){
			  System.out.println("10:00 AM");
			  }
			  else if (((day!=0)||(day!=6))&&(!vacation)){
			  System.out.println("7:00 AM"); 
			  }
			  else if (((day==0)||(day==6))&&(vacation)){
			  System.out.println("OFF"); 
			  }
			  else{
			  System.out.println("10:00 AM"); 
			  }
		
		
	}

}

//## Task - Alarm clock
//
//Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are
//on vacation, return a string of the form "7:00" indicating when the alarm clock should ring.
//Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on
//vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
//
//Example:
//```text
//1 false
//"7:00"
//
//5 false
//"7:00"
//
//0 false
//"10:00"
//```
//
