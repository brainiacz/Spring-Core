package com.nt.beans;

import java.util.List;

public class EnggCourse {
	private List<String> subjects;
	
	public void setSubjects(List<String> subjects){
		this.subjects = subjects;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EnggCouse [subjects="+subjects+"]";
	}
}
