package day29_Arraylist;

import java.util.Arrays;

public class ExtractLetterAndDigit {

	public static void main(String[] args) {
		
		String str = "1a@#bcd2$$34e%&fg^*567";
		
		char[] chars = str.toCharArray();
		
		String digits = "";
		
		String letters = "";
		
		String specialCharacter = "";
		
		for(char a : chars) {
		//	System.out.println(a);
			if(Character.isDigit(a)) {
				digits += a;
			}
			if(Character.isLetter(a)) {
				letters += a;
			}
			if(!Character.isDigit(a) && !Character.isLetter(a)) {
				specialCharacter += a;
			}
		}
		
		System.out.println(digits);
		System.out.println(letters);
		System.out.println(specialCharacter);
		
		System.out.println(Arrays.toString(digits.toCharArray()));
		System.out.println(Arrays.toString(letters.toCharArray()));
		System.out.println(Arrays.toString(specialCharacter.toCharArray()));
	}
	
}
