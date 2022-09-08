package day14_HW;

import java.util.Scanner;

public class Task01_ForLoop {

	public static void main(String[] args) {
		
		/*# ForLoop
## Task1
`
Write a program that asks user to enter number for 5 times,
 and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
					*/
		
		int num, countP=0, countN=0, countZ=0;
	      Scanner sc = new Scanner(System.in);
	      
	      
	      for(int i=0; i < 5; i++) {
	    	System.out.print("Enter Numbers: ");
	         num = sc.nextInt();
	         
	         if(num<0) {
	            countN++;
	         }else if(num>0) {
	            countP++;
	         }else
	            countZ++;{
	      }
	     }
	      
	      
	      System.out.println("\nTotal Positive Number: " +countP);
	      System.out.println("Total Negative Number: " +countN);
	      System.out.println("Total Zero: " +countZ);
	      
	      sc.close();
	      
	}

}








