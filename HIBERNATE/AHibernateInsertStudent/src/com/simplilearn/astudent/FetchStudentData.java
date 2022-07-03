package com.simplilearn.astudent;

import org.hibernate.*;
import org.hibernate.cfg.AnnotationConfiguration;

public class FetchStudentData {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory;
		Transaction tx = null;
		
		try {
			AnnotationConfiguration aconfig= new AnnotationConfiguration();
			aconfig=(AnnotationConfiguration)aconfig.configure();
			sessionFactory=aconfig.buildSessionFactory();
			Session session = sessionFactory.openSession();
			tx = session.beginTransaction();
			
			Student studentdata1 = (Student) session.get(Student.class, 1);
			Student studentdata2 = (Student) session.get(Student.class, 2);
			/*Select * from Student Where STUID = ? */
			
			System.out.println("************************ STUDENT_ID=1 ***********************");
			System.out.println(
								"Student ID : "+studentdata1.getStuid()+" "
								+"Student Name : "+studentdata1.getStuname()+" "
								+"Student Email : "+studentdata1.getStuemail()+" "
								+"Student Phone : "+studentdata1.getStuphone()+" "
								+"Student Balance : "+studentdata1.getStubal()+" "
								+"Student City : "+studentdata1.getStucity());
			
			System.out.println("************************ STUDENT_ID=2 ***********************");
			System.out.println(
					"Student ID : "+studentdata2.getStuid()+" "
					+"Student Name : "+studentdata2.getStuname()+" "
					+"Student Email : "+studentdata2.getStuemail()+" "
					+"Student Phone : "+studentdata2.getStuphone()+" "
					+"Student Balance : "+studentdata2.getStubal()+" "
					+"Student City : "+studentdata2.getStucity());

			
			session.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}
		
		
		
	
		
	}
}
