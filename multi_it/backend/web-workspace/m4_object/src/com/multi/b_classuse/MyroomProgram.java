package com.multi.b_classuse;

import com.multi.a_classmake.Calculator;
import com.multi.a_classmake.Dog;
import com.multi.a_classmake.Phone;
import com.multi.a_classmake.Tv;

public class MyroomProgram {
	public static void main(String[] args) {
		// 전화기 한대 넣기
		Phone p1 = new Phone(); // alt enter: 자동으로 해결 추천
		
		p1.makeCall();
		p1.takePhoto();
		/*p1.size = -5; //set
		p1.speaker = "바나나";
		System.out.println(p1.size + "\t" + p1.speaker); //get
		// 'size' has private access in 'com.multi.a_classmake.Phone'*/
		
		
		p1.setSize(100);
		System.out.println(p1.getSize());
		
		
		// 전화기 1대 추가
		Phone p2 = new Phone();
		p2.setSize(500);
		p2.makeCall();
		System.out.println(p2.getSize());
		p2.takePhoto();
		p2.setSpeaker("삼성");
		System.out.println(p2.getSpeaker());
		
		
		Dog dog1 = new Dog();
		dog1.setColor("white");
		dog1.setField("진돗개");
		System.out.println(dog1.getColor() + "\t" + dog1.getField());
		dog1.wagTail();
		dog1.bark();
		
		System.out.println(dog1.toString()); // com.multi.a_classmake.Dog@1ddc4ec2 참조변수에는 주소값이 담겨잇다!!
		// 오버라이드 이후: color: white, field: 진돗개
		
		
		Tv tv1 = new Tv();
		
		tv1.on();
		tv1.off();
		
		tv1.setCh(100);
		tv1.setVol(20);
		tv1.setOnOff(true);
		
		System.out.println(tv1.getCh() + "\t" + tv1.getVol() + "\t" + tv1.isOnOff());
		
		
		System.out.println(tv1.toString());
		
		
		Calculator cal=new Calculator();
		cal.add();
		cal.div();
		cal.minus();
		cal.mul();
	
		
		
		
		
	}
}
