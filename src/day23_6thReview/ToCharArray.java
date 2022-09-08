package day23_6thReview;

import java.util.Arrays;

public class ToCharArray {

	public static void main(String[] args) {
		
		// .toCharArray() -> convert string to char array
		
		String str = "Hello";
		
		char[] arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));

	}

}
