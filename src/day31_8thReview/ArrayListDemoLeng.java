package day31_8thReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemoLeng {

	public static void main(String[] args) {
		
		// ArrayList => Dynamic size array,
	      // access by indexing
	      // order that you add value is matter

	      // Syntax to initialize
	      // Type<dataType> varName = new Type<dataType>();
	      ArrayList<Integer> numList = new ArrayList<>();
	      ArrayList<Integer> numList2 = new ArrayList<>(Arrays.asList(0, 9, 8));

	      // Add element at the end of the list
	      numList.add(1); // [1]
	      numList.add(2); // [1,2]
	      numList.addAll(numList2); // [1,2,0,9,8]
	      System.out.println(numList);
	      System.out.println(numList.size());
	      // Insert element
	      numList.add(1,100); // [1,100,2,0,9,8]

	      // Remove element by index
	      numList.remove(0);
	      System.out.println(numList); // [2, 0, 9, 8]
	      System.out.println(numList.size());

	      // Access member of Arraylist
	      Integer number = numList.get(2); // want 9
	      System.out.println(number);

	      // Convert ArrayList to Array
	      int[] arr = new int[5];
	      Object[] objArr = numList.toArray(); // no param => Object[]
	      Integer[] arrNum = numList.toArray(new Integer[0]);
//	      System.out.println(Arrays.toString(arrNum));
//	      System.out.println(arrNum[0]);

//	      numList.clear(); // [] delete all member in the list
	      numList.isEmpty(); // if list is empty return true
	      System.out.println(numList);

	      // to check existence of element
	      System.out.println(numList.contains(9));


	      for (int num:numList)
	         System.out.println(num+" from forEach loop");

	      // Check to see two lists are equal
	      System.out.println(numList.equals(numList2)); // false

	      // .indexOf(), .lastIndexOf()

	      // replace element with specific index
	      numList.set(1,100);
	      System.out.println(numList); // [2,100,9,8]
	      
	      // subList, first index inclusive. last index is exclusive
	      //   0    1   2  3  4
	      // [100, 100, 0, 9, 8]
	      List<Integer> list = numList.subList(1, 3);// return new ArrayList from Index 1 to 2
	      System.out.println(list); // [100,0]

	}

}
