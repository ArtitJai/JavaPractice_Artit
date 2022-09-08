package day15_HW;

public class Task05_SeeingDouble {

	public static void main(String[] args) {
		
		/*
		 * ## Task - Seeing Double?

Given a string, return a string where for every char in the original, there are two chars.

Example:

```text
Input   : The
Output  : TThhee

Input   : AAbb
Output  : AAAAbbbb

Input   : Hi-There
Output  : HHii--TThheerree
```*/ 

		String str = "The";
		String str1 = "";
		
		for(int i = 0; i <= str.length()-1; i++) {
			str1 += str.charAt(i);
			str1 += str.charAt(i);
		}
		
		System.out.println(str1);
		
//		String result = "";
//	      String str = "hello World";
//	      for (int i = 0; i < str.length(); i++) {
//	         result += ""+str.charAt(i)+str.charAt(i);
//	      }
//	      System.out.println(result);
//		
	}

}
