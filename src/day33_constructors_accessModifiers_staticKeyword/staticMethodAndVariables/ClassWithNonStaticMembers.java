package day33_constructors_accessModifiers_staticKeyword.staticMethodAndVariables;

public class ClassWithNonStaticMembers {
	// non static means that you need to create instance of the class. Then you can access the non static members.
	String name = "TechCircle";


public void readValue() {
	
	System.out.println("This is Clark Kent from " + name);
}
}
