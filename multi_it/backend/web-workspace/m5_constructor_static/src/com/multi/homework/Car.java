package com.multi.homework;

public class Car {
	public String fuelType;
	public int wheelNum;
	
	public Car() {
		this("gasoline", 4);
	}
	
	public Car(String fuelType, int wheelNum) {
		this.fuelType = fuelType;
		this.wheelNum = wheelNum;
	}
	
	public Car(int wheelNum) {
		this("gasoline", wheelNum);
	}
	
	
	public Car(String fuelType) {
		this(fuelType, 4);
	}
	
	@Override
	public String toString() {
		return "Car{" +
				"fuelType='" + fuelType + '\'' +
				", wheelNum=" + wheelNum +
				'}';
	}
}
