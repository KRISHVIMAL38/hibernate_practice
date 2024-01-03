package com.first;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {
	public static void main(String[] args) throws IOException{
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory fact=cfg.buildSessionFactory();
		
		
//		while inserting the image fire th below query
//		Alter table employee modify image MEDIUMBLOB by default it is tinyblob
//		Please note that ddl auto must be update
		
		Employee e=new Employee();
		e.setEmp_id(543);
		e.setCity("Benglore");
		e.setDate(new Date());
		e.setOpen(true);
		FileInputStream fis=new FileInputStream("src/main/java/docs.png");
		byte[] data=new byte[fis.available()];
		fis.read();
		e.setImage(data);
		
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		session.save(e);
		tx.commit();
		session.close();
	}
}
