package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	private String name;
	private Date date;
	
	public WishGenerator(){
		System.out.println("Wish Generator; 0 args construtor");
	}
	
	public void setName(String name){
		System.out.println("Wish Generator Set Name");
		this.name = name;
	}
	
	public void setDate(Date date){
		System.out.println("Wish Generator Set Date");
		this.date = date;
	}
	
	public String generateWishMsg(){
		return "Good Morning : "+name+"----->"+date;
	}

}
