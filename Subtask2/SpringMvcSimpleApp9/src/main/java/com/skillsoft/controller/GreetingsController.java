package com.skillsoft.controller;

import java.util.Map;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingsController {
	
/*	@RequestMapping("/hello")
	public String greeting(HttpServletRequest req, Model model) {
		
		String name = req.getParameter("name");
		
		String msg = "Hello " + name ;
		
		model.addAttribute("message",msg);
		
		return "greetingsPage";
	} */
	
/*	@RequestMapping("/hello")
	public String greeting(
			@RequestParam("studentName") String name, 
			@RequestParam(required = false) String major,
			Model model) {
		
		String msg = "Hello " + name; 
		
		if(major != null && !major.isEmpty()) {
			msg = msg + " welcome to your major: " + major ;
		}
		
		model.addAttribute("message",msg);
		
		return "greetingsPage";
	}*/
	
/*	@RequestMapping("/hello")
	public String greeting(
			@RequestParam("studentName") String name, 
			@RequestParam(defaultValue = "English") String major,
			Model model) {
		
		String msg = "Hello " + name + " welcome to your major: " + major ; 
			
		model.addAttribute("message",msg);
		
		return "greetingsPage";
	}*/
	
	@RequestMapping("/hello")
	public String greeting(
			@RequestParam Map<String,String> allParametersMap,
			Model model) {
		String name = allParametersMap.get("studentname");
		String major = allParametersMap.get("major");
		String advisor = allParametersMap.get("advisor");
		String msg = "Hello " + name + " welcome to your major: " + major +
				", your advisor is: " + advisor; 
			
		model.addAttribute("message",msg);
		
		return "greetingsPage";
	}
}
