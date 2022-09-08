package day41_errorhandling;

public class MultipleCatchBlocksExample {

	public static void main(String[] args) {
		
		String str = "Welcome!";
		
		char[] chars = str.toCharArray();
		
		try {
			System.out.println();
			
			char lastChar = chars[chars.length-1];
			
			System.out.println(lastChar);
		
			String subStr = str.substring(10);
			
			System.out.println(subStr);
		
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Array index problem");
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index problem");
		}
		

	}

}
