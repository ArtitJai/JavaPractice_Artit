package day03_1stReview;

public class PrintFunction {
 public static void main(String[] args) {
	 System.out.println();
	 System.out.printf("Hello world");
	 System.out.printf("Hello world");
	 System.out.printf("Hello world");
	 
	 // printf can print %s = string
	 // printf can print %d = digit (byte, short, int, long) 
	 // printf can print %f = float (float, double)
	 // printf can print %b = boolean
	 // %.2f = 3.4567 => 3.45, %.1 = 45.6789 => 45.6
	 
	int age = 31;
	String message = "world";
	boolean isEligible = false;
	
	System.out.println();
	System.out.printf("Hello %s! Fluke is %d",message,35);
	System.out.println();
	System.out.printf("fluke is %d years old.",70); 
	System.out.println();
	System.out.printf("Price is %.4f cheaper",4.35);
	System.out.println();
	System.out.printf("%b is not eligible",isEligible);
	
}
}
