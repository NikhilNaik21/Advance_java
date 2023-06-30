package com.met.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Component
@RequestMapping("/welcome")
public class WelcomeController {

	
	//http://localhost:9090/SpringMVCTest/mvc/welcome
	
	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping	
	public ModelAndView welcome() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("welMsg", "Welcome to Spring MVC");
		
		
		mv.setViewName("hello");

		return mv;
		
	}
	
	//http://localhost:9090/SpringMVCTest/mvc/welcome/reqParam?userName=abc&age=20
	
	//@RequestMapping(method = RequestMethod.GET, value = "reqParam")
	
	@GetMapping("reqParam")
	public ModelAndView welcomeParam(@RequestParam(required = false, name = "uName") String userName, @RequestParam(defaultValue = "20") int age) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("welMsg", "Welcome to Spring MVC with user " + userName + " and age " + age);
		
		
		mv.setViewName("hello");
		
		return mv;
	}
	
	//http://localhost:9090/SpringMVCTest/mvc/welcome/pathParam/abc/20
	
	
	@GetMapping("pathParam/{name}/{age}")
	public ModelAndView pathParameter(@PathVariable String name,
				@PathVariable int age) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("welMsg", "Welcome to Spring MVC with user " + name + " and age " + age);
		
		
		mv.setViewName("hello");
		
		return mv;
		
		
	}
	
	
	
	
}


