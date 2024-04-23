package com.multi.c_static;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter {
	
	private static int count = 0;
	
	
	public static void main(String[] args) {
		
		
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(400, 300);
		f.setLayout(new FlowLayout());
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel number = new JLabel("0");
		
		JButton plus = new JButton("1더하기");
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(Integer.toString(count));
			}
		});
		
		JButton reset = new JButton("0으로 초기화");
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(Integer.toString(count));
			}
		});
		
		
		JButton minus = new JButton("1빼기");
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count -=1; // count--;
				number.setText(Integer.toString(count));
			}
		});
		
		
		number.setForeground(Color.red);
		
		Font font = new Font("궁서", Font.BOLD, 15);
		plus.setFont(font);
		reset.setFont(font);
		minus.setFont(font);
		
		number.setFont(new Font("궁서", Font.BOLD, 150));
		
		f.add(plus);
		f.add(reset);
		f.add(minus);
		f.add(number);
		
		
		f.setVisible(true);
		
		
	}
	
	
}
