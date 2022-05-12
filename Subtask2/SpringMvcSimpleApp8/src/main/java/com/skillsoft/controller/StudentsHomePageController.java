package com.skillsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentsHomePageController {
	
	@RequestMapping(value = "/students/{name}")
	public String display(@PathVariable("name") String name, Model model) {
		
		String welcomeMessage = "welcome to " + name + "'s home page";
		
		model.addAttribute("welcomeMessage",welcomeMessage);
		
		return "student_home_page";
	}
}
