package day14_HW;

import java.util.Scanner;

public class Task06_InitialAndCapitalize {

	public static void main(String[] args) {
		/*write a program that can return the initials of the user

            ex:
                techcircle
                school

            output:
                T.S

        Note: Pay attention to the example output
        */
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first word");
	String a = sc.nextLine();
	
	System.out.println("Enter second word");
	String b = sc.nextLine();
	
	a = a.toUpperCase();
	b = b.toUpperCase();
	
	String initials = a.substring(0,1) + "." + b.substring(0,1);
	
	System.out.println("\n"+initials);
	
	sc.close();

	}

}





