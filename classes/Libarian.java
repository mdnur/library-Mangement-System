package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import abstructs.Member;
import abstructs.UserAbstract;
import interfaces.IssueBookAble;

public class Libarian extends UserAbstract implements IssueBookAble {
	private ArrayList<BorrowBook> issuesbooks = new ArrayList<BorrowBook>();
	private static SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public void addIssues(BorrowBook issuesBook) {
		boolean bool = issuesbooks.add(issuesBook);
		if (bool) {
			System.out.println("Issuesed Book succesfully");
			issuesBook.getIssuedMember().setNoOfBookIssued(1);
		} else {
			System.out.println("Something went wrong");
		}

	}

	@Override
	public BorrowBook searchIssues(int issuesID) {
		for (BorrowBook issuesbook : issuesbooks) {
			if (issuesbook.getIssuesID() == issuesID) {
				return issuesbook;
			}
		}
		return null;

	}

	@Override
	public void deleteissues(int issuesID) {
		for (BorrowBook issuesbook : issuesbooks) {
			if (issuesbook.getIssuesID() == issuesID) {
				issuesbooks.remove(issuesbook);
				System.out.println("issued  book history is deleted id: " + issuesID);
			}
		}

	}

	@Override
	public boolean returnBook(int issuesID, Date returnDate) {
		for (BorrowBook issuesbook : issuesbooks) {
			if (issuesbook.getIssuesID() == issuesID && issuesbook.getReturnDate() != null) {
				checkExpired(issuesbook, returnDate);
				issuesbook.setReturnBook(true);
				issuesbook.setReturnDate(returnDate);
				return true;
			}
		}
		return false;

	}

	public boolean hasMemberAndBookIdThere(int MemberID, int bookID) {
		LibraryManagement lM = new LibraryManagement();
		if (lM.getMember(MemberID) && lM.getBook(bookID)) {
			return true;
		}
		return false;
	}

	public void checkExpired(BorrowBook issuesbook, Date returnDate) {
		if (issuesbook.getIssuedExpiryDate().compareTo(returnDate) < 0) {
			issuesbook.getIssuedMember().setNoOfBookReturn(1);
			System.out.println("Return book done");
			return;
		}
		
		issuesbook.getIssuedMember().setFine(10);
		issuesbook.getIssuedMember().setNoOfBookReturn(1);
		issuesbook.getIssuedMember().setNoOfBookBorrowed(-1);
		System.out.println("fine for late submission");
	}

}
