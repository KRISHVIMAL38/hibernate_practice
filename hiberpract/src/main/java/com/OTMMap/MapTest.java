package com.OTMMap;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapTest {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		
		Question q1=new Question();
		q1.setQuestionId(11);
		q1.setQuesDescription("This is the first question");
		
		List<Answer>list=new ArrayList<Answer>();
		
		Answer a1=new Answer();
		a1.setAnswerId(111);
		a1.setAnsDescription("This is the answer of the first question");
		a1.setQuestion(q1);
		
		Answer a2=new Answer();
		a2.setAnswerId(112);
		a2.setAnsDescription("This is the answer of the first ! question");
		a2.setQuestion(q1);
		
		Answer a3=new Answer();
		a3.setAnswerId(113);
		a3.setAnsDescription("This is the answer of the first !! question");
		a3.setQuestion(q1);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswer(list);
		
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(q1);
		Transaction tx=session.beginTransaction();
		
		tx.commit();
		
		Question q=(Question )session.get(Question.class, 11);
		System.out.println(q.getQuesDescription());
		
		for(Answer a:q.getAnswer()) {
			System.out.println(a.getAnsDescription());
		}
		session.close();
		fact.close();
	}
}
