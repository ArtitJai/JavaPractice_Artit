package day29_Arraylist;

import java.util.Arrays;

public class WrapperClass_Character {

	public static void main(String[] args) {
		
		String password = "Abc123@1";
											 //  0  1  2  3  4  5  6  7
		char[] arr = password.toCharArray(); // [A, b, c, 1, 2, 3, @, 1]
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Character.isDigit(arr[0]));  // false
		
		System.out.println(Character.isDigit(arr[3]));	// true
		
		System.out.println(Character.isDigit('a')); // false
		
		System.out.println(Character.isDigit('9'));
		
		System.out.println(Character.isLetter('3')); // false
		
		System.out.println(Character.isLetter('p'));
		
		
	}

}
