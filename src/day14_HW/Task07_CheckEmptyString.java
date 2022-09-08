package day14_HW;

import java.util.Scanner;

public class Task07_CheckEmptyString {

	public static void main(String[] args) {
		
		/*## Task7
`
 Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
        */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phrase");
		String str = sc.nextLine();
		
		if(str.length() < 1) {
			System.out.println("EMPTY");
		}else if(str.length() > 3) {
			System.out.print(str.substring(str.length()-3));
		}else {
			System.out.print(str);
		}
		
		sc.close();
	
	}

}
