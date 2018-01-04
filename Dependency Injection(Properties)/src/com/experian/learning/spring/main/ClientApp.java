package com.experian.learning.spring.main;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.experian.learning.spring.pojo.EmployeeProfile;

public class ClientApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/experian/learning/spring/config/applicationContext.xml");
		EmployeeProfile college = context.getBean("emp",EmployeeProfile.class);
		String result = college.toString();
		System.out.println(result);
		
		Properties sample = college.getEmpDsgs();
		
		System.out.println(sample.getProperty("Anil"));
	}

}
