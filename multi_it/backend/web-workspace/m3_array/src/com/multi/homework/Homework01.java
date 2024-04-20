package com.multi.homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homework01 {
	
	private static int now = 0;
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("현재 상영작");
		f.setSize(700, 700);
		f.getContentPane().setLayout(null);
		f.setBackground(Color.lightGray);
		
		
		JLabel label1 = new JLabel();
		label1.setText("현재 상영작");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setForeground(Color.BLACK);
		label1.setBounds(30, 20, 250, 100);
		label1.setFont(new Font("돋움", Font.BOLD, 30));
		f.getContentPane().add(label1);
		
		String[] images = {"지푸라기.jpg", "정직한 후보.jpg", "1917.jpg", "작은 아씨들.jpg", "클로젯.jpg"};
		double[] rates = {15.5, 16.7, 23.1, 24.0, 25};
		
		
		// 이미지 크기 변환
		ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + images[now]);
		Image img1 = icon.getImage();
		Image changeImg1 = img1.getScaledInstance(350, 480, Image.SCALE_SMOOTH);
		ImageIcon img2 = new ImageIcon(changeImg1);
		JLabel img = new JLabel(img2);
		img.setBounds(180, -33, 600, 820);
		f.add(img);
		
		// 예매율
		JLabel rate = new JLabel();
		rate.setText("예매율: " + rates[now] + "%");
		rate.setHorizontalAlignment(SwingConstants.CENTER);
		rate.setForeground(Color.BLACK);
		rate.setBackground(Color.WHITE);
		rate.setOpaque(true);
		rate.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		rate.setBounds(330, 20, 250, 100);
		rate.setFont(new Font("돋움", Font.BOLD, 30));
		
		f.getContentPane().add(rate);
		
		
		// 영화 버튼 시작
		JButton movie1 = new JButton();
		movie1.setHorizontalAlignment(SwingConstants.CENTER);
		movie1.setText("지푸라기");
		movie1.setBounds(30, 130, 250, 90);
		movie1.setOpaque(true);
		movie1.setForeground(Color.WHITE);
		movie1.setBackground(Color.darkGray);
		movie1.setFont(new Font("돋움", Font.BOLD, 30));
		f.getContentPane().add(movie1);
		
		movie1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				now = 0;
				rate.setText("예매율: " + rates[now] + "%");
				ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + images[now]);
				Image img1 = icon.getImage();
				Image changeImg1 = img1.getScaledInstance(350, 480, Image.SCALE_SMOOTH);
				ImageIcon img2 = new ImageIcon(changeImg1);
				img.setIcon(img2);
				
			}
		});
		
		
		JButton movie2 = new JButton();
		movie2.setHorizontalAlignment(SwingConstants.CENTER);
		movie2.setText("정직한 후보");
		movie2.setBounds(30, 230, 250, 90);
		movie2.setOpaque(true);
		movie2.setForeground(Color.WHITE);
		movie2.setBackground(Color.darkGray);
		movie2.setFont(new Font("돋움", Font.BOLD, 30));
		f.getContentPane().add(movie2);
		
		
		movie2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				now = 1;
				rate.setText("예매율: " + rates[now] + "%");
				ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + images[now]);
				Image img1 = icon.getImage();
				Image changeImg1 = img1.getScaledInstance(350, 480, Image.SCALE_SMOOTH);
				ImageIcon img2 = new ImageIcon(changeImg1);
				img.setIcon(img2);
				
			}
		});
		
		
		JButton movie3 = new JButton();
		movie3.setHorizontalAlignment(SwingConstants.CENTER);
		movie3.setText("1917");
		movie3.setBounds(30, 330, 250, 90);
		movie3.setOpaque(true);
		movie3.setForeground(Color.WHITE);
		movie3.setBackground(Color.darkGray);
		movie3.setFont(new Font("돋움", Font.BOLD, 30));
		f.getContentPane().add(movie3);
		
		movie3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				now = 2;
				rate.setText("예매율: " + rates[now] + "%");
				ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + images[now]);
				Image img1 = icon.getImage();
				Image changeImg1 = img1.getScaledInstance(350, 480, Image.SCALE_SMOOTH);
				ImageIcon img2 = new ImageIcon(changeImg1);
				img.setIcon(img2);
				
			}
		});
		
		
		JButton movie4 = new JButton();
		movie4.setHorizontalAlignment(SwingConstants.CENTER);
		movie4.setText("작은 아씨들");
		movie4.setBounds(30, 430, 250, 90);
		movie4.setOpaque(true);
		movie4.setForeground(Color.WHITE);
		movie4.setBackground(Color.darkGray);
		movie4.setFont(new Font("돋움", Font.BOLD, 30));
		f.getContentPane().add(movie4);
		
		
		movie4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				now = 3;
				rate.setText("예매율: " + rates[now] + "%");
				ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + images[now]);
				Image img1 = icon.getImage();
				Image changeImg1 = img1.getScaledInstance(350, 480, Image.SCALE_SMOOTH);
				ImageIcon img2 = new ImageIcon(changeImg1);
				img.setIcon(img2);
				
			}
		});
		
		
		JButton movie5 = new JButton();
		movie5.setHorizontalAlignment(SwingConstants.CENTER);
		movie5.setText("클로젯");
		movie5.setBounds(30, 530, 250, 90);
		movie5.setOpaque(true);
		movie5.setForeground(Color.WHITE);
		movie5.setBackground(Color.darkGray);
		movie5.setFont(new Font("돋움", Font.BOLD, 30));
		f.getContentPane().add(movie5);
		
		
		movie5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				now = 4;
				rate.setText("예매율: " + rates[now] + "%");
				ImageIcon icon = new ImageIcon("src/com/multi/homework/img/" + images[now]);
				Image img1 = icon.getImage();
				Image changeImg1 = img1.getScaledInstance(350, 480, Image.SCALE_SMOOTH);
				ImageIcon img2 = new ImageIcon(changeImg1);
				img.setIcon(img2);
				
			}
		});
		
		
		f.setVisible(true);
		
		
	}
}
