package day22_HW;

import java.util.Arrays;

public class Task19_FindPalinDromeInArray {

	public static void main(String[] args) {
		
//		Given name array. find all the palindrome string then put into a new array.
//
//		String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin", "Bob", "Inna", "Eve"};
//		

//		 String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin", "Bob", "Inna", "Eve"};
         
//		 for (int i= 0 ; i < names.length; i++) {
//			 
//			 String reversed = "";
//			 
//			 for (int j = names[i].length()-1; j >= 0; j--) {
//				 
//				 reversed += names[i].charAt(j);
//			 }
//			 if(reversed.equalsIgnoreCase(names[i])) {
//				 System.out.println(reversed);
//			 }
//		 }
		 
	       // access all element /
	       // ignore case /
	       // find palindrome /
	       // count palindrome /
	       // create new String[count] /
	       // store palindrome back to new String[] /
	       // return new Stirng[] /
	       String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin", "Bob", "Inna", "Eve"};
	       int count = 0;
	       for (String name : names) { // access all element /
	          if (isPalindrome(name)) // find palindrome /
	             count++;  // count palindrome /
	       }
	       
	       String[] result = new String[count]; // create new String[count] /
	       int index = 0;
	       for (String name : names) {
	          if (isPalindrome(name)) {
	             result[index++] = name; // store palindrome back to new String[] /
	          }
	       }
	       System.out.println(Arrays.toString(result)); // return new Stirng[] /
	    }

	    private static boolean isPalindrome(String name) {
	       return name.equalsIgnoreCase(reverseString(name)); // ignore case /
	    }

	    private static String reverseString(String str) {
	       String revStr = "";
	       for (int i = str.length()-1; i >= 0 ; i--) {
	          revStr += str.charAt(i);
	       }
	       return revStr;
	    }
	}
	

		 
         
        
         
