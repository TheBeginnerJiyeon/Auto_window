package com.multi.practice.abstract1;

public class PhoneExample {
	public static void main(String[] args) {
		
		/*Phone phone = new Phone("홍길동"); //'Phone' is abstract; cannot be instantiated*/
		
		SmartPhone smartPhone=new SmartPhone("홍길동");
		
		smartPhone.turnOff();
		smartPhone.internetSearch();
		smartPhone.turnOn();
		
		
		
		
		
		
	}
	
	
	
}
