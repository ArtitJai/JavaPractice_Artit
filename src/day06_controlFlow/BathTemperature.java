package day06_controlFlow;

import java.util.Scanner;

public class BathTemperature {

	public static void main(String[] args) {
		
	// Create instance of Scanner object
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter your bath temperature:");
		
	//int bathTemperature = 110;
	
	int bathTemperature = scan.nextInt();
	
		if (bathTemperature < 90)	{
			System.out.println("Brrr!");
		} 
		
		else if (bathTemperature >= 90 && bathTemperature<95)  {
			System.out.println("That,s lukewarm");
		} 
		
		else if (bathTemperature >= 95 && bathTemperature<105) {
			System.out.println("perfect!");
		}
		
		else if (bathTemperature >= 105 && bathTemperature<110) {
			System.out.println("This isn't a hot tub");
			
		}
		else if (bathTemperature>=110) {
			System.out.println("Are you trying to boil a lobster?");
			
		}
		
		scan.close();
	}

}
