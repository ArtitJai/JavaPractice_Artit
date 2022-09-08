package day22_ArrayOfArray;

import java.util.Arrays;

public class Task2_ArrayNum1_100 {

	public static void main(String[] args) {
		
//		Create an array that has the numbers 1 to 100
		
		int[] nums = new int[100];
		
		for(int i = 1 ; i < 101 ; i++) {
//			System.out.println(i);
			nums[i-1] = i;
		}
			
		System.out.println(Arrays.toString(nums));
	}

}
