package day22_HW;

import java.util.Arrays;

public class Task13_MergeArrayOfInteger {

	public static void main(String[] args) {
		
		
//		write a program that can merge two arrays of integers
//		Example:
//
//		input:
//		arr1 = {1,2,3,4} 
//		arr2 = {5,6}
//
//		output:
//		arr3 = {1,2,3,4,5,6}
		
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6};
		int[] arr3 = new int[arr1.length + arr2.length];
		
		for (int a = 0; a < arr1.length; a++) { 
			for (int i = 0; i < arr1.length; i++)
				arr3[a++] = arr1[i];
			for (int j = 0; j < arr2.length; j++)
			    arr3[a++] = arr2[j];
			System.out.println(Arrays.toString(arr3));
		}
		
		

	}

}
