package com.multi.homework2;

import javax.swing.*;
import java.awt.*;

public class Homework5 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.setVisible(true);
		f.setBackground(Color.GRAY);
		f.getContentPane().setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel label1 = new JLabel();
		label1.setText("K-pop 인기 투표");
		label1.setFont(new Font("굴림", Font.BOLD, 30));
		label1.setForeground(Color.black);
		label1.setBackground(null);
		label1.setBounds(130, 50, 500, 50);
		f.add(label1);
		
		
		// 1. 나중에 경로 고치기
		ImageIcon icon = new ImageIcon("src/com/multi/20240418_java_안지연/img/iu.jpeg");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel label2 = new JLabel(changeIcon);
		label2.setBounds(50, 150, 100, 100);
		f.add(label2);
		
		JLabel label3 = new JLabel();
		label3.setText("1. 아이유-라일락");
		label3.setFont(new Font("굴림", Font.BOLD, 20));
		label3.setForeground(Color.black);
		label3.setBackground(null);
		label3.setBounds(200, 150, 300, 40);
		f.add(label3);
		
		JLabel label4 = new JLabel();
		label4.setText("0표");
		label4.setFont(new Font("굴림", Font.BOLD, 20));
		label4.setForeground(Color.black);
		label4.setBackground(null);
		label4.setBounds(250, 200, 300, 40);
		f.add(label4);
		
		
		// 2. 나중에 경로 고치기
		ImageIcon icon2 = new ImageIcon("src/com/multi/20240418_java_안지연/img/promise.jpg");
		Image img2 = icon2.getImage();
		Image changeImg2 = img2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon changeIcon2 = new ImageIcon(changeImg2);
		JLabel label5 = new JLabel(changeIcon2);
		label5.setBounds(50, 300, 100, 100);
		f.add(label5);
		
		JLabel label6 = new JLabel();
		label6.setText("2. 프로미스나인-we go");
		label6.setFont(new Font("굴림", Font.BOLD, 20));
		label6.setForeground(Color.black);
		label6.setBackground(null);
		label6.setBounds(200, 300, 300, 40);
		f.add(label6);
		
		JLabel label7 = new JLabel();
		label7.setText("0표");
		label7.setFont(new Font("굴림", Font.BOLD, 20));
		label7.setForeground(Color.black);
		label7.setBackground(null);
		label7.setBounds(250, 350, 300, 40);
		f.add(label7);
		
		
		// 3. 나중에 경로 고치기
		ImageIcon icon3 = new ImageIcon("src/com/multi/20240418_java_안지연/img/stayc.jpg");
		Image img3 = icon3.getImage();
		Image changeImg3 = img3.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon changeIcon3 = new ImageIcon(changeImg3);
		JLabel label8 = new JLabel(changeIcon3);
		label8.setBounds(50, 450, 100, 100);
		f.add(label8);
		
		JLabel label9 = new JLabel();
		label9.setText("3. 스테이씨-ASAP");
		label9.setFont(new Font("굴림", Font.BOLD, 20));
		label9.setForeground(Color.black);
		label9.setBackground(null);
		label9.setBounds(200, 450, 300, 40);
		f.add(label9);
		
		JLabel label10 = new JLabel();
		label10.setText("0표");
		label10.setFont(new Font("굴림", Font.BOLD, 20));
		label10.setForeground(Color.black);
		label10.setBackground(null);
		label10.setBounds(250, 500, 300, 40);
		f.add(label10);
		
		
		// 인기투표
		
		boolean check1 = true;
		int iu = 0;
		int promise = 0;
		int stacy = 0;
		
		while (check1) {
			
			String input1 = JOptionPane.showInputDialog("이번 주 인기 노래는?" + "\n" + "1. 아이유-라일락" + "\n" + "2. 프로미스나인-we go" + "\n" + "3. 스테이씨-ASAP");
			
			try {
				int num = Integer.parseInt(input1);
				
				if (num == 1) {
					iu++;
					label4.setText(iu + "표");
					label7.setText(promise + "표");
					label10.setText(stacy + "표");
				} else if (num == 2) {
					promise++;
					label4.setText(iu + "표");
					label7.setText(promise + "표");
					label10.setText(stacy + "표");
				} else if (num == 3) {
					stacy++;
					label4.setText(iu + "표");
					label7.setText(promise + "표");
					label10.setText(stacy + "표");
				} else {
					System.out.println("숫자 1-3까지 입력해주세요!!");
					continue;
				}
				
			} catch (Exception e) {
				System.out.println("숫자를 입력해주세요!!");
				continue;
			}
			
			System.out.println("아이유-Lylac : " + iu + "표");
			System.out.println("프로미스나인-we go : " + promise + "표");
			System.out.println("스테이씨 : " + stacy + "표");
			
			
			while (true) {
				char input2 = JOptionPane.showInputDialog("그만두시겠습니까? y/n").charAt(0);
				
				if (input2 == 'y') {
					check1 = false;
					
					while (true) {
						char input3 = JOptionPane.showInputDialog("창을 끄시겠습니까? y/n").charAt(0);
						
						if (input3 == 'y') {
							System.exit(0);
							
						} else if (input3 == 'n') {
							break;
						} else {
							JOptionPane.showMessageDialog(null, "다시 입력해주세요");
						}
						
					}
					
					break;
					
				} else if (input2 == 'n') {
					break;
				} else {
					System.out.println("다시 입력해주세요");
				}
				
			}
			
			
		}
		
		
	}
	
	
}
