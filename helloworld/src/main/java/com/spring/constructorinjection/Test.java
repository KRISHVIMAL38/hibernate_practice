package com.spring.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/constructorinjection/conconfig.xml");
		Person person =(Person)context.getBean("personbean");
		
		System.out.println(person);

	}

}
