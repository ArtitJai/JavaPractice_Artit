package day21_arrays;

import java.util.Arrays;

public class MaxAndMinValue {

	public static void main(String[] args) {
		
		int[] nums = {10, 3, 4, 30, 52, 1};
		
		Arrays.sort(nums);
		
//		max value is the last element of the sorted array
		
//		last element of an array. ==> arrayname[array.length-a]
		
		System.out.println(nums[nums.length-1]);
		
//		first element of an array ==> arrayname[0]
		System.out.println(nums[0]);
		
		int min = nums[0];
		
//		if(3 < min) {
//			min = 3;
//		}

		
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < min) {	
			min = nums[i];
			}	
		}
			System.out.println(min);
		
		int max = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {	
			max = nums[i];
			}	
		}
			System.out.println(max);
			
	}

}
