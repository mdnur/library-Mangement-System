package classes;

import java.util.Date;

import abstructs.Member;

public class Faculty extends Member {
	private String position;
	private int college_teacher_id;

	public Faculty() {
		super();
	}

	public Faculty(String position, int college_teacher_id, int id, String type, Date dateOfjoin,
			boolean memberStatus, double fine, String department, String name, String email, String mobile,
			Date dob) {
		super(id, type, dateOfjoin, memberStatus, department, name, email, mobile, dob);
		this.position = position;
		this.college_teacher_id = college_teacher_id;
	}

	public int getCollege_teacher_id() {
		return college_teacher_id;
	}

	public void setCollege_teacher_id(int college_teacher_id) {
		this.college_teacher_id = college_teacher_id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
