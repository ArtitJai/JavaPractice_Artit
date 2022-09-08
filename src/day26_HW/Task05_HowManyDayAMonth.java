package day26_HW;

import java.util.Scanner;

public class Task05_HowManyDayAMonth {

//		5. Create a method that can print how many days a month has
	
	private static void monthOf(int month) {
		
		if(month == 2) {
			System.out.println("28 or 29 days in a month");
		}
		
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30 days in a month");
		}
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("31 days in a month");
		}
		
		if(month < 1 && month > 12) {
			System.out.println("Invalid number");
		}
		
	}
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter any number equal to or between 1-12 to display days in the month");
			
			int month = sc.nextInt();
			
			monthOf(month);
			
			sc.close();
	}
}
