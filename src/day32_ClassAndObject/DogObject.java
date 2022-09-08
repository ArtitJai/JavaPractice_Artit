package day32_ClassAndObject;

public class DogObject {

	public static void main(String[] args) {
		
		// Create instance of the Dog
		Dog dog1 = new Dog();
//		System.out.println(dog1.breed);
//		System.out.println(dog1.size);
//		dog1.eat();
//		dog1.run();
		
		dog1.breed = "Neapolitan Mastiff";
		dog1.size = 'L';
		dog1.age = 5;
		dog1.color = "Black";
		
		dog1.eat();
		dog1.sleep();
		dog1.run();
		dog1.sit();
		
		Dog dog2 = new Dog();
		
		dog2.breed = "Cavalier King Charles Spaniel";
		dog2.size = 's';
		dog2.age = 3;
		dog2.color = "White/Brown";
		
		dog2.eat();
		dog2.sleep();
		dog2.run();
		dog2.sit();
		
		Dog dog3 = new Dog();
		
		dog3.breed = "Teacup Maltese";
		
		dog3.size = 's';
		dog3.age = 1;
		dog3.color = "White";
		
		dog3.eat();
		dog3.sleep();
		dog3.run();
		dog3.sit();
		
		
	}

}
