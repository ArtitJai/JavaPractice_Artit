package day23_HW;

public class TaskE2_UnLuckyNumber {

	public static void main(String[] args) {
		
//		# Task - E2
//
//		We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the
//		given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
//
//		```text
//		unlucky1([1, 3, 4, 5]) → true
//		unlucky1([2, 1, 3, 4, 5]) → true
//		unlucky1([1, 1, 1]) → false
//		```
		
		int[] nums = {2, 1, 3, 4, 5};

		if (nums.length < 2) {
			System.out.println(false);
		}
		else if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length-2] == 1 && nums[nums.length-1] == 3)) {
			System.out.println(true);
		}
		else if (nums.length > 2 && nums[1] == 1 && nums[2] == 3) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

		
		
		
	}

}
