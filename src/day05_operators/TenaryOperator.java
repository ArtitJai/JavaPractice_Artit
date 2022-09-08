package day05_operators;

public class TenaryOperator {

	public static void main(String[] args) {
	
		// syntax:
		// variable = (condition) ? trueBlock : falseBlock;
		
		int a, b;
		a = 10;
		
		b = (a == 1) ? 5: 60;
		
		System.out.println(b); // 60
		
		b = (a / 10 == 1) ? 10 : 20;
		System.out.println(b); // 10
		
		System.out.println("value of b is ");
		
		
		System.out.println("value of b is "+b);
		
		
		String result = (b % 2 == 0) ? "even number" : "odd number";
		
		System.out.println(result);
		
		b = 11;
		
		result = (b % 2 == 0) ? "even number" : "odd number";
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
