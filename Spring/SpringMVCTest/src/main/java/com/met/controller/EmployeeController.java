package com.met.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.met.model.Employee;

@Component
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping
	public ModelAndView initializeEmployee() {
		
		ModelAndView mv = new ModelAndView();
		
		Employee defEmp = new Employee();
		
		mv.addObject("employee", defEmp);
		
		mv.setViewName("emp");
		
		return mv;
		
	}
	
	@PostMapping
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		
		ModelAndView mv = new ModelAndView();
		System.out.println(employee);
		
		mv.setViewName("emp");
		
		return mv;
		
		
	}
	
}



