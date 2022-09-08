package day37_inheritance.employee;

public class Person {

	private String name;
	private int age;
	private char gender;

	// Default constructor
	public Person() {}	
	
	// parameterized constructor
	public Person(String name, int age, char gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	 //instance methods
    public void eat() {
        System.out.println(name +" is eating food.");
    }
    
    public void drink() {
        System.out.println(name +" is drinking water.");
    }
	
}
