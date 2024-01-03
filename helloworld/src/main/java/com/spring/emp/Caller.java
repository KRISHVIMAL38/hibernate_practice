package com.spring.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Caller {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/emp/collectionconfig.xml");
		Emp e=(Emp)context.getBean("emp1");
		
//		System.out.println(e.getName());
//		System.out.println(e.getAddress());
//		System.out.println(e.getCourses());
//		System.out.println(e.getPhones());
		
		System.out.println(e);
	}
   
}
