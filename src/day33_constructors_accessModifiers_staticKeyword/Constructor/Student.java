package day33_constructors_accessModifiers_staticKeyword.Constructor;

public class Student {


	    String name;
	    char sex;
	    int age;
	    String color;
	    
	    
	    public Student() {}
	    
	    public Student(String name) {
	        this.name = name; // this.instanceVariable = parameter
	    }
	    public Student(String name, char sex) {
	        this.name = name;
	        this.sex = sex;
	    }
	    public Student(String name, char sex, int age) {
	        this.name = name;
	        this.sex = sex;
	        this.age = age;
	    }
	    public Student(String name, char sex, int age, String color) {
	        this.name = name;
	        this.sex = sex;
	        this.age = age;
	        this.color = color;
	    }

    
    //instance method
    public void eat() {
        System.out.println(name+" is eating");
    }
    public void drink() {
        System.out.println(name+" is drinking");
    }
    public void run() {
        System.out.println(name+" is running");
    }
    
    public void sleep() {
        System.out.println(name+" can sleep");
    }
    
    public void code() {
        System.out.println(name+" can code");
    }
    public void study() {
        System.out.println(name + " is learning java");
        
    }
    public void cry() {
        System.out.println(name + " be strong");
        
    }   
}


//		public Student(String name, char sex, int age, String color) {
//		    
//		    this.name = name;
//		    this.sex = sex;
//		    this.age = age;
//		    this.color = color;
//		}
//		
//		public Student() {
//		    
//		    this(" ",' ',0," ");
//		    
//		}
//		
//		public Student(String name, String color) {
//		    
//		    String sColor = color;
//		    String sName = name;
//		    
//		    
//		}
//		
//		
//		
//		
//		}

////instance variables
//String name;
//char sex;
//int age;
//String color;
//String race;
//double high;
//
//
//
//public Student() {
//	System.out.println("This is default constructor of the Student class");
//}
//
//public Student(String sName, char sSex, String sColor) {
//  name = sName;
//  sex = sSex;
//  color = sColor;
//  
//
//}
//
//public Student(String sName, char sSex, String sColor, String racial) {
//	name = sName;
//  sex = sSex;
//  color = sColor;
//  race = racial;
//
//}
//
//public Student(String sName, char sSex, String sColor, String racial, double sHigh) {
//	name = sName;
//  sex = sSex;
//  color = sColor;
//  race = racial;
//  high = sHigh;
//
//}
//
//public Student(String sName, char sSex, String sColor, String racial, double sHigh, int sAge) {
//	name = sName;
//  sex = sSex;
//  color = sColor;
//  race = racial;
//  high = sHigh;
//  age = sAge;
//
//}
//

