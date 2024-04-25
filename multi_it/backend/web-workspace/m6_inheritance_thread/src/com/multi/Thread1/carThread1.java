package com.multi.Thread1;

import javax.swing.*;

public class carThread1 extends Thread {
	private static JFrame f;
	private JLabel l;
	private int x, y;
	
	
	public carThread1(JFrame f, JLabel l, int x, int y) {
		this.f = f;
		this.l = l;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void run() {
		
		
		for (int i = 0; i < 50; i++) {
			x += (int) (Math.random() * 100 + 1);
			l.setBounds(x, y, 100, 100);
			f.add(l);
			f.setVisible(true);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				JOptionPane.showMessageDialog(null, "레이싱 종료");
				return;
			}
			
		}
		
		
	}
}
