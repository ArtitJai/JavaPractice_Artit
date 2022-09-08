package day25_method;

public class MethodWithParameters {

	public static void main(String[] args) {
		
		/*
		 * 	Information can be passed to methods as parameter.
		   	Parameters act as variables inside the method.
		   	Parameters are specified after the method name, 
		   	inside the parentheses. You can add as many parameters as you want, 
		   	just separate them with a comma.
*/
		sayHello();
		sayHelloWithName("Dekizugi");
		sayHelloWithName("Nobita");
		
	}
	
	public static void sayHelloWithName(String name) {
		
//		String name = "Artit";
		
		System.out.println("hello " + name);
	}
	public static void sayHello() {
		
		System.out.println("Hello");
	}
	
}
