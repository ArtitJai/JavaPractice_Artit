package day22_HW;

import java.util.Scanner;

public class Task09_StoreAndFindAverageNumberInArray {

	public static void main(String[] args) {
		
//			AverageNumber:
//
//			Ask the user how many numbers user want to enter
//			get all the inputs from the user and store them into an array
//			Iterate the array & return the average number

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers user want to enter");
		
		int num = sc.nextInt();
		
		double mean = 0;
		double[] arr = new double[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("Enter value");
			arr[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < num; i++) {
			mean += arr[i];
		}
		
		System.out.println("The average number is :"+ mean/num);
		
	sc.close();
	
	}

}
