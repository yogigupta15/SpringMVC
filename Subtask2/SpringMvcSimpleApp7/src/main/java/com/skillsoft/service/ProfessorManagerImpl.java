package com.skillsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillsoft.dao.ProfessorDAO;
import com.skillsoft.model.Professor;

@Service
public class ProfessorManagerImpl implements ProfessorManager {
	
	@Autowired
	ProfessorDAO professorDAO;
	
	@Override
	public List<Professor> getProfessors() {
		
		return professorDAO.getProfessors();
	}

}
