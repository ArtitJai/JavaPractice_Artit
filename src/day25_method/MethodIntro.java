package day25_method;

public class MethodIntro {
/*
 * 	sccessModifier returnType methodName (parameter){
 * 		// your code
 * 	}
 * 	access Modifiers : public, private, protected or default
 * 	
 * 	returnType	: void or returnSomething ==> int, string, double
 * 
 * 	method name	: just like your variable name. it will run when you call it.
 * 
 * 	parameters	: i could be empty or you can use some parameters.
 * 
 * 
 * 
 * 
 * */
	
	public static void printUSflag() {
		
	System.out.println ();
	{
		  String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
		  String p2 = "==============================================";
		  for (int i = 0; i < 4; i++) {
		   System.out.println(p1);
		  }
		  System.out.println("* * * * * * ==================================");
		  for (int i = 0; i < 6; i++) {
		   System.out.println(p2);
		  }
}
	}
	
	public static void main(String[] args) {
		
		printUSflag();
		printHello10Times();
	

	}
	public static void printHello10Times() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello JAVA");
		}
	}
}
