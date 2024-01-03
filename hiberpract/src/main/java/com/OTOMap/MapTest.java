package com.OTOMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory fact=cfg.buildSessionFactory();
		
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		
		Question q1=new Question();
		q1.setQuestionId(11);
		q1.setQuesDescription("This is first question");
		
		Answer a1=new Answer();
		a1.setAnswrId(111);
		a1.setAnsdescription("This is first answer");
		
		q1.setAnswer(a1);
		a1.setQuestion(q1);
		
		Question q2=new Question();
		q2.setQuestionId(12);
		q2.setQuesDescription("This is second question");
		
		Answer a2=new Answer();
		a2.setAnswrId(112);
		a2.setAnsdescription("This is second answer");
		
		q2.setAnswer(a2);
		a2.setQuestion(q2);
		
		session.save(a1);
		session.save(q1);
		session.save(a2);
		session.save(q2);
		
		tx.commit();
		session.close();
		fact.close();
	}

}
