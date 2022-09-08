 package day07_HW;

import java.util.Scanner;

public class Solution_F {

	public static void main(String[] args) {
		/*
		## Task F - Upper Lower or Number

		Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z )
		or number (0-9). if the input letter is lowercase, print `<letter> is a lowercase alphabet`
		if the letter is the uppercase, print `<letter> is a uppercase alphabet`
		if the letter is a number, print `<letter> is a number`
		if the letter is not an alphabet and number, print `this input cannot be computed`

		Tips:

		- you can refer to ASCII table
		- use `nextLine().charAt(0)` or `next().charAt(0)` to receive `char` input from user

		**Example:**

		```text
		Please enter the letter:
		> A
		'A' is a uppercase alphabet

		Please enter the letter:
		> 3
		'3' is a number

		Please enter the letter:
		> %
		this input cannot be computed
		```
		*/
		
		char letter = 'a';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the letter: \n");
		letter = sc.next().charAt(0);
		
		System.out.println();
		
		if(letter >= 0 && letter <= 10) {
			System.out.println(letter+" is a number");
		}
		
		else if(letter >= 'a' && letter <= 'z') {
			System.out.println(letter+" is lower case alphabet");
		}
		
		
		else if(letter >= 'A' && letter <= 'Z') {
			System.out.println(letter+" is UPPER case alphabet");
		}
		
		else {
			System.out.println("This input cannot be computed");
		}
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
