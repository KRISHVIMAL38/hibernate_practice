package com.spring.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.constructorinjection.Person;
import com.spring.stdcollect.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stdcollect/collectionconfig.xml");
		Student student =(Student)context.getBean("studentbean");
		System.out.println(student);
		System.out.println(student.getList().getClass().getName());
		System.out.println(student.getMap().getClass().getName());
	}

}