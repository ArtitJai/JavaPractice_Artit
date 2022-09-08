package day22_HW;

import java.util.Scanner;

public class Task18_RandomNumberToArray {

	public static void main(String[] args) {
		
//		Write a program to add random 100 number to an integer array
//
//		how many even numbers in the array?
//		how many odd numbers in the array?
//		how many numbers can be evenly divisible by 3?
//		how many numbers can be evenly divisible by 5?

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers user want to enter");
		
		int num = sc.nextInt();
		
		double[] arr = new double[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("Enter value");
			arr[i] = sc.nextDouble();
		}
		
		double[] result = new double[arr.length];
		int even = 0;
		int odd = 0;
		int index3 = 0, index5 = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				result[even] = arr[i];
				even++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) {
				result[odd] = arr[i];
				odd++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0) {
				result[index3] = arr[i];
				index3++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 5 == 0) {
				result[index5] = arr[i];
				index5++;
			}
		}
		System.out.println();
		System.out.println("Count of even number is: "+ even);
		System.out.println("Count of odd number is: "+ odd);
		System.out.println("count of numbers can be evenly divisible by 3 :"+ index3);
		System.out.println("count of numbers can be evenly divisible by 5 :"+ index5);
		
		sc.close();
	}

}

//Random rm = new Random();
//int[] arr = new int[100];
//int even = 0, odd = 0, divByThree = 0, divByFive = 0;
//
//for (int i = 0; i < arr.length; i++) {
//	arr[i] = rm.nextInt(100);
//}
//for (int i : arr) {
//	if (i % 2 == 0) {
//		even++;
//	}
//	if (i % 2 == 1) {
//		odd++;
//	}
//	if (i % 3 == 0) {
//		divByThree++;
//	}
//	if (i % 5 == 0) {
//		divByFive++;
//	}
//
//}
//System.out.println(Arrays.toString(arr));
//
//System.out.println("Even Count: " + even);
//System.out.println("Odd Count: " + odd);
//System.out.println("Divisible by 3 Count: " + divByThree);
//System.out.println("Divisible by 5 Count: " + divByFive);
//
//}
//}




