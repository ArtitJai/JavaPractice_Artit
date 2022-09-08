package day23_HW;

import java.util.Arrays;

public class TaskE3_ReturnFirstElement {

	public static void main(String[] args) {
		
//		# Task - E3
//
//		Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
//		If either array is length 0, ignore that array.
//
//		```text
//		front11([1, 2, 3], [7, 9, 8]) → [1, 7]
//		front11([1], [2]) → [1, 2]
//		front11([1, 7], []) → [1]
//		front11([], [2, 8]) → [2]
//		front11([], []) → []
//		```
		
		int[] a = {1, 2, 3};
		int[] b = {7, 9, 8};
		
		int[] c = new int[a.length > 0 ? b.length > 0 ? 2:1:b.length > 0 ? 1:0];
		
		if(a.length > 0) {
			c[0] = a[0];
		}
		if(b.length > 0) {
			c[a.length > 0 ? 1:0] = b[0];
		}
		
		System.out.println(Arrays.toString(c));
	}

}
