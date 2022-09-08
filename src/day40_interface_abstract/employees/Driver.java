package day40_interface_abstract.employees;

public class Driver extends Employees{

	public Driver() {
		setTitle("Driver");
	}

	public Driver(int id, String name, double salary) {
		super(id, name, "Driver", salary);
		
	}
	
	@Override
	public void work() {
		
		System.out.println(getName() + " is driving a school bus");
		
	}
	
	public void sleep() {
		System.out.println(getName() + " is sleeping 10 hours");
	}
	

}
