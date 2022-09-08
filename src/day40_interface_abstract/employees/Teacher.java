package day40_interface_abstract.employees;

public class Teacher extends Employees{
	
	
	public Teacher() {
	
	}

	public Teacher(int id, String name, double salary) {
		super(id, name, "Teacher", salary);
	}

	@Override
	public void work() {
		System.out.println(getName() + " is teaching");
	}

	@Override
	public void sleep() {
		System.out.println(getId() + " is sleep 8 hours");
		
	}
	

}
