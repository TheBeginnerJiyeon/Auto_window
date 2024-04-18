package com.multi.practice.cartire22;

public class CarExample {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		for (int i = 1; i <= 5; i++) {
			int problemlocation = car.run();
			
			switch (problemlocation) {
				
				case 1:
					System.out.println("앞 왼쪽 한국타이어로 교체");
					car.frontLeftTire = new HankookTire("앞왼", 15);
					break;
				
				case 2:
					System.out.println("앞 오른쪽 한국타이어로 교체");
					car.frontLeftTire = new HankookTire("앞오", 13);
					break;
				
				case 3:
					System.out.println("뒤 왼쪽 한국타이어로 교체");
					car.frontLeftTire = new HankookTire("뒤왼", 14);
					break;
				
				case 4:
					System.out.println("뒤 오른쪽 한국타이어로 교체");
					car.frontLeftTire = new HankookTire("뒤오", 17);
					break;
			}
			
			
		}
		
		
	}
	
	
}

