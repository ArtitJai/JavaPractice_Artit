package day33_constructors_accessModifiers_staticKeyword.Constructor;

public class Dog { 
	
//	A constructor in Java is a special method that is used to initialize objects.
//	Note that the constructor name must match the class name, and it cannot have a return type (like void).
	
	public Dog() {
		System.out.println("This is default constructor of the dog class");
	} // default constructor of the dog class
	
	public Dog(String fbreed) { // parameterized constructor of the dog class
		breed = fbreed;
	}
	
	public Dog(String fbreed, char fsize) { // parameterized constructor of the dogclass
		breed = fbreed;
		size = fsize;
	}
	
	public Dog(String fBreed, char fSize, int fAge, String fColor) {
		breed = fBreed;
		size = fSize;
		age = fAge;
		color = fColor;
	}
	
	// instance variable
	String breed;
	char size;
	int age;
	String color;
	
//	instance method
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


