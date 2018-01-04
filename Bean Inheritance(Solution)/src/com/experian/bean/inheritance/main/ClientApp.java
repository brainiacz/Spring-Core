package com.experian.bean.inheritance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.experian.bean.inheritance.pojo.Bike;

public class ClientApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/experian/bean/inheritance/config/applicationContext.xml");
		Bike bike = context.getBean("pulsar2",Bike.class);
		System.out.println(bike.toString());
	}

}
