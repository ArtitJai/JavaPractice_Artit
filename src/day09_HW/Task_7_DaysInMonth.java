package day09_HW;

import java.util.Scanner;

public class Task_7_DaysInMonth {

	public static void main(String[] args) {
		
		 /*
		 
		 
		1. write a program that can find the number of days in a month
		 
		Note: MUST USE NESTED IF
		 
		*/


		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter(1-12) Prefer to month");
		
		
		int month = sc.nextInt();
		
		
		if(month == 2) {
			System.out.println("28 or 29 days in a month");
		}
		
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30 doys in a month");
		}
		
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("31 doys in a month");
		}
		
		if(month < 1 && month > 12) {
			System.out.println("Invalid number");
		}
		
		sc.close();
		
//		int month = 1;
//        int days;
//        
//        switch(month) {
//        case 1: 
//            
//        case 3:
//        
//        case 5:
//        
//        case 7:
//        
//        case 8:
//            
//        case 10:
//        
//        case 12:
//            days = 31;
//            System.out.printf("The number of days in this month is %d", days);
//            break;
//        case 4:
//        
//        case 6:
//        
//        case 9:
//        
//        case 11:
//            days = 30;
//            System.out.printf("The number of days in this month is %d", days);
//            break;
//        case 2:
//            days = 28;
//            System.out.printf("The number of days in this month is %d", days);
//            break;
//        
//        default:
//            System.out.println("Invalid Input");
//        }
		
		
			boolean has30Day = (month == 4 || month == 6 || month == 9 || month == 11) ? true : false;
	        boolean has31Day = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) ? true : false;
	        boolean has28Day = (month == 2 ) ? true : false;
	        
	        
	        if (has30Day) {
	            System.out.println("Has 30 days");
	        }
	        
	        
	        if (has31Day) {
	            System.out.println("Has 31 days");
	        }
	        
	        if (has28Day) {
	            System.out.println("Has 28 days");
	        }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
