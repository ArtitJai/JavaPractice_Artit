package day36_inheritance;

public class Apple {

	public static void main(String[] args) {
		
		SDET nobita = new SDET();
		nobita.employee_id = 123456789;
		nobita.name = "Nobita";
		nobita.job_title = "SDET";
		nobita.salary = 190_000;
		nobita.ssn = "123-45-6789";
		nobita.work();
		
		System.out.println(nobita.toString());
		

	}

}
