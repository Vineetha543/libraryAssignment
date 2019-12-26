package book;

public class Book {
	private String bookTitle;

	public Book(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Override 
	public String toString() {
		return this.bookTitle;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

}
