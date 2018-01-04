package com.experian.learning.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.experian.learning.spring.pojo.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/experian/learning/spring/config/applicationContext.xml");
		WishGenerator wishGenerator = context.getBean("wsg", WishGenerator.class);
		String result = wishGenerator.getMsg();
		System.out.println(result);
	}
}
