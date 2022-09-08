package day38_polymorphismOverriding.animals;

import java.util.ArrayList;

public class FarmLand {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Cat c = new Cat();
		c.sleep();
		Dog d = new Dog();
		Horse h = new Horse();
		
		a.makeSound();
		c.makeSound();
		c.eat();
		
	 // SuperClass s = new Subclass();
		Animal cat = new Cat();
		// WebDriver driver = new ChromeDriver();
		cat.makeSound();
		cat.eat();
//		cat.sleep(); -> can not do Because Animal class Doesn't have
//		   				learningJava() method
		
		System.out.println();
		Animal dog = new Dog();
		dog.makeSound();
		dog.eat();
		dog.walk();
		
		System.out.println();
		Animal horse = new Horse();
		horse.makeSound();
		horse.eat();
		horse.walk();
		
		ArrayList<Cat>cats = new ArrayList<>();
		cats.add(c);
		cats.add(new Cat());
//		cats.add(cat);
		
		System.out.println();
		ArrayList<Animal>animals = new ArrayList<>();
		
		animals.add(horse);
		animals.add(dog);
		animals.add(cat);
		animals.add(c);
		animals.add(d);
		animals.add(h);
		
		for (int i = 0; i < animals.size(); i++) {
			animals.get(i).makeSound();
		}
		
//		method overloading
//		System.out.print
	}

}
