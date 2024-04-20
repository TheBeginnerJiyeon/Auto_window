package com.multi.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homework02 {
	
	private static int now = 0;
	private static int f1 = 0;
	private static int f2 = 0;
	private static int f3 = 0;
	private static int sum = f1 + f2 + f3;
	private static int[] prices = {8000, 11000, 6000};
	private static int pay = 0;
	
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("결제화면");
		f.setSize(700, 800);
		f.getContentPane().setLayout(null);
		f.setBackground(Color.lightGray);
		
		
		String[] images = {"짬뽕.jpg", "우동.jpg", "짜장.jpg"};
		
		
		// 이미지 크기 변환
		ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + images[now]);
		Image img1 = icon.getImage();
		Image changeImg1 = img1.getScaledInstance(600, 400, Image.SCALE_SMOOTH);
		ImageIcon img2 = new ImageIcon(changeImg1);
		JLabel img = new JLabel(img2);
		img.setBounds(30, 200, 600, 400);
		f.add(img);
		
		
		// 주문 개수
		JLabel rate = new JLabel();
		rate.setText("<html>짬뽕: " + f1 + "개<br>" + "우동: " + f2 + "개<br>" + "짜장: " + f3 + "개<br>" + "총 ->" + sum + "개<html>");
		rate.setHorizontalAlignment(SwingConstants.CENTER);
		rate.setForeground(Color.BLACK);
		rate.setBackground(Color.WHITE);
		rate.setOpaque(true);
		rate.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		rate.setBounds(350, 50, 300, 100);
		rate.setFont(new Font("돋움", Font.BOLD, 15));
		
		f.getContentPane().add(rate);
		
		
		// 총 가격
		JLabel total = new JLabel();
		total.setText(pay + "원");
		total.setHorizontalAlignment(SwingConstants.CENTER);
		total.setForeground(Color.RED);
		total.setBackground(Color.WHITE);
		total.setOpaque(true);
		total.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		total.setBounds(330, 610, 300, 100);
		total.setFont(new Font("돋움", Font.BOLD, 50));
		
		f.getContentPane().add(total);
		
		
		f.setVisible(true);
		
		
		// 음식 버튼
		JButton food1 = new JButton();
		food1.setHorizontalAlignment(SwingConstants.CENTER);
		food1.setText("짬뽕");
		food1.setBounds(30, 50, 90, 90);
		food1.setOpaque(true);
		food1.setForeground(Color.WHITE);
		food1.setBackground(Color.orange);
		food1.setFont(new Font("돋움", Font.BOLD, 15));
		f.getContentPane().add(food1);
		
		food1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				now = 0;
				f1++;
				sum++;
				rate.setText("<html>짬뽕: " + f1 + "개<br>" + "우동: " + f2 + "개<br>" + "짜장: " + f3 + "개<br>" + "총 ->" + sum + "개<html>");
				
				ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + images[now]);
				Image img1 = icon.getImage();
				Image changeImg1 = img1.getScaledInstance(600, 400, Image.SCALE_SMOOTH);
				ImageIcon img2 = new ImageIcon(changeImg1);
				img.setIcon(img2);
				
				
				pay = prices[0] * f1 + prices[1] * f2 + prices[2] * f3;
				total.setText(pay + "원");
				
			}
		});
		
		
		JButton food2 = new JButton();
		food2.setHorizontalAlignment(SwingConstants.CENTER);
		food2.setText("우동");
		food2.setBounds(130, 50, 90, 90);
		food2.setOpaque(true);
		food2.setForeground(Color.WHITE);
		food2.setBackground(Color.BLUE);
		food2.setFont(new Font("돋움", Font.BOLD, 15));
		f.getContentPane().add(food2);
		
		
		food2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				now = 1;
				f2++;
				sum++;
				rate.setText("<html>짬뽕: " + f1 + "개<br>" + "우동: " + f2 + "개<br>" + "짜장: " + f3 + "개<br>" + "총 ->" + sum + "개<html>");
				
				ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + images[now]);
				Image img1 = icon.getImage();
				Image changeImg1 = img1.getScaledInstance(600, 400, Image.SCALE_SMOOTH);
				ImageIcon img2 = new ImageIcon(changeImg1);
				img.setIcon(img2);
				
				pay = prices[0] * f1 + prices[1] * f2 + prices[2] * f3;
				total.setText(pay + "원");
				
			}
		});
		
		
		JButton food3 = new JButton();
		food3.setHorizontalAlignment(SwingConstants.CENTER);
		food3.setText("짜장");
		food3.setBounds(230, 50, 90, 90);
		food3.setOpaque(true);
		food3.setForeground(Color.WHITE);
		food3.setBackground(Color.darkGray);
		food3.setFont(new Font("돋움", Font.BOLD, 15));
		f.getContentPane().add(food3);
		
		food3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				now = 2;
				f3++;
				sum++;
				rate.setText("<html>짬뽕: " + f1 + "개<br>" + "우동: " + f2 + "개<br>" + "짜장: " + f3 + "개<br>" + "총 ->" + sum + "개<html>");
				
				ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + images[now]);
				Image img1 = icon.getImage();
				Image changeImg1 = img1.getScaledInstance(600, 400, Image.SCALE_SMOOTH);
				ImageIcon img2 = new ImageIcon(changeImg1);
				img.setIcon(img2);
				
				pay = prices[0] * f1 + prices[1] * f2 + prices[2] * f3;
				total.setText(pay + "원");
				
			}
		});
		
		
		// 지불 레이블
		JLabel label2 = new JLabel();
		label2.setText("지불할 총 금액");
		label2.setHorizontalAlignment(SwingConstants.LEFT);
		label2.setForeground(Color.BLACK);
		label2.setBounds(30, 600, 400, 120);
		label2.setFont(new Font("돋움", Font.BOLD, 40));
		
		f.getContentPane().add(label2);
		
		
	}
}
