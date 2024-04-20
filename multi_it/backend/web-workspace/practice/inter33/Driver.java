package com.multi.practice.inter33;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
			System.out.println("오잉");
			System.out.println("오잉");
			System.out.println("오잉");
		}
		vehicle.run();
		System.out.println("dlrjs,s??");
	}
}
