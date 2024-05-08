package com.chat;

public class MicroFood {

	private String microFoodName;
	private int microFoodValue;
	public MicroFood() {
		super();
		// TODO Auto-generated constructor 
	}
	public MicroFood(String microFoodName, int microFoodValue) {
		super();
		this.microFoodName = microFoodName;
		this.microFoodValue = microFoodValue;
	}
	public String getMicroFoodName() {
		return microFoodName;
	}
	public void setMicroFoodName(String microFoodName) {
		this.microFoodName = microFoodName;
	}
	public int getMicroFoodValue() {
		return microFoodValue;
	}
	public void setMicroFoodValue(int microFoodValue) {
		this.microFoodValue = microFoodValue;
	}
	
}
