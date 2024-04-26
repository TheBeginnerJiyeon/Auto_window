package com.multi.homework.a_interface.dto;

import java.util.ArrayList;

public class BeanFactory {
	
	public void getBean(ArrayList<ArrayList> input) {
		
		for (int i = 0; i < input.size(); i++) {
			
			String gName = (String) (input.get(i).get(0));
			String name = (String) input.get(i).get(1);
			String gender = (String) input.get(i).get(2);
			int age = (int) input.get(i).get(3);
			
			if (gName.toUpperCase().equals("TWICE")) {
				Twice twice = new Twice(name, gender, age);
				
				ArrayList list = twice.getMemList();
				list.add(twice);
				twice.setMemList(list);
				
			} else if (gName.toUpperCase().equals("NEWJEANS")) {
				
				NewJeans njs = new NewJeans(name, gender, age);
				
				ArrayList list = njs.getMemList();
				list.add(njs);
				njs.setMemList(list);
			}
			
		}
		
		System.out.println("트와이스 전체 멤버 구성 : ");
		for (int j = 0; j < Twice.getMemList().size(); j++) {
			System.out.println("---------------------------------------");
			Twice t1 = (Twice) (Twice.getMemList().get(j));
			System.out.println(t1);
			t1.act();
			t1.spicy();
			t1.dance();
		}
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		
		System.out.println("뉴진스 전체 멤버 구성 : ");
		for (int j = 0; j < NewJeans.getMemList().size(); j++) {
			System.out.println("---------------------------------------");
			NewJeans n1 = (NewJeans) (NewJeans.getMemList().get(j));
			System.out.println(n1);
			n1.act();
			n1.spicy();
			n1.sing();
		}
		
	}
	
	
}
