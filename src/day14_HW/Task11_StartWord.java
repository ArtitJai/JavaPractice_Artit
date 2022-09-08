package day14_HW;

import java.util.Scanner;

public class Task11_StartWord {

	public static void main(String[] args) {
		
		
		/*
		 * ## Task11
`
Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
                        */
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please, enter word");
			String a = sc.nextLine();
			
			if(a.startsWith("x")) {
				System.out.println("\n"+a.substring(1));
			}
			else {
				System.out.println("\n"+a);
			}
			
			sc.close();
	}

}
