package day13_String;

public class StringTrimMethod {

	public static void main(String[] args) {
		
		String str1 = "    Hello";
		
		System.out.println(str1.length()); 
		System.out.println(str1);
		
		str1 = str1.trim(); // trim can cut white space out  just before and after word
		
		System.out.println(str1.length());
		System.out.println(str1);
		
		String str2 = "                 Hello                   world";
		System.out.println(str2.length());
		System.out.println(str2);
		
		str2 = str2.trim();
		System.out.println(str2);
		
		
		
	}

}
