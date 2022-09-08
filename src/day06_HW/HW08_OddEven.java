package day06_HW;

import java.util.Scanner;

public class HW08_OddEven {

	public static void main(String[] args) {
	
		int num1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter number");
		num1 = sc.nextInt();
		
		sc.close();
		
		if(num1 % 2 == 0) {
			System.out.println(num1+ " is even number");
		}else {
			System.out.println(num1+ " is odd number");
		}

	}

}
