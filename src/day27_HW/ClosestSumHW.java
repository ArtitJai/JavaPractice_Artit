package day27_HW;

public class ClosestSumHW {
			
	
//			## Task - Sum3Closest
//		
//			Given an integer array nums of length n and an integer target, find three integers in nums such that
//			the sum is closest to target.
//		
//			Return the sum of the three integers.
//		
//			You may assume that each input would have exactly one solution.
//		
//			#### Example 1:
//		
//			```text
//			Input: nums = [-1,2,1,-4] , target = 1
//			Output: 2
//			Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//			```
//		
//			#### Example 2:
//		
//			```text
//			Input: nums = [0,0,0] , target = 1
//			Output: 0
//			```
//		
//			#### Constraints:
//		
//			- 3 <= nums.length <= 1000
//			- -1000 <= nums[i] <= 1000
//			- -104 <= target <= 104
	
	// Function to return the sum of a
	// triplet which is closest to x
public static int closest(int arr[], int x){
	     
	    // To store the closest sum
	    int closestSum = Integer.MAX_VALUE;
	   
	    // Run three nested loops each loop 
	    // for each element of triplet
	    for(int i = 0; i < arr.length ; i++) 
	    {
	        for(int j = i + 1; j < arr.length; j++)
	        {
	            for(int k = j + 1; k < arr.length; k++)
	            {
	                 
	                // Update the closestSum
	                if (Math.abs(x - closestSum) >
	                    Math.abs(x - (arr[i] + arr[j] + arr[k])))
	                    closestSum = (arr[i] + arr[j] + arr[k]);
	            } 
	        }
	    }
	     
	    // Return the closest sum found
	    return closestSum;
	}
public static void main(String[] args) {
	
	  int arr[] = { -1, 2, 1, -4 };
	    int x = 1;
	     
	    System.out.print(closest(arr, x));
	}

}


