package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishGenerator;

public class ClientApp {
	public static void main(String[] args) {
		
		System.out.println("Client App Main");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nt/config/applicationContext.xml");
		WishGenerator wishGenerator = context.getBean("wsg",WishGenerator.class);
		String result = wishGenerator.generateWishMsg();
		System.out.println(result);
		
		
	}

}
