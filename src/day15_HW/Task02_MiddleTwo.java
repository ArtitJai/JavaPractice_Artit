package day15_HW;

public class Task02_MiddleTwo {

	public static void main(String[] args) {
		/*
		 * ## Task - Middle Two

Given a string of even length, return a string made of the middle two chars, so the string "string"
yields "ri". The string length will be at least 2.
*/

		
		String a = "string";
				
		int a1 = a.length()/2;
		
		
		
		System.out.println(a.substring(a1-1, a1+1));
		
		
		
	}

}
