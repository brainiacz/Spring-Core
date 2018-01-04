
package com.experian.learning.spring.pojo;

import java.util.Arrays;
import java.util.List;

public class Student {
	
	private int marks[];
	private List<String> names;
	
	public void setNames(List<String> names){
		this.names = names;
	}
	
	public void setMarks(int[] marks){
		this.marks = marks;
	}
	
	@Override
	public String toString(){
		return "Student [ marks ="+Arrays.toString(marks)+ ", names = "+names+"]";
	}
	
}
