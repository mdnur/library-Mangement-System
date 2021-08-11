package interfaces;

import java.util.Date;

import classes.BorrowBook;

public interface IssueBookAble {
	public void addIssues(BorrowBook issuesBook);

//	public void editIssues(BorrowBook issuesBook);
	public BorrowBook searchIssues(int issuesID);

	public void deleteissues(int issuesID);

	public boolean returnBook(int issuesID, Date returnDate);
}
