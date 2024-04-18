package com.multi.b_operator;

import javax.swing.*;

public class Exec02 {
	
	public static void main(String[] args) {
		
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("n1"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("n2"));
		
		//double n1=Double.parseDouble("1.2");
		//double n2=Double.parseDouble("1.3030");
		
		//System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		//System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		//System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		//System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		
		
		/*String number1 = JOptionPane.showInputDialog("숫자1");
		String number2 = JOptionPane.showInputDialog("숫자2");*/
		
		// n2에 담기는 수 포함 0부터
		
		for(int i = 0; i < n2+1; i++) {
			System.out.println(i);
		}
		
		String p1=JOptionPane.showInputDialog("시작값");
		String p2=JOptionPane.showInputDialog("종료값");
		
		int num11=Integer.parseInt(p1);
		int num22=Integer.parseInt(p2);
		
		for (int i = num11; i <= num22; i++) {
			System.out.println(i);}
		
		//데이터 입력, 반복 횟수
		String n3=JOptionPane.showInputDialog("n3");
		String n4=JOptionPane.showInputDialog("n4");
		
		int num33=Integer.parseInt(n3);
		int num44=Integer.parseInt(n4);
		
		for(int i = 1; i <= num44; i++) {
			System.out.println(num33);
		}
	}
}