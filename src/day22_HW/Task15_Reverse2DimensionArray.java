package day22_HW;

import java.util.Arrays;

public class Task15_Reverse2DimensionArray {

	public static void main(String[] args) {
		
		
//		Write a program that can reverse a two dimensional array (return new array)
//		Example:
//
//		input:
//		array = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};
//
//		output:
//		reverse = {{13,12,11,10,9,8}, {7,6,5,4}, {3,2,1},};

		
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11, 12, 13 } };
		
		int[] ar1 = array[0];
        System.out.println(ar1.length);
        int[] ar2 = array[1];
        System.out.println(ar2.length);
        int[] ar3 = array[2];
        System.out.println(ar3.length);

        int[] num1 = new int[ar1.length];
        int[] num2 = new int[ar2.length];
        int[] num3 = new int[ar3.length];

        int a = 0, b = 0, c = 0;

        for (int i = ar1.length - 1; i >= 0; i--) {
            num1[a] = ar1[i];
            a++;
        }
        System.out.println(Arrays.toString(num1));

        for (int j = ar2.length - 1; j >= 0; j--) {
            num2[b] = ar2[j];
            b++;
        }

        System.out.println(Arrays.toString(num2));

        for (int k = ar3.length - 1; k >= 0; k--) {
            num3[c] = ar3[k];
            c++;
        }

        System.out.println(Arrays.toString(num3));

        System.out.println(Arrays.toString(num3) + " " + Arrays.toString(num2) + " " + Arrays.toString(num1));

        int[][] newArr = {num3, num2, num1};

        System.out.println(Arrays.deepToString(newArr));
        
        
//        int[][] arr = {{1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};
//		int row = arr.length;
//		int column = arr[0].length;
//		
//		for(int i=0 ; i<arr.length;i++)
//		{
//		    for(int j=0 ; j<arr[i].length;j++){
//		    }
//
//		}
//
//		for(int i=0 ; i<arr.length;i++)
//		{
//		    for(int j= arr[i].length-1 ; j >= 0;j--)
//		    {
//		        System.out.println(arr[i][j]+",");
//		    }
//		    System.out.println();
//
//		}
		
	}
	}


