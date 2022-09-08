package day27_HW;

public class TaskH1_CanBalance {

//		## Task - H1
//	
//		Given a non-empty array, return true if there is a place to split the array so that the sum of the
//		numbers on one side is equal to the sum of the numbers on the other side.
//	
//		```text
//		[1, 1, 1, 2, 1] → true
//		[2, 1, 1, 2, 1] → false
//		[10, 10] → true
//		[1, 2, 3, 1, 0, 1, 3] → false
//	```
	
public static boolean balanceSum(int[] nums) {
		
	 int total = 0, half = 0; 
	 
	  for(int i = 0; i < nums.length; i++)
	  {
	    total = nums[i] + total;
	  }
	  if(total % 2 == 1)
	  {
	    return false;
	  }
	  for(int i = 0; i < nums.length; i++)
	  {
	    half = nums[i] + half;
	    if(half == total / 2)
	    {
	      return true;
	    }
	  }
	  return false;
}

//				int leftSum = 0;
//				int rightSum = 0;
//				for (int i = 0; i < nums.length; i++){
//				      leftSum += nums[i];
//				      for (int j = i+1; j < nums.length; j++){
//				        rightSum += nums[j];
//				      }
//				      if (leftSum == rightSum)
//				        return true;
//				      rightSum = 0;
//				}
//				return false;
//				}

public static void main(String[] args) {
	
	int[] nums = {1, 2, 3, 1, 0, 1, 3};
	
	System.out.println(balanceSum(nums));
}
}
