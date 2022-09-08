package day15_4thReview;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		while(true) { // you can use while(input.equals("exit"))
			// Scanner take input from user
			String input = sc.next();
			if(input.equals("exit")) break;
			
			System.out.println(input);
			System.out.println("========");
		}

	
	
	
	
	
	
	sc.close();
	
	}

}
