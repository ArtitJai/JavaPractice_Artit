package day32_ClassAndObject;

public class LocalVariable {

	public static void main(String[] args) {;
		
		int count = 6;
		
		for(int i = 0; i < 10; i++) {
			System.out.println(count);
		}
		
//		System.out.println(i); => Can't access the variable i here. its local to the for loop
		
		if(5 > 4) {
			boolean result = true; // result is a local variable
			System.out.println(count);
		}
		
//		System.out.println(result);
		
		System.out.println(count);

	}

}
