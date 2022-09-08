package day37_inheritance.book;

public class AudioBook extends Book {
		
		// make Audio to subclass of the book
//	instance variable
//	length, narrator
	
//	instance method
//	listen();
//	toString method
	
	int length;
	String narrator;
	
	public AudioBook () {}

	public AudioBook(String title, String type, String author, double price, 
			int length, String narrator) {
		
		super(title, type, author, price);
		this.length = length;
		this.narrator = narrator;
	}
	
	public void listen() {
		System.out.println("Listening to " + super.getTitle());
	}

	@Override
	public String toString() {
		return super.toString()+ "length = " + length + ", narrator = " + narrator;
	}
	
	
	
}
