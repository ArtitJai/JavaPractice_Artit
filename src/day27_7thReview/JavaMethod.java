package day27_7thReview;

public class JavaMethod {

	String name = "Artit";
	public static void main(String[] args) {
		
		// method = collection of statement that group together to perform operation
		
		// Method Signature :
		// public ==> Access mModifier (opt.) - oops concept
		// Return type
		// Method Name - camelCase
		// Parameter (opt.) - inside parentheses, can have multiple
		
		// Method Body - inside curly braces
		
		sayHi();
		sayHiWithName("Fluke");
	}
	// Modifier, return type, methodName(){}
		 public static void sayHi() {
			 // Body
			 
			 System.out.println("Hi");
		 }
	// Modifier, return type, methodName(parameterType parameterName){}
	 public static void sayHiWithName(String name) {
		 // Body
//		 String name = "Fluke"; => can not have same variable name in same method
		 System.out.println("Hi, " + name);
	 }
	 public static void sayHiWithNameAndPrefix(String name, String prefix) {
		

		 System.out.println("Hi, " + prefix + " " + name);
	 }
}
