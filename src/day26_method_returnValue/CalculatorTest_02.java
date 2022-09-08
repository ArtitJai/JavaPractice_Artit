package day26_method_returnValue;

public class CalculatorTest_02 {

	public static void main(String[] args) {
		
		double result = MethodOverloading_02.addition(5,5);
		
		System.out.println(result);
		
		System.out.println(MethodOverloading_02.addition(5.5,5));
	
		double result2 = MethodOverloading_02.addition(5, 5, 5);
		System.out.println(result2);
		
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		result2 = MethodOverloading_02.addition(num);
		
		System.out.println(result2);
		
		System.out.println(MethodOverloading_02.subtraction(5,3,1));
				
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		result = MethodOverloading_02.subtraction(num);
		
		System.out.println(result);
	
	
	}	
}
