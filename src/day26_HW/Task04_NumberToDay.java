package day26_HW;

import java.util.Scanner;

public class Task04_NumberToDay {
	
//		4. Create a method that can print the name of the day based on the given number to the method

	private static void dayOf(int day) {
		
		switch (day){
	    case 1:
	        System.out.println ("The name of day number 1 is Sunday");
	        break;
	    case 2:
	        System.out.println ("The name of day number 2 is Monday");
	        break;
	    case 3:
	        System.out.println ("The name of day number 3 is Tuesday");
	        break;
	    case 4:
	        System.out.println ("The name of day number 4 is Wednesday");
	        break;
	    case 5:
	        System.out.println ("The name of day number 5 is Thursday");
	        break;
	    case 6:
	        System.out.println ("The name of day number 6 is Friday");
	        break;
	    case 7:
	        System.out.println ("The name of day number 7 is Saturday");
	        break;
	    default:
            System.out.println ("You have entered an invalid number");
       
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number equal to or between 1-7 to display the day");
		
		int day = sc.nextInt();
		
		dayOf(day);
		
		sc.close();
	}

	}


