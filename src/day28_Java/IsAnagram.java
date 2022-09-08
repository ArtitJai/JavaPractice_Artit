package day28_Java;

import java.util.Arrays;

public class IsAnagram {

	public static void main(String[] args) {
	
//      Write a program to check if two string are Anagram

      String str1 = "acdb"; 
      String str2 = "dbca";
      
      char[] arr1 = str1.toCharArray();
      char[] arr2 = str2.toCharArray();
      
      
      System.out.println(Arrays.toString(arr1));
      System.out.println(Arrays.toString(arr2));
      
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      
      System.out.println(Arrays.toString(arr1));
      System.out.println(Arrays.toString(arr2));
      
      
      
      System.out.println(Arrays.equals(arr1, arr2));

	}

}
