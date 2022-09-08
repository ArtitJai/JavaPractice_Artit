package day14_HW;

import java.util.Scanner;

public class Challenge2_Travel {

	public static void main(String[] args) {
		
		/*## challenge2
`Create a class called Travel. Make a cost variable to calculate how much the person will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for the $numberOfBags bags but you are traveling with $peopleYouTravelWith so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not to worry we will get it ready for you to travel to $allCountries. Your total cost has come out to $costAmount."
        			*/ 

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Do you have a valid passport? (yes or no)");
		
		String validPassport = sc.nextLine();
		if(validPassport.equalsIgnoreCase("Yes")) {
			System.out.println("What country are you traveling to?");
			String country = sc.nextLine();
			
			System.out.println("How many bag are you bring with you?");
			byte bag = sc.nextByte();
			
			System.out.println("How many people traveling with you?");
			short travelWith = sc.nextShort();
			
			System.out.println("Enter the name of people you will traveling with in oneline\n"+"**Separating by comma**");
			String name = sc.next();
			
			double baseCost = 1000, bagCost = bag * 50, beforeDiscount = ((1 + travelWith) * 1000.00) + bagCost;
			double totalCost = 0, discount = 0;
			
			if(travelWith == 0) {
				totalCost = beforeDiscount;
			}
			else if(travelWith >= 1 && travelWith < 3) {
				discount = ((1 + travelWith) * 100.00);
				totalCost = beforeDiscount - discount;
			}
			else if (travelWith >= 3) {
				discount = 300;
				totalCost = beforeDiscount - discount;
			}
				System.out.println();
				System.out.println("your ticket is booked to " + country);
				System.out.println("We have charge extra $" + bagCost + "for" + bag + " bag(s)");
				System.out.println("Because you are traveling with " + travelWith + "traveler(s)");
				System.out.println("We are giving a discount of $" + discount);
				System.out.println("your total cost is $" + totalCost);	
			}
			else if(validPassport.equalsIgnoreCase("no")) {
				double renewCost = 0;
				int expireYear = 0;
				
				System.out.println("How many year(s) your passport been expired?");
				expireYear = sc.nextInt();
				System.out.println("Which country are you planning to travel to?");
				String countryName = sc.next();
				System.out.println("Will you have plan to traveling on next year? (yes or no)");
				String nextYearTravel = sc.next();
			
				if(nextYearTravel.equalsIgnoreCase("yes")) {
					renewCost = 200 + (expireYear * 75) + 100;
				}
				else {
					renewCost = 200 + (expireYear * 75) - 50;
				}
				System.out.println();
				System.out.println("Looks like your passport has been expired for " + expireYear + " year(s)");
				System.out.println("But do not worry we will get it ready for you to travel");
				System.out.println("Your total cost has came out to $" + renewCost);
			}
		
		
		sc.close();
		
		
		
		
	}

}
