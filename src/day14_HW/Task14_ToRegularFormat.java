package day14_HW;

import java.util.Scanner;

public class Task14_ToRegularFormat {

	public static void main(String[] args) {
		/*
		 * ## Task14
`Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "tecHCIrcle"
                        lastName = "SCHOOL";

                    output:
                        Techcircle School
                        */
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please, enter your firstname");
			String firstName = sc.nextLine();
	        
			System.out.println("Please, enter your lastname");
			String lastName = sc.nextLine();
			
			
	        
			String newFirst = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
		
			String newLast = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);
		
			System.out.println("\n" + newFirst + " " + newLast);
			
			sc.close();
			
	}

}
