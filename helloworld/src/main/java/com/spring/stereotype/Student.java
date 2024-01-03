package com.spring.stereotype;
import java.util.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Student {
	
	private String studentname;
	
	private String city;
	
	private List<String>address;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", city=" + city + ", address=" + address + "]";
	}
	
	
	
}
