package day07_HW;

import java.util.Scanner;

public class Solution_C {

	public static void main(String[] args) {
		
		
		/*
		## Task C - Plus or Minus Ten

		- Create the new class, called `Solution_C`
		- Write a program that reads a input from user
		- It should print `true` if value is in between -10 and 10. or `false` otherwise.
		
		Sample Input:
		> 5
		
		Sample Output:
		> true
		
		Sample Input:
		> -15
		
		Sample Output:
		> false
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please,enter number");
		double num = sc.nextDouble();
	
		
		boolean IsEligible = num >= -10 && num <=10;
		
		System.out.println(IsEligible);
		
		
		

	}

}
