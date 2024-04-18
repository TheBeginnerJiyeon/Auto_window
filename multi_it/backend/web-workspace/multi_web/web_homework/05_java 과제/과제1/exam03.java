package com.multi.homework;

import javax.swing.*;

public class exam03 {
	
	public static void main(String[] args) {
		String com = JOptionPane.showInputDialog("통신사 입력: ");
		String tel = JOptionPane.showInputDialog("전화번호 입력: ");
		String name = JOptionPane.showInputDialog("가입자 이름 입력: ");
		
		System.out.println("문자열 연결");
		System.out.println(name + "님은 " + com + "에 "+ tel + " 로 가입되셨습니다." );
		
		
	}
	
	
}
