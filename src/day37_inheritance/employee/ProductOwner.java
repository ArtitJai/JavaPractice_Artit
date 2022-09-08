package day37_inheritance.employee;

public class ProductOwner extends Employee {
	
    public ProductOwner(String name, int age, char gender, double salary, int employeeId) {
        super(name, age, gender, "PO", salary, employeeId);  
    }

	public void work() {
		System.out.println("Writting user stories");
	}
}
