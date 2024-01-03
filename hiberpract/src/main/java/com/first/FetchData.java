package com.first;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Configuration cfg =new Configuration();
		cfg.configure();
		SessionFactory fact=cfg.buildSessionFactory();
		
		Session session=fact.openSession();
		Student st=(Student)session.get(Student.class, 232);
		System.out.println(st);
		
		session.close();
	}

}
