package com.experian.learning.spring.pojo;

import java.util.Properties;

public class EmployeeProfile {
	
	private Properties empDsgs;
	
	public void setEmpDsgs(Properties empDsgs){
		this.empDsgs = empDsgs;
	}
	
	public Properties getEmpDsgs() {
		return empDsgs;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Profile[ EmpDesgs = "+empDsgs+"]";
	}
	

}
