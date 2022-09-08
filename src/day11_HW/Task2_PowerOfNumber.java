package day11_HW;

import java.util.Scanner;

public class Task2_PowerOfNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your base number?");
		int base = sc.nextInt();
		
		System.out.println("What is your power number?");
		int power = sc.nextInt();
		
		int result = 1;
		
		while(power != 0) {
			result = result * base;
			power--;
		}
		
		System.out.println("The result is: "+result);
		
		sc.close();
		
//		for(power = 2; power > 0; power--) {
//			result = result * base;
//		}
		
		
	}

}

//	Calculate the power of a number in Java using while loop
//	import java.io.*;
//
//	public class JavaApplication1 {
//	 public static void main(String[] args)
// 	{
//     int base = 3, power = 3;
//     int result = 1;
//     // running loop while the power > 0
//     while (power != 0) {
//         result = result * base;
//         // power will get reduced after
//         // each multiplication
//         power--;
//     }
//     System.out.println("Result =  " + result);
// 	}
//	}