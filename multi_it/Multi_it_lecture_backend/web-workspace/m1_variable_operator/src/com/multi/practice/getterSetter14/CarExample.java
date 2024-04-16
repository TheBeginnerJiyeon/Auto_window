package com.multi.practice.getterSetter14;

public class CarExample {
	public static void main(String[] args) {
		/*boolean a;
		System.out.println(a); Variable 'a' might not have been initialized*/
		
		Car myCar=new Car();
		
		/*myCar.setSpeed(-50);
		
		System.out.println("현재 속도: " + myCar.getSpeed());*/
		
		myCar.setSpeed(60);
		
		System.out.println(myCar.getSpeed());
		
		System.out.println(myCar.isStop());
		System.out.println(!myCar.isStop());
		
		if(!myCar.isStop()){
			myCar.setStop(true);
			System.out.println(myCar.getSpeed());
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		System.out.println(myCar.isStop());
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed(50);
		
		myCar.setStop(true);
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		
		
		
	}
	
	
	
}
