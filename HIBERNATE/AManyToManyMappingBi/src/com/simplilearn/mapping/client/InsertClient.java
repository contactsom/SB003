package com.simplilearn.mapping.client;


import java.util.*;

import org.hibernate.*;

import com.simpliearn.mapping.Account;
import com.simpliearn.mapping.Customer;
import com.simplilearn.mapping.utill.AHibernateUtil;


public class InsertClient {

	public static void main(String[] args) {
		Transaction tx = null;

		try {
			SessionFactory sf = AHibernateUtil.getsessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			// 1.Add Customer

			Customer cust1 = new Customer("om", " om@abc", new Date(), new Long(9999));
			session.save(cust1);

			Customer cust2 = new Customer("prakash", " prakash@abc", new Date(), new Long(8888));
			session.save(cust2);

			// 2.Add Acounts
			Account a1 = new Account("SA", 5000.00);
			session.save(a1);

			Account a2 = new Account("SA", 6000.00);
			session.save(a2);

			Account a3 = new Account("CA", 7000.00);
			session.save(a3);

			Set<Account> accs = new HashSet<Account>();
			accs.add(a1);
			accs.add(a2);
			accs.add(a3);
			cust1.setAccounts(accs);

			Set<Account> accs1 = new HashSet<Account>();
			accs1.add(a2);
			accs1.add(a3);
			cust2.setAccounts(accs1);

			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null) {
				tx.rollback();
			}
		}
	}
}
