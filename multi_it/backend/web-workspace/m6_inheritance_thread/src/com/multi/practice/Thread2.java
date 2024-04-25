package com.multi.practice;

import javax.swing.*;
import java.util.Date;

public class Thread2 extends Thread {
	private static String count;
	private static JLabel l;
	private static JFrame f;
	
	public Thread2(JFrame f, JLabel l) {
		this.f = f;
		this.l = l;
		
	}
	
	@Override
	public void run() {
		while (true){
			
			Date d = new Date();
			
			l.setText(d.toString());
			f.setVisible(true);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread2 interrupted");
				return;
			}
		}
		
		
	}
}
