package day31_8thReview;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Dynamic size array,
		// access by indexing
		// order that you add value is matter
		
		// Syntax to initialize
		// Type<dataType> varName = new Type<dataType>();
		
		ArrayList<Integer> numlist = new ArrayList<>();
		ArrayList<Integer> numlist2 = new ArrayList<>(Arrays.asList(0, 9, 8));
		
		// Add
		numlist.add(1); // [1]
		numlist.add(2); // [1, 2]
		numlist.addAll(numlist2); // [1, 2, 0, 9, 8]
		// Insert
		numlist.add(1, 100); // [[1, 100, 2, 0, 9, 8]
		
		// Remove
		numlist.remove(0);
		System.out.println(numlist); // [2, 0, 9, 8]
		System.out.println(numlist.size());
		
		// Access member of Arraylist
		Integer number = numlist.get(2); // want 9
		System.out.println(number);
		
		int[] arr = new int[5];
		Object[] objArr = numlist.toArray(); // no param => Object[]
		numlist.toArray(new Integer[0]);
		Integer[] arrNum = numlist.toArray(new Integer[0]);
		System.out.println(Arrays.toString(arrNum));
		
		// numlist.clear(); // [] delete all member in the list
		numlist.isEmpty(); // if list is empty return true
		System.out.println(numlist);
		
		// to check existence of element
		System.out.println(numlist.contains(9));
		
		//
		numlist.forEach((num) -> System.out.println(num));
		// num represent each element in the list
		
		for(int num : numlist)
			System.out.println(num + " from forEach loop");
		
		
//		numlist == numlist2 => it's not work
		
		//Check to see two lists are equal
		System.out.println(numlist.equals(numlist2)); // false
		
		//
		numlist.removeIf(y -> y < 5); // [9, 8]
		System.out.println(numlist);
		
		// .indexOf(), .lastIndexOf()
		
		
		
		
		
			
	}

}
