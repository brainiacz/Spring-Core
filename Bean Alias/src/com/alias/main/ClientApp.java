package com.alias.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alias.bean.Entitlement;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alias/config/applicationContext.xml");
		Entitlement ent = context.getBean("alias_ent",Entitlement.class);
		System.out.println(ent.toString());
	}
}
