package day43_11thReview.inclass.Interface;

public interface PrintTable { // abstract method
	
	final static int NUMBER_OF_TIME = 4; // final static by default
	
	void print();
	
	default void printName() { // default method
		System.out.println("My name is Fluke");
		
	}
}
