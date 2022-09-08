package day36_inheritance;

public class Employee {
	
	// instance variables
	String name;
	long employee_id;
	String ssn;
	String job_title;
	double salary;
	
	
	// instance method
	void work(){
		System.out.println("Working");
	}
		
	// default constructor
	public Employee() {}
	
	public Employee(String name) {

		this.name = name;
	}
	
	public Employee(String name, long employee_id, String ssn, String job_title, double salary) {

		this.name = name;
		this.employee_id = employee_id;
		this.ssn = ssn;
		this.job_title = job_title;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employee_id=" + employee_id + ", ssn=" + ssn + ", job_title=" + job_title
				+ ", salary=" + salary + "]";
	}
	
	
}
