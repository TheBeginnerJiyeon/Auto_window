package com.multi.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
	
	private String now = "짜장면";
	
	public void windowPop() {
		
		Food f1 = new Food();
		
		JFrame f = new JFrame();
		f.setTitle("음식 주문 화면");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.green);
		f.setSize(1000, 1000);
		
		JButton b1 = new JButton("짜장면");
		b1.setBounds(20, 50, 140, 100);
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setForeground(Color.BLACK);
		b1.setFont(new Font("굴림", Font.BOLD, 25));
		
		
		JButton b2 = new JButton("짬뽕");
		b2.setBounds(180, 50, 140, 100);
		b2.setBackground(Color.LIGHT_GRAY);
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("굴림", Font.BOLD, 25));
		
		
		JButton b3 = new JButton("우동");
		b3.setBounds(340, 50, 140, 100);
		b3.setBackground(Color.LIGHT_GRAY);
		b3.setForeground(Color.BLACK);
		b3.setFont(new Font("굴림", Font.BOLD, 25));
		
		JLabel l1 = new JLabel("개수 : ");
		l1.setBounds(520, 50, 140, 100);
		l1.setBackground(null);
		l1.setForeground(Color.pink);
		l1.setFont(new Font("굴림", Font.BOLD, 40));
		
		
		JTextField t1 = new JTextField("0개");
		t1.setHorizontalAlignment(JTextField.CENTER);
		t1.setBounds(650, 50, 300, 100);
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.pink);
		t1.setFont(new Font("굴림", Font.BOLD, 40));
		
		
		JLabel l2 = new JLabel("");
		ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + now + ".jpg");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		l2.setIcon(changeIcon);
		l2.setBounds(80, 200, 800, 500);
		
		
		JTextField t2 = new JTextField("결제금액 : 0원     ");
		t2.setBounds(80, 800, 800, 100);
		t2.setBackground(null);
		t2.setForeground(Color.red);
		t2.setHorizontalAlignment(JTextField.CENTER);
		t2.setFont(new Font("굴림", Font.BOLD, 40));
		
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Jajangmyeon j = new Jajangmyeon();
				j.button_click(j, "짜장면", t1, t2, l2);
				
				
				/*Jajangmyeon j = new Jajangmyeon();
				Food f1 = new Food();
				now = "짜장면";
				t1.setText(f1.getTotal_count() + "개");
				t2.setText("결제금액 :      " + f1.getTotal_price() + "원");
				ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + now + ".jpg");
				Image img = icon.getImage();
				Image changeImg = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
				ImageIcon changeIcon = new ImageIcon(changeImg);
				l2.setIcon(changeIcon);
				
				System.out.println(j.toString());*/
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Jjambbong j = new Jjambbong();
				j.button_click(j, "짬뽕", t1, t2, l2);
				
				/*Jjambbong j = new Jjambbong();
				Food f1 = new Food();
				now = "짬뽕";
				t1.setText(f1.getTotal_count() + "개");
				t2.setText("결제금액 :      " + f1.getTotal_price() + "원");
				ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + now + ".jpg");
				Image img = icon.getImage();
				Image changeImg = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
				ImageIcon changeIcon = new ImageIcon(changeImg);
				l2.setIcon(changeIcon);
				
				System.out.println(j.toString());*/
				
			}
		});
		
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Udon j = new Udon();
				j.button_click(j, "우동", t1, t2, l2);
				
				
				/*Udon j = new Udon();
				Food f1 = new Food();
				now = "우동";
				t1.setText(f1.getTotal_count() + "개");
				t2.setText("결제금액 :      " + f1.getTotal_price() + "원");
				ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + now + ".jpg");
				Image img = icon.getImage();
				Image changeImg = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH);
				ImageIcon changeIcon = new ImageIcon(changeImg);
				l2.setIcon(changeIcon);
				
				System.out.println(j.toString());*/
				
			}
		});
		
		
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		
		f.getContentPane().add(l2);
		f.getContentPane().add(t2);
		
		
		f.setVisible(true);
		
		
	}
	
	
}
