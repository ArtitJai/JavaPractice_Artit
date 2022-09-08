package day04_operators;

public class PrintFormatter {
	
	public static void main(String[] args) {
		
		 // printf can print %s = string
		 // printf can print %d = digit (byte, short, int, long) 
		 // printf can print %f = float (float, double)
		 // printf can print %b = boolean
		 // %.2f = 3.4567 => 3.45, %.1 = 45.6789 => 45.6
		
	System.out.printf("Hello My name is %s", "Artit");
	
	System.out.println();
	
	System.out.printf("%s My name is %s", "Bonjour", "Artit");
	
	System.out.println();
	
	System.out.printf("Is sunny today? %b",false);
	
		
	}

}
