package com.experian.bean.inheritance.pojo;

public class Bike {
	private String id;
	private String make;
	private String engineCC;
	
	
	
	public void setId(String id) {
		this.id = id;
	}



	public void setMake(String make) {
		this.make = make;
	}



	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bike[id="+ id + ",make="+make+",engineCC="+engineCC+"]";
	}
	
	
	
}
