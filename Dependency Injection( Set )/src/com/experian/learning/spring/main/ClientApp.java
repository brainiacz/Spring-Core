package com.experian.learning.spring.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.experian.learning.spring.pojo.User;

@SuppressWarnings("deprecation")
public class ClientApp {

	public static void main(String[] args) {
		
		FileSystemResource res = new FileSystemResource("src/com/experian/learning/spring/config/applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(res);
		User user = beanFactory.getBean("user", User.class);
		String result = user.toString();
		System.out.println(result);
		
	}
}
