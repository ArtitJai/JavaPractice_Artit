package day31_8thReview;

import java.util.ArrayList;
import java.util.Arrays;

public class ListWithLambda {

	public static void main(String[] args) {
		
	      ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1, 2, 0, 9, 8, 101));

	      //
//	      numList.removeIf((y) -> y < 5); // [9, 8, 101]
	      
	      
	      numList.removeIf(
	    		  (x) -> 
	    		  x % 2 == 0 // boolean expression
	    		  ); // return list of odd integer
	      
	      
	      
	      
	      System.out.println(numList);
	      // Access each element in the list
	      numList.forEach((num)-> System.out.println(num+" from forEach()"));
	      // num represent each element in the list

	}

}
