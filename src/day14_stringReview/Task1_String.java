package day14_stringReview;

import java.util.Scanner;

public class Task1_String {
public static void main(String[] args) {
//		
//	## Task1
//	`write a program that asks user to enter a sentence.
//	                then print the first & last characters of the sentence
//	Example:
//	    Input: Welcome To TechCircle
//	    output: We
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your sentence");
	
	String a = sc.nextLine();
	
		
	System.out.println(a.charAt(0));
	
	System.out.println(a.charAt(a.length()-1));

	// ===================================================

	String input = "Welcome To TechCircle!";
	
	char firstChar = input.charAt(0);
//  char lastChar = input.charAt(21)
  
  System.out.println(input.length());
  
  char lastChar = input.charAt(input.length()-1);
  
  System.out.print(firstChar);
  System.out.print(lastChar);
  System.out.println();
  
  String result = ""+firstChar;
  System.out.println(result);
  result += lastChar;
  System.out.println(result);
  
  sc.close();
}
}
