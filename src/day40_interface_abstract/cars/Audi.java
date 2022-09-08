package day40_interface_abstract.cars;

public class Audi extends Car{

	public Audi() {}

	public Audi(String model, String color, int year, double price) {
		super("Audi", model, color, year, price);
	}
	
	public void autoPart() {
		System.out.println(getBrand() + " " + getModel() + " has auto park feature");
	}

	@Override
	public void start() {
		
		System.out.println("push start button");
		
	}

}
