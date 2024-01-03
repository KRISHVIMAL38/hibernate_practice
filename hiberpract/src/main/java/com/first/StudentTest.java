package com.first;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("Hibernate Starts here");
		Configuration cfg=new Configuration() ;
		cfg.configure();
		
		SessionFactory fact=cfg.buildSessionFactory();
		
		Student st=new Student();
		st.setName("Maruti");
		st.setId(232);
		st.setCity("Kishkindha");
		
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();
		
		System.out.println("We did it bro !!!");
	}

}
