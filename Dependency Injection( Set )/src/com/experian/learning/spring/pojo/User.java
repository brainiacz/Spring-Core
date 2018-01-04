package com.experian.learning.spring.pojo;

import java.util.Set;

public class User {
	
	private Set<String> phones;
	
	public void setPhones(Set<String> phones){
		this.phones = phones;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [Phones = "+phones+"]";	
	}
}
