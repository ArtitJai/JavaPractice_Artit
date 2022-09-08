package day22_HW;

import java.util.Arrays;

public class Task10_Merge3ArrayIn1 {

	public static void main(String[] args) {
		
//		Write a program that can merge 3 arrays of integers
//
//		Example:
//
//		Input:
//		arr1 = {30, 10, 20}; 
//		arr2 = {15, 40, 25, 35}; 
//		arr3 = {8, 9, 17, 5, 4, 1} 
//
//		Output:
//		{30,10,20,15,40,25,35,8,9,17,5,4,1}
		
		int[] arr1 = {30, 10, 20};
		int[] arr2 = {15, 40, 25, 35};
		int[] arr3 = {8, 9, 17, 5, 4, 1};
		int[] arr4 = new int[arr1.length + arr2.length + arr3.length];
		
		for (int a = 0; a < arr1.length; a++) { 
			for (int i = 0; i < arr1.length; i++)
				arr4[a++] = arr1[i];
			for (int j = 0; j < arr2.length; j++)
			    arr4[a++] = arr2[j];
			for (int k = 0; k < arr3.length; k++)
			    arr4[a++] = arr3[k];
			
			System.out.println(Arrays.toString(arr4));
		}
		
				
		
		
	}

}

//					//Input:
//					int[] arr1 = {30, 10, 20}; 
//					int[] arr2 = {15, 40, 25, 35}; 
//					int[] arr3 = {8, 9, 17, 5, 4, 1} ;
//					
//					//Output:
//					//{30,10,20,15,40,25,35,8,9,17,5,4,1}
//					
//					int[] arr4 = new int[arr1.length + arr2.length + arr3.length];
//					
//					int index = 0;
//					ArrayUtils.printArray(arr4);
//					for (int num : arr1) {
//					    arr4[index] = num;
//					    index++;
//					}
//					
//					
//					ArrayUtils.printArray(arr4);
//					
//					for (int num : arr2) {
//					    arr4[index] = num;
//					    index++;
//					}
//					
//					
//					ArrayUtils.printArray(arr4);
//					
//					
//					for (int num : arr3) {
//					    arr4[index] = num;
//					    index++;
//					}
//					
//					
//					ArrayUtils.printArray(arr4);

