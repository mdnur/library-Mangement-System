package classes.book;

import abstructs.Book;

public class TextBook extends Book {

	public TextBook() {
		super();
	}

	public TextBook(int id, String isbn, String bookTitle, String authorName, int availableQuantity) {
		super(id, isbn, bookTitle, authorName, availableQuantity);
	}

}
