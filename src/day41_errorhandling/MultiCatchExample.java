package day41_errorhandling;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		String[] fruits = {"Apple", "Banana", "Orange", "Pear", null};
		
		try {
		
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
			System.err.println(fruits[i].charAt(3));
		}
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index issue");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Array index issue");
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			System.out.println("Finally Block");
		}
		

	}

}
