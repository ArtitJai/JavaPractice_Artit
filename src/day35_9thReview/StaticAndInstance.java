package day35_9thReview;

public class StaticAndInstance {

	public static void main(String[] args) {
		
		// Static = all static member belong to the class
		Calculator cal = new Calculator();
		
		Calculator.printSum(2, 3);
		printHello();

	}
	public static void printHello() {
		System.out.println("Hello");
	}

}

class Calculator{
	public static void printSum(int a, int b) {
		System.out.println("sum = " + (a + b));
	}
}

