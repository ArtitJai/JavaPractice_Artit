package day06_HW;

import java.util.Scanner;

public class HW07_ElectionEligible {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Check your eligibility for vote!!!");
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		
		
		String citizenship = "USA";
		boolean IsEligible = (age >= 18 && citizenship == "USA");

		
		if(IsEligible) {
			System.out.println("Congratulation! "+name+" is eligible to vote for Donald Trump or Joe Biden");
		}
		
		else {
			System.out.println("Sorry, "+name+" is eligible to vote for Donald Trump or Joe Biden");
		}
			
		sc.close();
	
		
		
	}

}
