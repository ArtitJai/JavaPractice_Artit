package day10_HW;

import java.util.Scanner;

public class Task3_NumberToWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("please put number in your mind 0-9");
		
		int num = sc.nextInt();
		sc.close();
		
		switch(num) {
		case 0	:
			System.out.println("zero");
			break;
		case 1	:
			System.out.println("one");
			break;
		case 2	:
			System.out.println("two");
			break;
		case 3	:
			System.out.println("three");
			break;
		case 4	:
			System.out.println("four");
			break;
		case 5	:
			System.out.println("five");
			break;
		case 6	:
			System.out.println("six");
			break;
		case 7	:
			System.out.println("seven");
			break;
		case 8	:
			System.out.println("eight");
			break;
		case 9	:
			System.out.println("nine");
			break;
			default	:
				System.out.println("not in range");
			
				
		}
	}

}

//## Task3
//
//`Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
//			Ex:
//				number = 1;
//			output:
//				One


