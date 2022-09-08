package day21_arrays;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {
		
		int[] list1 = {1, 2, 3, 4, 5};
		
		int[] list2 = {5, 4, 3, 2, 1};
		
		int[] list3 = {1, 2, 3};
		
		System.out.println(Arrays.equals(list1, list2));
		
		Arrays.sort(list1);
		Arrays.sort(list2);

		
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		
		System.out.println(Arrays.equals(list1, list2));
		
		System.out.println(Arrays.equals(list1, list3));
	}

}
