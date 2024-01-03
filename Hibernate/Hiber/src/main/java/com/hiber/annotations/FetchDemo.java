package com.hiber.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory fact=cfg.buildSessionFactory();
		
		Session session=fact.openSession();
		Student student = (Student)session.load(Student.class, 169);
		Student student1 = (Student)session.load(Student.class, 169);
		System.out.println(student);
		System.out.println(student1);
		session.close();
		fact.close();
		
	}
}
