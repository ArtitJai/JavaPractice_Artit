package day26_HW;

public class Task11_SumOf {

	
//	11. Task1:
//	    1. create a method that can find the sum of two numbers
//	                    method name: sumOf2Numbers
//
//	    2. create a method that can find the sum of three numbers
//	                    method name: sumOf3Numbers
//
//	    3. create a method that can find the sum of four numbers
//	                    method name: sumOf4Numbers
	
	protected static double sumOf2Numbers(double a, double b) {
		
		return a + b;
		
	}
	protected static double sumOf3Numbers(double a, double b, double c) {
		
		return a + b + c;
	}
	protected static double sumOf4Numbers(double a, double b, double c, double d) {
		
		return a + b + c + d;
	} 
	public static void main(String[] args) {
		
		double result = sumOf2Numbers(5.90, 7.08);
		System.out.println(result + "\n");
		
		double result1 = sumOf3Numbers(5.90, 7.08, 600.798);
		System.out.println(result1 + "\n");
		
		double result2 = sumOf4Numbers(5.90, 7.08, 600.798, 70.222);
		System.out.println(result2 + "\n");
	}
}
