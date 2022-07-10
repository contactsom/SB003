package com.simplilearn.mapping;

import java.util.*;

public class Account {

	private int accno;
	private String atype;
	private Double bal;
	Set<Customer> customers;

	public Account() {
	}

	public Account(String atype, Double bal) {
		super();
		this.atype = atype;
		this.bal = bal;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAtype() {
		return atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public Double getBal() {
		return bal;
	}

	public void setBal(Double bal) {
		this.bal = bal;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

}