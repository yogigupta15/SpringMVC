package com.skillsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skillsoft.service.ProfessorManager;
import com.skillsoft.service.StudentManager;

@Controller
@RequestMapping("/university")
public class UniversityController {
	
	@Autowired
	StudentManager studentManager;
	
	@Autowired
	ProfessorManager professorManager;
	
	@RequestMapping(value="/students" , method = RequestMethod.GET)
	public String getStudents(Model model) {
		
		model.addAttribute("students",studentManager.getStudents());
		
		return "students_view";		
	}
	@RequestMapping(value="/professors" , method = RequestMethod.GET)
	public String getProfessors(Model model) {
		
		model.addAttribute("professors", professorManager.getProfessors());
		
		return "professors_view";		
	}	
}
