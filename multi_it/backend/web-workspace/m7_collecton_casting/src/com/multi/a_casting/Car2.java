package com.multi.a_casting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Car2 {
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
				
				Car2.show("img/car01.png");
			}
		});
		
		
		JButton yellow = new JButton("---차2---");
		
		yellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Car2.show("img/car02.png");
			}
		});
		
		
		JButton blue = new JButton("---차3---");
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Car2.show("img/car03.png");
			}
		});
		
		
		f.add(red);
		f.add(yellow);
		f.add(blue);
		
		
		f.setVisible(true);
		
		
	}
	
	private static void show(String s) {
		JLabel l1 = new JLabel("");
		l1.setBounds(200, 300, 100, 100);
		ImageIcon icon = new ImageIcon(s);
		l1.setIcon(icon);
		f.add(l1);
		f.setVisible(true); // 셋 비지블 잊지 말기!!!
		
		
	}
	
	
}
