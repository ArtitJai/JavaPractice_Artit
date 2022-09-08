package day41_errorhandling;

public class ArrayIndexProblem {

	public static void main(String[] args) {
		
		try{
//					  0	   1   2   3   4  5   6   7	
		int[] nums = {11, 22, 33, 44, 55, 66, 77, 88};
		
		System.out.println(nums[4]); // 55
		
		System.out.println(nums[7]); // 88
		
		System.out.println(nums[10]); // index issue
		}catch(Exception e) {
			System.out.println("Array index issue");
//			e.printStackTrace();
		}
		System.out.println("I'm here");
	}

}
