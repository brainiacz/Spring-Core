package com.experian.learning.spring.pojo;

import java.util.Date;

public class WishGenerator {
	
	private Date date;
	private String name;
	
	public WishGenerator(String name, Date date) {
		this.name = name;
		this.date = date;
	}
	
	public String getMsg(){
		return "Good Morning : "+name+"---->"+date;
	}

}
