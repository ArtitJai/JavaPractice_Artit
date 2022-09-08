package day15_HW;

public class Task03_HasBad {

	public static void main(String[] args) {
	/*
	 * ## Task - Has Bad?

Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "
badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
*/

		
		String a = "xbadxx";
		
		boolean bad = a.contains("bad");
		
		int a1 = a.indexOf("bad");
		
		if(bad) {
		}
		if(a1 <= 1) {
			System.out.println(bad);
		}else {
			System.out.println(false);
		}
	}

}
