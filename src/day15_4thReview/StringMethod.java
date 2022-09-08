package day15_4thReview;

public class StringMethod {

	public static void main(String[] args) {
		
//		String sequence of character
//		"...Some String..."
		
		String name = "Hello";
//		String is reference type
		String secondName = new String("World");
		
//		String can be empty
		String thisIsEmpty = "";
		
//		String can store only one Character
		String s = "s";
		char S = 's';// this is not the same as above
		
//		String can be null
		String thisIsNull = null;
		
		System.out.println(thisIsNull); // => null
		System.out.println(thisIsEmpty); // will not print
		
//		System.out.println(thisIsNull.toLowerCase()); => NPE
		

	}

}
