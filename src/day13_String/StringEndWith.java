package day13_String;

public class StringEndWith {

	public static void main(String[] args) {
		
		String str = "Hello";
		System.out.println(str.startsWith("He"));
		
		System.out.println(str.endsWith("HE"));
		
		System.out.println(str.endsWith("llo"));
		
		String str2 = "TechCircle";
		
		System.out.println(str2.startsWith("Tech"));
		
		System.out.println(str2.endsWith("Cle"));
		
		System.out.println(str2.endsWith("cle"));
		
		

	}

}
