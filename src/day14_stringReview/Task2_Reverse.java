package day14_stringReview;

public class Task2_Reverse {

	public static void main(String[] args) {
		
		/*
		 * Create a class called Reverse, write a program that will reverse a string.
    Your program should reverse a string only 5 characters long.
    If word is shorter, display message: "Too short!".
    If word is longer, display message: "Too long!".
    Otherwise, reverse this word and print out result into the console.
    */
		
		String a = "art";
		
		
		if(a.length() > 5) {
			System.out.println("Too long");
		}
		else if(a.length() < 5) {
			System.out.println("Too short");
		}
		else {
		System.out.println(a.charAt(4));
		System.out.println(a.charAt(3));
		System.out.println(a.charAt(2));
		System.out.println(a.charAt(1));
		System.out.println(a.charAt(0));	
		}
		
		
		
	}

}

/*Create a class called Reverse, write a program that will reverse a string.
    Your program should reverse a string only 5 characters long.
    If word is shorter, display message: "Too short!".
    If word is longer, display message: "Too long!".
    Otherwise, reverse this word and print out result into the console.
    */




