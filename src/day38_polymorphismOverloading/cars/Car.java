package day38_polymorphismOverloading.cars;

public class Car {
	    
	    String brand;
	    String model;
	    int year;
	    double price;
	    String color;
	    double miles;
	    
//	    public Car() {}
	    public Car (String brand, String model, int year, double price, String color, double miles) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	        this.price = price;
	        this.color = color;
	        this.miles = miles;
	    }
	    
	    public void start() {
	        System.out.println(brand +" "+ model + " is starting");
	    }
	    
	    public void drive() {
	        System.out.println(brand +" "+ model + " is driving");
	    }
	    
	    @Override
	    public String toString() {
	        return "Car [brand = " + brand + ", model = " + model + ", year = " + year + ", price = " + price + ", color = " + color
	                + ", miles = " + miles + "]";
	    }
}