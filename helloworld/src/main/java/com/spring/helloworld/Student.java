package com.spring.helloworld;

public class Student {
	private int studentId;
	private String studentname;
	private String studentAddress;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("this is setStudent id method");
		this.studentId = studentId;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		System.out.println("this is setStudent  name method");
		this.studentname = studentname;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("This is setStudent address method");
		this.studentAddress = studentAddress;
	}
	public Student(int studentId, String studentname, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentname = studentname;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentname=" + studentname + ", studentAddress=" + studentAddress
				+ "]";
	}
	
	
}
