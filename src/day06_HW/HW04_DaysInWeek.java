package day06_HW;

import java.util.Scanner;

public class HW04_DaysInWeek {

	public static void main(String[] args) {
		
		
		Scanner d = new Scanner(System.in);
		
		System.out.println("Please input 1-7 for a day in the week");
		int day = d.nextInt();
		
		
		if(day >= 1 && day <= 7) {
		}	
		else {
			System.out.println("Invalid Input");
		}
		
		if(day == 1) {
			System.out.println("Monday");
		}
		
		if(day == 2) {
			System.out.println("Tuesday");
		}
		
		if(day == 3) {
			System.out.println("Wednesday");
		}
		
		if(day == 4) {
			System.out.println("Thursday");
		}
		
		if(day == 5) {
			System.out.println("Friday");
		}
		
		if(day == 6) {
			System.out.println("Saturday");
		}
		
		if(day == 7) {
			System.out.println("Sunday");
		}
			
		d.close();

	}

}
