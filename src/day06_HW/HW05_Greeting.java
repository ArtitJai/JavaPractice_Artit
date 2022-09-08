package day06_HW;

import java.util.Scanner;

public class HW05_Greeting {

	public static void main(String[] args) {
		
		
		System.out.printf("What time is it?");
		
		
		Scanner greet = new Scanner(System.in);
		double hours = greet.nextDouble();
		
		System.out.format("%.2f", hours);
		System.out.println();
		
		String greeting1 = "Good Morning";
		String greeting2 = "Good Afternoon";
		String greeting3 = "Good Evening";
		
		if(hours >=1 && hours<=24) {
		}	
		
		if(hours >= 1 && hours <= 4.59) {
			System.out.println("Sweet Dream");	
		}
		
		else if(hours >= 5 && hours <= 11.59) {
			System.out.println(greeting1);
		}
		
		else if(hours >= 12 && hours <= 16.59) {
			System.out.println(greeting2);
		}
		
		else if(hours >= 17 && hours <= 24) {
			System.out.println(greeting3);
		}
		
		else{
			System.out.println("Enter a time in a 24 hour.");
	}
		
		greet.close();

	}

}
