package day33_constructors_accessModifiers_staticKeyword.Constructor;

public class StudentObject {

	public static void main(String[] args) {
		
		Student jane = new Student("Jane");
		Student stas = new Student("Stas", 'M');
		Student jessica = new Student("Jessica", 'F', 25);
		
		System.out.println(jane.name);
		System.out.println(jane.age);
		
		System.out.println(stas.name);
		System.out.println(stas.age);
		System.out.println(stas.sex);
		
		System.out.println(jessica.name);
		System.out.println(jessica.sex);
		System.out.println(jessica.age);

	}

}
