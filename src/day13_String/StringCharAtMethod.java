package day13_String;

public class StringCharAtMethod {

	public static void main(String[] args) {
	
//					   0123456789
		String name = "TechCircle";
		
		System.out.println(name.charAt(0)); // T
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(4));
		System.out.println(name.charAt(5));
		System.out.println(name.charAt(6));
		System.out.println(name.charAt(7));
		System.out.println(name.charAt(8));
		System.out.println(name.charAt(9));
		
		
		
		for(int i = 0; i < name.length(); i++) {
//			System.out.println(i);
			System.out.println(name.charAt(i));
		
		}
		
		
		
		
	}

}
