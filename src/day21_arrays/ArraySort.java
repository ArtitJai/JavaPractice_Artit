package day21_arrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
	int nums[] = {15, 20, 10, 25, 35, 40};
		
		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums);

		System.out.println(Arrays.toString(nums));
		
		int max;
		int min = nums[0];
		
		System.out.println(nums.length);
		System.out.println(nums.length-1);
		
		System.out.println(nums[nums.length-1]);
		
		for(int i =0; i < nums.length; i++) {
			if(nums[i] < min);
			}	
		System.out.println(min);

	}

}
