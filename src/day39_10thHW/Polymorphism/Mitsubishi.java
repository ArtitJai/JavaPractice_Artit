package day39_10thHW.Polymorphism;

public class Mitsubishi extends Car{

	public Mitsubishi(int cylinders, String name) {
		super(true, cylinders, "Mitsubishi", 4);
	}
	
	public String startEngine() {
		return "Mitsubishi => " + super.startEngine();
	}
	
	public String accelerate() {
		return "Mitsubishi => " + super.accelerate();
	}
	
	public String brake() {
		return "Mitsubishi => " + super.brake();
	}
}
