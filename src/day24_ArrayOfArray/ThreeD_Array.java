package day24_ArrayOfArray;

public class ThreeD_Array {

	public static void main(String[] args) {
		
		int[] num = {1, 2, 3};
		int[] num2 = {4, 5, 6};
		int[] num3 = {7, 8, 9};
		int[] num4 = {10, 11, 12, 13};
		
		int[][] num5 = {num, num2};
		
		int[][] num6 = {num3, num4};
		
		int[][][] num7 = {num5, num6};
	
	
		
		System.out.println(num3[1]); // 8
	
		System.out.println(num6[0][1]); // 8
		
		System.out.println(num7[1][0][1]); // 8
	
		// 13
		
		System.out.println(num4[3]);
		
		System.out.println(num6[1][3]);
		
		System.out.println(num7[1][1][3]); 
		
		System.out.println("--------------------------");
		
		System.out.println(num7.length); // 2
		
		System.out.println(); 
		
		for(int a = 0; a < num7.length; a++) {
			for(int b = 0; b < num7[a].length; b++) {
				for(int c = 0; c < num7[a][b].length; c++) {
					System.out.println(num7[a][b][c]);
				}
			}
		}
		
	}

}
