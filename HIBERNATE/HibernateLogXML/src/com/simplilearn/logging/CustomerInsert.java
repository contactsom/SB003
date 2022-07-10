package com.simplilearn.logging;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerInsert {

	public static void main(String[] args) {
		SessionFactory factory;
		Transaction tx = null;
		
		try {
		// 1. Create the Configuration Object 
			Configuration cfg = new Configuration();
			
		// 2. Call the configure Method			
			cfg = cfg.configure();
			
		// 3. Through configuration call the buildSessionFactory()
			factory = cfg.buildSessionFactory();
			
		// 4. With factory object open the session
			Session session = factory.openSession();
		
		// 5. With the help of Session need to begin the transaction
			tx = session.beginTransaction();
		
		//6. Business Object 	
		   // Customer cust = new Customer("naraharisetti", "nar@abc.com", 123456789, "Bangalore1", 25000.00);
		  //  Customer cust = new Customer("rmkatkar7", "rmka@abc.com", 12236789, "Bangalore", 5000.00);
			//  Customer cust = new Customer("rmkatkar", "mka@abc.com", 1223789, "Hyd", 5000.00);
			
			 Customer cust = new Customer("rmkatka", "mk@abc.com", 123789, "Hyd1", 4000.00);
		
		//7. Save the Data
		    session.save(cust);
		    
		//8. Commit in DB
			tx.commit();
		
		//9. Close the Resources
		session.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

	}
	}
