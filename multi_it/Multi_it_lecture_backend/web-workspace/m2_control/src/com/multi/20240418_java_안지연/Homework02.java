package com.multi.homework2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homework02 {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("로그인 화면");
		f.setSize(600, 800);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.setBackground(Color.GREEN);
		
		JLabel id = new JLabel("아이디: ");
		id.setFont(new Font("HY견고딕", Font.BOLD, 30));
		id.setBounds(20, 100, 200, 100);
		f.getContentPane().add(id);
		
		JTextField text1 = new JTextField();
		text1.setFont(new Font("HY견고딕", Font.BOLD, 30));
		text1.setBounds(180, 120, 180, 70);
		text1.setBackground(Color.YELLOW);
		f.getContentPane().add(text1);
		
		JLabel pw = new JLabel("패스워드: ");
		pw.setFont(new Font("HY견고딕", Font.BOLD, 30));
		pw.setBounds(20, 200, 200, 100);
		f.getContentPane().add(pw);
		
		JTextField text2 = new JTextField();
		text2.setFont(new Font("HY견고딕", Font.BOLD, 30));
		text2.setBounds(180, 220, 180, 70);
		text2.setBackground(Color.YELLOW);
		f.getContentPane().add(text2);
		
		JButton btn1 = new JButton();
		btn1.setText("로그인확인");
		btn1.setFont(new Font("HY견고딕", Font.BOLD, 20));
		btn1.setBounds(30, 320, 150, 70);
		btn1.setBackground(Color.ORANGE);
		f.getContentPane().add(btn1);
		
		
		JTextField result = new JTextField("");
		result.setBackground(null);
		result.setBorder(null);
		result.setBounds(30, 420, 500, 100);
		result.setFont(new Font("HY견고딕", Font.BOLD, 30));
		f.getContentPane().add(result);
		
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id_check = text1.getText();
				String pw_check = text2.getText();
				String id_real = "root";
				String pw_check_real = "1234";
				
				if (id_check.equals(id_real) && (pw_check.equals(pw_check_real))) {
					result.setText("로그인 성공");
					result.setForeground(Color.BLUE);
					
					
				} else {
					result.setText("로그인 실패");
					result.setForeground(Color.RED);
				}
			}
		});
		
		
		JButton btn2 = new JButton();
		btn2.setText("지우기");
		btn2.setFont(new Font("HY견고딕", Font.BOLD, 20));
		btn2.setBounds(230, 320, 150, 70);
		btn2.setBackground(Color.ORANGE);
		f.getContentPane().add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				text2.setText("");
				result.setText("");
				
			}
		});
		
		
	}
}
