package com.met.model;

public class Employee {

	private int id;
	private String name;
	private String designation;
	private String emailId;
	
	public Employee() {
		super();
		System.out.println("Default Employee object created....");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", emailId=" + emailId + "]";
	}
	 
	
	
	
	
}
