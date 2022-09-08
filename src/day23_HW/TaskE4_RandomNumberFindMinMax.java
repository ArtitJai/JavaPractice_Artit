package day23_HW;

import java.util.Arrays;

public class TaskE4_RandomNumberFindMinMax {

	public static void main(String[] args) {
		
//		# Task - E4
//
//		Create array that store 20 randoms numbers between 1-99. Then write the program that can find `max`
//		and `min` number from that list then store them in new int[2]{`min`,`max`}
		
		 int[] nums = new int[20];

		    //Generates 20 Random Numbers in the range 1 to 99
		    for(int i = 0; i < nums.length; i++)
		      nums[i] = (int)(Math.random() * 99 + 1);
		    
		    System.out.println(Arrays.toString(nums));
		
		    Arrays.sort(nums);
		    
		    System.out.println("\nMinimum number for this array is : " + nums[0]);
		    
		    int max = nums[0];
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] > max) {	
				max = nums[i];
				}	
			}
			
			System.out.println("\nMaximum number for this array is : " + max);
	}

}
