package day38_polymorphismOverriding.animals;

public class Dog extends Animal{
	
	public void makeSound() {
		System.out.println("I'm dog. barking...");
	}
	
	public void walk() {
		System.out.println("Dog is walking");
	}

}
