package com.skillsoft.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

	public List<Student> getStudents() {
		
		List<Student> studentsList = new ArrayList<Student>();
		
		studentsList.add(new Student("Greg","Jhonson","Computer Science"));
		studentsList.add(new Student("Alice","Kruger","Philosophy"));
		studentsList.add(new Student("Peter","Smith","Math"));
		studentsList.add(new Student("Claudia","Wallace","Chemistry"));
		studentsList.add(new Student("Sinead","O'Connor","Operations"));
		return studentsList;
	}
	
}
