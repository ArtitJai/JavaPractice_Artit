package day43_11thReview.inclass.ExceptionDemo;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UcheckedException {

	public static void main(String[] args) {
		
//		Unchecked Exception - or Runtime Exception
//		compiler will not check before it run. will not see this type of exception unless you run the program.
//		Can be prevent by good coding practice
		
		String hello = "Hello World";
		String lastCharacter = " ";
		try {
		lastCharacter = hello.charAt(hello.length())+ "";
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("There is no index in this string");
		}
		System.out.println(lastCharacter);
	}

}
