package day37_inheritance.book;

public class Book {

	private String title, type, author;
	private double price;

	
	// Encapsulate the book class.
	// Create constructor to assign value to all the instance variables
	// Create toString method.
	
	public Book() {}
	public Book(String title, String type, String author, double price) {
		//super(); // refer to super class default constructor
		this.title = title;
		this.type = type;
		this.author = author;
		this.price = price;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Book [title=" + title + ", type=" + type + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
