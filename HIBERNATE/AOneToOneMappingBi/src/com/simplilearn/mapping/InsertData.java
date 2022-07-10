package com.simplilearn.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simplilearn.mapping.utill.AHibernateUtil;


public class InsertData {

	public static void main(String[] args) {
		
		Transaction tx=null;
		try {
		 
		SessionFactory	 sf=  AHibernateUtil.getsessionFactory();
		Session session=sf.openSession();
		tx = session.beginTransaction();
		
		
		/*Prepare the Parent Object Here it is Student*/
		Student student = new Student();
		student.setSname("Jon");
		student.setSemail("Jon@abc.com");
		student.setSphone("9638");
		
		/*Prepare the Child Object Here it is Address*/
		Address address= new Address();
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setStreet("OMR Road");
		
		
		student.setAddress(address);/*Set address data in to Student*/
		address.setStudent(student);/*Set Student data in to Address*/
		
		session.save(address);/* I am saving address object , because it has student reference already*/
		
		
		session.getTransaction().commit();
		session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) {
				tx.rollback();
			}
		
		}
	}
}
