package com.multi.a_casting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Car3_2 {
	private static JFrame f;
	static HashMap<String,String> map;
	
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
				Car3_2.show(str1);
			}
		});
		
		
		JButton yellow = new JButton("---차2---");
		
		yellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String str1 = yellow.getText();
				Car3_2.show(str1);
			}
		});
		
		
		JButton blue = new JButton("---차3---");
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// getText 대신 e.getActionCommand() 로 해도 됨ㅋㅋ
				String str1 = blue.getActionCommand();
				Car3_2.show(str1);
			}
		});
		
		
		f.add(red);
		f.add(yellow);
		f.add(blue);
		
		
		map=new HashMap<>();
		map.put("---차1---","img/car01.png");
		map.put("---차2---","img/car02.png");
		map.put("---차3---","img/car03.png");
		
		
		
		f.setVisible(true);
		
		
	}
	
	private static void show(String s1) {
		System.out.println(s1);
		String img=map.get(s1);
		System.out.println(img);
		System.out.println(map);
		JLabel l1 = new JLabel();
		l1.setBounds(200, 300, 100, 100);
		ImageIcon icon = new ImageIcon(img);
		l1.setIcon(icon);
		f.add(l1);
		f.setVisible(true);
		
		
	}
	
	
}
