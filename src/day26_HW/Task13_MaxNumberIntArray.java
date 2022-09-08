package day26_HW;

public class Task13_MaxNumberIntArray {

//	13. Write a function that can find the maximum number from an int Array

	protected static int findMax(int[] arr) {
		
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		
		int[] arr = {5, 7, 300, 9 ,25};
		
		System.out.println(findMax(arr));

	}
	
}
