package com.cg.demo2;

public class Car {
	Engine engine;
	int manufactureYear;
	public int getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	void displayCarDetails()
	{
		engine.engineType();
		System.out.println("Manufacture year = "+manufactureYear);
	}
}
