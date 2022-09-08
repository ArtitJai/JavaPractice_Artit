package day26_method_returnValue;

public class MethodReturnValue {

	public static void main(String[] args) {
		
		String firstName = "Nine";
		String lastName = "be";
		
//		String fullName = firstName + " " + lastName;
		
		String name = fullName(firstName,lastName);
		
		System.out.println(name);
		
		System.out.println(fullName("Emre","Altun"));

	}
	
	public static String fullName(String firstName, String lastName) {
		
		return firstName + " " + lastName;
	}

}
