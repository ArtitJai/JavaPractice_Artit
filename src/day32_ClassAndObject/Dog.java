package day32_ClassAndObject;

public class Dog {
	
	// instance variable
	String breed;
	char size;
	int age;
	String color;
	
	public void eat() {
		System.out.println(breed + " is eating");
	}
	
	public void sleep() {
		System.out.println(breed + " is sleeping");
	}
	
	public void sit() {
		System.out.println(breed + " is sitting");
	}
	
	public void run() {
		System.out.println(breed + " is running");
	}
}
