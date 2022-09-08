package day38_polymorphismOverloading.cars;

public class BMW extends Car{

	public BMW(String model, int year, double price, String color, double miles) {
		super("BMW", model, year, price, color, miles);
		
	}
	
//	public void start() {
//	    System.out.println(super.brand +" "+ super.model + " is starting");
//	    }
//	  
//	public void drive() {
//	    System.out.println("Nobita is driving " + brand +" "+ model);
//	    }
	
	public void breaksDown() {
		System.out.println("BMW " + model + " is breakdown real good");	
		}
	
	  public void racing(){
	        System.out.println("BMW " + " "+ model +" is a racing car");
	    }

}
