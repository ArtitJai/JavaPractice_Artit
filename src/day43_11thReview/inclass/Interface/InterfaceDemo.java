package day43_11thReview.inclass.Interface;

public class InterfaceDemo {
//	Interface = contract of the class
//	- have inheritance, abstraction, polymorphism concepts
//	- 100% abstraction
//	- have public abstract method by default
//	- use when you having action (method) 
//	  that you want many unrelated class to implements.
	
	public static void main(String[] args) {
		
//		PrintTable print = new PrintTable(); => this will not work
		PrintTable printing = new ParkingStation();
		printing.print();
		printing.printName();
		System.out.println(PrintTable.NUMBER_OF_TIME);
		OfficePrinter oPrint = new OfficePrinter();
		oPrint.print();
		
	}
}
