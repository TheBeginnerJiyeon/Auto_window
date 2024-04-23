package com.multi.homework;

public class CoffeeTruck extends Truck {
	
	public String color;
	public String food;
	public int years;
	
	public CoffeeTruck() {
		super();
		this.color = "black";
		this.food = "coffee";
		this.years = 0;
	}
	
	public CoffeeTruck(String color, String food, int years) {
		this.color = color;
		this.food = food;
		this.years = years;
	}
	
	public CoffeeTruck(int carSize, String color, String food, int years) {
		super(carSize);
		this.color = color;
		this.food = food;
		this.years = years;
	}
	
	public CoffeeTruck(String fuelType, int wheelNum, int carSize, String color, String food, int years) {
		super(fuelType, wheelNum, carSize);
		this.color = color;
		this.food = food;
		this.years = years;
	}
	
	public CoffeeTruck(int wheelNum, String carType, int carSize, String color, String food, int years) {
		super(wheelNum, carType, carSize);
		this.color = color;
		this.food = food;
		this.years = years;
	}
	
	public CoffeeTruck(String fuelType, int carSize, String color, String food, int years) {
		super(fuelType, carSize);
		this.color = color;
		this.food = food;
		this.years = years;
	}
	
	@Override
	public String toString() {
		return "CoffeeTruck{" +
				"color='" + color + '\'' +
				", food='" + food + '\'' +
				", years=" + years +
				", carSize=" + carSize +
				", fuelType='" + fuelType + '\'' +
				", wheelNum=" + wheelNum +
				'}';
	}
}
