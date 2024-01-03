package com.queries;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class ExecutingQueries {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Here we go");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		String query ="update animal1 set name ='moti' where animalId='12'";
		Query q=session.createQuery(query);
		
		int res=q.executeUpdate();
		tx.commit();
		session.close();
		fact.close();
		System.out.println("we did it bro");
	}

}
