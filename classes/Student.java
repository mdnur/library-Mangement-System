package classes;

import java.util.Date;

import abstructs.Member;

public class Student extends Member {

	private int student_college_id;

	public Student(int student_college_id, int id, Date dateOfjoin, boolean memberStatus, String department,
			String name, String email, String mobile, Date dob) {
		super(id, "student", dateOfjoin, memberStatus, department, name, email, mobile, dob);
		this.student_college_id = student_college_id;
	}

	public Student() {
		super();
		this.type = "student";
	}

	public int getStudent_college_id() {
		return student_college_id;
	}

	public void setStudent_college_id(int student_college_id) {
		this.student_college_id = student_college_id;
	}

}
