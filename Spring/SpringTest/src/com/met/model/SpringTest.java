package com.met.model;

import org.springframework.context.ApplicationContext;import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
	
		ApplicationContext appcontext = new ClassPathXmlApplicationContext("test.xml");
		System.out.println("***************Post spring container Initialization*******************");
		
		
		Employee employeeBeanEmployee = appcontext.getBean("emp1",Employee.class);
		System.out.println(employeeBeanEmployee);
		
		System.out.println("***************Prototype beans*******************");
		Employee emp3 = appcontext.getBean("emp4",Employee.class);
		System.out.println(emp3);
		
		
		Employee emp4 = appcontext.getBean("emp4",Employee.class);
		System.out.println(emp4);
		
	
		
		 Employee emp5 = appcontext.getBean("emp5",Employee.class);
		 System.out.println(emp5);
		 
	
		  Employee emp6 = appcontext.getBean("emp6",Employee.class);
		  System.out.println(emp6);
		
		
		Employee emp8 = appcontext.getBean("emp8",Employee.class);
		System.out.println(emp8);
		
		Employee emp8singleton = appcontext.getBean("emp8",Employee.class);
		System.out.println(emp8singleton);
		
		Employee emp_9 = appcontext.getBean("emp9",Employee.class);
		System.out.println(emp_9);
	
		
		Stage stage1 = appcontext.getBean("stage1",Stage.class);
		System.out.println(stage1);
		
		Stage stage2 = appcontext.getBean("stage2",Stage.class);
		System.out.println(stage2);
		
		if(stage1==stage2)
			System.out.println("Identical");
	}
}