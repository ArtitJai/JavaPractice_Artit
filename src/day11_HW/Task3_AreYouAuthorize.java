package day11_HW;

import java.util.Scanner;

public class Task3_AreYouAuthorize {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type you name:");
		String name = sc.nextLine();
		
		System.out.println("What is your clearance level?");
		int num = sc.nextInt();
		
		switch(num) {
		case 1	:
			System.out.println("Sorry, "+name+" The junior employee don't have access to this program.");
			break;
		case 2	:
			System.out.println("Sorry, "+name+" The senior employee don't have access to this program.");
			break;
		case 3	:
			System.out.println("Sorry, "+name+" The manager employee don't have access to this program.");
			break;	
		case 4	:
			System.out.println(name+", you are admin. Welcome to the program ABC.");
			break;
			default	:
				System.out.println("The number is not in clearance level");
		}
			
		sc.close();
		
//		String name = "", role= "";
//        int level = 0;
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter your full name:");
//        name = scan.nextLine();
//        
//        System.out.println("What is your clearance level ?");
//        level = scan.nextInt();
//        
//        if (level == 1) {
//            role = "junior employee";
//        } else if (level == 2) {
//            role = "senior employee";
//        } else if (level == 3) {
//            role = "manager";
//        } else if (level == 4) {
//            role = "admin";
//        }
//        if (level >= 3) {
//            System.out.println(name + ", you are " + role + ". Welcome to the program ABC");
//        } else {
//            System.out.println("Sorry, " + name + ". The " + role + " don't have access to this program");
//        }
//        scan.close();
	}

}



//## Task - Are You Authorize?
//
//### Description
//
//Let's write program that check the user authorization before using the internal company software.
//The program should ask the full name of the user and clearance level (1-4).
//
//Denote the level of the clearance:
//
//- `1` = junior employee
//- `2` = senior employee
//- `3` = manager
//- `4` = admin
//
//### Instruction
//
//This internal program can _only_ be access by management level employee and admin.
//
//Once user logged in the program should display welcome
//message `<name>, you are <role>. Welcome to the program ABC.`. For user that do not have a clearance
//the program should display `Sorry, <name>. The <role> don't have access to this program.`
//
//Example:
//
//```text
//Please type you name:
//>John Holy
//What is your clearance level?
//>2
//Sorry, John Holy. The senior employee don't have access to this program.
//```
//```text
//
//
//






