package day07_HW;

import java.util.Scanner;

public class Solution_A {
	
	/* 
	 *     ## Task A - Is it in order?

			- you should create a new class called `Solution_A`
			  Write program that can check the order of the 3 integer inputs. if the order that input integer
			  are in descending order (high -> low). the program should return `true`, otherwise return `false`

			#### Input 1

			> 185 178 172

			#### Output 1

			> true

			#### Input 2

			> 181 184 177

			#### Output 2

			> false
			*/
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("numA");
		int numA = scanner.nextInt();
		
		System.out.println("numB");
		int numB = scanner.nextInt();
		
		System.out.println("numC");
		int numC = scanner.nextInt();
		
		System.out.println(" ");
		
		boolean descending = numA > numB && numB > numC;
		System.out.println("TRUE");
		
		scanner.close();

	}

}
