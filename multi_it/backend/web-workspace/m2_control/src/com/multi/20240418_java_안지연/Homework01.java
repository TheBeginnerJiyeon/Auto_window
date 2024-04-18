package com.multi.homework2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homework01 {
	
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(400, 800);
		f.setTitle("Winning");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		int ran = (int) (Math.random() * 49 + 1);
		System.out.println(ran + 1);
		
		JButton[] btns = new JButton[49];
		
		for (int i = 0; i < 49; i++) {
			JButton btn = new JButton(i + 1 + "번");
			btn.setBackground(Color.lightGray);
			btn.setForeground(Color.black);
			btn.setFont(new Font("HY견고딕", Font.BOLD, 15));
			btn.getMargin().set(10, 5, 10, 5);
			btns[i] = btn;
			f.getContentPane().add(btn);
		}
		
		for (int i = 0; i < 49; i++) {
			if (i == ran) {
				btns[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "당첨입니다.");
						System.exit(0);
					}
				});
				
			} else {
				btns[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "꽝입니다.");
					}
				});
				
				
			}
			
			
		}
	}
	
	
}
		
		

