package day15_4thReview;

public class StringLengthAndCharacter {

	public static void main(String[] args) {
		
//		find Length and Character
//		.length() => int, number of character of the string
		
		String something = "something wrong";
		
		int lengthOfSthg = something.length(); // => 15
		System.out.println(lengthOfSthg);
		
//		,charAt(int) => char
//		return character of given index (start from 0)
//		**parameter index always start from 0
		
		String str = "techcircle school";
		char letter = str.charAt(13);
		System.out.println(letter);
		str.length(); // => 15
		
		char firstLetter = str.charAt(0);
		char lastLetter = str.charAt(str.length() - 1);

	}

}
