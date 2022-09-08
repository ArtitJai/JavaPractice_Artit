package day14_stringReview;

public class NumberToString_ValueOf {

	public static void main(String[] args) {
		
		long a = 123456L;
		
		String valueA = String.valueOf(a);
		
		System.out.println(valueA);
		System.out.println(valueA.length());
		
		short s = 31542;
		String valueS = String.valueOf(s);
		
		System.out.println(valueS);
		System.out.println(valueS.length());
		System.out.println(valueS.charAt(2));
		
		
		
	}

}
