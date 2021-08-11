package classes;

import java.util.Date;

import abstructs.Book;
import abstructs.Member;

public class BorrowBook {

	private int issuesID;
	private Date issuesRenew = null;
	private String issuedDiscription;
	private Book issuesBook;
	private Date issueDate;
	private Date issuedExpiryDate = null;
	private boolean returnBook = false;
	private Date returnDate = null;
	private Member issuedMember;

	public BorrowBook() {
	}

	public BorrowBook(int issuesID, String issuedDiscription, Book issuesBook, Date issueDate, Date issuedExpiryDate,
			Member issuedMember) {
		this.issuesID = issuesID;
		this.issuedDiscription = issuedDiscription;
		this.issuesBook = issuesBook;
		this.issueDate = issueDate;
		this.issuedExpiryDate = issuedExpiryDate;
		this.issuedMember = issuedMember;
	}

	public int getIssuesID() {
		return issuesID;
	}

	public void setIssuesID(int issuesID) {
		this.issuesID = issuesID;
	}

	public Date getIssuesRenew() {
		return issuesRenew;
	}

	public void setIssuesRenew(Date issuesRenew) {
		this.issuesRenew = issuesRenew;
	}

	public String getIssuedDiscription() {
		return issuedDiscription;
	}

	public void setIssuedDiscription(String issuedDiscription) {
		this.issuedDiscription = issuedDiscription;
	}



	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getIssuedExpiryDate() {
		return issuedExpiryDate;
	}

	public void setIssuedExpiryDate(Date issuedExpiryDate) {
		this.issuedExpiryDate = issuedExpiryDate;
	}

	public Member getIssuedMember() {
		return issuedMember;
	}

	public void setIssuedMember(Member issuedMember) {
		this.issuedMember = issuedMember;
	}

	public boolean isReturnBook() {
		return returnBook;
	}

	public void setReturnBook(boolean returnBook) {
		this.returnBook = returnBook;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Book getIssuesBook() {
		return issuesBook;
	}

	public void setIssuesBook(Book issuesBook) {
		this.issuesBook = issuesBook;
	}
	
	

}
