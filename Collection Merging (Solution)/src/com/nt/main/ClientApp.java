package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.EnggCourse;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nt/config/applicationContext.xml");
		EnggCourse enggCourse = context.getBean("ECE1styear",EnggCourse.class);
		System.out.println(enggCourse.toString());
		
		// Solution : Add merge = "true" inside list tag so that it will also merge base list values.
	}
}
