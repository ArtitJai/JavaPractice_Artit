package day11_HW;

import java.util.Scanner;

public class Task1_WarmUp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please,input number from 0 - 99");
		int num = sc.nextInt();
		String word = " ";
			
	
			if (num >= 20 && num <= 29) {			 	
			  	word = "twenty ";  
			}else if(num >= 30 && num <= 39) {
	    	 	word = "thirty ";
	    	}else if(num >= 40 && num <= 49) {
	    	 	word = "fourty ";	    	 
	    	}else if(num >= 50 && num <= 59) {
	    	 	word = "fifty ";	 	    	 
	    	}else if(num >= 60 && num <= 69) {
	    	 	word = "sixty ";	    	  	 
	    	}else if(num >= 70 && num <= 79) {
	    	 	word = "seventy ";	    	 			    	 
	    	}else if(num >= 80 && num <= 89) {
	    		word = "eighty ";	    	 
	    	}else if(num >= 90 && num <= 99) {
	    	 	word = "ninety ";
	    	}
	    	 
	    	
			if(num == 0) {
	    		 word += "zero";
	    		 
			}else if(num % 10 == 1) {
	    		 word += "one";
	    		 
	    	 }else if(num % 10 == 2) {
	    		 word += "two";
	    		 
	    	 }else if(num % 10 == 3) {
	    		 word += "three";
	    		 
	    	 }else if(num % 10 == 4) {
	    		 word += "four";
	    		 
	    	 }else if(num % 10 == 5) {
	    		 word += "five";
	    		 
	    	 }else if(num % 10 == 6) {
	    		 word += "six";
	    		 
	    	 }else if(num % 10 == 7) {
	    		 word += "seven";
	    		 
	    	 }else if(num % 10 == 8) {
	    		 word += "eight";
	    		 
	    	 }else if(num % 10 == 9) {
	    		 word += "nine";
	    	 }
	    	 
	    	 
	    	 if(num == 10) {
	    		 word = "ten";
	    	 }else if(num == 11) {
		    	word = "eleven";
	    	 }else if(num == 12) {
	    		 word = "twelve";
	    	 }else if(num == 13) {
	    		 word = "thirteen";
	    	 }else if(num == 14) {
	    		 word = "fourteen";
	    	 }else if(num == 15) {
	    		 word = "fifteen";
	    	 }else if(num == 16) {
	    		 word = "sixteen";
	    	 }else if(num == 17) {
	    		 word = "seventeen";
	    	 }else if(num == 18) {
	    		 word = "eighteen";
	    	 }else if(num == 19) {
	    		 word = "nineteen";
	    	 }
	
	
	    	 System.out.println(num+" "+word);
	    	 System.out.println();
	    	 System.out.println("=======================");
	    	 System.out.println();

	    	 while(num >= 0) {
	 			System.out.print(num+" ");
	 			num--;
	 		}
	
	
	    	 sc.close();
	
	
	
	
	}

}

//## Task - warm up
//- Write program to enter the number and print it in words. (n < 100)
//Example:
//```text
//23
//twenty three
//
//7
//seven
//```
//- Write program to print all number in reverse in one line (from `n` to 1) - using while loop
//
//
