package day34_HW_class_constructor;

public class Student {

	/*
	 *  5. Student Task:
     Create a class called Student:
		attributes:
				  name, gender, age, studentID, grade

   5.1 Add a constructor that allows user to create object by setting the name of student

   5.2 Add a constructor that allows user to create object by setting the name and gender of the student

   5.3 Add a constructor that allows user to create object by setting the name and studentID of the student

   5.4 Add a constructor that allows user to create object by setting the name, studentID and grade of the student

  5.5 Add a constructor that allows user to create object by setting the name, gender and age of the student

  5.6 Add a constructor that allows user to create object by setting the name, gende, age and studentID of the student

  5.7 add a constructor that allows user to create object by setting the name, gende, age, studentID and grade of the student

  Actions:
		toString()
		study()
	 */
	
	String name;
	char gender;
	int age;
	String id;
	char grade;
	
//	 5.1 Add a constructor that allows user to create object by setting the name of student
	public Student(String name) {
		this.name = name;
	}
	
//	5.2 Add a constructor that allows user to create object by setting the name and gender of the student
	public Student(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	
//	5.3 Add a constructor that allows user to create object by setting the name and studentID of the student
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
//	5.4 Add a constructor that allows user to create object by setting the name, studentID and grade of the student
	public Student(String name, String id, char grade) {
		this(name, id);
		this.grade = grade;
	}

//	5.5 Add a constructor that allows user to create object by setting the name, gender and age of the student
	public Student(String name, char gender, int age) {
		this(name, gender);
		this.age = age;
	}
	
//	5.6 Add a constructor that allows user to create object by setting the name, gender, age and studentID of the student
	public Student(String name, char gender, int age, String id) {
		this(name, gender, age);
		this.id = id;
	}
	
//	5.7 add a constructor that allows user to create object by setting the name, gender, age, studentID and grade of the student
	public Student(String name, char gender, int age, String id, char grade) {
		this(name, gender, age, id);
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [name = " + name + ", gender = " + gender + ", age = " + age + ", id = " + id + ", grade = " + grade
				+ "]";
	}
	
	public String study() {
		
		 if(grade >= 'A' && grade <= 'C') {
	            System.out.println(name + " do not reuqire extra study");
	        }else {
	            System.out.println(name + " is require for extra study time");
	        }
		 
		 return "";
		
	}
	
	
	
	
	
}
