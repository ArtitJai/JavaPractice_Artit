package day23_HW;

import java.util.Arrays;

public class TaskE1_SwapFirstAndLast {

	public static void main(String[] args) {
		
//		# Task - E1
//
//		Given an array of ints, swap the first and last elements in the array. Return the modified array.
//		The array length will be at least 1.
//
//		```text
//		swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
//		swapEnds([1, 2, 3]) → [3, 2, 1]
//		swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
//		```

		 	int[] nums = {1, 2, 3, 4};
		
			int temp = nums[0];
		    nums[0] = nums[nums.length - 1];
		    nums[nums.length - 1] = temp;
		    
		    System.out.println(Arrays.toString(nums));
			
	}

}
