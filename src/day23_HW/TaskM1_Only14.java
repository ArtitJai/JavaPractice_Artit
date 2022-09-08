package day23_HW;

public class TaskM1_Only14 {

	public static void main(String[] args) {
		
//		# task - M1
//
//		Given an array of ints, return true if every element is a 1 or a 4.
//
//		```text
//		only14([1, 4, 1, 4]) → true
//		only14([1, 4, 2, 4]) → false
//		only14([1, 1]) → true
//		only14([4, 1, 4, 1]) → true
//		only14([]) → true
//		```
		
		int[] nums = {1, 4, 2, 4};
		int a = 0;
		
		for(int i =0; i<nums.length;i++){
			if(nums[i]==1)
			a++;
			else if(nums[i]==4)
			a++;}
			 System.out.println(a == nums.length);
	}

}
