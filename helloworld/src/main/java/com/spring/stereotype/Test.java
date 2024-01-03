package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereotype/stereoconfig.xml");
		Student student=(Student)context.getBean("studentbean");
		Student student1=(Student)context.getBean("studentbean");
		Student student2=(Student)context.getBean("studentbean");
		System.out.println(student);
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
	}

}
