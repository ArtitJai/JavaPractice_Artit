package day40_interface_abstract.employees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class EmployeeObject {

	public static void main(String[] args) {
		
		Driver john = new Driver(102, "John", 45000);
		Developer luke = new Developer(103, "Luke", 180000);
		Tester doraemon = new Tester(104, "Doraemon", 125000);
		Teacher dekizugi = new Teacher(105, "Dekizugi", 100000);
		
		john.work();
		System.out.println(john.toString());
		System.out.println();
		
		luke.work();
		luke.writeUnitTest();
		System.out.println(luke.toString());
		System.out.println();
		
		doraemon.bugReport();
		doraemon.work();
		System.out.println(doraemon.toString());
		System.out.println();
		
		dekizugi.work();
		System.out.println(dekizugi.toString());
		
		
//		superClass = new subClass -> override
		
		Employees a = new Tester(106, "Jane", 130000);
		
		Employees b = new Developer(107, "Paul", 185000);
		
		a.work();
		b.work();
		
		ArrayList<Employees>list = new ArrayList<>();
		
		list.addAll(Arrays.asList(john, luke, doraemon, dekizugi, a, b));
		
		for(Employees e : list) {
			e.work();
			e.sleep();
			System.out.println(e.toString());
		}

	}

	

}
