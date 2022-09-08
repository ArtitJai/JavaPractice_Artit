package day22_HW;

import java.util.Arrays;

public class Task15_Reverse2DimensionArrayExample01 {

	public static void main(String[] args) {
		
		int[][] array = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};
	      int[][] result = new int[array.length][]; // new int[3] empty
	      for (int i = array.length-1,m = 0; i >= 0; i--,m++) {
	         System.out.println(Arrays.toString(array[i]));
	         int[] newInsideArr = new int[array[i].length]; // new int[6] empty
	         for (int j = array[i].length-1,k = 0; j >= 0; j--, k++) {
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
