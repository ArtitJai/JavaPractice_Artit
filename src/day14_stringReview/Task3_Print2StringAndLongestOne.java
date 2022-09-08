package day14_stringReview;

import java.util.Scanner;

public class Task3_Print2StringAndLongestOne {

	public static void main(String[] args) {
		
		/*
		 * write a program that asks user to enter two strings, and print out the longest string
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please insert any word you want");
		String a = sc.nextLine();
		
		System.out.println("Please insert any word you want");
		String b = sc.nextLine();
		
		if(a.length() > b.length()) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		
		sc.close();
				

	}

}
