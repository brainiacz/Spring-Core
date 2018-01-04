package com.alias.bean;

public class Entitlement {

	private String name;
	private int time;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name : "+name+ " <=========> "+"Time : "+time;
	}
}
