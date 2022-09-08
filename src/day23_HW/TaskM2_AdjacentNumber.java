package day23_HW;

public class TaskM2_AdjacentNumber {

	public static void main(String[] args) {
		
//		# Task - M2
//
//		Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6,
//		... or 23, 24, 25.
//
//		```text
//		tripleUp([1, 4, 5, 6, 2]) → true
//		tripleUp([1, 2, 3]) → true
//		tripleUp([1, 2, 4]) → false
//		tripleUp([1, 2, 4, 5, 7, 6, 5, 7, 7, 6]) → false
//		tripleUp([-100, -99, -99, 100, 101, 102]) → true
//		```

		int[] nums = {-100, -99, -99, 100, 101, 102};
		
		 boolean result = false;
		 
		   for (int i =0;i < nums.length-2;i++) {
		 
		   if ( (nums[i] + 1 == nums[i+1]) && (nums[i+1] + 1 == nums[i+2]) )
		 
		   result = true;
		   }
		 
		   System.out.println(result);

	}

}
