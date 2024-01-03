package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("this is setPrice method");
	}

	public Samosa() {
		super();
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
//	public void init() {
//		System.out.println("This is init method");
//	}
//	
//	public void destroy() throws Exception{
//		System.out.println("this is destroy method");
//	}

	@PostConstruct
	public void start() {
		System.out.println("this is another init method");
	}
	@PreDestroy
	public void end() {
		System.out.println("this is destroy method");
	}
}
