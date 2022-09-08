package day19_taskSubmissionArtitJaikwang;

public class Task_E2 {

	public static void main(String[] args) {
		
//		### Task - E2
//
//		Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
//		so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
//
//		```text
//		lastChars("last", "chars") → "ls"
//		lastChars("yo", "java") → "ya"
//		lastChars("hi", "") → "h@"
		
		String a = "last";
		String b = "chars";
		
		if(a.length() < 1) { // can use a.isEmpty
			System.out.println("@" + b.substring(b.length()-1));
		}
		else if(b.length() < 1) { // can use b.isEmpty
			System.out.println(a.substring(0,1) + "@");
		}
		else {
			System.out.println(a.substring(0,1) + b.substring(b.length()-1));
		}
	
		
		
//		String a = "last";
//        String b = "chars";
//        
//        if(a.length() == 0)
//            
//                a = "@";
//            
//              if(b.length() == 0)
//            
//                b = "@";
//            
//               
//            
//              System.out.println( a.substring(0,1) + b.substring(b.length()-1, b.length()));
//	
	}

}
