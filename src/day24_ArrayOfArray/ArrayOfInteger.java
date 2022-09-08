package day24_ArrayOfArray;

import java.util.Arrays;

public class ArrayOfInteger {

	public static void main(String[] args) {
		
//							   0		 1				2	
	
		int[][] numbers = {{1, 2, 3},{7, 8, 9},{11, 22, 33, 44, 55, 66}};
		
		System.out.println(numbers.length); // 3
		
		for(int[] arr : numbers) {
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println();
		
		for(int[] arr : numbers) {
			for(int num : arr) {
				System.out.println(num);
			}
		}
	
		System.out.println();
//		Create a program to find out all the odd number from above array
		
	
		for(int[] arr : numbers) {
			for(int num : arr) {
				
				if(num % 2 == 0) {
					System.out.println(num);
				}
				
			}
		}
	
		for(int[] arr : numbers) {
			for(int num : arr) {
				
				if(num % 2 == 0) {
					System.out.println(num);
				}
				
			}
		}
		
	}

}
