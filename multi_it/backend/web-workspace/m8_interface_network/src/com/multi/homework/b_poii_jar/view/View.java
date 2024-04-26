package com.multi.homework.b_poii_jar.view;

import com.multi.homework.b_poii_jar.controller.NewsController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class View {
	
	// 뉴스 기사 가져오기
	private static JTextArea t1;
	private static JFrame f;
	private static JLabel label;
	private static JLabel label2;
	private static NewsController nc = new NewsController();
	private static JLabel label4;
	
	public void viewNews() {
		// 프레임
		f = new JFrame("뉴스 한눈에 보기");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800, 1300);
		f.getContentPane().setBackground(Color.pink);
		f.getContentPane().setLayout(null);
		
		//캐릭터 레이블
		label = new JLabel("Characters: ");
		label.setBounds(50, 50, 600, 50);
		label.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		// 사진 넣기
		nc.addPic(f, label4);
		
		
		//워즈 레이블
		label2 = new JLabel("Words: ");
		label2.setBounds(50, 200, 600, 50);
		label2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		// 텍스트 에러이러
		t1 = new JTextArea();
		t1.setText("클릭을 누르면 뉴스 헤드라인이 나옵니다\n-----------------------------------\n");
		t1.setBounds(40, 400, 700, 700);
		t1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		t1.setLineWrap(true);
		t1.setWrapStyleWord(true);
		
		
		// 버튼 1 : click
		JButton b1 = new JButton("Click");
		b1.setBounds(40, 1150, 100, 80);
		b1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		// 버튼 1-2 : clear
		JButton b1_2 = new JButton("Clear");
		b1_2.setBounds(170, 1150, 100, 80);
		b1_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		//버튼 2 : pad color
		JButton b2 = new JButton("Pad Color");
		b2.setBounds(295, 1150, 200, 80);
		b2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		//버튼 3 : text color
		JButton b3 = new JButton("Text Color");
		b3.setBounds(535, 1150, 200, 80);
		b3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		
		
		// click 버튼
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*NewsController nc= new NewsController();
				nc.crawl();*/
				
				nc = new NewsController();
				nc.crawl(label, label2, t1);
				
			}
		});
		
		//clear 버튼
		b1_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				t1.setText("");
				label.setText("Characters: ");
				label2.setText("Words: ");
				
				
			}
		});
		
		// pad color 버튼
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color[] list = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.CYAN, Color.PINK};
				int r = (int) (Math.random() * 6);
				t1.setBackground(list[r]);
			}
		});
		
		//text color 버튼
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color[] list = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW, Color.CYAN, Color.PINK};
				int r = (int) (Math.random() * 6);
				t1.setForeground(list[r]);
			}
		});
		
		
		
		f.add(label);
		f.add(label2);
		f.add(t1);
		f.add(b1);
		f.add(b1_2);
		f.add(b2);
		f.add(b3);
		f.setVisible(true);
		
		
	}
	
	
}
