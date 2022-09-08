package day22_HW;

import java.util.Arrays;

public class Task12_2StringAreAnagram {

	public static void main(String[] args) {
		
//		Write a program to check if two string are Anagram
//
//		String str1 = "acdb"; 
//		String str2 = "dbca";

		String str1 = "acdb"; 
		String str2 = "dbca";
		
		str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();
		
		if(str1.length() == str2.length()) {
			
			 char[] charArray1 = str1.toCharArray();
		     char[] charArray2 = str2.toCharArray();
		     
		     Arrays.sort(charArray1);
		     Arrays.sort(charArray2);
		     
		     boolean result = Arrays.equals(charArray1, charArray2);
		     
		     if(result) {
		         System.out.println(str1 + " and " + str2 + " are anagram.");
		       }
		       else {
		         System.out.println(str1 + " and " + str2 + " are not anagram.");
		       }
		     }
		     else {
		       System.out.println(str1 + " and " + str2 + " are not anagram.");
		     }
	  }
	
		
		
		
	}


