package com.simplilearn.ahibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class CustomerInsert {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory;
		Transaction tx = null;
		
		try {
			// 1. Create the Configuration Object 
			AnnotationConfiguration afg = new AnnotationConfiguration();
			
			// 2. Call the configure Method			
			afg = (AnnotationConfiguration) afg.configure(); /*Doing the Typecast for AnnotationConfiguration as configure returns Configuration */
			
			// 3. Through configuration call the buildSessionFactory()
			sessionFactory = afg.buildSessionFactory();			
			
			// 4. With factory object open the session
			Session session = sessionFactory.openSession();
			
			// 5. With the help of Session need to begin the transaction
			tx = session.beginTransaction();
			
			//6. Business Object 
			Customer cust = new Customer("Shivadimon420","Shivadimon420@simplilearn.com",4899,"Bang",3400.00);
			
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
