package com.MTMMap;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity(name="project")
public class Project {
	@Id
	@Column(name="project_id")
	private int projectId;
	private String projectName;
	
	@ManyToMany(mappedBy = "projects")
	private List<Emp>emp;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String projectName, List<Emp> emp) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.emp = emp;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Emp> getEmp() {
		return emp;
	}

	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", emp=" + emp + "]";
	}
	
	
}
