package day32_ClassAndObject;

public class StudentObject {

	public static void main(String[] args) {
		
		// Create instance of student object
		// call the constructor of the student class
		// constructor is special method to create the object.
		
		Student student1 = new Student();
		// assigning value to the instance variables
		student1.name = "Luke";
		student1.age = 10;
		student1.color = "White";
		student1.sex = 'M';
		
		student1.eat();
		student1.drink();
		student1.run();
		student1.sleep();
		student1.code();
		
		Student student2 = new Student();
		
		student2.name = "Jane";
		student2.age = 11;
		student2.color = "Dark";
		student2.sex = 'F';
		
		student2.eat();
		student2.drink();
		student2.run();
		student2.sleep();
		student2.code();
		
		Student student3 = new Student();
		
		student3.name = "Michelle";
		student3.age = 9;
		student3.color = "Fair";
		student3.sex = 'F';
		
		student3.eat();
		student3.drink();
		student3.run();
		student3.sleep();
		student3.code();

	}

}
