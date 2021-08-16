package abstructs;

import java.util.Date;

public abstract class Member extends Person {

	protected final static int maxBookBeIssued = 10;
	protected int id;
	protected String type;
	protected Date dateOfjoin;
	protected boolean memberStatus;
	protected double fine;
	protected int noOfBookBorrowed;
	protected int noOfBookReturn;

	public Member() {
		super();
	}

	public Member(int id, String type, Date dateOfjoin, boolean memberStatus, String department, String name,
			String email, String mobile, Date dob) {
		super(name, email, mobile, dob);
		this.id = id;
		this.type = type;
		this.dateOfjoin = dateOfjoin;
		this.memberStatus = memberStatus;
		this.department = department;
	}

	public int getNoOfBookIssued() {
		return noOfBookBorrowed;
	}

	public void setNoOfBookIssued(int noOfBookIssued) {
		this.noOfBookBorrowed += noOfBookIssued;
	}

	private String department;

	public Date getDateOfjoin() {
		return dateOfjoin;
	}

	public void setDateOfjoin(Date dateOfjoin) {
		this.dateOfjoin = dateOfjoin;
	}

	public boolean isMemberStatus() {
		return memberStatus;
	}

	public void setMemberStatus(boolean memberStatus) {
		this.memberStatus = memberStatus;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	// latest 

	public int getNoOfBookBorrowed() {
		return noOfBookBorrowed;
	}

	public void setNoOfBookBorrowed(int noOfBookBorrowed) {
		this.noOfBookBorrowed += noOfBookBorrowed;
	}

	public int getNoOfBookReturn() {
		return noOfBookReturn;
	}

	public void setNoOfBookReturn(int noOfBookReturn) {
		this.noOfBookReturn += noOfBookReturn;
	}

	
	
}
