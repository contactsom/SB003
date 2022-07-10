package com.simplilearn.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DATA")
public class Student {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="STUDENT_ID")
		int sid;
		
		@Column(name="STUDENT_NAME")
		String sname;
		
		@Column(name="STUDENT_EMAIL")
		String semail;
		
		@Column(name="STUDENT_PHONE")
		String sphone;
		
		@OneToOne()
		@JoinColumn(name="aid")
		Address address;
		//ONE STUDENT HAVE ONLY ONE Address - TRUE
		
		public Student() {
			super();
		}

		public Student(String sname, String semail, String sphone, Address address) {
			super();
			this.sname = sname;
			this.semail = semail;
			this.sphone = sphone;
			this.address = address;
		}
		
		
		
		public Student(int sid, String sname, String semail, String sphone, Address address) {
			super();
			this.sid = sid;
			this.sname = sname;
			this.semail = semail;
			this.sphone = sphone;
			this.address = address;
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

		public String getSphone() {
			return sphone;
		}

		public void setSphone(String sphone) {
			this.sphone = sphone;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", sphone=" + sphone
					+ ", address=" + address + "]";
		}
		
		
		
		
		
}
