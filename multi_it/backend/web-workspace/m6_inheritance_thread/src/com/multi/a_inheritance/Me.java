package com.multi.a_inheritance;

import java.util.ArrayList;

public class Me {
	
	public static void main(String[] args) {
		ArrayList listMe = new ArrayList();
		listMe.add("안지연");
		listMe.add(30);
		listMe.add(2.8);
		listMe.add(true);
		listMe.add("여자");
		
		System.out.println(listMe);
		for (int i = 0; i < listMe.size(); i++) {
			System.out.println(listMe.get(i));
		}
		
		
		
		System.out.println("나의 이름은 " + listMe.get(0));
		
		System.out.println("나의 내년 나이는 " +( (Integer) listMe.get(1) + 1));
		System.out.println("나의 시력은 " + ((double)listMe.get(2)+0.2));
		
		if( ((Boolean) listMe.get(3))==true){
			System.out.println("아침을 먹었습니다.");
		}else {
			System.out.println("아침을 안먹었습니다.");
		}
		
		System.out.println("나는 " + listMe.get(4) + "입니다.");
		
		
	}
	
	
}
