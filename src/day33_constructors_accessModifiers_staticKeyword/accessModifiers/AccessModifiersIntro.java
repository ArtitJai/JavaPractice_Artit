package day33_constructors_accessModifiers_staticKeyword.accessModifiers;

public class AccessModifiersIntro {

	/*
	 Default - No keyword required
	 Private
	 Protected
	 Public
	 */

	
	String url = "techCircleschool.com"; // default
	private int age = 30;
	protected char gender = 'M';
	public String name = "TechCircle";
	
	
	// instance method.
	public void readData() {
		
		System.out.println("URL : " + url);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
		System.out.println("Name : " + name);
	
	}
	
	void methodA() {
		
		System.out.println("This is default modifiers");
		
	}
	
	private void methodB() {
		
		System.out.println("This is private method");
	
	}
	
	protected void methodC() {
		
		System.out.println("This is protected method");
	}
	
	public void methodD() {
		
		System.out.println("This is public method");
	}
	
	public void callingMethodB() {
		
		methodB();
	}
}
