package day13_String;

public class StringSubStringMethod {

	public static void main(String[] args) {
		
		
		String str1 = "Television";
		System.out.println(str1.substring(4)); // vision
		
		System.out.println(str1.substring(2,5)); // lev (start from 2 not include 5
		
		String str2 = "Immutable";
		System.out.println(str2.substring(2));
		
		System.out.println(str2.substring(4));
		
		System.out.println(str2.substring(4, 9));
		
		String email = "firstName.lastName@domainName.com";
		
		String gmail = "fluke_krab@gmail.com";
		
		System.out.println(gmail.indexOf('g'));
		
		System.out.println(gmail.lastIndexOf('.'));
		
		String domainName = gmail.substring(11, 16);
		
		System.out.println(domainName);
		
		System.out.println(gmail.substring(gmail.indexOf('g'),gmail.lastIndexOf('.')));

	}

}
