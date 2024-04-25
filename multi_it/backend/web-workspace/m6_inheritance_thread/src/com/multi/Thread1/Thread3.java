package com.multi.Thread1;

import javax.swing.*;
import java.awt.*;

public class Thread3 extends Thread {
	
	private static String count;
	private static JLabel l;
	private static JFrame f;
	
	public Thread3(JFrame f, JLabel l) {
		this.f = f;
		this.l = l;
		
	}
	
	@Override
	public void run() {
		while (true) {
			
			for (int i = 1; i <= 5; i++) {
				
				ImageIcon icon1 = new ImageIcon("images/" + i + ".jpg");
				Image img = icon1.getImage();
				img.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
				l.setIcon(new ImageIcon(img));
				
				f.setVisible(true);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Thread3 interrupted");
					return;
				}
				
			}
			
		}
		
	}
	
	
}
