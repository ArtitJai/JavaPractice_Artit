package day14_HW;

import java.util.Scanner;

public class Task09_CutFirstCharacterOut {

	public static void main(String[] args) {
		
		/*## Task9
`
Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
                    */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter word :");
		String a = sc.nextLine();
		
		System.out.println("Enter word :");
		String b = sc.nextLine();
		
		System.out.print(a.substring(1));
		System.out.print(b.substring(1));
		
		sc.close();

	}

}
