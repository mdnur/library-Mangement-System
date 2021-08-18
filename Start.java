import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import abstructs.Book;
import abstructs.Member;
import classes.AboutUs;
import classes.BorrowBook;
import classes.Faculty;
import classes.Librarian;
import classes.Admin;
import classes.LibraryManagement;
import classes.Student;
import classes.book.FictionBook;
import classes.book.StoryBook;
import classes.book.TextBook;

public class Start {
	private static SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");

	public static void main(String[] args) throws ParseException {

		LibraryManagement lM = new LibraryManagement();
		Scanner sc = new Scanner(System.in);
		Admin admin = new Admin("admin", "password");
		System.out.print("Enter Admin User Name:");
		String adminUser = sc.next();

		System.out.print("Enter Admin User password: ");
		String adminPass = sc.next();
		if (admin.getUsername().equals(adminUser) && admin.getPassword().equals(adminPass)) {
			System.out.println("You granted access");
		} else {
			System.out.println("Username or password are invalid");
			sc.close();
			return;
		}

		Book book1 = new TextBook(1, "0135166306", "Core Java Volume I--Fundamentals", "Cay S. Horstmann", 50);

		Book book3 = new TextBook(2, "3689656869", "Java: A Beginner’s Guide", "Herbert Schildt", 90);
		Book book4 = new TextBook(3, "989787563", "Head First Java", "Kathy Sierra & Bert Bates", 12);
		Book book5 = new TextBook(4, "878784525474", "Java Performance: The Definite Guide", "Scott Oaks", 54);

		Book sBook1 = new StoryBook();
		sBook1.setId(5);
		sBook1.setIsbn("1593275994");
		sBook1.setBookTitle("Clean Code");
		sBook1.setAuthorName("Robert C. Martin");
		sBook1.setAvailableQuantity(50);

		lM.AddBook(book1);
		// lM.AddBook(book2);
		lM.AddBook(book3);
		lM.AddBook(book4);
		lM.AddBook(book5);
		lM.AddBook(sBook1);

		Student s1 = new Student(1, 1, sdformat.parse("12/12/2020"), true, "CSE", "Mohammad Nur", "mdnur701@gmail.com",
				"0185990333", sdformat.parse("21/03/2002"));
		Student s2 = new Student(2, 2, sdformat.parse("13/12/2020"), true, "CSE", "zuba", "mdnur701@gmail.com",
				"0185990333", sdformat.parse("21/03/2002"));
		Student s3 = new Student(3, 3, sdformat.parse("15/12/2020"), true, "CSE", "ta ", "mdnur701@gmail.com",
				"0185990333", sdformat.parse("21/03/2002"));
		Student s4 = new Student(4, 4, sdformat.parse("21/12/2020"), true, "CSE", "fasfd ", "mdnur701@gmail.com",
				"0185990333", sdformat.parse("21/03/2002"));

		Student s5 = new Student(5, 5, sdformat.parse("1/12/2020"), true, "CSE", "fadfa ", "mdnur701@gmail.com",
				"0185990333", sdformat.parse("21/03/2002"));

		lM.AddMember(s1);
		lM.AddMember(s2);
		lM.AddMember(s3);
		lM.AddMember(s4);
		lM.AddMember(s5);
		Member member1 = lM.searchMember(2);

		// if (member1 != null) {
		// System.out.println("Member id : " + member1.getId());
		// System.out.println("Member Name : " + member1.getName());
		// System.out.println("Member Email : " + member1.getEmail());
		// System.out.println("Member Mobile : " + member1.getMobile());
		// System.out.println("Member Date of birth : " + member1.getDob());
		// System.out.println("Member Type : " + member1.getType());
		// System.out.println("Member Date of Join : " + member1.getDateOfjoin());
		// System.out.println("Member Status : " + (member.isMemberStatus() == true ?
		// "true" : "False");
		// System.out.println("Member Status : " + member1.isMemberStatus());
		// if (member1.getFine() > 0) {
		// System.out.println("Member fine : " + member1.getFine());
		// }

		// System.out.println("Member No Of Book Issued : " +
		// member1.getNoOfBookIssued());
		// System.out.println("");
		// }

		Librarian lib = new Librarian();

		BorrowBook is1 = new BorrowBook(1, "for 10 days", sBook1, sdformat.parse("21/03/2002"),
				sdformat.parse("10/25/2021"), member1);

		System.out.println("\t\t\t Welcome to Sample Library Management Application");
		System.out.println("\t Developed By Mohammad Nur, Sirajus Salehin,Md. Reasat Ahmed, Mir Ashiqul Haque");
		boolean choice = true;

		while (choice) {
			System.out.println("Here are Some Options for You: \n");
			System.out.println("	1. Student Management");
			System.out.println("	2. Faculty Management");
			System.out.println("	3. Book Management");
			System.out.println("	4. Borrow Book ");
			System.out.println("	5. About Us");
			System.out.println("	6. Exit the Application\n");
			System.out.print("What do you want to do? : ");

			int first = sc.nextInt();

			switch (first) {
				case 1:

					System.out.println("You have selected Member Management");
					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New Student Profile");
					System.out.println("	2. Remove Existing Student");
					System.out.println("	3. Search Student");
					System.out.println("	4. See all Student Member");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second1 = sc.nextInt();

					switch (second1) {
						case 1:

							System.out.println("You have Selected to create a new Student\n");

							System.out.print("Enter Student Id: ");
							int studentId = sc.nextInt();

							System.out.print("Enter Student Name: ");
							String name = sc.next();

							System.out.print("Enter Student Date of Birth : ");
							String dob = sc.next();

							System.out.print("Enter Student Mobile no: ");
							String mobile = sc.next();

							System.out.print("Enter Student Email: ");
							String email = sc.next();

							System.out.print("Enter Student date Of join (dd/mm/yyy): ");
							String dateOfJoin = sc.next();

							System.out.print("Enter Student college Id : ");
							int ScollegeID = sc.nextInt();

							Student e = new Student();
							e.setStudent_college_id(studentId);
							e.setName(name);
							e.setId(studentId);
							e.setDob(sdformat.parse(dob));
							e.setMobile(mobile);
							e.setEmail(email);
							e.setDateOfjoin(sdformat.parse(dateOfJoin));
							e.setStudent_college_id(ScollegeID);
							lM.AddMember(e);

							break;

						case 2:

							System.out.println("You have Selected to remove an existing Student");
							System.out.print("Enter Member Id: ");
							lM.removeMember(sc.nextInt());

							break;
						case 3:

							System.out.println("You have Selected to Search a Student");
							System.out.print("Enter Member Id: ");
							int searchId = sc.nextInt();
							Member searchData = lM.searchMember(searchId);
							if (searchData != null) {
								lM.showMember(searchData);
							} else {
								System.out.println("Student not found");
							}

							break;

						case 4:

							System.out.println("You have Selected to see all Members");

							lM.showAllMember();

							break;

						case 5:

							System.out.println("You have Selected to Go Back");
							break;

						default:

							System.out.println("Invalid Input");
							break;
					}

					break;

				case 2:

					System.out.println("You have selected Faculty Management");

					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Create New Faculty Profile");
					System.out.println("	2. Remove Existing Faculty");
					System.out.println("	3. Search Faculty");
					System.out.println("	4. See all Faculty Profile");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second2 = sc.nextInt();

					switch (second2) {
						case 1:

							System.out.print("Enter Member Id: ");
							int facultyId = sc.nextInt();

							System.out.print("Enter Member Name: ");
							String name = sc.next();

							System.out.print("Enter Member Date of Birth (dd/mm/yyy): ");
							String dob = sc.next();

							System.out.print("Enter Member Mobile no: ");
							String mobile = sc.next();

							System.out.print("Enter Member Email: ");
							String email = sc.next();

							System.out.print("Enter Member date Of join (dd/mm/yyy): ");
							String dateOfJoin = sc.next();

							System.out.print("Enter Member position : ");
							String position = sc.next();

							System.out.print("Enter Member college Teacher Id : ");
							int FCollegeTeacherID = sc.nextInt();

							Faculty e = new Faculty();
							e.setCollege_teacher_id(FCollegeTeacherID);
							e.setName(name);
							e.setId(facultyId);
							e.setDob(sdformat.parse(dob));
							e.setMobile(mobile);
							e.setEmail(email);
							e.setDateOfjoin(sdformat.parse(dateOfJoin));
							e.setPosition(position);
							lM.AddMember(e);

							break;

						case 2:

							System.out.print("Enter Member id: ");
							int nid2 = sc.nextInt();
							lM.removeMember(nid2);
							break;
						case 3:

							System.out.println("You have Selected to Search a Faculty");
							System.out.print("Enter Faculty Id: ");
							int searchId = sc.nextInt();
							Member searchData = lM.searchMember(searchId);
							if (searchData != null) {
								lM.showMember(searchData);
							} else {
								System.out.println("Student not found");
							}

						case 4:

							lM.showAllMember();
							break;

						case 5:

							System.out.println("Going Back . . .");
							break;

						default:

							System.out.println("Invalid Input");
							break;
					}

					break;

				case 3:

					System.out.println("You have selected Book Management ");

					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Add Book");
					System.out.println("	2. Remove Existing Book");
					System.out.println("	3. Search Book");
					System.out.println("	4. See all Book");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second3 = sc.nextInt();

					switch (second3) {
						case 1:
							System.out.println("There are 3 types of Book: ");
							System.out.println("	1. Text Book");
							System.out.println("	2. Story Book");
							System.out.println("	3. Fiction Book");
							System.out.println("	4. Go Back\n");
							System.out.print("What do you want to do? : ");

							int type = sc.nextInt();

							if (type == 1) {
								System.out.print("Enter Book Id: ");
								int bookID = sc.nextInt();

								System.out.print("Enter Book ISBN: ");
								String isbn = sc.next();

								System.out.print("Enter Book Title : ");
								String title = sc.next();

								System.out.print("Enter Book Author Name: ");
								String authorName = sc.next();

								System.out.print("Enter Book AvailableQuantity: ");
								int availableQuantity = sc.nextInt();

								Book e = new TextBook();
								e.setId(bookID);
								e.setIsbn(isbn);
								e.setBookTitle(title);
								e.setAuthorName(authorName);
								e.setAvailableQuantity(availableQuantity);
								lM.AddBook(e);

								break;

							} else if (type == 2) {

								System.out.print("Enter Book Id: ");
								int bookID = sc.nextInt();

								System.out.print("Enter Book ISBN: ");
								String isbn = sc.next();

								System.out.print("Enter Book Title : ");
								String title = sc.next();

								System.out.print("Enter Book Author Name: ");
								String authorName = sc.next();

								System.out.print("Enter Book AvailableQuantity: ");
								int availableQuantity = sc.nextInt();

								Book e = new StoryBook();
								e.setId(bookID);
								e.setIsbn(isbn);
								e.setBookTitle(title);
								e.setAuthorName(authorName);
								e.setAvailableQuantity(availableQuantity);
								lM.AddBook(e);

								break;
							} else if (type == 3) {
								System.out.print("Enter Book Id: ");
								int bookID = sc.nextInt();

								System.out.print("Enter Book ISBN: ");
								String isbn = sc.next();

								System.out.print("Enter Book Title : ");
								String title = sc.next();

								System.out.print("Enter Book Author Name: ");
								String authorName = sc.next();

								System.out.print("Enter Book AvailableQuantity: ");
								int availableQuantity = sc.nextInt();

								Book e = new FictionBook();
								e.setId(bookID);
								e.setIsbn(isbn);
								e.setBookTitle(title);
								e.setAuthorName(authorName);
								e.setAvailableQuantity(availableQuantity);
								lM.AddBook(e);

								break;
							} else if (type == 4) {
								System.out.print("Going Back . . .");
							} else {
								System.out.println("Invalid Input");
							}

						case 2:

							System.out.print("Enter Book Id: ");
							int id = sc.nextInt();

							lM.removeBook(id);

							break;
						case 3:

							System.out.println("You have Selected to Search a Book");
							System.out.print("Enter book Id: ");
							int searchId = sc.nextInt();
							Book searchData = lM.searchBook(searchId);
							if (searchData != null) {
								lM.showBook(searchData);
							} else {
								System.out.println("Book not found");
							}

							break;

						case 4:

							lM.showAllBook();
							break;

						case 5:

							System.out.println("Going Back . . .");
							break;

						default:

							System.out.println("Invalid Input");
							break;
					}

					break;

				case 4:
					System.out.println("You have selected Borrow Book");
					System.out.println("Here are Some Options for You: \n");
					System.out.println("	1. Add Issue Book");
					System.out.println("	2. Search Issues");
					System.out.println("	3. returnBook");
					System.out.println("	4. Delete Issues ");
					System.out.println("	5. Go Back\n");
					System.out.print("What do you want to do? : ");
					int second4 = sc.nextInt();

					switch (second4) {
						case 1:

							System.out.print("Enter issues ID : ");
							int issuesID = sc.nextInt();

							System.out.print("Enter issued Description : ");
							String issuedDescription = sc.next();

							System.out.print("Enter issued Member ID : ");
							int issuesMemberID = sc.nextInt();

							System.out.print("Enter issued Book ID : ");
							int issuedBookID = sc.nextInt();

							System.out.print("Enter issued Member ID : ");
							String issueDate = sc.next();

							if (lib.hasMemberAndBookIdThere(issuesMemberID, issuedBookID)) {
								BorrowBook bb = new BorrowBook();
								bb.setIssuesID(issuesID);
								bb.setIssuedDiscription(issuedDescription);
								bb.setIssuedMember(lM.searchMember(issuesMemberID));
								// lM.searchMember(issuesMemberID).setNoOfBookBorrowed(noOfBookBorrowed);

								bb.setIssuesBook(lM.searchBook(issuedBookID));
								bb.setIssueDate(sdformat.parse(issueDate));
								lib.addIssues(bb);

							} else {
								System.out.println("Member ID or Book ID not found");
							}

							break;

						case 2:

							System.out.print("Enter Issue Id: ");
							int issueID = sc.nextInt();

							BorrowBook getByID = lib.searchIssues(issueID);
							if (getByID != null) {
								System.out.println("--From the search--");
								System.out.println("Borrow Book Issue Id : " + getByID.getIssuesID());
								System.out.println("Borrow Book issues Renew Date : " + getByID.getIssuesRenew());
								System.out
										.println("Borrow Book issued Description  : " + getByID.getIssuedDiscription());
								System.out
										.println("Borrow Book issuesMemberID  : " + getByID.getIssuedMember().getId());
								System.out.println("Borrow Book issueDate : " + getByID.getIssueDate());
								System.out.println("Borrow Book issuedExpiryDate  : " + getByID.getIssuedExpiryDate());
								System.out.println("Borrow Book Return Book status: " + getByID.isReturnBook());
								System.out.println("Borrow Book Return Date  : " + getByID.getReturnDate());
								System.out.println("Borrow Book issued Book ID   : " + getByID.getIssuesBook().getId());
							} else {
								System.out.println("Issues Book id not found");
							}

							break;

						case 3:

							System.out.print("Enter  Borrow Book Issue Id: ");
							int id = sc.nextInt();

							System.out.print("Enter Return date: ");
							String returnDate = sc.next();

							boolean check = lib.returnBook(id, sdformat.parse(returnDate));
							if (check) {
								System.out.println("return book successfully");
							}

							break;

						case 4:

							System.out.print("Enter Issue Id: ");
							int isID = sc.nextInt();

							lib.deleteIssues(isID);
							break;

						case 5:

							System.out.println("You have Selected to Go Back");
							break;

						default:

							System.out.println("Invalid Input");
							break;
					}
					break;
				case 5:
					System.out.println("you have selected about us");

					new AboutUs();
					break;
				case 6:
					sc.close();
					System.out.println("You have selected to exit the application");
					System.out.println("Thank you for using Application");
					choice = false;
					break;

				default:

					System.out.println("Invalid Input");
					break;
			}
		}

	}

}
