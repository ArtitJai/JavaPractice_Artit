package day25_method;

import java.util.Arrays;

public class MethodTask {

	public static void count1To100() {
		
		Integer[] nums = new Integer[100];
		
		int index = 0;
		for(int a = 1; a < 101; a++) {
			nums[index] = a;
			index++;
		}
		System.out.println(Arrays.toString(nums));
		
		
		
	}
	
	public static void reverseHello() {
		
		String str = "Hello";
		String reverse = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
//			System.out.println(str.charAt(i));
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
		
	}
	
	public static void main(String[] args) {
		
//		create an array that has the numbers 1 to 100
		
		count1To100();
		count1To100();
		count1To100();
		count1To100();
		reverseHello();
		reverseHello();
		reverseHello();
		

	}

}
