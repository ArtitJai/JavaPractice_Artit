package day14_stringReview;

public class NumberToStringWrapperClass {

	public static void main(String[] args) {
		
		
		byte age = 60;
		
		String ageAsString = Byte.toString(age);
		
		System.out.println(ageAsString);//60
		 
		System.out.println(ageAsString.charAt(0)); // 6
		
		int distance = 1000;
		
		String c = Integer.toString(distance);
		
		System.out.println(c);
		
		double price = 9.99;
		
		String p = Double.toString(price);
		
		System.out.println(p.length());
		
		System.out.println(p.charAt(1));
		
		
		
		

	}

}
