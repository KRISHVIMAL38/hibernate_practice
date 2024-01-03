package com.queries;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Here we go");
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory fact=cfg.buildSessionFactory();
		Session session =fact.openSession();
		
		Animal an=new Animal();
		an.setAnimalId(10);
		an.setCategory("Cat");
		an.setName("Rapanzel");
		
		Animal an1=new Animal();
		an1.setAnimalId(11);
		an1.setCategory("Buffelo");
		an1.setName("Laxmi");
		
		session.save(an1);
		session.save(an);
		
		Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
		fact.close();
		System.out.println("We did it bro !!!!");
	}

}
