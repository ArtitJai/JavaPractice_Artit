package day40_interface_abstract.employees;

public class Tester extends Employees{

	
	public Tester() {
		setTitle("Tester");
	}

	public Tester(int id, String name, double salary) {
		super(id, name, "Tester", salary);
	}

	@Override
	public void work() {
		System.out.println("Test new functionality");	
	}
	
	public void bugReport() {
		System.out.println(getName() + " creating new bug");
	}

	@Override
	public void sleep() {
		System.out.println("No release today! I can sleep 12 hours");
		
	}

}
