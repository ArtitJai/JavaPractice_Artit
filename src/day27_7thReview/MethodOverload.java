package day27_7thReview;

public class MethodOverload {

	public static void main(String[] args) {
		
		System.out.println(max("100.23", "2.3456789"));
		
//		Method Overload = Method that have same name, same class, different parameters
	}
	public static int max(int a, int b) {
		return a > b ? a : b;
	}
	public static double max(double a, double b) {
		return a > b ? a : b;
		// if(a > b) return a;
		// else return b;
	}
	public static String max(String a, String b) {
		return a.length() > b.length() ? a : b;
	}
}
