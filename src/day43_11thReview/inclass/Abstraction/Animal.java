package day43_11thReview.inclass.Abstraction;

public abstract class Animal {
	  String name;
	    String color;
	    int age;
	    
	    public Animal(String name, String color, int age) {
	        this.name = name;
	        this.color = color;
	        this.age = age;
	    }
	    
	    public abstract void eat(); // Focus What
	    
	    public void move() {
	        System.out.println("This animal is moving");
	    }
}
