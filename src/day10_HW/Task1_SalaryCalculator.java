package day10_HW;

public class Task1_SalaryCalculator {

	public static void main(String[] args) {
		
		int a = 50, b = 45; 	// hourlyRate, weeklyHours
		int c = a * b * 52;		// salaryBeforeTax
		double i = c * 0.06; 	// stateTaxRate
		double u = c * 0.26; 	// federalTaxRate
		double x = i + u;		// totalTax
		double y = c - x;		// netIncome
		
		System.out.println("Gross pay is: $" + c);
		
		System.out.println("Federal tax is: $" + u);
		
		System.out.println("State tax is: $" + i);
		
		System.out.println("Total tax is: $" + x);
		
		System.out.println("Net income is: $" + y);
		
		
	}

}


//## Task1
//`Create a class called SalaryCalculator.java
//			1 declare the following variables:
//					hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
//			2 use the given info in above variables to calculate the followings:
//					1. salaryBeforeTax
//					2. stateTax
//					3. federalTax
//					4. totalTax
//					5. salaryAfterTax
//					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52
//			3 use print statement to print each of the above
//				Ex:
//					   hourlyRate = $50
//					   weeklyHours = 45
//					   stateTaxRate = 6 (given as percentage, you need to convert to decimal)
//					   federalTaxRate = 26 (given as percentage, you need to convert to decimal)
//				    output:
//				    	Gross pay is: $117000
//				    	Federal tax is: $30420
//			    		State tax is: $7020
//			    		Total tax is: $37440
//			    		Net income is: 79560



