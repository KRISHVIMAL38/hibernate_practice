package com.spring.ambiguity;

public class add {
	private int b,a;
	
	public add(double  a,double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("This is double constructor");
	}
	public add(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("this is int constructor");
	}
	public add(String a,String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("this is string constructor");
	}
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	
	public int addition() {
		return this.a+this.b;	}
}
