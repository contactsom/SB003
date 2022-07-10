package com.simpliearn.mapping;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	
	@Column(name="cname")
	private String cname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="dob")
	Date dob;
	
	@Column(name="phone")
	Long phone;

	@ManyToMany
	@JoinTable(name = "cust_acc", joinColumns = @JoinColumn(name = "cid", referencedColumnName = "cid"), inverseJoinColumns = @JoinColumn(name = "accno", referencedColumnName = "accno"))
	Set<Account> accounts;// ***

	public Customer() {
	}

	public Customer(String cname, String email, Date dob, Long phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

}
