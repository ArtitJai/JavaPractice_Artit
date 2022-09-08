package day39_10thHW.Polymorphism;

public class Ford extends Car{
	
	public Ford(int cylinders, String name) {
		super(true, cylinders, "Ford", 4);
	}
	
	public String startEngine() {
		return "Ford => " + super.startEngine();
	}
	
	public String accelerate() {
		return "Ford => " + super.accelerate();
	}
	
	public String brake() {
		return "Ford => " + super.brake();
	}
}
