package day34_HW_class_constructor;

public class TechCircleStudent {

	/*
	 * 6. Create a class named TechCircleStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, 
                schoolName, fieldOfStudy, programmingLanguage, secretCode

 6.1 Add a constructor to initialize all the fields

 6.2 Add a static block to initialize all the statics

 6.3 Create methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
	 */
	static String name;
	String schoolName, fieldsOfStudy, programmingLanguage, secretCode;
	static int age;
	int batchNumber, groupNumber;
	static char gender;
	
//	 6.1 Add a constructor to initialize all the fields
	public TechCircleStudent(String name, String schoolName, String fieldsOfStudy, String programmingLanguage,
			String secretCode, int age, int batchNumber, int groupNumber, char gender) {
		
		super();
		TechCircleStudent.name = name;
		TechCircleStudent.age = age;
		TechCircleStudent.gender = gender;		
		this.schoolName = schoolName;
		this.fieldsOfStudy = fieldsOfStudy;
		this.programmingLanguage = programmingLanguage;
		this.secretCode = secretCode;
		this.batchNumber = batchNumber;
		this.groupNumber = groupNumber;
	}
	
//	6.2 Add a static block to initialize all the statics
	static {
		
		name = "Luke Skywalker";
		
		gender = 'M';
		
		age = 20;
		
		System.out.println("Name from static block : " + name);
		System.out.println("Gender from static block : " + gender);
		System.out.println("Age from static block : " + age);
	}
	
//	6.3 printSchoolName();
	public void printSchoolName() {
		System.out.println("School Name: " + this.schoolName);
	}

//	6.3 printSecretCode();
	public void printSecretCode() {
		System.out.println("Secret Code: " + this.secretCode.toUpperCase());
	}

//	6.3 attendClass():
	public void attendClass() {
		System.out.println(
				TechCircleStudent.name + " is attending " + this.programmingLanguage + " Class at " + this.schoolName);
	}

//	6.3 study()
	public void study() {
		System.out.println(TechCircleStudent.name + " is studying in " + this.fieldsOfStudy);
	}

	@Override
	public String toString() {
		return "TechCircleStudent [schoolName=" + schoolName + ", fieldsOfStudy=" + fieldsOfStudy
				+ ", programmingLanguage=" + programmingLanguage + ", secretCode=" + secretCode + ", batchNumber="
				+ batchNumber + ", groupNumber=" + groupNumber + "]";
	}
	
	
	
}
