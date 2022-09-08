package day28_Java;

import java.util.Arrays;

public class IsAnagramMethod {

	public static void main(String[] args) {
		
//      Write a program to check if two string are Anagram

		boolean result = IsAnagram("acdb", "acdb");
		
		System.out.println(result);

	}

	public static boolean IsAnagram(String str1, String str2) {
		  
		  
		  char[] arr1 = str1.toCharArray();
		  char[] arr2 = str2.toCharArray();
		  
		  
//		  System.out.println(Arrays.toString(arr1));
//		  System.out.println(Arrays.toString(arr2));
		  
		  Arrays.sort(arr1);
		  Arrays.sort(arr2);
		  
//		  System.out.println(Arrays.toString(arr1));
//		  System.out.println(Arrays.toString(arr2));
		  
		  return Arrays.equals(arr1, arr2);
		 
	}

}
