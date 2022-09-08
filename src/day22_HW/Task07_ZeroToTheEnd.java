package day22_HW;

import java.util.Arrays;

public class Task07_ZeroToTheEnd {

	public static void main(String[] args) {
		
//		write a program that can move all the zeros to the end of the array
//		Example:
//
//		input:
//		array = {10, 0, 5, 0, 1, 0};
//
//		output:
//		{10, 5, 1, 0, 0, 0}

		
		int[] arr = {10, 0, 5, 0, 1, 0};
		
		int j = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
				
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}



//			int[] array = { 10, 0, 5, 0, 1, 0 };
//			int[] newArr = new int[array.length];
//			int j = 0;
//			for (int i = 0; i < array.length; i++) {
//				if (array[i] != 0) {
//					newArr[j] = array[i];
//					j++;
//				}
//			}
//			
//			System.out.println(Arrays.toString(newArr));
//			




