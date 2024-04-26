package com.multi.a_interface;
//추상클래스 -> 일반멤버(변수 + 메소드)  + 추상메소드
//인터페이스 -> only 상수필드 + 추상메소드

public class PhoneMain {
	public static void main(String[] args) {
	
	/*PhoneInterface p=new PhoneInterface();
	// 'PhoneInterface' is abstract; cannot be instantiated*/
		// 인터페이스는 객체생성 불가능
		
		/*PhoneClass p=new PhoneClass();*/
		// 'PhoneClass' is abstract; cannot be instantiated 추상클래스도 객체생성 불가능
		
		PhoneInterface p = new PhoneClass(); // 인터페이스를 상속받은 구현이 된 클래스
		// 인터페이스 특징
		// 3. 객체 생성은 하지 못하지만, 참조형 타입으로서는 사용 가능하다.
		
		p.call();
		System.out.println();
		
		AppleKOREA a = new AppleKOREA();
		a.call();
		a.pay();
		System.out.println();
		
		AppleUSA b= new AppleUSA();
		b.call();
		b.pay();
		
		
		
		
		
		
	}
}
