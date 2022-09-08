package day26_HW;

import java.util.Scanner;

public class Task12_Password {

	
//		12.     Write a function that can verify if a password is valid or not. requirements:
//        1. Password MUST be at least have 6 characters and should not contain space
//        2. PassWord should at least contain one upper case letter
//        3. PassWord should at least contain one lower case letter
//        4. Password should at least contain one special characters
//        5. Password should at least contain a digit
//        if all requirements above are met, the method returns true, otherwise returns false
	private static boolean isValid(String password) {
		
		boolean upperCase = false;
		boolean lowerCase = false;
		boolean specialChar = false;
		boolean nums = false;

		if (!((password.length() >= 6))) {
			return false;

		} else {

			for (int i = 0; i < password.length(); i++) {

				if ('A' <= password.charAt(i) && password.charAt(i) <= 'Z')
					upperCase = true;

				if ('a' <= password.charAt(i) && password.charAt(i) <= 'z')
					lowerCase = true;

				if ("!@#$%^&*()-+".contains(password.charAt(i) + ""))
					specialChar = true;

				if ('0' <= password.charAt(i) && password.charAt(i) <= '9')
					nums = true;

			}
			
		}
		return upperCase && lowerCase &&  specialChar && nums;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print( "1. Password MUST be at least have 6 characters and should not contain space\n"+
                "2. PassWord should at least contain one upper case letter\n"+
                "3. PassWord should at least contain one lowercase letter\n"+
                "4. Password should at least contain one special characters\n"+
                "5. Password should at least contain a digit\n\n"+
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
		String password = sc.next();
		
		if (isValid(password)) {
            System.out.println("\nPassword is valid: " + password);
        } else {
            System.out.println("\nNot a valid password: " + password);
        }
		sc.close();
		
	}
}

//Java code to validate a password


//public class PasswordValidator {
//
//	// A utility function to check
//	// whether a password is valid or not
//	public static boolean isValid(String password)
//	{
//
//		// for checking if password length
//		// is between 8 and 15
//		if (!((password.length() >= 8)
//			&& (password.length() <= 15))) {
//			return false;
//		}
//
//		// to check space
//		if (password.contains(" ")) {
//			return false;
//		}
//		if (true) {
//			int count = 0;
//
//			// check digits from 0 to 9
//			for (int i = 0; i <= 9; i++) {
//
//				// to convert int to string
//				String str1 = Integer.toString(i);
//
//				if (password.contains(str1)) {
//					count = 1;
//				}
//			}
//			if (count == 0) {
//				return false;
//			}
//		}
//
//		// for special characters
//		if (!(password.contains("@") || password.contains("#")
//			|| password.contains("!") || password.contains("~")
//			|| password.contains("$") || password.contains("%")
//			|| password.contains("^") || password.contains("&")
//			|| password.contains("*") || password.contains("(")
//			|| password.contains(")") || password.contains("-")
//			|| password.contains("+") || password.contains("/")
//			|| password.contains(":") || password.contains(".")
//			|| password.contains(", ") || password.contains("<")
//			|| password.contains(">") || password.contains("?")
//			|| password.contains("|"))) {
//			return false;
//		}
//
//		if (true) {
//			int count = 0;
//
//			// checking capital letters
//			for (int i = 65; i <= 90; i++) {
//
//				// type casting
//				char c = (char)i;
//
//				String str1 = Character.toString(c);
//				if (password.contains(str1)) {
//					count = 1;
//				}
//			}
//			if (count == 0) {
//				return false;
//			}
//		}
//
//		if (true) {
//			int count = 0;
//
//			// checking small letters
//			for (int i = 97; i <= 122; i++) {
//
//				// type casting
//				char c = (char)i;
//				String str1 = Character.toString(c);
//
//				if (password.contains(str1)) {
//					count = 1;
//				}
//			}
//			if (count == 0) {
//				return false;
//			}
//		}
//
//		// if all conditions fails
//		return true;
//	}
//
//	// Driver code
//	public static void main(String[] args)
//	{
//
//		String password1 = "GeeksForGeeks";
//
//		if (isValid(password1)) {
//			System.out.println(password1 + " - Valid Password");
//		}
//		else {
//			System.out.println(password1 + " - Invalid Password!");
//		}
//
//		String password2 = "Geek$ForGeeks7";
//		if (isValid(password2)) {
//			System.out.println(password2 + " - Valid Password");
//		}
//		else {
//			System.out.println(password2 + " - Invalid Password!");
//		}
//	}
//}
//
