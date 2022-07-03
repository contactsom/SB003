package com.simplilearn.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int sid; // PK
	private String sname;
	private String dob;
	private String qualification;
	private String[] course; /*Table courses*/ 
	private List<String> emails;/*Table emails*/ 
	private List<Integer> marks;
	private Set<Long> phone;
	
	private Map<String,Long> referance;
	
	public Student() {
		super();
	}
	
	public Student(String sname, String dob, String qualification, String[] course, List<String> emails,
			List<Integer> marks, Set<Long> phone, Map<String, Long> referance) {
		super();
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
		this.course = course;
		this.emails = emails;
		this.marks = marks;
		this.phone = phone;
		this.referance = referance;
	}
	
	public Student(int sid, String sname, String dob, String qualification, String[] course, List<String> emails,
			List<Integer> marks, Set<Long> phone, Map<String, Long> referance) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
		this.course = course;
		this.emails = emails;
		this.marks = marks;
		this.phone = phone;
		this.referance = referance;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<Long> getPhone() {
		return phone;
	}

	public void setPhone(Set<Long> phone) {
		this.phone = phone;
	}

	public Map<String, Long> getReferance() {
		return referance;
	}

	public void setReferance(Map<String, Long> referance) {
		this.referance = referance;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", dob=" + dob + ", qualification=" + qualification
				+ ", course=" + Arrays.toString(course) + ", emails=" + emails + ", marks=" + marks + ", phone=" + phone
				+ ", referance=" + referance + "]";
	}
	
	
}


