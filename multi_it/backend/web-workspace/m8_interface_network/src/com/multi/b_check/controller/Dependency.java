package com.multi.b_check.controller;

import com.multi.b_check.dto.BeanFactory;
import com.multi.b_check.dto.BlackPink;
import com.multi.b_check.dto.Singer;
import com.multi.b_check.dto.Twice;

import java.util.Scanner;

public class Dependency {
	
	
	public void doGet() {
		// 1. 일반 객체 생성
		
		Twice singer= new Twice();
		singer.sing();
		singer.compose();
		singer.dance();
		
		//2. 인터페이스를 사용해 결합도를 낮춘다.
		Singer singer1= new BlackPink();
		singer1.sing();
		singer1.compose();
		singer1.dance();
		
		
		//3. 전략 디자인 패턴
		Scanner sc= new Scanner(System.in);
		System.out.println("만들 가수 그룹을 입력하세요");
		
		String enter= sc.nextLine();
		
		Singer singer2= (Singer) BeanFactory.getBean(enter);
		
		singer2.sing();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
