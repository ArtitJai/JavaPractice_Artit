package day38_polymorphismOverloading;

public class AreaCalculator {
	
	public static void main(String[] args) {
//		getArea(5.0);
		
		AreaCalculator areaCal = new AreaCalculator();
		
//		areaCal.getArea(5);
		
		System.out.println(areaCal.getArea(5.0));
		
		System.out.println();
		
		System.out.println(areaCal.getArea(5, 10.0));
		
		System.out.println();
		
		System.out.println(areaCal.getArea(5.0, 10.0));
		
		System.out.println();
		
		System.out.println(AreaCalculator.getArea(9)); // static way to access
	}
	
	public double getArea(double radius) {
		// Circle
		System.out.println("Circle");
		double pi = 3.14;
		return pi * radius*radius;
	}
	
	public double getArea(double a, double b) {
		// Rectangle
		System.out.println("Rectangle");
		return a * b;
	}
	
	public double getArea(int h, double b) {
		// Triangle
		System.out.println("Triangle");
		return h * b/2;
	}
	
	public static int getArea(int a) {
		return a + 10;
	}

}
