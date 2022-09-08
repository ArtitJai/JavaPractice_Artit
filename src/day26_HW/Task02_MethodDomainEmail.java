package day26_HW;

public class Task02_MethodDomainEmail {

//	2. Create a method that can display the domain of the email
	
	private static String domain(String email) {
		
		return email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
		
	}
	public static void main(String[] args) {
		
		System.out.print(domain("fluke_krab@hotmail.com"));
	}
}
