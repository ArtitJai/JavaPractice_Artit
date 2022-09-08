package day19_taskSubmissionArtitJaikwang;

public class Task_E3 {

	public static void main(String[] args) {
		
//		### Task - E3
//
//		Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
//		The string length will be at least 2.
//
//		```text
//		right2("Hello") → "loHel"
//		right2("java") → "vaja"
//		right2("Hi") → "Hi"
//		```
		
		String a = "Hi";
		
		if(a.length() <= 2) {
			System.out.println(a);
		}
		else {
			System.out.println(a.substring(a.length() - 2) + a.substring(0,a.length() - 2));
		}
		

	}

}
