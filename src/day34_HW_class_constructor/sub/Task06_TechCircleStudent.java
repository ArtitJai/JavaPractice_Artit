package day34_HW_class_constructor.sub;

import day34_HW_class_constructor.TechCircleStudent;

public class Task06_TechCircleStudent {
	
	public static void main(String[] args) {
		
		TechCircleStudent cohort = new TechCircleStudent("Artit Jaikwang", "TechCircle School", "SDET", 
				"JavaScript", "999", 20, 11, 11, 'M');

		System.out.println(cohort);
		
		cohort.printSchoolName();
		cohort.printSecretCode();
		cohort.attendClass();
		cohort.study();
		
	}
		

}
