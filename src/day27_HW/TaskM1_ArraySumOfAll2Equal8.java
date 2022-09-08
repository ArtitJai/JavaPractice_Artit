package day27_HW;

import java.nio.file.spi.FileSystemProvider;

public class TaskM1_ArraySumOfAll2Equal8 {
	
//	## Task - M1
//
//	Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
//
//	```text
//	[2, 3, 2, 2, 4, 2] → true
//	[2, 3, 2, 2, 4, 2, 2] → false
//	[1, 2, 3, 4] → false
//	[2] → false
//	[] → false
//	[5, 2, 2, 2, 4, 2] → true
//	```
	
public static boolean sum28(int[] nums) {
	
	boolean result = false;
	
	int sum = 0;
	
	for (int i = 0; i <nums.length;i++) {
		if (nums[i] == 2) sum+=2;
	}
		if (sum == 8) result = true;
		
	return result;

}
public static void main(String[] args) {
	
	int[] nums = {5, 2, 2, 2, 4, 2};
	
	System.out.println(sum28(nums));
}
}
