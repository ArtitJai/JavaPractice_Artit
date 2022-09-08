package day22_ArrayOfArray;

import java.util.Arrays;
import java.util.Collections;

public class Task3_SortTheArray {

	public static void main(String[] args) {
		
		/*
		Write a program that sort the array of integer in descending order
 

		example:
   		arr[] = {1,2,3,4,5};
		
		output:
        arr[] =    {5,4,3,2,1} 
 
		 */
		
		int[] nums = {1, 2, 3, 4, 5};
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		
		int[] nums1 = new int[nums.length];
		
		System.out.println(Arrays.toString(nums1));
		
		int index = 0;
		
		for(int i = nums.length-1; i >= 0; i--) {
			System.out.println(nums[i]);
			nums1[index] = nums[i];
			index++;
		}
		
		System.out.println(Arrays.toString(nums1));
		
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        Arrays.sort(arr);

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
		
	
	
	
	}
		
	}


