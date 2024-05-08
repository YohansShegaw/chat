package com.chat;

public class Demo {

	private String foodName;
	private String mealTime;
	private int fat;
	private int protine;
	private int carbohaydrate;
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demo(String foodName, String mealTime, int fat, int protine, int carbohaydrate) {
		super();
		this.foodName = foodName;
		this.mealTime = mealTime;
		this.fat = fat;
		this.protine = protine;
		this.carbohaydrate = carbohaydrate;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getMealTime() {
		return mealTime;
	}
	public void setMealTime(String mealTime) {
		this.mealTime = mealTime;
	}
	public int getFat() {
		return fat;
	}
	public void setFat(int fat) {
		this.fat = fat;
	}
	public int getProtine() {
		return protine;
	}
	public void setProtine(int protine) {
		this.protine = protine;
	}
	public int getCarbohaydrate() {
		return carbohaydrate;
	}
	public void setCarbohaydrate(int carbohaydrate) {
		this.carbohaydrate = carbohaydrate;
	}

}
