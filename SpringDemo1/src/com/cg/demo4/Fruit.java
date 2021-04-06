package com.cg.demo4;

import java.util.List;

public class Fruit {
	List fruitnames;

	public List getFruitnames() {
		return fruitnames;
	}

	public void setFruitnames(List fruitnames) {
		this.fruitnames = fruitnames;
	}
	
	void displayFruitNames()
	{
		System.out.println("Fruit names = "+fruitnames);
	}
}
