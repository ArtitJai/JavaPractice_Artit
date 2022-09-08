package day23_6thReview;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		
		// sort() -> ascending order
		
		int[] arr = { 5, 0, -11, 100 };
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		// fill() -> set all element with specific value
		Arrays.fill(arr, 100);
		System.out.println(Arrays.toString(arr));
		
		// equals() -> if all elements in array have the same value +> true
		int x = 1, y = 1;
		System.out.println(x == y); // true
		
		String[] fruits1 = { "Orange", " Mango", "Banana" };
		String[] fruits2 = { "Orange", " Mango", "Banana" };
		
		System.out.println(fruits1 == fruits2); // not working
		System.out.println(Arrays.equals(fruits1, fruits2));
	
		
			
	}

}
