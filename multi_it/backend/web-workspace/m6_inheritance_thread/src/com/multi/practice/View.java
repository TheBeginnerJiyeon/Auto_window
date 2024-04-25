package com.multi.practice;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.CountDownLatch;

public class View {
	
	private static JFrame f;
	private static JLabel l;
	
	public void view() {
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
		f.getContentPane().setBackground(Color.LIGHT_GRAY);
		f.setSize(1000, 1000);
		
		
		l = new JLabel();
		l.setText("카운트>>>>>");
		l.setFont(new Font("굴림", Font.BOLD, 60));
		f.getContentPane().add(l);
		
		JLabel l2 = new JLabel();
		l2.setText("");
		ImageIcon icon1 = new ImageIcon("images/" + 1 + ".jpg");
		Image img = icon1.getImage();
		img.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
		l2.setIcon(new ImageIcon(img));
		
		f.getContentPane().add(l2);
		
		
		JLabel l3 = new JLabel();
		l3.setText("시간 >> 0");
		l3.setFont(new Font("굴림", Font.BOLD, 60));
		f.getContentPane().add(l3);
		
		f.setVisible(true);
		
		CountDownLatch latch = new CountDownLatch(1);
		Thread1 t1 = new Thread1(f, l, latch);
		t1.start();
		
		
		Thread2 t2 = new Thread2(f, l3);
		t2.start();
		
		Thread3 t3 = new Thread3(f, l2);
		t3.start();
		
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			System.out.println("main sleep interrupted");
		}
		
		t1.interrupt();
		t2.interrupt();
		t3.interrupt();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			System.out.println("latch waiting interrupted");
			;
		}
		
		
	}
	
	
}
