package com.multi.e_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exec04 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(500, 1000);
		f.getContentPane().setLayout(null);
		
		JLabel nameLabel = new JLabel("숫자1");
		nameLabel.setFont(new Font("굴림", Font.BOLD, 20));
		nameLabel.setBounds(25, 40, 105, 43);
		f.getContentPane().add(nameLabel);
		
		JTextField textField1 = new JTextField();
		textField1.setFont(new Font("굴림", Font.BOLD, 20));
		textField1.setBounds(137, 40, 284, 37);
		f.getContentPane().add(textField1);
		
		JLabel nameLabel2 = new JLabel("숫자2");
		nameLabel2.setFont(new Font("굴림", Font.BOLD, 20));
		nameLabel2.setBounds(25, 115, 105, 43);
		f.getContentPane().add(nameLabel2);
		
		JTextField textField2 = new JTextField();
		textField2.setForeground(Color.BLUE);
		textField2.setFont(new Font("굴림", Font.BOLD, 20));
		textField2.setBounds(137, 115, 284, 37);
		f.getContentPane().add(textField2);
		
		
		JLabel imgLabel = new JLabel();// 다시 들어가서 이미지 경로 바꾸기(컨텐트 경로로), 경로 뭐가 뭔지 알아보기
		imgLabel.setIcon(new ImageIcon("C:\\Users\\dkswl\\OneDrive\\Documents\\code_upload\\Auto_window\\multi_it\\Multi_it_lecture_backend\\web-workspace\\m2_control\\img\\Image20240418150720.gif"));
		textField2.setFont(new Font("굴림", Font.BOLD, 20));
		imgLabel.setBounds(38, 241, 422, 321);
		f.getContentPane().add(imgLabel);
		
		JButton plus = new JButton("+");
		plus.setFont(new Font("굴림", Font.BOLD, 20));
		plus.setForeground(Color.WHITE);
		plus.setBackground(Color.GREEN);
		plus.setBounds(23, 175, 107, 56);
		f.getContentPane().add(plus);
		
		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "플러스 버튼을 누르셨군요.");
				int num1 = Integer.parseInt(textField1.getText());
				int num2 = Integer.parseInt(textField2.getText());
				int sum = num1 + num2;
				
				f.setTitle("더한 결과는 " + sum);
				textField1.setText("");
				textField2.setText("");
				
			}
		});
		
		
		JButton minus = new JButton("-");
		minus.setFont(new Font("굴림", Font.BOLD, 20));
		minus.setForeground(Color.WHITE);
		minus.setBackground(Color.YELLOW);
		minus.setBounds(142, 175, 107, 56);
		f.getContentPane().add(minus);
		
		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "마이너스 버튼을 누르셨군요.");
				int num1 = Integer.parseInt(textField1.getText());
				int num2 = Integer.parseInt(textField2.getText());
				int result = num1 - num2;
				
				f.setTitle("뺀 결과는 " + result);
				textField1.setText("");
				textField2.setText("");
				
			}
		});
		
		
		JButton multiply = new JButton("*");
		multiply.setFont(new Font("굴림", Font.BOLD, 20));
		multiply.setForeground(Color.WHITE);
		multiply.setBackground(Color.BLUE);
		multiply.setBounds(266, 175, 107, 56);
		f.getContentPane().add(multiply);
		
		
		multiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "곱하기 버튼을 누르셨군요.");
				int num1 = Integer.parseInt(textField1.getText());
				int num2 = Integer.parseInt(textField2.getText());
				int result = num1 * num2;
				
				f.setTitle("곱한 결과는 " + result);
				textField1.setText("");
				textField2.setText("");
				
			}
		});
		
		
		JButton divide = new JButton("/");
		divide.setFont(new Font("굴림", Font.BOLD, 20));
		divide.setForeground(Color.WHITE);
		divide.setBackground(Color.red);
		divide.setBounds(385, 175, 107, 56);
		f.getContentPane().add(divide);
		
		
		divide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "나누기 버튼을 누르셨군요.");
				int num1 = Integer.parseInt(textField1.getText());
				int num2 = Integer.parseInt(textField2.getText());
				int result = num1 / num2;
				
				f.setTitle("나눈 결과는 " + result);
				textField1.setText("");
				textField2.setText("");
				
			}
		});
		
		
		f.setVisible(true);
		
		
	}
}
