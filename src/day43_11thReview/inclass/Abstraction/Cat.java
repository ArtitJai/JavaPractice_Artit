package day43_11thReview.inclass.Abstraction;

public class Cat extends Animal{
	public Cat(String name, String color, int age) {
        super(name, color, age);
        
    }
    @Override
    public void eat() {
        System.out.println(name+" Cat is eating");
    }
}
