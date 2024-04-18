package com.multi.homework;

import javax.swing.*;

public class exam01 {
	
	public static void main(String[] args) {
		
		int width = Integer.parseInt(JOptionPane.showInputDialog("width: "));
		int height = Integer.parseInt(JOptionPane.showInputDialog("height: "));
		
		int area = width * height;
		
		System.out.println("area = " + area);
	}
	
	
}
