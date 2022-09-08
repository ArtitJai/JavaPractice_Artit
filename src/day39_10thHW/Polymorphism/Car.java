package day39_10thHW.Polymorphism;

public class Car {
	private boolean engine;
	private int cylinders, wheels;
	private String name;
	
	public Car() {}
	public Car(int cylinders, String name) {
		
		this.engine = true;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.name = name;
	}
	public Car(boolean engine, int cylinders, String name, int wheels) {
		
		this.engine = true;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.name = name;
	}
	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
	
	public String startEngine() {
		return "car's engine is starting";
	}
	
	public String accelerate() {
		return "car is accelerating";
	}
	
	public String brake() {
		return "car is braking";
	}
	
	
}
