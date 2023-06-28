package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.met.model.Employee;

public class SpringTest {

	public static void main(String[] args) {
		
		
		ApplicationContext appContext = new
				ClassPathXmlApplicationContext("test.xml");
				
				 System.out.println("********************Post Spring Container Initialization*******************");
				 
				 
				 
				  
					/*
					 * Employee employee = appContext.getBean(Employee.class);
					 * System.out.println(employee);
					 */
				  
					/*
					 * System.out.println("Annual salary of bean with id emp1:  "+
					 * employee.calculateAnnualSalary());
					 */
				 
		
		
		Employee employeeBean = appContext.getBean("emp1", Employee.class);
		System.out.println(employeeBean);
		System.out.println("Annual salary of bean with id emp1:  "+ employeeBean.calculateAnnualSalary());
		
		Employee employeeTest = (Employee)   appContext.getBean("emp1");
		System.out.println(employeeTest);
		System.out.println("Annual salary of bean with id emp1:  "+ employeeTest.calculateAnnualSalary());
		
		
		System.out.println("");
		System.out.println("******************Prototype beans*******************");
		System.out.println("");
		
		Employee employee3 = appContext.getBean("emp3", Employee.class);
		System.out.println(employee3);
		
		Employee employee3Prototype = appContext.getBean("emp3", Employee.class);
		System.out.println(employee3Prototype);
		
		
		System.out.println("");
		System.out.println("******************Passing values via constructor*******************");
		System.out.println("");
		
		Employee employee4 = appContext.getBean("emp4", Employee.class);
		System.out.println(employee4);
		
		Employee employee5 = appContext.getBean("emp5", Employee.class);
		System.out.println(employee5);
		
		System.out.println("");
		System.out.println("******************Passing values via Property/Setters*******************");
		System.out.println("");
		
		Employee employee6 = appContext.getBean("emp6", Employee.class);
		System.out.println(employee6);
		
	}
	
}



