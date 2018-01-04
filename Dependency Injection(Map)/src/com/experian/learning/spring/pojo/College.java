package com.experian.learning.spring.pojo;

import java.util.Map;

public class College {
	private Map<String, String>  facultySubjects;
	private Map<?,?> facultyPhones;
	
	public void setFacultySubjects(Map<String, String> facultySubjects){
		this.facultySubjects = facultySubjects;
	}
	
	public void setFacultyPhones(Map<?,?> facultyPhones){
		this.facultyPhones = facultyPhones;
	}
	
	
	
	public Map<String, String> getFacultySubjects() {
		return facultySubjects;
	}

	public Map<?, ?> getFacultyPhones() {
		return facultyPhones;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "College [facultySubjects = "+facultySubjects+", facultyPhones = "+facultyPhones;
	}
}

