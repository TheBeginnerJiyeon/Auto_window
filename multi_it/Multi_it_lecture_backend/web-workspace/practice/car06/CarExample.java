package com.multi.practice.car06;

public class CarExample {
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpedd();
		System.out.println("현재속도: " + speed + "km/h");
	}
	
}
