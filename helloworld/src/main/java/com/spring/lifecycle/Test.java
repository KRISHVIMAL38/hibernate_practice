package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/lifeconfig.xml");
		Samosa samosa =(Samosa)context.getBean("samosabean");
		context.registerShutdownHook();
		System.out.println(samosa);

	}

	

}