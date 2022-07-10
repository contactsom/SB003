package com.simplilearn.mapping.client;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.simpliearn.mapping.utill.CHibernateUtil;
import com.simplilearn.mapping.Customer;
import com.simplilearn.mapping.Order;

public class PlaceOrder {

	public static void main(String[] args) {
		Transaction tx=null;
		
		try {
			SessionFactory	 sf=  CHibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx = session.beginTransaction();
			

			Order o1= new Order(1,new Double(200.0), new Date(),"New"); 
			session.save(o1);
			
			Order o2= new Order(2,new Double(300.0), new Date(),"New"); 
			session.save(o2);
			
			Order o3= new Order(3,new Double(400.0), new Date(),"New"); 
			session.save(o3);
			
			
			Customer customer = new Customer("Riven", "Riven@gmail.com", new Date(), new Long(9999));
			session.save(customer);
			
			o1.setCustomer(customer);
			o2.setCustomer(customer);
			o3.setCustomer(customer);
			
			
			
			tx.commit();
			session.close();

			} catch (Exception e) {
				e.printStackTrace();
				if(tx!=null) {
					tx.rollback();
				}
			
			}
		
	}
}
