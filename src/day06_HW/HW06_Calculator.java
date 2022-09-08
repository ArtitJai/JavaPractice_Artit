package day06_HW;

import java.util.Scanner;

public class HW06_Calculator {

	public static void main(String[] args) {
		
		
Scanner sc = new Scanner(System.in);

	System.out.println("Please, enter Num1");
	double num1 =  sc.nextDouble();
	
	System.out.println("Please, enter operator '+, -, *, /'");
	//char operator = sc.next().charAt(0);
	String operator = sc.next();
	System.out.println("Please, enter Num2");
	double num2 = sc.nextDouble();
	
	
	switch(operator) {
	case "+":
		System.out.printf("%f + %f = %f", num1, num2, (num1 + num2));
		break;
	
	case "-":
		System.out.printf("%f - %f = %f", num1, num2, (num1 - num2));
		break;
	
	case "*":
		System.out.printf("%f * %f = %f", num1, num2, (num1 * num2));
		break;
	
	case "/":
		System.out.printf("%f / %f = %f", num1, num2, (num1 / num2));
		break;
	default:
		System.out.println("Please use only  - + * or /");
	
		sc.close();
	}

	}

}
