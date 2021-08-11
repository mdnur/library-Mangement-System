package classes.book;

import abstructs.Book;

public class FictionBook extends Book {

	public FictionBook() {
		super();
	}

	public FictionBook(int id, String isbn, String bookTitle, String authorName, int availableQuantity) {
		super(id, isbn, bookTitle, authorName, availableQuantity);
	}

}
