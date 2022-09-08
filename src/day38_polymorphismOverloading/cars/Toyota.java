package day38_polymorphismOverloading.cars;

public class Toyota extends Car{

	public Toyota(String model, int year, double price, String color, double miles) {
		super("Toyota", model, year, price, color, miles);

	}
	public void start() {
	    System.out.println(super.brand +" "+ super.model + " is starting");
	    }
	  
	public void drive() {
	    System.out.println("Nobita is driving " + brand +" "+ model);
	    }
	    
}
