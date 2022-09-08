package day40_interface_abstract.cars;

public class Tesla extends Car{

	public Tesla() {
		setBrand("Tesla");
	}

	public Tesla(String model, String color, int year, double price) {
		super("Tesla", model, color, year, price);
		
	}
	
	public void autoPilot() {
		System.out.println(getBrand() + " " + getModel() + " is driving by itself");
	}

	@Override
	public void start() {
		
		System.out.println("Just drive your car");
		
	}
	
}
