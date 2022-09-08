package day41_errorhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
	try {
		int a, b;
		
		a = 7;
		b = 0;
		
		System.out.println("Result : " + a/b);
		
	}catch(Exception e) {
		System.out.println("Bing go ");
		e.printStackTrace();
	}
		
		System.out.println("Program reached this line");

	}

}
