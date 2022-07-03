package com.simplilearn.ahibernate;

import javax.persistence.*;

@Entity /* This is to define the Entity class*/
@Table(name="customers") /*This is to define the Table name for the class*/
public class Customer {
	
	@Id /*This is to define the PK*/
	@GeneratedValue(strategy=GenerationType.AUTO)	/*THis is to do the auto increment of PK */
	@Column(name="cid")/*To provide the custom table column name*/
	private int cid;
	
	@Column(name="cname") /*To provide the custom table column name*/
	private String cname;
	
	@Column(name="email") /*To provide the custom table column name*/
	private String email;
	
	@Column(name="phone") /*To provide the custom table  column name*/
	private long phone;
	
	@Column(name="city") /*To provide the custom table  column name*/
	private String city;
	
	@Column(name="bal") /*To provide the custom table  column name*/
	private double bal;
	
	public Customer() {	}

	public Customer(String cname, String email, long phone, String city,double bal) {

		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
	}

	public Customer(int cid, String cname, String email, long phone,
			String city, double bal) {

		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.bal = bal;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", city=" + city
				+ ", bal=" + bal + "]";
	}

}
