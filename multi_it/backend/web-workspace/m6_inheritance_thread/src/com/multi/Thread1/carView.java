package com.multi.Thread1;

import javax.swing.*;
import java.awt.*;

public class carView {
	
	private static JLabel l1,l2,l3;
	
	public void view() {
		
		JFrame f=new JFrame();
		f.getContentPane().setLayout(null);
		f.setSize(1000, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Racing Car");
		f.getContentPane().setBackground(Color.cyan);
		
		
		l1=new JLabel("");
		l2=new JLabel("");
		l3=new JLabel("");
		
		
	
		l1.setBounds(30,30,100,100);
		ImageIcon icon= new ImageIcon("images/car01.png");
		Image img= icon.getImage();
		Image newimg=img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		l1.setIcon(new ImageIcon(newimg));
		
		l2.setSize(200, 200);
		l2.setBounds(30,395,100,100);
		ImageIcon icon2= new ImageIcon("images/car02.png");
		Image img2= icon2.getImage();
		Image newimg2=img2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		l2.setIcon(new ImageIcon(newimg2));
		
		l3.setSize(100, 100);
		l3.setBounds(30,760,100,100);
		ImageIcon icon3= new ImageIcon("images/car03.png");
		Image im3= icon3.getImage();
		Image newim3=im3.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		l3.setIcon(new ImageIcon(newim3));
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		
		f.setVisible(true);
		
		// 레이싱 시작
		
		carThread1 t1=new carThread1(f,l1,30,30);
		carThread1 t2=new carThread1(f,l2,30,395);
		carThread1 t3=new carThread1(f,l3,30,760);
		
		
		t1.start();
		t2.start();
		t3.start();
		
	
		
		
		
	}
	
	
}
