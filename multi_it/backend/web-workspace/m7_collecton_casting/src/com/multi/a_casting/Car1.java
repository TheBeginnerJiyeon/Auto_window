package com.multi.a_casting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Car1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 800);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton red = new JButton("---차1---");
		
		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel l1 = new JLabel("");
				l1.setBounds(200, 300, 100, 100);
				ImageIcon icon = new ImageIcon("img/car01.png");
				l1.setIcon(icon);
				f.add(l1);
				f.setVisible(true);
			}
		});
		
		
		JButton yellow = new JButton("---차2---");
		
		yellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel l2 = new JLabel("");
				l2.setBounds(200, 300, 100, 100);
				ImageIcon icon = new ImageIcon("img/car02.png");
				l2.setIcon(icon);
				f.add(l2);
				f.setVisible(true);
			}
		});
		
		
		JButton blue = new JButton("---차3---");
		blue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel l3 = new JLabel("");
				l3.setBounds(200, 300, 100, 100);
				ImageIcon icon = new ImageIcon("img/car03.png");
				l3.setIcon(icon);
				f.add(l3);
				f.setVisible(true);
			}
		});
		
		
		f.add(red);
		f.add(yellow);
		f.add(blue);
		
		
		f.setVisible(true);
		
		
	}
	
	
}
