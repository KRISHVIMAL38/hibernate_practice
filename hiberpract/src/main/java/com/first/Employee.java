package com.first;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="Empp_id")
	private int emp_id;
	private String city;
	private boolean isOpen;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	@Lob
	private byte[] image;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Employee(int emp_id, String city, boolean isOpen, Date date, byte[] image) {
		super();
		this.emp_id = emp_id;
		this.city = city;
		this.isOpen = isOpen;
		this.date = date;
		this.image = image;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", city=" + city + ", isOpen=" + isOpen + ", date=" + date + ", image="
				+ Arrays.toString(image) + "]";
	}
	
	
	
}
