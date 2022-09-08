package day15_4thReview;

import java.util.Scanner;

public class WhileLoopAsk1_100 {

	public static void main(String[] args) {
		
//		ask user to enter number between 1 -100
//		if input not in the range, the program should ask again

		int input;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter number between 1 - 100");
			input = sc.nextInt();
			if(input > 0 && input <= 100) break;
			System.out.println("Number is not in 1-100 range");
		}

		System.out.println(input);
	
	
	
	
	
	sc.close();
	
	
	
	
	}

}
