package com.simplilearn.mapping;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS_DATA")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cid")
	int cid;
	
	@Column(name="cname")
	String cname;
	
	@Column(name="email")
	String email;
	
	@Column(name="dob")
	Date dob;
	
	@Column(name="phone")
	Long phone;
	
	@OneToMany(mappedBy = "customer") /* customer: this is the referance/object name mentioned in Order class*/
	Set<Order> order;/*One Customer many Order*/

	
	public Customer() {
		super();
	}
	
	public Customer(String cname, String email, Date dob, Long phone) {
		super();
		this.cname = cname;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
	}
	
	public Customer(String cname, String email, Date dob, Long phone, Set<Order> order) {
		super();
		this.cname = cname;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.order = order;
	}
	
	public Customer(int cid, String cname, String email, Date dob, Long phone, Set<Order> order) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.dob = dob;
		this.phone = phone;
		this.order = order;
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

	public Set<Order> getOrder() {
		return order;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", email=" + email + ", dob=" + dob + ", phone=" + phone
				+ ", order=" + order + "]";
	}
	
}
