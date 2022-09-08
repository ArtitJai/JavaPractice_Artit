package day15_HW;

public class Task01_FirstHalf {

	public static void main(String[] args) {
		/*## Task - First Half

		Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
		*/
		
		String a = "WooHoo";
		
		System.out.println(a.substring(0,a.length()/2));
	}

}
