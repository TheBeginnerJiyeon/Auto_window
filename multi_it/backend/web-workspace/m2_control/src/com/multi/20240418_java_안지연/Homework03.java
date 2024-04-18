package com.multi.homework2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homework03 {
	
	
	public static void main(String[] args) {
		
		JFrame f=new JFrame();
		f.getContentPane().setLayout(null);
		f.setSize(500,800);
		f.setBackground(Color.GREEN);
		f.setTitle("먹고싶은 음식은?");
		f.setVisible(true);
		
		
		JLabel label1= new JLabel();
		label1.setBounds(20,50,200,50);
		label1.setText("먹고싶은 음식");
		label1.setFont(new Font("맑은 고딕",Font.BOLD,30));
		label1.setBackground(null);
		f.getContentPane().add(label1);
		
		JTextField text1= new JTextField();
		text1.setBounds(220,50,200,50);
		text1.setFont(new Font("맑은 고딕",Font.BOLD,20));
		text1.setBackground(Color.ORANGE);
		f.getContentPane().add(text1);
		
		JButton btn1= new JButton();
		btn1.setBounds(20,150,400,50);
		btn1.setFont(new Font("맑은 고딕",Font.BOLD,20));
		btn1.setText("어디로 갈까?");
		btn1.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(btn1);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str1=text1.getText();
				if(str1.equals("커피")||str1.equals("아이스아메리카노")||str1.equals("홍차")){
					JOptionPane.showMessageDialog(null, "카페로 갑시다");
				}else{
					JOptionPane.showMessageDialog(null, "물이나 드세요.");
				}
				
			}
		});
		
		
		
		
		
		JLabel label2= new JLabel();
		label2.setBounds(20,250,200,50);
		label2.setText("당신의 나이는?");
		label2.setFont(new Font("맑은 고딕",Font.BOLD,25));
		label2.setBackground(null);
		f.getContentPane().add(label2);
		
		JTextField text2= new JTextField();
		text2.setBounds(220,250,200,50);
		text2.setFont(new Font("맑은 고딕",Font.BOLD,20));
		text2.setBackground(Color.ORANGE);
		f.getContentPane().add(text2);
		
		JButton btn2= new JButton();
		btn2.setBounds(20,350,400,50);
		btn2.setFont(new Font("맑은 고딕",Font.BOLD,20));
		btn2.setText("나의 내년 나이는?");
		btn2.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(btn2);
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int str2=Integer.parseInt(text2.getText());
				int result=str2+1;
				JOptionPane.showMessageDialog(null, result+"살");
				
				
			}
		});
		
		
		
		
		JLabel label3= new JLabel();
		label3.setBounds(20,450,200,50);
		label3.setText("국어점수");
		label3.setFont(new Font("맑은 고딕",Font.BOLD,20));
		label3.setBackground(null);
		f.getContentPane().add(label3);
		
		JTextField text3= new JTextField();
		text3.setBounds(220,450,200,50);
		text3.setFont(new Font("맑은 고딕",Font.BOLD,20));
		text3.setBackground(Color.ORANGE);
		f.getContentPane().add(text3);
		
		JLabel label4= new JLabel();
		label4.setBounds(20,550,200,50);
		label4.setText("수학점수");
		label4.setForeground(Color.BLACK);
		label4.setFont(new Font("맑은 고딕",Font.BOLD,20));
		label4.setBackground(null);
		f.getContentPane().add(label4);
		
		JTextField text4= new JTextField();
		text4.setBounds(220,550,200,50);
		text4.setFont(new Font("맑은 고딕",Font.BOLD,20));
		text4.setBackground(Color.ORANGE);
		f.getContentPane().add(text4);
		
		JButton btn4= new JButton();
		btn4.setBounds(20,650,400,50);
		btn4.setFont(new Font("맑은 고딕",Font.BOLD,20));
		btn4.setText("두 과목의 점수의 평균은?");
		btn4.setBackground(Color.LIGHT_GRAY);
		f.getContentPane().add(btn4);
		
		
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(text3.getText());
				int num2=Integer.parseInt(text4.getText());
				double result=(double) (num1+num2)/2;
				JOptionPane.showMessageDialog(null, result+"점");
			}
		});
		
		
		
		
	}
	
	
}
