package com.simplilearn.hibernate;

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
			 //Customer cust = new Customer("rmkatk", "m@abc.com", 13789, "Hyd1", 3000.00);
			// Customer cust = new Customer("Dk Singh", "singhdk.singh68", 987512, "Bangalore", 5000.00);
			 //Customer cust = new Customer("prashantkb", "prashant@gmail.com", 908123, "USA", 2000.00);
			// Customer cust = new Customer("Jay shiva", "Jay04shiva@gmail.com", 805043, "UK", 1000.00);
			 Customer cust = new Customer("kushagra Jayant", "kushagra@gmail.com", 805043, "NZ", 9000.00);
		
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

