package day27_HW;

public class TaskE1_CutTwoFirstLeftAAndB {

	public static String cutFront(String str) {
		
			         int len = str.length();
			 
			         if (len == 0) {
			             return str;
			         }
			 
			         if (len == 1) {
			             return str.charAt(0) == 'a' ? str : "";
			         }
			 
			         if (str.charAt(0) == 'a') {
			             if (str.charAt(1) == 'b') {
			                 return str;
			             } else {
			                 return "a" + str.substring(2);
			             }
			         }
			 
			         if (str.charAt(1) == 'b') {
			             return str.substring(1);
			         }
			 
			         return str.substring(2);
			     }
	public static void main(String[] args) {
		
//		## Task - E1
//
//		Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a'
//		and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
//
//		```text
//		"Hello" → "llo"
//		"java" → "va"
//		"away" → "aay"
//		"abxyz" → "abxyz"
//		"xz" → ""
//		```	 
		
		String str = "Hello";
		
		System.out.println(cutFront(str));
	
	}
}

//		public String deFront(String str)
//		{    
//			int len = str.length();
//			if(len >= 2)
//			{
//				StringBuilder stbuild = new StringBuilder(len);
//				if(str.charAt(0) == 'a')
//					stbuild.append('a');
//				if(str.charAt(1) == 'b')
//					stbuild.append('b');
//				stbuild.append(str.substring(2));
//				return stbuild.toString();
//			}
//			else if(len == 1 && str.charAt(0) == 'a')
//				return "a";
//			else
//				return "";
//		}




