package com.spring.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "My program worked successfully !!!!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/dao/config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        
        Student student=new Student();
        student.setId(100);
        student.setName("Sunil");
        student.setCity("Bidri");
        
        int result=studentDao.insert(student);
        System.out.println(result +" no of rows inserted.....");
    }
}
