package day26_method_returnValue;

public class MethodOverloading_02 {

	// Having more than one method with same name, different parameter in the same class
	
	public static double addition(int a, int b) {
		
		return a + b;
	}
	
	public static double addition(double a, int b) {
		
		return a + b;
		
	}
	public static double addition(int a, double b) {
		
		return a + b;
		
	}
	public static double addition(short a, short b) {
		
		return a + b;
		
	}
	
	public static double addition(byte a, byte b) {
		
		return a + b;
		
	}
	public static double addition(int a, int b, int c) {
		
		return a + b + c;
	}
	public static double addition(int[] arr) {
		
		double sum = 0;
		
		for(int a : arr) {
			sum += a;
		}
		return sum;
	}
	
	public static double subtraction(int a, int b) {
		
		return a - b;
	}
	
	public static double subtraction(double a, int b) {
		
		return a - b;
		
	}
	public static double subtraction(int a, double b) {
		
		return a - b;
		
	}
	public static double subtraction(short a, short b) {
		
		return a - b;
		
	}
	
	public static double subtraction(byte a, byte b) {
		
		return a - b;
		
	}
	public static double subtraction(int a, int b, int c) {
		
		return a - b - c;
	}
	public static double subtraction(int[] arr) {
		
		double sum = 0;
		
		for(int a : arr) {
			sum -= a;
		}
		return sum;
	}
	
	
	
	}
