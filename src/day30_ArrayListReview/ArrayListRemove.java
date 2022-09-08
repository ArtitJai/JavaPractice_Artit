package day30_ArrayListReview;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemove {

	public static void main(String[] args) {
		
		ArrayList<String>arr = new ArrayList<>
		(Arrays.asList( "Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));
		
		arr.removeIf(item -> item.contains("J"));
		
		System.out.println(arr);

	}

}
