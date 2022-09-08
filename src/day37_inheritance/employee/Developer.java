package day37_inheritance.employee;

public class Developer extends Employee {

	public Developer() {}
	
	public Developer(String name, int age, char gender, int employeeId, double salary) {
		//super(name, age, gender, employeeId, "JAVA Developer", salary);
		super(name, age, gender, "JAVA Developer", salary, employeeId);
	}
	
	public void code() {
		System.out.println(getName() + " is writing code");
	}
	
	public void debug() {
		System.out.println(getName() + " is debuging code");
	}
	
	public void fixBug() {
		System.out.println(getName() + " is fix bug");
	}
	
	public void work() {
		System.out.println("Developing work Application");
	}
}
