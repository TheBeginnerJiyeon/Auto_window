package com.multi.homework;

public class Truck extends Car {
	
	public static final String carType="truck";
	public int carSize;
	
	public Truck() {
		this(20);
	}
	
	public Truck(int carSize) {
	
		this.carSize = carSize;
	}
	
	public Truck(String fuelType, int wheelNum,int carSize) {
		super(fuelType, wheelNum);
		
		this.carSize = carSize;
	}
	
	public Truck(int wheelNum, String carType, int carSize) {
		super(wheelNum);

		this.carSize = carSize;
	}
	
	public Truck(String fuelType, int carSize) {
		super(fuelType);
	
		this.carSize = carSize;
	}
	
	public String getCarType() {
		return carType;
	}
	
	
	public int getCarSize() {
		return carSize;
	}
	
	public void setCarSize(int carSize) {
		this.carSize = carSize;
	}
	
	@Override
	public String toString() {
		return "Truck{" +
				"carType='" + carType + '\'' +
				", carSize=" + carSize +
				", fuelType='" + fuelType + '\'' +
				", wheelNum=" + wheelNum +
				'}';
	}
}
