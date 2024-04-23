package com.multi.a_constructor;

public class MyRoom {
	public static void main(String[] args) {
		/*
		Tv tv1=new Tv(1, 10, true);
		Tv tv2=new Tv(2, 20, false);
		
		System.out.println(tv1); // toString 안해주고 객체 이름만 적어도 그 양식으로 나옴*/
		
		Tv tv1 = new Tv();
		tv1.on();
		Tv tv2 = new Tv();
		tv2.on();
		tv2.off();
		
		
		Tv tv3 = new Tv(7, 8, false);
		Tv tv4 = new Tv(11, 8, true);
		
		
		System.out.println(tv3);
		System.out.println(tv4);
		System.out.println("객체 생성 갯수는 ? " + Tv.count); // 스테틱(메서드, 필드) 호출은 객체 생성없이 가능함
		
		
		
		
	}
}
