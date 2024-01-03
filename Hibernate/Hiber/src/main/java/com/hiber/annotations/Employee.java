package com.hiber.annotations;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	private int empId;
	private String empName;
	private String empcity;
	private Certificate certi;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpcity() {
		return empcity;
	}
	public void setEmpcity(String empcity) {
		this.empcity = empcity;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public Employee(int empId, String empName, String empcity, Certificate certi) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empcity = empcity;
		this.certi = certi;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empcity=" + empcity + ", certi=" + certi + "]";
	}
	
	
}
