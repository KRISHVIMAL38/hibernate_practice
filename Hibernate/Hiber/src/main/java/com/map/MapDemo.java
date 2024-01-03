package com.map;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory fact=cfg.buildSessionFactory();
		
		Question q1=new Question();
		q1.setQuestionId(121);
		q1.setQuestion("What is java");
		
		
		Answer ans1=new Answer();
		ans1.setAnswerId(343);
		ans1.setAnswer("Java is programming language");
		ans1.setQ(q1);
		
		
		
		Answer ans2=new Answer();
		ans2.setAnswerId(512);
		ans2.setAnswer("Spring is a java framework");
		ans2.setQ(q1);
		
		Answer ans3=new Answer();
		ans3.setAnswerId(729);
		ans3.setAnswer("Java is love");
		ans3.setQ(q1);
		
		
		List<Answer>list=new ArrayList<Answer>();;
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		q1.setList(list);
		Session s=fact.openSession();
		Transaction tx=s.beginTransaction();
		s.save(ans1);
		s.save(q1);
		s.save(ans2);
		s.save(ans3);
		
		tx.commit();
		s.close();
		fact.close();
	}

}
