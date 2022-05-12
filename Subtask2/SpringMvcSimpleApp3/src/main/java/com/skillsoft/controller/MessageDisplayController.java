package com.skillsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageDisplayController {
	
	@RequestMapping(value = "/hello")
	public ModelAndView sayHello(Model model) {
		model.addAttribute("message", "Hello there !");
		return new ModelAndView("index.jsp");
	}
	
	@RequestMapping(value = "/start")
	public ModelAndView startLearning(Model model) {
		model.addAttribute("message", "Let's Start Learning !");
		return new ModelAndView("index.jsp");
	}
}
