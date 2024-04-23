package com.multi.b_polymorphism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder {
	
	private static int count;
	private static final int PRICE = 5000;
	private static int result1 = 0;
	private static ImageIcon img;
	private static JLabel center;
	private static JTextField t1;
	private static JTextField t2;
	
	//public이 더 좋은 듯
	private static void method1(String buttonText) {
		
		ImageIcon img = new ImageIcon("images/" + buttonText + ".png");
		center.setIcon(img);
		count++;
		result1 = count * PRICE;
		t1.setText(count + "개");
		t2.setText(result1 + "원");
	}
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("음식점 주문 화면");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(823, 574);
		f.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("개수:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setBounds(489, 37, 68, 46);
		
		// 전역변수는 기울어진 모양
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.BOLD, 40));
		t1.setBounds(556, 32, 239, 44);
		t1.setColumns(10);
		
		
		center = new JLabel("");
		ImageIcon img = new ImageIcon("images/짜장면.png");
		center.setIcon(img);
		center.setBounds(124, 96, 559, 368);
		
		
		JLabel result = new JLabel("결제금액");
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setBounds(124, 464, 555, 61);
		
		t2 = new JTextField();
		t2.setBackground(Color.YELLOW);
		t2.setFont(new Font("굴림", Font.BOLD, 40));
		t2.setBounds(400, 470, 239, 44);
		t2.setColumns(10);
		
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton.setBounds(12, 10, 142, 66);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*ImageIcon img = new ImageIcon("images/짬뽕.png");
				center.setIcon(img);
				count++;
				result1 = count*PRICE;
				t1.setText(count+"개");
				t2.setText(result1+"원");*/
				
				
				/*method1(e.getActionCommand());*/
				
				String buttonText = btnNewButton.getText();
				method1(buttonText);
				
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(166, 10, 142, 66);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*ImageIcon img = new ImageIcon("images/우동.png");
				center.setIcon(img);
				count++;
				result1 = count*PRICE;
				t1.setText(count+"개");
				t2.setText(result1+"원");*/
				String buttonText = btnNewButton_1.getText();
				method1(buttonText);
				
				
			}
		});
		
		
		JButton btnNewButton_2 = new JButton("짜장면");
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 27));
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setBounds(320, 10, 142, 66);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*ImageIcon img = new ImageIcon("images/짜장면.png");
				center.setIcon(img);
				count++;
				result1 = count*PRICE;
				t1.setText(count+"개");
				t2.setText(result1+"원");*/
				String buttonText = btnNewButton_2.getText();
				method1(buttonText);
				
				
			}
		});
		
		
		f.getContentPane().add(lblNewLabel);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		f.getContentPane().add(center);
		f.getContentPane().add(result);
		f.getContentPane().add(btnNewButton);
		f.getContentPane().add(btnNewButton_1);
		f.getContentPane().add(btnNewButton_2);
		
		
		f.setVisible(true);
		
		
	}
	
	
}
