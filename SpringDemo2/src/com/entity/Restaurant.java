package com.entity;

public class Restaurant {
	HotDrinks h;
	CoolDrinks c;
	String restaurantName;
	public void setH(HotDrinks h) {
		this.h = h;
	}
	public void setC(CoolDrinks c) {
		this.c = c;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	void displayRestaurantDetails()
	{
		System.out.println("Restaurant name "+restaurantName);
		h.drink();
	}
}
