package com.skillsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageDisplayController {
	
	@RequestMapping("/hello")
	public String redirect_hello_page() {
		return "hello_page";
	}
	
	@RequestMapping("/start")
	public String redirect_start_page() {
		return "start_page";
	}
}
