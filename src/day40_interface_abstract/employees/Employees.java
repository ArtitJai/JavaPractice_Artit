package day40_interface_abstract.employees;

public abstract class Employees {

	private int id;
	private String name, title;
	private double salary;
	
	public abstract void work();
	public abstract void sleep();
	
	public Employees() {}
	public Employees(int id, String name, String title, double salary) {
		
		this.id = id;
		this.name = name;
		this.title = title;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [id = " + id + ", name = " + name + ", title = " + title + ", salary = " + salary + "]";
	}
	
	
	
	
	
	
}
