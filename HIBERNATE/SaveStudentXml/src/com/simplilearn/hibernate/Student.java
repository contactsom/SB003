package com.simplilearn.hibernate;

public class Student {

	private int sid  ;
	private String sname; 
	private String semail ;
	private long sphone ;
	private String scity ;
	private double sbal;
	
	
	public Student() {
		super();
	}
	
	public Student(String sname, String semail, long sphone, String scity, double sbal) {
		super();
		this.sname = sname;
		this.semail = semail;
		this.sphone = sphone;
		this.scity = scity;
		this.sbal = sbal;
	}
	
	public Student(int sid, String sname, String semail, long sphone, String scity, double sbal) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.sphone = sphone;
		this.scity = scity;
		this.sbal = sbal;
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

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public long getSphone() {
		return sphone;
	}

	public void setSphone(long sphone) {
		this.sphone = sphone;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public double getSbal() {
		return sbal;
	}

	public void setSbal(double sbal) {
		this.sbal = sbal;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", sphone=" + sphone + ", scity="
				+ scity + ", sbal=" + sbal + "]";
	}
	
	
}
