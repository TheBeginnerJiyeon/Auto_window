package com.multi.homework;

import javax.swing.*;

public class exam04 {
	
	public static void main(String[] args) {
		String name= JOptionPane.showInputDialog("이름은 ");
		int age = Integer.parseInt(JOptionPane.showInputDialog("나이는 "));
		String place = JOptionPane.showInputDialog("사는 곳은 ");
		double weight= Double.parseDouble(JOptionPane.showInputDialog("몸무게는 "));
		boolean programer = Boolean.parseBoolean(JOptionPane.showInputDialog("프로그래머 여부 "));
		String color= JOptionPane.showInputDialog("좋아하는 색");
		
		System.out.println("친구의 이름은 " + name + "이고 나이는 " + age + "세이다.");
		System.out.println(place+"에 살고 "+"몸무게는 " + weight + "다." );
		System.out.println("좋아하는 색은 " + color + "가 들어가는 색이고, 프로그래머 여부는 " + programer +"이다." );
		
		
		
		
		
	}
	
	
}
