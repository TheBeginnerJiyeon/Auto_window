package com.multi.a_inheritance.run;

import com.multi.a_inheritance.Manager;
import com.multi.a_inheritance.SuperMan;
import com.multi.a_inheritance.WonderWoman;

public class Run {
	public static void main(String[] args) {
		
		Manager m = new Manager();
		m.setName("손강"); // 임플로이의 셋네임
		System.out.println(m); // 매니저의 투스트링을 가져온다
		// 매니저가 정의 안되어있으면 임플로이의 투스트링을 가져온다
		// 애초에 오브젝트의 투스트링을 계속 연쇄적으로 오버라이드 한 것..
		
		SuperMan s1 = new SuperMan("슈퍼맨", 30, 200, true);
		System.out.println(s1);
		s1.eat(); // 휴먼의 메서드 바로 사용 가능
		s1.run(); // 맨의 메서드 바로 사용 가능
		s1.space(); // 슈퍼맨에서 정의한 메서드
		
		WonderWoman w1 = new WonderWoman("제니", 40, "파전", true);
		System.out.println(w1);
		w1.sleep();
		w1.eat();
		
		
	}
}
