package day34_encapsulation.employees;

public class ThisKeyword {

	// instance variables
	private String name;
	private int age;
	private String ssn;
	
	public ThisKeyword() {
		this("Nobita", 20, "123-12-1234"); // this() -> we are calling parameterized constructor
	}
	//parameterized constructor
	public ThisKeyword(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		
	}
	// instance method
	public void Jane() {
		this.setName("Jane");
		this.setAge(18);
		this.setSsn("123-12-1234");
	}
	
	public void readValue() {
		System.out.println(this.age); // read instance variable age
		System.out.println(this.name);
		System.out.println(this.ssn);
	}
	
	public String getName() {
		return this.name; // reading instance variable name// updating instance variable name
	}
	
	public void setName(String name) {
		this.name = name; // updating instance variable name
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
}
