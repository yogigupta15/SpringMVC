package com.skillsoft.model;

import java.io.Serializable;

public class Professor implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String firstName;
	private String lastName;
	private String department;
	public Professor(String firstName, String lastName, String department) {
		
		this.id = (long) Math.floor(Math.random() * 1000000);
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Student {firstName=" + firstName +
				", lastName=" + lastName + 
				", department=" + department +
				"}";
	}
}
