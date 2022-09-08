package day37_inheritance.book;

public class PaperBook extends Book{
	
	// instance variable pageNumber
	// instance method read()
	// toString method
	// paper book inherited  title, type, author, price; instance variable from book class.

	int pageNumber;
	
	public PaperBook() {}

	public PaperBook(String title, String type, String author, double price, int pageNumber) {
		super(title, type, author, price);
		this.pageNumber = pageNumber;
	}
	
	public void read() {
		System.out.println("Reading " + super.getTitle());
	}

//	super.toString() reading toString method from Book Class.
	@Override
	public String toString() {
		return super.toString() + "page number : " + pageNumber;
	}

}
