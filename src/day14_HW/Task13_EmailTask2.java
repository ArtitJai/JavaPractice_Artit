package day14_HW;

public class Task13_EmailTask2 {

	public static void main(String[] args) {
		
		/*## Task13
`
Create a class called EmailTask2.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

       Write a program that will print out information about user based on email. Print first name, last name, and domain.

       First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

               Ex:
                   input:
                       techcircle_school@aws.com

                Output:
                    First name: Techcircle
                    Last name: School
                    Domain: aws*/
		
		String email = "techcircle_school@aws.com";
		
		
		String firstName = email.substring(0,email.indexOf('_'));
		
		String lastName = email.substring(email.indexOf('_')+1, email.indexOf('@'));
		
		String domain = email.substring(email.indexOf('@')+1,email.indexOf('.'));
		
		
		String newFirst = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
		
		String newLast = lastName.toUpperCase().substring(0,1) + lastName.toLowerCase().substring(1);
		
		System.out.println("First name: " + newFirst+"\n");
		
		System.out.println("Last name: " + newLast+"\n");
		
		System.out.println("Domain: " + domain);
		
		

	}

}
