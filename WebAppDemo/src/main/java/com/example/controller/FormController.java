package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	public FormController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/showform")
	public String showForm() {
		return "showForm";
		
	}
	
	@RequestMapping("/formResp")
	public String formResp() {
		return "formResp";
		
	}
	
	
}
