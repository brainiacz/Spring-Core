package com.experian.learning.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.experian.learning.spring.pojo.Student;

public class ClientApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/experian/learning/spring/config/applicationContext.xml");
		Student student = context.getBean("st", Student.class);
		String result = student.toString();
		System.out.println(result);
	}
}
