package com.simplilearm.acollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.*;

import com.simplilearn.utill.AHibernateUtil;

public class StudentInsert {

	public static void main(String[] args) {
		Transaction tx = null;

		try {

			SessionFactory sf = AHibernateUtil.getsessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();

			
			String course[]= {"JAVA","JDBC","HIBERNATE"};
			
			List<String> email= new ArrayList<String>();
			email.add("a@abc");
			email.add("b@abc");
			email.add("c@abc");
			
			List<Integer> marks= new ArrayList<Integer>();
			marks.add(90);
			marks.add(80);
			marks.add(70);
			
			//private Set<Long> phone;
			Set<Long> phones= new HashSet<Long>();
			phones.add(new Long(12345));
			phones.add(new Long(12346));
			phones.add(new Long(12347));			
			
			
			Map<String,Long> refs= new HashMap<String,Long>();
			refs.put("A", new Long(12345));
			refs.put("B", new Long(12346));
			refs.put("C", new Long(12347));
			
			// Business
			Student stu = new Student("kushagra", "03-JAN-20", "B.Tech", course, email, marks, phones, refs);

			session.save(stu);
			tx.commit();
			session.close();

		} catch (Exception e) {

			System.out.println("Error occured while Inserting the Student Data");
			e.printStackTrace();

			if (tx != null)
				tx.rollback();// Revert the Changes
		}
	}
}
