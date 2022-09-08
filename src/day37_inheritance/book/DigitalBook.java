package day37_inheritance.book;

public class DigitalBook extends Book {
	
	public DigitalBook() {}
	
	public DigitalBook(String title, String type, String author, double price) {
		super(title, type, author, price);
	}

	public void read() {
		System.out.println("Reading " + super.getTitle());
	}
	
	public void printInfo() {
		System.out.println(super.toString());
	}
}
