package day09_HW;

import java.util.Scanner;

public class Task_8_Triangle {

	public static void main(String[] args) {
		
		/*
		Task01: ValidTriangle
		         A triangle is valid if the sum of all the three angles is equal to
		         180 degrees. Write a program that declares three integers as angles
		         and check whether a triangle is valid or not.
		 */

		int triangle = 180;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number of degree to make triangle");
		int num1 = sc.nextInt();
		
		System.out.println("Please enter number of degree to make triangle");
		int num2 = sc.nextInt();
		
		System.out.println("Please enter number of degree to make triangle");
		int num3 = sc.nextInt();
		
		
		if(num1+num2+num3==triangle) {
			System.out.println("Bingo! valid to build Triangle");
		}else {
			System.out.println("Not valid degree to make Triangle");
		}

		
	sc.close();
		
		   
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
