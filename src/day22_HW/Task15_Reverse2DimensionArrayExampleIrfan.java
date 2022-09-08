package day22_HW;

import java.util.Arrays;

public class Task15_Reverse2DimensionArrayExampleIrfan {

	public static void main(String[] args) {
		
		/*
	      15. Write a program that can reverse a two dimensional array (return new array)
	input:
	array = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};
	output:
	reverse = {{13,12,11,10,9,8}, {7,6,5,4}, {3,2,1},};
	       */
		int[][] arr = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};
		
	System.out.println(Arrays.deepToString(reverseArr(arr)));
		

	}	
	
	protected static int[][] reverseArr(int[][] arr) {
		
		int[][] reversed2DArr = new int[arr.length][];
		
		int index = 0;
		
		for(int i = arr.length - 1; i >= 0; i--) {
//			System.out.println(Arrays.toString(arr[i]));		
//			System.out.println(Arrays.toString(reverseArr(arr[i])));
			
			reversed2DArr[index] = reverseArr(arr[i]);
			index++;
		}
		return reversed2DArr;
	}
	
	protected static int[] reverseArr(int[] arr) {
		
		
//		int[] arr = {8,9,10,11,12,13};	
		
		int[] reverseArr = new int[arr.length];
		
		int index = 0;
		
		for(int i = arr.length - 1; i >= 0; i--) {
//			System.out.println(arr[i]);
			reverseArr[index] = arr[i];
			index++;
		}
		
		return reverseArr;
		
		
	}
}



