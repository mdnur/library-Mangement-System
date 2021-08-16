package classes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import abstructs.Book;
import abstructs.Member;
import interfaces.BookManagement;
import interfaces.MemberManagement;

public class LibraryManagement implements BookManagement, MemberManagement {
	private ArrayList<Member> members = new ArrayList<Member>();
	private ArrayList<Book> books = new ArrayList<Book>();
	private static SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public void AddMember(Member member) {
		boolean bool = members.add(member);
		if (bool) {
			System.out.println("Member add successfully");
		} else {
			System.out.println("Something went wrong");
		}
	}

	@Override
	public void showAllMember() {
		for (Member member : members) {
			System.out.println("Member id : " + member.getId());
			System.out.println("Member Name : " + member.getName());
			System.out.println("Member Email : " + member.getEmail());
			System.out.println("Member Mobile : " + member.getMobile());
			System.out.println("Member Date of birth : " + sdformat.format(member.getDob()));
			System.out.println("Member Type : " + member.getType());
			System.out.println("Member Date of Join : " + sdformat.format(member.getDateOfjoin()));
//			System.out.println("Member Status : " + (member.isMemberStatus() == true ? "true" : "False");
			System.out.println("Member Status : " + member.isMemberStatus());
			if (member.getFine() > 0) {
				System.out.println("Member fine : " + member.getFine());
			}

			System.out.println("Member No Of Book Issued : " + member.getNoOfBookIssued());
			System.out.println("");
		}

	}
	public boolean getMember(int id) {
		for (Member member : members) {
			if (member.getId() == id) {
				return true;
			}else {
				System.out.println("Member not found");
				return false;
			}
		}
		return false;
	}

	@Override
	public void removeMember(int id) {
		for (Member member : members) {
			if (member.getId() == id) {
				members.remove(member);
				System.out.println("last deleted member id is : " + id);
			}else {
				System.out.println("Member not found");
			}
		}

	}
	@Override
	public Member searchMember(int id) {
		for (Member member : members) {
			if (member.getId() == id) {
				return member;
			}
		}
		return null;

	}
	
	@Override
	public void AddBook(Book book) {
		boolean bool = books.add(book);
		if (bool) {
			System.out.println("Book added successfully");
		} else {
			System.out.println("Something went wrong");
		}

	}

	@Override
	public void showAllBook() {
		for (Book book : books) {
			System.out.println("Book id : " + book.getId());
			System.out.println("Book Isbn : " + book.getIsbn());
			System.out.println("Book Author Name : " + book.getAuthorName());
			System.out.println("Book Title : " + book.getBookTitle());
			System.out.println("Book Available Quantity : " + book.getAvailableQuantity());
			System.out.println("");

		}

	}

	@Override
	public void removeBook(int id) {
		for (Book book : books) {
			if (book.getId() == id) {
				books.remove(book);
				System.out.println("last deleted book id is : " + id);
			}
		}
	}

	public boolean getBook(int id) {
		for (Book book : books) {
			if (book.getId() == id) {
				return true;
			}else {
				System.out.println("Book not found");
				return false;
			}
		}
		return false;
	}

	@Override
	public Book searchBook(int isbn) {
		for (Book book : books) {
			if (book.getId() == isbn) {
				return book;
			}
		}
		return null;
	}

}
