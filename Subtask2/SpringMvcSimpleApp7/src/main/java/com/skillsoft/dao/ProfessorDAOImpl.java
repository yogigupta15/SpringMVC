package com.skillsoft.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.skillsoft.model.Professor;

@Repository
public class ProfessorDAOImpl implements ProfessorDAO {

	public List<Professor> getProfessors() {
		List<Professor> professorList = new ArrayList<>();
		
		professorList.add(new Professor("Yasmin","Cheng","Economics"));
		professorList.add(new Professor("Ankita","Smith","Philosopy"));
		professorList.add(new Professor("Nick","Goldberg","Computer Science"));
		return professorList;
	}
	
	
	
}
