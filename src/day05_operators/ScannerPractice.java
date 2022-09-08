package day05_operators;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		
		Scanner artit = new Scanner(System.in);
		
		System.out.println("Please type value a");
		//int a = 1;
		int a = artit.nextInt();
		
		
		System.out.println("Please type value b");
		//int b = 2;
		int b = artit.nextInt();
		
		
		System.out.println("Please type value c");
		//int c =3;
		int c = artit.nextInt();
		
		System.out.println(a+b > c);
		
		
		artit.close();
		
	}
}
