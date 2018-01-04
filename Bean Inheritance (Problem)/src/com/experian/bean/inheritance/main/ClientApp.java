package com.experian.bean.inheritance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.experian.bean.inheritance.pojo.Bike;

public class ClientApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/experian/bean/inheritance/config/applicationContext.xml");
		Bike bike = (Bike)context.getBean("pulsar1"); 
	
		System.out.println(bike.toString());
		
		/*
		 * Problem : = Make and engineCC property values are not reussable even they are same  in multiple bean configuration.
		 * Solution := Bean Inheritance
		 * 
		 */
	}

}
