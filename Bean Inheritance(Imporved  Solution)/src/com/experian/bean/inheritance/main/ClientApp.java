package com.experian.bean.inheritance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.experian.bean.inheritance.pojo.Bike;

public class ClientApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/experian/bean/inheritance/config/applicationContext.xml");
		Bike pulsor1 = context.getBean("pulsor1",Bike.class);
		Bike pulsor2 = context.getBean("pulsor2",Bike.class);
		System.out.println(pulsor1.toString());
		System.out.println(pulsor2.toString());
	}

}
