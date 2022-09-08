package day22_HW;

import java.util.Arrays;
import java.util.Collections;

public class Task01_Array100To1 {

	public static void main(String[] args) {
		
//		1. create an array that has the numbers 100 to 1
		
		Integer[] nums = new Integer[100];
		
		int index = 0;
		for(int a = 100; a >= 1; a--) {
			nums[index] = a;
			index++;
		}
		
		System.out.println(Arrays.toString(nums));
		
		for(int i = 1 ; i < 101 ; i++) {
			nums[i-1] = i;
		}
		
		Arrays.sort(nums,Collections.reverseOrder());
		
		System.out.println(Arrays.toString(nums));
		
		

	}

}
