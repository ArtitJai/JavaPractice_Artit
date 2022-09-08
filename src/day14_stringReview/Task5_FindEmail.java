package day14_stringReview;

import java.util.Scanner;

public class Task5_FindEmail{

	public static void main(String[] args) {
		/*## Task5
`Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
*/
		
		
Scanner sc = new Scanner(System.in);
System.out.println("please, enter your email");
		String email = sc.nextLine() ;
		
        //The email string must contain an '@' character.
        
        boolean hasAtSign = email.contains("@");
        System.out.println(hasAtSign);
        
        
//        The email string must contain an '.' character.
        boolean hasDot = email.contains(".");
        
        
//        The '@' must contain at least one character in front of it.
//        01
//        a@example.com
        boolean hasCharBeforeAtSign = email.indexOf('@') >=1;
        
        
        System.out.println(hasCharBeforeAtSign);
        
        
//        The '.' and '@' must be in the appropriate places.
        
        boolean dotAndAtAreInAppropriatePlaces  = email.lastIndexOf('.') - email.indexOf('@') >=2;
        
        
        
        if (hasAtSign &&hasDot && hasCharBeforeAtSign && dotAndAtAreInAppropriatePlaces) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        
		
		
		
		
	}

}
