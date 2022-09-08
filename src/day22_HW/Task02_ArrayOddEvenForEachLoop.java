package day22_HW;

import java.util.Arrays;

public class Task02_ArrayOddEvenForEachLoop {

	public static void main(String[] args) {
		
//		2. Write a program that can count the even and odd number from an array of integers
//		Note: MUST use for each loop
		
		int[] nums = new int[100];
		
		for(int i = 1 ; i < 101 ; i++) {
			nums[i-1] = i;
		}
		
		int[] result = new int[nums.length];
		int index = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				result[index] = nums[i];
				index++;
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 1) {
				result[index] = nums[i];
				index++;
			}
		}
		

		System.out.println(Arrays.toString(result));
		
		int even = 0;
		int odd = 0;
	
		for(int a : nums) {
			if(a % 2 == 0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Count of even number is: "+ even);
		System.out.println("Count of odd number is: "+ odd);
		
	}

}
