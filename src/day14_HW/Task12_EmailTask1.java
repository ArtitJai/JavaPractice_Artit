package day14_HW;

public class Task12_EmailTask1 {

	public static void main(String[] args) {
		/*## Task12
`
Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
                */
		
		
		String email = "fluke_krab@gmail.com";
		
		if(email.indexOf('_') == -1) {
			System.out.println("Not correct email");
		}
		else {
			String firstName = email.substring(0, email.indexOf('_'));
			String lastName = email.substring(email.indexOf('_')+1, email.indexOf('@'));
			String emailAddress = email.substring(email.indexOf('@'));
			String newEmail = lastName + "_" + firstName + emailAddress;
			
			System.out.println(newEmail);
		}
		
		
		
		
		

	}

}
