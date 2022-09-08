package day27_7thReview;

import java.util.Arrays;

public class MultiDimensionArray {

	public static void main(String[] args) {
		
        //    Column
	int[][] numbers = { { 1, 2, 3 }, //<Role //0
	        { 4, 5, 6 },         // 1    
	        { 7, 8, 9 } };       // 2
	//                role    Column
	//numberTable    [0]        [0];             this will show : 1
	
	
	
	int[][] team = { { 1, 2, 3, 1, 2 }, 
	     { 4, 5, 6 },         
	     { 7, 8, 9 } };
	
	
	// for printing out the arrays
	
	for (int i = 0; i < team.length; i++) {
	for (int j = 0; j < team.length; j++) {
	System.out.println(team[i][j]);
	}
	
	System.out.println(Arrays.toString(team));// this will return null due to unable to access to print more than 1D arrays
	
	System.out.println(Arrays.deepToString(team));// with this, it will able to access to print more than 1D arrays

	}

}
}
