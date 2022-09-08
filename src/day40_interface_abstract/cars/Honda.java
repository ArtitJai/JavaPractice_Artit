package day40_interface_abstract.cars;

public class Honda extends Car{

	public Honda() {
		setBrand("Honda");
	}

	public Honda(String model, String color, int year, double price) {
		super("Honda", model, color, year, price); // calling super class
		
	}

	@Override
	public void start() {
		
		System.out.println("Insert the key and twist it");
		
	}

}
