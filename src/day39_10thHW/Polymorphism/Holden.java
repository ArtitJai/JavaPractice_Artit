package day39_10thHW.Polymorphism;

public class Holden extends Car {
	
	public Holden(int cylinders, String name) {
		super(true, cylinders, "Holden", 4);
	}
	
	public String startEngine() {
		return "Holden => " + super.startEngine();
	}
	
	public String accelerate() {
		return "Holden => " + super.accelerate();
	}
	
	public String brake() {
		return "Holden => " + super.brake();
	}
}
