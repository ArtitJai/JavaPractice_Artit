package day37_inheritance.employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Amazon {

	public static void main(String[] args) {
		
		Tester luke = new Tester("Luke", 20, 'M', 123456, 180000);
		
		luke.regressionTest(); // from Tester
		luke.smokeTest();  // from Tester
		luke.work(); // from Employee
		luke.eat(); // from Person
		luke.drink(); // from Person
		
		System.out.println(luke.toString());
		
		Tester nobita = new Tester("Nobita",25,'M',12345,170000);
	    
	    Developer giant = new Developer("Giant",25,'M',455,250000);
	    
	    Developer john = new Developer("John",25,'M',2455,350000);
	    
	    Developer shizuka = new Developer("Shizuka",20,'F',278455,1500000);
	    
	    ProductOwner senio = new ProductOwner("Senio",35,'M',135000,856758);
	    
	    ScrumMaster jane = new ScrumMaster("Jane",42,'F',200000,3456);
	    
	    ArrayList<Employee>scrumTeam = new ArrayList<>(Arrays.asList(nobita,giant,john,shizuka,senio,jane));
	    
	    for(Employee employee : scrumTeam) {
	        System.out.println(employee.getName());
	        System.out.println(employee.getJobTitle());
	        employee.work();
	        System.out.println(employee.toString());
	        System.out.println("=================");
	        
	    }

	}

}
