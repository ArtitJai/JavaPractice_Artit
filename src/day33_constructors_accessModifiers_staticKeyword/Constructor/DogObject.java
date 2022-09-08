package day33_constructors_accessModifiers_staticKeyword.Constructor;

public class DogObject {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog(); // calling default constructor of the dog object.
		
		System.out.println(dog1.breed);
		
		dog1.breed = "Neapolitan Mastiff";
		dog1.size = 'L';
		dog1.age = 5;
		dog1.color = "Black";
		
		System.out.println(dog1.breed);
		
		Dog dog2 = new Dog("Teacup Maltese");
		
		dog2.eat();
		dog2.sit();
		
		Dog dog3 = new Dog("Shiba Inu", 'M');
		
		System.out.println(dog3.breed); // Shiba Inu
		
		System.out.println(dog3.size);
		
		Dog dog4 = new Dog("Pitbull", 'L', 10, "Brindle");
		
		System.out.println(dog4.breed);
		System.out.println(dog4.size);
		System.out.println(dog4.age);
		System.out.println(dog4.color);
		
		

	}

}
