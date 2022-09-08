package day14_stringReview;

import java.util.Scanner;

public class Task2_ReverseExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter a word of 5 characters long:");
        
        String word = scan.next();

        
        if(word.length() > 6) {
            System.out.println("Too long!");
        }else if(word.length() < 5) {
            System.out.println("Too short!");
        }
        
        for(int i = word.length() - 1; i > -1; i--) {
             
        
        System.out.print(word.charAt(i));    
        }
        
        scan.close();
        
        String str = "Pizza";
        
        if(str.length()==5) {
        	//reverse your string
//        	System.out.println(str.charAt(4));
//    		System.out.println(str.charAt(3));
//    		System.out.println(str.charAt(2));
//    		System.out.println(str.charAt(1));
//    		System.out.println(str.charAt(0));	
        	
        	
        	for(int i = str.length()-1; i >= 0 ; i--) {
//        		System.out.println(i);
        		System.out.println(str.charAt(i));
        	}
    		
    		System.out.println();
        }else if(str.length() > 5) {
        	System.out.println("Too long!");
        }else {
        	System.out.println("Too short!");
        }
        	
	}

}
/* 
 * Create a class called Reverse, write a program that will reverse a string.
    Your program should reverse a string only 5 characters long.
    If word is shorter, display message: "Too short!".
    If word is longer, display message: "Too long!".
    Otherwise, reverse this word and print out result into the console.
    
    *
    */
