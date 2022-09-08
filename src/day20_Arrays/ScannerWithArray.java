package day20_Arrays;

import java.util.Scanner;

public class ScannerWithArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter number of array you like");
		
		int arrayNum = sc.nextInt();
		
		int[] num = new int[arrayNum];
		
		num[0] = 8;
		num[1] = 9;
		num[2] = 10;
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		sc.close();
	}

}
