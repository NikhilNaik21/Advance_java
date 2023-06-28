package com.met.model;

public class Employee {

	private static int count = 0;
	
	private int id;	
	private String name;
	private int age;
	private double salary;
	private String designation;
	
	
	public Employee(String name, int age) {
		this();
		this.name = name;
		this.age = age;
		this.designation = "FRESHER";
		this.salary = 50000;
		
		
		System.out.println("Employee with 2 Parameterized constructor invoked with id: " + id);
	}
	
	

	public Employee() {
		id= ++count;			//count++ 
		
		System.out.println("Default Employee object created with id: " + id);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	
	
	public double calculateAnnualSalary() {
		return salary * 12;
	}
	
}
