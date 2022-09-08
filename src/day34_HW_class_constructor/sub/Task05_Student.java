package day34_HW_class_constructor.sub;

import day34_HW_class_constructor.Student;

public class Task05_Student {

	public static void main(String[] args) {
		
		Student nobita = new Student("Nobita", 'M', 300, "1234-123-12345", 'A');
		
		System.out.println(nobita.toString());
		
//		System.out.println(nobita);
		
		nobita.study();
		
	}

}
