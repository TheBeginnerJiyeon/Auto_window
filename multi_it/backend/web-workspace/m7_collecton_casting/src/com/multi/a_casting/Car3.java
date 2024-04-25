package com.multi.a_casting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Car3 {
	private static JFrame f;
	
	
	public static void main(String[] args) {
		f = new JFrame();
		f.setSize(400, 800);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton red = new JButton("---차1---");
		
		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String str1 = red.getText();
				Car3.show(str1);
			}
		});
		
		
		JButton yellow = new JButton("---차2---");
		
		yellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String str1 = yellow.getText();
				Car3.show(str1);
			}
		});
		
		
		JButton blue = new JButton("---차3---");
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getText 대신 e.getActionCommand() 로 해도 됨ㅋㅋ
				String str1 = blue.getActionCommand();
				Car3.show(str1);
			}
		});
		
		
		f.add(red);
		f.add(yellow);
		f.add(blue);
		
		
		f.setVisible(true);
		
		
	}
	
	private static void show(String s1) {
		int idx = s1.indexOf("차");
		String s2 = s1.substring(idx + 1, idx + 2);
		// 수업은 equals로 세개 값 비교
		JLabel l1 = new JLabel();
		l1.setBounds(200, 300, 100, 100);
		ImageIcon icon = new ImageIcon("img/car0" + s2 + ".png");
		l1.setIcon(icon);
		f.add(l1);
		f.setVisible(true);
		
		
	}
	
	
}
