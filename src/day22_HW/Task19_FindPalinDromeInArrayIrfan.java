package day22_HW;

import day26_method_returnValue.StringUtils;

public class Task19_FindPalinDromeInArrayIrfan {

	public static void main(String[] args) {
//		Given name array. find all the palindrome string then put into a new array.
		
	String[] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin", "Bob", "Inna", "Eve"};
	
	for(String name : names) {
		if(StringUtils.isPalindrome(name)) {
			System.out.println(name);
		}
	}

	}
	
	public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverseStr(str));
    }
    
    

    public static String reverseStr(String str) {
        
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }
}
