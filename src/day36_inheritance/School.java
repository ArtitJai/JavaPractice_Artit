package day36_inheritance;

public class School {

	public static void main(String[] args) {
		
		Teacher shafkat = new Teacher();
		System.out.println(shafkat.getCollegeName()); // School
		System.out.println(shafkat.getDesignation()); // teacher
		shafkat.does();
		
		System.out.println();
		
		PhysicsTeacher luke = new PhysicsTeacher();
		
		System.out.println(luke.mainSubject);
		
		luke.does();
		
		luke.setCollegeName("TechCircle");
		luke.setCollegeName("Software Test Automation Engineer");
		
		System.out.println(luke.getCollegeName());
		System.out.println(luke.getDesignation());
		
		JavaTeacher john = new JavaTeacher();
		
		System.out.println(john.mainSubject);
		System.out.println(john.getCollegeName());
		john.does();
	}

}
