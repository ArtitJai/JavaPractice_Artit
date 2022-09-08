package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		
		String fruit1 = "Apple";
		String fruit2 = "Banana";
		String fruit3 = "Mango";
		String fruit4 = "Orange";
		String fruit5 = "Kiwis";
		String fruit6 = "Grapes";
		
		String[] fruits = new String[10]; // this is an array of string that can hold 6 elements
		
//		  0		1	  2		3	  4		5	  6		7	  8		9		
//		[null, null, null, null, null, null, null, null, null, null]
		
		System.out.println(Arrays.toString(fruits));
		
		fruits[0] = "Apple";
		System.out.println(Arrays.toString(fruits));
		
		fruits[1] = fruit1;
		System.out.println(Arrays.toString(fruits));
		
		fruits[2] = fruit2;
		System.out.println(Arrays.toString(fruits));
		
		fruits[3] = fruit3;
		System.out.println(Arrays.toString(fruits));
		
		fruits[4] = fruit4;
		System.out.println(Arrays.toString(fruits));
		
		fruits[5] = fruit5;
		System.out.println(Arrays.toString(fruits));
		
		fruits[6] = fruit6;
		System.out.println(Arrays.toString(fruits));
		
		fruits[7] = "Durians";
		System.out.println(Arrays.toString(fruits));
		
		fruits[8] = "Mangosateen";
		System.out.println(Arrays.toString(fruits));
		
		fruits[9] = "Rambutan";
		System.out.println(Arrays.toString(fruits));
		
		System.out.println(fruits[3]);
		
		System.out.println(Arrays.toString(fruits));
		
		fruits[9] = "Pears";
		System.out.println(Arrays.toString(fruits));
		
		System.out.println(fruits.length); // return number of elements
	
		System.out.println(fruits.length-1);
		
		System.out.println(fruits[fruits.length-1]);
	}

}
