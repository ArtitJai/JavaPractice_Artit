package day22_ArrayOfArray;

import java.util.Arrays;

public class StringSplitMethod {

	public static void main(String[] args) {
		
		String email = "techcircle@techcircleSolutions.org";
		
		System.out.println(email.split("@")[0]);
		System.out.println(email.split("@")[1]);
		
		System.out.println(Arrays.toString(email.split("@")));
		
		String[] portionOfTheEmail = email.split("@");
		
		System.out.println(portionOfTheEmail.length); // 2
		System.out.println(portionOfTheEmail[0]);
		System.out.println(portionOfTheEmail[1]);
		
		String str = "The quick brown fox jumps over the lazy dog.";
		
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		System.out.println(email.split("c"));
		

	}

}
