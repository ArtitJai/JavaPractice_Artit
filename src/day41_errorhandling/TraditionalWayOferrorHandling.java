package day41_errorhandling;

import day40_interface_abstract.employees.EmployeeObject;
import day40_interface_abstract.employees.Tester;

public class TraditionalWayOferrorHandling {

	public static void main(String[] args) {
		
		int a, b;
		a = 7;
		b = 0;
		
		if(b != 0) {
		System.out.println("Result : " + a/b);
		}
		else {
		System.out.println("B is zero");
		}
		
		System.out.println("Program reached this line?");
		
		String name = null;
		if(name != null) {
		System.out.println(name.length());
		}
		else {
			System.out.println("Value of name is null");
		}
		
		System.out.println("Program reached this line 30");
		
		Tester e = new Tester();
		
		if(e != null)
		e.work();
		
		
	}

}
