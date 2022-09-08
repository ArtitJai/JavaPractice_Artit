package day15_HW;

public class Task04_SeeColor {

	public static void main(String[] args) {
		/*
		 * ## Task - See Color

Given a string, if the string begins with "red" or "blue" return that color string, otherwise return
the empty string.

Example:

```text
Input   : redxx
Output  : red

Input   : xxred
Output  : 

Input   : blueTimes
Output  : blue

Input   : xyzred
Output  : 

*/

		
		String str = "redxx";
		
		if(str.startsWith("red")) {
			System.out.println("red");
		}
		else if(str.startsWith("blue")){
			System.out.println("blue");
		}else {
			System.out.println(" ");
		}
			
		
	}

}
