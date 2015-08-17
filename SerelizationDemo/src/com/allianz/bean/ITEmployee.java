package com.allianz.bean;

import java.io.Serializable;

public class ITEmployee extends Employee implements Serializable  {
	
	public String project ;
	public String manager ;
	
	
	public ITEmployee(String project, String manager) {
		super();
		this.project = project;
		this.manager = manager;
		System.out.println(" Inside  argument constructor of ITEmployee ");
		
	}
	
	
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
}
