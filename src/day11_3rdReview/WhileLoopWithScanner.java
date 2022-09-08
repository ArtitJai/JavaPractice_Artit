package day11_3rdReview;

import java.util.Scanner;

public class WhileLoopWithScanner {

	public static void main(String[] args) {
		
	//		Scanner sc = new Scanner(System.in);
	//	int sum = 0;
	//
	//	do {
	//	int elem = sc.nextInt();
	//	sum+= elem;
	//	}
	//	while (sc.nextInt()); 
	//	
	
//		- Write program that count number of digits in number
//		  Example:
//		345234
//		345234 has 6 digits
	
//		you can reduce digit by divide the number by 10
		
		
		int count = 0;
		int number = 5678745; 
		int startNumber = number;
		while (number != 0) {
			number = number / 10; 
			count++;
			System.out.printf("%s has %s digit \n",startNumber,count);
		}
			
		
	
/*	
		-Write program to print all alphabets with their ASCII values. (lower/Upper)
		
		a 97
		b 98
		c 99
		
		..
		z ...
*/	
	
	
		char a = 'a';
		while(a <= 'z') {
			int asciiValue =a;
			System.out.println(a+" "+asciiValue);
			a++;
			asciiValue++;
		}
	
	

		char A = 'A';
		while(A <= 'Z') {
			int asciiValueUpper =A;
			System.out.println(A+" "+asciiValueUpper);
			A++;
		}
	
	
//	cannot use == to compare on String *****
	
	
	
	
	
	
	
	
	
	
	}

}
