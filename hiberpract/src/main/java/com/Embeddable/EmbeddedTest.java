package com.Embeddable;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddedTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory fact=cfg.buildSessionFactory();
		
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		
		Trainee tr=new Trainee();
		tr.setTrainee_id(233);
		tr.setTrainee_name("Krishna");
		
		Certi cr=new Certi();
		cr.setCerti_name("Hibernate");
		cr.setDuration(11);
		
		tr.setCerti(cr);
		
		//session.save(cr);
		session.save(tr);
		tx.commit();
		System.out.println(tr);
		session.close();
	}

}
