package com.spring.constructorinjection;

public class Certi {
	String certiname;
	Certi(String certiname){
		this.certiname=certiname;
	}
	@Override
	public String toString() {
		return "Certi [certiname=" + certiname + "]";
	}
}
