package com.hiber.annotations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException	
    {
        System.out.println( "Hello Krishna" );
        Configuration cfg=new Configuration();
        cfg.configure();//You can provide path of configuration file here
        SessionFactory factory=cfg.buildSessionFactory();
        //factory.getCurrentSession();
        
        //Creating the object of student
        Student st =new Student();
        st.setId(169);
        st.setName("Avadhut");
        st.setCity("kolhapur");
        
        //Creating the object of address
        
        Address ad=new Address();
        ad.setAddressId(144);
        ad.setStreet("Hanumaan_Road");
        ad.setCity("Ram_Mandir");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.1234);
        FileInputStream fis=new FileInputStream("src/main/java/docs.png");
        byte [] data=new byte[fis.available()];
        fis.read();
        ad.setImage(data);
        
        System.out.println(st);
        System.out.println(ad);
        
        Session session=factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad); 
        tx.commit();
        session.close();
        
        System.out.println("Done bro !!!!");
        
    }
}
