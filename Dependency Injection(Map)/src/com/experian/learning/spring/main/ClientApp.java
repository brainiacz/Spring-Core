package com.experian.learning.spring.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.experian.learning.spring.pojo.College;

public class ClientApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/experian/learning/spring/config/applicationContext.xml");
		College college = context.getBean("college",College.class);
		String result = college.toString();
		System.out.println(result);
		
		Map<String, String> sample = college.getFacultySubjects();
		
		for(Map.Entry<String, String> values : sample.entrySet()){
			System.out.println("Key : "+ values.getKey() +"  <=======>  "+ "Values : "+ values.getValue());
		}
		
	}

}
