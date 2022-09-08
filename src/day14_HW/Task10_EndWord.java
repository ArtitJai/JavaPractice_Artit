package day14_HW;

import java.util.Scanner;

public class Task10_EndWord {

	public static void main(String[] args) {

/*
 * ## Task10
`
ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter word :");
		String a = sc.nextLine();
		
		if(a.endsWith("ly")) {
			System.out.println("\nreally???");
		}
		else {
			System.out.println("\nnever mind");
		}
		
		sc.close();
		
	}

}
