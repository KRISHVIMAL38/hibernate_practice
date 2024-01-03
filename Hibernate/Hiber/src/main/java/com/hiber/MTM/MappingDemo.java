package com.hiber.MTM;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class MappingDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory fact=cfg.buildSessionFactory();
		
		Emp e1=new Emp();
		Emp e2=new Emp();
		
		Project p1=new Project();
		Project p2=new Project();
		
		e1.setEid(21);
		e1.setEname("Ram");
		
		e2.setEid(22);
		e2.setEname("Hanumaan");
		
		p1.setPid(99);
		p1.setProjectName("Orphan Pets");
		
		p2.setPid(98);
		p2.setProjectName("SpringBoot");
		
		List<Emp>l1=new ArrayList<Emp>();
		List<Project>l2=new ArrayList<Project>();
		
		l1.add(e1);l1.add(e2);
		l2.add(p1);l2.add(p2);
		
		e1.setProjects(l2);p1.setEmps(l1);
		
		
		Session s=fact.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(p1);
		s.save(p2);
		tx.commit();
		s.close();
		fact.close();
	}

}
