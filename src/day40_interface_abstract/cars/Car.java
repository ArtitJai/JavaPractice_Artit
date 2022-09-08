package day40_interface_abstract.cars;

public abstract class Car {
	// to have an abstract method in your class you must make your class abstract.
	// Abstract method has no method body
	
	public abstract void start();
	
	private String brand, model, color;
	private int year;
	private double price;
	
	
	public Car() {}
	public Car(String brand, String model, String color, int year, double price) {
	
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", year=" + year + ", price=" + price
				+ "]";
	}
	
	
	
	
	
	
}
