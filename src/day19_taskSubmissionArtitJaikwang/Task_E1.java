package day19_taskSubmissionArtitJaikwang;

public class Task_E1 {

	public static void main(String[] args) {
		
//		### Task - E1
//
//		Given a string of any length, return a new string where the last 2 chars, if present, are swapped,
//		so "coding" yields "codign".
//
//		```text
//		lastTwo("coding") → "codign"
//		lastTwo("cat") → "cta"
//		lastTwo("ab") → "ba"
//		```
		
		String a = "ba";
		
		if(a.length() < 2) {
			System.out.println(a);
		}
		else {
			System.out.println(a.substring(0,a.length()-2) + a.charAt(a.length()-1) + a.charAt(a.length()-2));
		}
		
		

	}

}
