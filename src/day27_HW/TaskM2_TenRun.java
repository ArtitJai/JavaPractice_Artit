package day27_HW;

import java.util.Arrays;

public class TaskM2_TenRun {

//	## Task - M2
//
//	For each multiple of 10 in the given array, change all the values following it to be that multiple
//	of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20,
//	20}.
//
//	```text
//	[1, 20, 50, 1] → [1, 20, 50, 50]
//	[2, 10, 3, 4, 20, 5] → [2, 10, 10, 10, 20, 20]
//	[10, 1, 20, 2] → [10, 10, 20, 20]
//	[10, 1, 9, 20] → [10, 10, 10, 20]
//	[1, 2] → [1, 2]
//	[1, 2] → [1, 2]
//	```
	
public static int[] multiple(int[] nums) {
		
		  for(int i = 0; i < nums.length;i++){
		  if ( nums[i] % 10 == 0)
		  {	  
		  for (int j = i +1; j < nums.length && !(nums[j] % 10 == 0) ; j++) 
			  nums[j] = nums[i];
		  }
		
		  }
		
		  return nums;
	
		}
public static void main(String[] args) {
	
	int[] nums = {1, 20, 12, 50, 1};
	
	System.out.println(Arrays.toString(multiple(nums)));
}

}

//		public int[] tenRun(int[] nums) {
//		    int current;
//		    int i = 0;
//		      
//		    while(i < nums.length && nums[i] % 10 != 0)
//		        i++;
//		                
//		    if(i >= nums.length)
//		        return nums;
//		                          
//		    current = nums[i]; 
//		    i++;
//		                                
//		    while(i < nums.length) {
//		        if(nums[i] % 10 == 0)
//		            current = nums[i];
//		        else
//		            nums[i] = current;
//		        i++;
//		    }
//		                                                              
//		    return nums; 
//		}
