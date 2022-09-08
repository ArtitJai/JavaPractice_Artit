package day29_Arraylist;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		
		ArrayList<Integer>numbers = new ArrayList<>();
		
		numbers.add(1); // autoboxing
		numbers.add(10);
		
		int num = 100;
		
		Integer num2 = num;
		System.out.println(num2); // 100
		
		byte num3 = num2.byteValue();
		double num4 = num2.doubleValue();
		float num5 = num2.floatValue();
		
		numbers.add(num2);
		
		System.out.println(numbers);
		
		String num6 = num2.toString();
		
		System.out.println(num6.charAt(0));
		
		Boolean result = true;
		boolean result2 = result.booleanValue();
		
	}

}
