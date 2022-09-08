package day22_HW;

import java.util.Arrays;

public class Task15_Reverse2DimensionArrayExample02 {

	public static void main(String[] args) {
		/*
	      15. Write a program that can reverse a two dimensional array (return new array)
	input:
	array = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};
	output:
	reverse = {{13,12,11,10,9,8}, {7,6,5,4}, {3,2,1},};
	       */
	      //
	      int[][] array = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12, 13}};
	      int[][] result = new int[array.length][]; // new int[3] empty
	      for (int i = array.length - 1, m = 0; i >= 0; i--, m++) {
	         System.out.println(Arrays.toString(array[i]));
	         result[m] = reverseArr(array[i]);
	      }
	      System.out.println();
	      System.out.println(Arrays.deepToString(result));
	   }

	   public static int[] reverseArr(int[] arr) {
	      int[] reversedArr = new int[arr.length];
	      int j = 0;
	      for (int i = arr.length - 1; i >= 0; i--) {
	         reversedArr[j++] = arr[i];
	      }
	      return reversedArr;
	   }


	   public static void task15A() {
	      int[][] array = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12, 13}};
	      int[][] result = new int[array.length][]; // new int[3] empty
	      for (int i = array.length - 1, m = 0; i >= 0; i--, m++) {
	         System.out.println(Arrays.toString(array[i]));
	         int[] newInsideArr = new int[array[i].length]; // new int[6] empty
	         for (int j = array[i].length - 1, k = 0; j >= 0; j--, k++) {
//	            System.out.print(array[i][j]);
	            newInsideArr[k] = array[i][j];
	         }
	         System.out.println(Arrays.toString(newInsideArr)); // reversed inside arr
	         result[m] = newInsideArr;
	         System.out.println();
	      }
	      System.out.println(Arrays.deepToString(result));
	   }

	}


