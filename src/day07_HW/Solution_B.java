package day07_HW;

import java.util.Scanner;

public class Solution_B {

	public static void main(String[] args) {
	
		/*
		## Task B - Input String and Number
		
		In this challenge,
		
		- you should create new class called `Solution_B`
		- you must write the program that read string and integers from user and then print them to console
		  with additional string as _Sample_
		
		### Input Format
		
		There are lines of input, and each line contains a single integer.
		
		**Sample Input**
		
		```text
		Hello
		100
		125 
		```
		
		**Sample Output**
		
		```text
		My string is "Hello". 
		The sum of the 100 and 125 is 225
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What would you like to string?");
		String word = sc.nextLine();
		
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("My string is '"+word+"'");
		System.out.println("The sum of the "+num1+" and "+num2+" is "+sum);
		
		sc.close();

	}

}
