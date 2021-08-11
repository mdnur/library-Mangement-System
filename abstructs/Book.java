package abstructs;

public abstract class Book {

	protected int id;
	protected String isbn;
	protected String bookTitle;
	protected String authorName;
	protected int availableQuantity;

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Book() {

	}

	public Book(int id, String isbn, String bookTitle, String authorName, int availableQuantity) {
		this.id = id;
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.availableQuantity = availableQuantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void addQuantity(int amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Amout can not be nagive number");
		} else {
			this.availableQuantity += amount;
		}

	}

}
