package com.MTMMap;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity(name="employ")
public class Emp {
	@Id
	@Column(name="emp_id")
	private int empId;
	private String empName;
	
	@ManyToMany
	@JoinTable
	(
			name="join_learn",
			joinColumns= {@JoinColumn(name="emp_id")},
			inverseJoinColumns= {@JoinColumn(name="project_id")}
	)
	private List<Project>projects;

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

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Emp(int empId, String empName, List<Project> projects) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.projects = projects;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", projects=" + projects + "]";
	}
	
	
}
