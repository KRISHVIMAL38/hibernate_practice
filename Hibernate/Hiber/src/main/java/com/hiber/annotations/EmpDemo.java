package com.hiber.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory fact=cfg.buildSessionFactory();
		
		Employee emp=new Employee();
		emp.setEmpId(2197076);
		emp.setEmpName("Krushnat Malavekar");
		emp.setEmpcity("kolhapur");
		
		Certificate certi=new Certificate();
		certi.setCertiId(144);
		certi.setCertiName("Hibernate");
		
		emp.setCerti(certi);
		
		Employee emp1=new Employee();
		emp1.setEmpId(247);
		emp1.setEmpName("Vaibhav Patil");
		emp1.setEmpcity("kagal");
		
		Certificate certi1=new Certificate();
		certi1.setCertiId(169);
		certi1.setCertiName("SysOps");
		
		emp1.setCerti(certi1);
		
		Session s=fact.openSession();
		Transaction tx=s.beginTransaction();
		s.save(emp1);
		s.save(emp);
		tx.commit();
		s.close();
		fact.close();
		
		System.out.println("Done Bro !!!!!");
	}

}
