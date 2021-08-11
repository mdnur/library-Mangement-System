package interfaces;

import abstructs.Book;

public interface BookMangement {

	public void AddBook(Book book);

	public void showAllBook();

	public void removeBook(int id);

	public Book searchBook(int isbn);
}
