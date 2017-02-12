package test;

public class Book {

	String bookTitle;
    double price;
	
	public String getBookTitle(){
		return this.bookTitle;
	}
	
	public double getPrice(){
		return this.price;
	}
	
    public Book(String bookTitle, double price) {
        this.bookTitle = bookTitle;
        this.price = price;
    }
}
