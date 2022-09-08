package day08_control_flow;

import java.util.Scanner;

public class CalculatorWithScanner {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
		
	System.out.println("Enter Number A");	
		double numA = sc.nextDouble();
		
	System.out.println("Enter Number B");
		double numB = sc.nextDouble();
		
	System.out.println("Type one of the following operator");
	System.out.println("+, -, *, /");
		String operator = sc.next();
		
		double total = 0;
		
		if(operator.equals("+"))	
		{
			total = numA + numB;
		}

		if(operator.equals("-"))	
		{
			total = numA - numB;
		}

		if(operator.equals("*"))	
		{
			total = numA * numB;
		}

		if(operator.equals("/"))	
		{
			total = numA / numB;
		}
		

		System.out.println(numA+ " " +operator+ " " +numB+ " = " +total);
		
		sc.close();
		
	}

}
