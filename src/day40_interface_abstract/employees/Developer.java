package day40_interface_abstract.employees;

public class Developer extends Employees{

	public Developer() {
		setTitle("Developer");
	}

	public Developer(int id, String name, double salary) {
		super(id, name, "Developer", salary);
		
	}
	
	@Override
	public void work() {
		
		System.out.println("Writting code");
		
	}
	
	public void writeUnitTest() {
		System.out.println("Testing my own code");
	}

	@Override
	public void sleep() {
		System.out.println(getName() + " sleep 5 hours");
		
	}

}
