package com.skillsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillsoft.dao.StudentDAO;
import com.skillsoft.model.Student;

@Service
public class StudentManagerImpl implements StudentManager {
	
	@Autowired
	StudentDAO studentDAO;
	
	@Override
	public List<Student> getStudents() {
		
		return studentDAO.getStudents();
		
	}

}
