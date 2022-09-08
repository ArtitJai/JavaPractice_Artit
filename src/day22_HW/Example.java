package day22_HW;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		
		int[][] array = {{1,2,3},{4,5,6,7},{8,9,10,11,12,13}};
		// expected output: reverse[][] = {{13,12,11,10,9,8},{7,6,5,4},{3,2,1}};
		
		int[][] reverse = new int[array.length][];
		
		int a = 0;
		for(int i = array.length-1; i >= 0; i--) {
			int b = 0;
			for(int j = array[i].length-1; j >= 0; j--) {
				reverse[a][b] = array[i][j];
				b++;
			}
			a++;
		}
		
		System.out.println(Arrays.toString(reverse));

	}

}
