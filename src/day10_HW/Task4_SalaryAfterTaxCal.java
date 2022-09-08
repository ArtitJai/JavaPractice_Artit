package day10_HW;

import java.util.Scanner;

public class Task4_SalaryAfterTaxCal {

	public static void main(String[] args) {
		
		String married;
		
		int sal=0, tax=0, salAfterTax;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, input your salary:");
		
		sal = sc.nextInt();
		
		System.out.println("Are you married? yes or no");
		
		married = sc.next();
		System.out.println();
		
		sc.close();
		
		if(sal >= 130_000) {
			tax = 35;
			salAfterTax = sal - (sal * tax / 100);
		}
		else if(sal >= 100_000 && sal < 130_000) {
			tax = 30;
			salAfterTax = sal - (sal * tax / 100);
		}
		else if(sal >= 80_000 && sal < 100_000) {
			tax = 25;
			salAfterTax = sal - (sal * tax / 100);
		}
		else {
			tax = 20;
			salAfterTax = sal - (sal * tax / 100);
		}
		
		if(married.equals("Y") || married.equals("y") || married.equals("YES") || married.equals("Yes") || married.equals("yes")) {
			tax -= 5;
			salAfterTax = sal - (sal * tax / 100);
		}
		
		System.out.println("Your salary afetr tax : $"+salAfterTax);
		
		
	
	}

}

//## Task4
//
//`Write a program that can calculate the salary after tax based on the following requirements
//                the tax rates are:
//                        35% for salary of 130K or more
//      			30% for salary of 100K to 130k (excluded)
//      			25% for salary of 80K to 100K (excluded)
//      			20% for salary less than 80K
//                in addition, if the person is married, he/she will pay 5% less tax
//                
