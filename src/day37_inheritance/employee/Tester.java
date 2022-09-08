package day37_inheritance.employee;

public class Tester extends Employee {
	
	public Tester() {}
	
	public Tester(String name, int age, char gender, int employeeId, double salary) {
		super(name, age, gender, "QA Test Automation Engineer", salary, employeeId);
	}
	
	public void smokeTest() {
		System.out.println(getName() + " is running Smoke test");
	}
	
	public void regressionTest() {
		System.out.println(getName() + " is running regression test");
	}
	
	public void createTestDocumentation() {
		System.out.println(getName() + " is creating test document");
	}
	
	public void work() {
		System.out.println("Testing web application");
	}

}
