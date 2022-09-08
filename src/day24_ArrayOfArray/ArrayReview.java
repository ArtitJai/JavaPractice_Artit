package day24_ArrayOfArray;

import java.util.Arrays;
import java.util.Iterator;

import day21_arrays.ForEachLoop;

public class ArrayReview {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		nums[0] = 70;
		nums[1] = 22;
		nums[2] = 44;
		nums[3] = 11;
		nums[4] = 1;
		
		
		System.out.println(nums[4]);
		System.out.println(Arrays.toString(nums));
		
		for(int apple : nums) {
			System.out.println(apple);
		}
		for (int i = 0; i < nums.length; i++) {
			
		}
		
		for (int i : nums) {
			
		}
		
		
	}

}
