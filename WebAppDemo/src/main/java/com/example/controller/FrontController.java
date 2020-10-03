package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {

	public FrontController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/")
	public String showHomePage() {
		System.out.println("Reached In");
		return "home";
		
	}
	
	@RequestMapping("/spring")
	public String spring() {
		
		return "spring";
		
	}

}
