package com.simplilearm.acollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sid")
	private int sid; // PK
	
	@Column(name = "sname")
	private String sname;
	
	@Column(name = "dob")
	private String dob;
	
	@Column(name = "quali")
	private String qualification;
	
	@CollectionOfElements
	@JoinTable(name = "courses",joinColumns = @JoinColumn(name="sid"))
	@IndexColumn(name="idx")
	@Column(name="cname")
	private String[] course; /*Table courses*/ 
	
	
	@CollectionOfElements
	@JoinTable(name = "emails",joinColumns = @JoinColumn(name="sid"))
	@IndexColumn(name="idx")
	@Column(name="emailId")
	private List<String> emails;/*Table emails*/ 
	
	
	@CollectionOfElements
	@JoinTable(name = "marks",joinColumns = @JoinColumn(name="sid"))
	@Column(name="marks")
	private List<Integer> marks;
	
	
	@CollectionOfElements
	@JoinTable(name = "phones",joinColumns = @JoinColumn(name="sid"))
	@Column(name="phoneNo")
	private Set<Long> phone;
	
	@CollectionOfElements
	@JoinTable(name = "referance",joinColumns = @JoinColumn(name="sid"))
	@Column(name="rphone")
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


