package com.multi.practice.airplane18;

public class SuperSonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flymode=SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode=SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
		
		
	}
	
	
	
}
