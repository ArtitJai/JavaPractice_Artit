package day37_inheritance.employee;

public class ScrumMaster extends Employee  {
	
	public ScrumMaster(String name, int age, char gender, double salary, int employeeId) {
        super(name, age, gender, "ScrumMaster", salary, employeeId);  
    }
	
	

	public void work() {
		System.out.println("Creating and managing ");
	}
}
