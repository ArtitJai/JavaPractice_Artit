package day14_HW;

import java.util.Scanner;

public class Challenge1_TipCalculator {

	public static void main(String[] args) {
		
		/*## challenge1
`Create a class called TipCalculator, write a program for a tip calculator.
There will be different service quality benchmarks that will determine the tip given.
There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number) (each person = & in output) Check amount: (number) Service Quality: (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method
	*/ 
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Split or No split (Yes or No)?");
		
		String split = sc.next();
		
		System.out.println("Number of people entered:");
		
		int numOfPpl = sc.nextInt();
		
		System.out.println("Enter the check amount:");
		
		double checkAmount = sc.nextDouble();
		
		double totalTip = 0, payPerson = 0, tipPerson = 0, totalPay = 0;
		
		System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
		
		String service = sc.next();
		
		if(service.equalsIgnoreCase("poor")) {
			totalTip = checkAmount * 0.05;
		}
		else if(service.equalsIgnoreCase("fair")) {
			totalTip = checkAmount * 0.10;
		}
		else if(service.equalsIgnoreCase("good")) {
			totalTip = checkAmount * 0.15;
		}
		else if(service.equalsIgnoreCase("great")) {
			totalTip = checkAmount * 0.20;
		}
		else if(service.equalsIgnoreCase("excellent")) {
			totalTip = checkAmount * 0.25;
		}
		
		totalPay = checkAmount + totalTip;
		
		if(numOfPpl > 1) {
			if(split.equalsIgnoreCase("yes")) {
				payPerson = totalPay / numOfPpl;
				tipPerson = totalTip / numOfPpl;
			}
		}
		
		System.out.println("\n=========================\n");
		System.out.print("Number of people entered: "+ numOfPpl + "\n");
		System.out.print("Total to pay:  "+ totalPay + "\n");
		System.out.print("Total tip: "+ totalTip + "\n");
		System.out.print("Total per person: "+ payPerson + "\n");
		System.out.print("Tip per person: "+ tipPerson + "\n");
		
		
		
		sc.close();
		
	}

}
