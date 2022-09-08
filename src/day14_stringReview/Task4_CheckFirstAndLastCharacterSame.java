package day14_stringReview;

public class Task4_CheckFirstAndLastCharacterSame {

	public static void main(String[] args) {
		/*
		 * ## Task4
write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
                */
			
		String a = "level";
		
		char x = a.charAt(0);
		char y = a.charAt(a.length()-1);
		
		if(x == y) {
			System.out.println("SAME");
		}else {
			System.out.println("DIFFERENT");
		}
		
		
		
		
		
	}

}
