package day07_HW;

import java.util.Scanner;

public class Solution_D {

	public static void main(String[] args) {
		
		/*
		## Task D - Speeding Ticket

		Write a program that calculates the fine for a speeding ticket. Prompt the user for several items of
		information. These data items will be used to determine the fine.

		**Here is what your program must do:**

		Prompt for: driver lastName, firstName, age, speedLimit, actual speed, and whether you are in a
		construction zone.

		Calculate the components of the fine and the total fine (see rules below).

		**Rules to calculate fine:**

		1. if driver is less than 5mph over limit, no fine is assessed, but you finish all prompts,
		   calculations and generate the report.
		2. else if driver is over limit by 20mph or less, charge $30 per every 5mph over limit.
		3. else if driver is more than 20mph over limit charge $50 per every 5 mph over limit.
		4. Don't mix rates! - driver is either charged $30 per 5mph over or $50 per 5mph over.
		5. if the violation occurred in a construction zone, you are to **DOUBLE** the fine.

		[comment]: <> (Lastly -- AFTER ALL OTHER CALCULATIONS ARE DONE: if driver is under 21 AND more than 20mph over)

		[comment]: <> (limit then you must add an additional straight $300 underage speeder fine. ** You are NOT to double)

		[comment]: <> (this)

		### Constraints

		- Only enter positive numbers for driver's age, speed limit and actual speed.
		- Don't enter ridiculously huge numbers. Your variables could overflow and formatting may not fit.

		**Example:**

		```text
		What is driver's firstname?
		> Greg
		What is driver's lastname?
		> Naman
		What is driver's age?
		> 30
		What is the speed limit (mph)?
		> 25
		What is driver's speed (mph)?
		> 45
		Is it a construction zone (Y/N)?
		> Y

		=========REPORT=========

		Driver name: 
		    Greg Naman
		Age:        
		    30 years old
		Speed limit:    25 mph
		Current speed:  45 mph
		Construction zone (Y/N)?: Y
		Speeding fine:  $120.00

		==========END===========
		*/
		
		
		
		
		String firstname, lastname, zone;
		int age, speedLimit=0, actualSpeed=0, over, base=0, zoneFine=0, underAge=0, fine=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is driver's firstname?: \n");
		firstname = sc.next();
		
		System.out.println();
		
		System.out.println("What is driver's lastname?: \n");
		lastname = sc.next();
		
		System.out.println();
		
		System.out.println("What is driver's age?: \n");
		age = sc.nextInt();
		
		System.out.println();
		
		System.out.println("What is the speed limit (mph)?: \n");
		speedLimit = sc.nextInt();
		
		System.out.println();
		
		System.out.println("What is driver's speed (mph)?: \n");
		actualSpeed = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Is this a construction zone (Y/N)?: \n");
		zone = sc.next();
		
		
		System.out.println();
		System.out.println("========REPORT========");
		
//		=================speed===========================
		
		if (actualSpeed > speedLimit) {    // no this 2 line mean charge from mile 0
			over = actualSpeed-speedLimit; // no this 2 line mean charge from mile 0
		}
		else {
			over=0;
		}
		
		
		if(over<=5) {
			base=0;
		}
		
		else if (over<=20) {
		 	base=over*6; // base=(over/5)*30;
		}
		
		else if (over>20) {
		 	base=over*10; // base=(over/5)*50;
		}
		
//	===================zone==========================
		
		if(over<=5) {
			zoneFine=0;
		}
		
		else if (zone.equals("Y")||zone.equals("YES")||zone.equals("Yes")||zone.equals("yes")||zone.equals("y")) {
			zoneFine=base*2;
		}
		
		else if (zone.equals("N")||zone.equals("NO")||zone.equals("No")||zone.equals("no")||zone.equals("n")) {
			zoneFine=0;
		}
	
		
//	==================Under-Age========================	
		
		if(age<21 && over>=20) {
			underAge=500;
		}
		else {
			underAge=0;
		}
		
	
		
//	======================Final-Charge======================
		
		fine=zoneFine+underAge+base;
		
		
		System.out.println();
		
		System.out.println("Driver name:");
		
		System.out.println(firstname+" "+lastname);
		
		System.out.println("Age:");
		
		System.out.println(age+" years old");
		
		System.out.println("Speed limit: "+speedLimit+" mph");
		
		System.out.println("Current speed: "+actualSpeed+" mph");
		
		System.out.println("MPH over limit: "+over);
		
		System.out.println("Base fine: $"+base);
		
		System.out.println("Under Age Fine: $"+underAge);
		
		System.out.println("Construction zone (Y/N)?: "+zone);
		
		System.out.println("Construction zone Fine: $"+zoneFine);
		
		System.out.println("Total Fine: $"+fine);
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("========END REPORT========");
		
		sc.close();
		
		
//		Scanner sc = new Scanner(System.in);
//
//	      System.out.println("What is driver's first name?");
//	      String fn = sc.next();
//
//	      System.out.println("What is driver's last name?");
//	      String ln = sc.next();
//
//	      System.out.println("What is driver's age?");
//	      int age = sc.nextInt();
//
//	      System.out.println("What is the speed limit (mph)?");
//	      int speedLimit = sc.nextInt();
//
//	      System.out.println("What is driver's speed (mph)?");
//	      int actualSpeed = sc.nextInt();
//
//	      System.out.println("Is this a construction zone (Y/N)?");
//	      char isConstructionZone = sc.next().charAt(0);
//
//	      double fine = 0;
//	      int overSpeedLimit = actualSpeed - speedLimit;
//
//	      if (overSpeedLimit > 5 && overSpeedLimit <= 20) {
//	         fine = (overSpeedLimit/5)*30; // every 5mph over, charge 30 each
//	      } else if (overSpeedLimit > 20) { // overSpeedLimit greater 20 mph
//	         fine = (overSpeedLimit/5)*50; // every 5mph over, charge 50 each
//	      } // 250
//
//	      if (isConstructionZone == 'Y') fine = fine * 2; // fine =* 2;
//	      if (age < 21 && overSpeedLimit > 20) fine = fine + 300;
//
//	      System.out.println("========================");
//	      System.out.printf("Driver name:\n\t%s %s",fn,ln);
//	      System.out.println();
//	      System.out.printf("Speed limit:\t%d mph",speedLimit);
//	      System.out.println();
//	      System.out.printf("Current speed:\t%d mph",actualSpeed);
//	      System.out.println();
//	      System.out.printf("Construction Zone (Y/N)?: %c",isConstructionZone);
//	      System.out.println();
//	      System.out.printf("Speeding fine: $%.2f",fine);
//	      System.out.println();
//	      System.out.println("========================");
//		
//		
//		
		

	}

}
