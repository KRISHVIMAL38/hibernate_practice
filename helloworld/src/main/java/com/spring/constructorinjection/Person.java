package com.spring.constructorinjection;

public class Person {
	private String name;
	private int roll;
	private Certi certiname;
	Person(String name,int roll,Certi certiname){
		this.name=name;
		this.roll=roll;
		this.certiname=certiname;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", roll=" + roll + ", certiname=" + certiname + "]";
	}

	
}
