package com.multi.homework;

public class MyCars {
	public static void main(String[] args) {
		
		Car car=new Car();
		System.out.println(car);
		
		Truck truck=new Truck();
		truck.setCarSize(10);
		System.out.println(truck);
		
		Truck truck2=new Truck();
		System.out.println(truck2);
		
		
		CoffeeTruck coffeeTruck=new CoffeeTruck();
		System.out.println(coffeeTruck);
		
		
		
		
		
		
	}
}
