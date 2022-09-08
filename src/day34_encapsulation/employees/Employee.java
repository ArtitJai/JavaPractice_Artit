package day34_encapsulation.employees;

public class Employee {
	
	String name;
	int age;
	String job_title;
	double salary;
	int id;
	String companyName;
	public Employee() {
		
	}
	public Employee(String name, int age, String job_title, double salary, int id, String companyName) {
		
		this.name = name;
		this.age = age;
		this.id = id;
		this.job_title = job_title;
		this.salary = salary;
		this.companyName = companyName;
		
	}
	
	public String toString() {
		return "{name : "+name+" ,\nage : "+age+" ,\njob_title : "+job_title+" ,\nsalary : "+salary+" ,\nid : "+id+" ,\ncompanyName : "+companyName+"}";
	}
	
	public void work() {
		System.out.println(name + " is working at " + companyName);
	}
}
