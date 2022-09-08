package day38_polymorphismOverriding;

public class Test {

	public static void main(String[] args) {
		
		School s = new School();
		s.getLocation();
		
		TechCircle t = new TechCircle();
		t.getLocation();
		
		
		// SuperClass s = new Subclass();
		School school = new TechCircle();
		school.getLocation(); // -> this is an Overriding
		
//		school.learnlearningJava(); -> can not do Because School class Doesn't have
//									   learningJava() method
		
	}

}
