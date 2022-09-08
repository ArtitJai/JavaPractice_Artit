package day23_6thReview;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		
		// split() --> convert string to string[], depend on separator
		
		String str = "Hello world Java";
		String[] strArr = str.split(" ");
		System.out.println(Arrays.toString(strArr)); // ["Hello", "world", "Java"]

	}

}
