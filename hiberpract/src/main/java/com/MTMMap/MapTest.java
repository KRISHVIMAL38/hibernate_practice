package com.MTMMap;

import java.util.ArrayList;
import java.util.List;

import javax.naming.ConfigurationException;

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
		Session session =fact.openSession();
		
		Emp e1=new Emp();
		e1.setEmpId(232);
		e1.setEmpName("Krishna");
		
		Emp e2=new Emp();
		e2.setEmpId(233);
		e2.setEmpName("Kishori Ji");
		
		Emp e3=new Emp();
		e3.setEmpId(234);
		e3.setEmpName("Balraam");
		
		
		Project p1=new Project();
		p1.setProjectId(21);
		p1.setProjectName("Walmart");
		
		Project p2=new Project();
		p2.setProjectId(22);
		p2.setProjectName("Adobe");
		
		Project p3=new Project();
		p3.setProjectId(23);
		p3.setProjectName("Oracle");
		
		List<Project>lst1=new ArrayList<Project>();
		lst1.add(p1);
		lst1.add(p2);
		
		List<Emp>lst2=new ArrayList<Emp>();
		lst2.add(e3);
		lst2.add(e2);
		
		e1.setProjects(lst1);
		p2.setEmp(lst2);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
		fact.close();
	}

}
