package day34_encapsulation.employees;

public class Amazon {

	public static void main(String[] args) {
		
		Employee luke = new Employee();
		luke.name = "Luke";
		luke.age = 30;
		luke.companyName = "Amazon";
		luke.salary = 180000;
		luke.id =10001;
		luke.job_title = "SDET - Software development engineer in test";
		
		System.out.println(luke.toString());
		
		luke.work();

	}

}
