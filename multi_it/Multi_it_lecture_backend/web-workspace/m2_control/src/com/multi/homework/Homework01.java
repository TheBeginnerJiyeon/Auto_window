package com.multi.homework;

import javax.swing.*;

public class Homework01 {
	
	public static void main(String[] args) {
		//순차문 확인문제
		//158-1
		String number1 = JOptionPane.showInputDialog("정수 1을 입력");
		String number2 = JOptionPane.showInputDialog("정수 2을 입력");
		
		if (number1.length() == 0 || number2.length() == 0) {
			JOptionPane.showMessageDialog(null, "값을 입력해주세요!!");
		} else {
			try {
				int num1 = Integer.parseInt(number1);
				int num2 = Integer.parseInt(number2);
				int add = num1 + num2;
				int sub = num1 - num2;
				int mul = num1 * num2;
				double div = (double) num1 / num2;
				
				String str1 = num1 + "+" + num2 + "=" + add;
				String str2 = num1 + "-" + num2 + "=" + sub;
				String str3 = num1 + "*" + num2 + "=" + mul;
				String str4 = num1 + "/" + num2 + "=" + div;
				
				JOptionPane.showMessageDialog(null, str1);
				JOptionPane.showMessageDialog(null, str2);
				JOptionPane.showMessageDialog(null, str3);
				JOptionPane.showMessageDialog(null, str4);
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "정수를 입력해주세요!!" + "\n" + e.getMessage());
			}
			
			
		}
		
		
		//158-2
		
		double result = Double.parseDouble(JOptionPane.showInputDialog("현재 온도를 입력하세요."));
		
		if (result > 25) {
			JOptionPane.showMessageDialog(null, "너무 더워요.");
		} else {
			JOptionPane.showMessageDialog(null, "괜찮아요~");
		}
	}
	
	
}
