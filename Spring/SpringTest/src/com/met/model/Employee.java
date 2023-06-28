package com.met.model;

public class Employee {
	private int Id;
	private int age;
	private String name;
	private double salary;
	private String designation;
	static int count=0;
	private Address address;

	public Employee() {
		Id = ++count;
		System.out.println("Default Employee object created with id:"+Id);
	}
	public Employee(int age, String name) {
		this();
		this.age = age;
		this.name = name;
		this.designation= "FRESHER";
		this.salary =50000;
	}
	
	public Employee(String name, int age, double salary, String designation, Address address) {
		this();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
		this.address = address;
		System.out.println("Employee object created with Parameterized const having id:" + Id);
	}
	public void setId(int id) {
		Id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", age=" + age + ", name=" + name + ", salary=" + salary + ", designation="
				+ designation + ", address=" + address + "]";
	}
	public double calculatesalary()
	{
		return salary *12;
	}
	
}
