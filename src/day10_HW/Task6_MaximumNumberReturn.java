package day10_HW;

import java.util.Scanner;

public class Task6_MaximumNumberReturn {

	public static void main(String[] args) {
		
		
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=1;i<=5;i++){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if(num > max) {
            	max=num;
            }   
		}

		 System.out.println("the max number is: " + max);
		
		 sc.close();
		 
	}

}

//## Task6
//
//`Write a program that asks the user to enter a number for 5 times.
//return the maximum number



