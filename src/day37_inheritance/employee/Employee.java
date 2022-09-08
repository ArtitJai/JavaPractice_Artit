package day37_inheritance.employee;

public class Employee extends Person{

	private String jobTitle;
	private double salary;
	private int employeeId;
	
	public Employee() {}
	
	public Employee(String name, int age, char gender, String jobTitle, double salary, int employeeId) {
		super(name, age, gender); // calling super class's parameterized constructor
		
		// to set value to instance variable of employee 
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
		this.salary = salary;
		
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", salary=" + salary + ", employeeId=" + employeeId + "]"
				+ "from person class " + super.toString();
	}
	
	public void work() {
		System.out.println(getName() + " is working");
	}
	
	
}
