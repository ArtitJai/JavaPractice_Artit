package day34_encapsulation.employees;

public class Apple {

	public static void main(String[] args) {
		
		Employee john = new Employee("John",40,"SDET",180000,21212,"Apple");
		
		john.work();
		
		System.out.println(john.toString());

	}

}
