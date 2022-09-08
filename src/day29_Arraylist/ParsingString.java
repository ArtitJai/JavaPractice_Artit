package day29_Arraylist;

public class ParsingString {

	public static void main(String[] args) {
		
		String str1 = "123";
		String str2 = "123";
		
		System.out.println(str1 + str2);
		// 123 = 123 = 246
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num1 + num2);
		
		String str3 = "9.99";
		
		String str4 = "19.99";
		
		System.out.println(str3 + str4);
		
		Double num3 = Double.parseDouble(str3);
		
		Double num4 = Double.parseDouble(str4);
		
		System.out.println(num3 + num4);
		
		String str5 = "32000";
		short num5 = Short.parseShort(str5);
		
		System.out.println(num5 - 1);
		
		

	}

}
