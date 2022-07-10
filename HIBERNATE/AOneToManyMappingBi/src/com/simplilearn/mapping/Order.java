package com.simplilearn.mapping;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="ORDER_DATA")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="orderId")
	int orderId;
	
	@Column(name="totalQty")
	int totalQty;
	
	@Column(name="totalCost")
	Double totalCost;
	
	@Column(name="orderDate")
	Date orderDate;
	
	@Column(name="status")
	String status;
	
	@ManyToOne
	@JoinColumn(name = "cid", referencedColumnName = "cid")
	Customer customer; /* May Order's belongs to one Customer*/

	public Order() {
		super();
	}
	
	public Order(int totalQty, Double totalCost, Date orderDate, String status) {
		super();
		this.totalQty = totalQty;
		this.totalCost = totalCost;
		this.orderDate = orderDate;
		this.status = status;
	}
	
	public Order(int totalQty, Double totalCost, Date orderDate, String status, Customer customer) {
		super();
		this.totalQty = totalQty;
		this.totalCost = totalCost;
		this.orderDate = orderDate;
		this.status = status;
		this.customer = customer;
	}
	
	public Order(int orderId, int totalQty, Double totalCost, Date orderDate, String status, Customer customer) {
		super();
		this.orderId = orderId;
		this.totalQty = totalQty;
		this.totalCost = totalCost;
		this.orderDate = orderDate;
		this.status = status;
		this.customer = customer;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getTotalQty() {
		return totalQty;
	}
	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", totalQty=" + totalQty + ", totalCost=" + totalCost + ", orderDate="
				+ orderDate + ", status=" + status + ", customer=" + customer + "]";
	}
	
	
}
