package day21_arrays;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		
		
		String names[] = {"Emre", "Victoria", "Gulfire", "Larry", "Austin", "Keasinee"};
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
//		forEachLoop
		
//		for(dataType variableName : arrayName) {
//			your ststement
//		}

		
		for(String artit : names) {
			System.out.println(artit);
		}
			
		char[] chars = {'a', 'b', 'c'};
		
		for(char c : chars) {
			System.out.println(c);
		}
		
		
		double prices[] = {1, 2.2, 30.5, 9.99};
		
		for(double price : prices) {
			System.out.println(price);
		}
		
		
		String name = "TechCircle";
		
		for(int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		char[] s = name.toCharArray();
		
		System.out.println(Arrays.toString(s));
		
		for(char a : s) {
			System.out.println(a);
		}
		
		for(char nameChar : name.toCharArray()) {
			System.out.println(nameChar);
		}
		
		
		

		
		
		
		
		
		
	}

}
