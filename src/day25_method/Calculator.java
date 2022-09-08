package day25_method;

public class Calculator {
	
	
	public static void addition(int a, int b){
//		int a = 10;
//		int b = 20;
		System.out.println(a+b);
	}
	public static void minus(int a, int b) {
		System.out.println(a-b);
		
	}
	public static void multiply(int a, int b) {
		System.out.println(a*b);
		
	}
	public static void divide(int a, int b) {
		System.out.println(a/b);
		
	}
	public static void calculatorApp(int a, int b, String operator) {
		switch(operator) {
		case "+" : 
			addition(a,b);
			break;
		
		case "-" : 
			minus(a,b);
			break;
		
		case "*" : 
			multiply(a,b);
			break;
		
		case "/" : 
			divide(a,b);
			break;
		}
		}
	
	public static void main(String[] args) {
		// create 3 methods for rest of the operators. *, -, /
//		addition(1,2); // 3
//		addition(5,22); // 27
//		addition(90,-32); // 58
//		
//		minus(5,3); // 2
//		
//		multiply(3,2); // 6
//		
//		divide(8,4); // 2
		
		calculatorApp(2,3,"*");
		calculatorApp(9,3,"/");
		
	}

}
