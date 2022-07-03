package com.simplilearn.utill;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class CHibernateUtil {

	static SessionFactory factory;

	static {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		factory = cfg.buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

}
