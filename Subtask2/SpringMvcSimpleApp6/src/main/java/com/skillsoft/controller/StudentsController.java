package com.skillsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentsController {
	
	@Autowired
	StudentManager studentManager;
	
	@RequestMapping(value = "/university/students", method = RequestMethod.GET)
	
	public String getStudents(Model model) {
		model.addAttribute("allStudents",studentManager.getStudents() );
		return "students_view";
	}
}
