package com.multi.Thread1;

import javax.swing.*;
import java.util.concurrent.CountDownLatch;

public class Thread1 extends Thread {
	
	private static String count;
	private static JLabel l;
	private static JFrame f;
	private static CountDownLatch latch;
	
	public Thread1(JFrame f, JLabel l, CountDownLatch latch) {
		this.f = f;
		this.l = l;
		this.latch = latch;
	}
	
	@Override
	public void run() {
		for (int i = 100; i >= 0; i--) {
			
			count = "카운트>>>" + i;
			l.setText(count);
			f.setVisible(true);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread1 interrupted");
				latch.countDown();
				return;
			}
		}
		System.out.println("thread1 end");
		f.dispose();
		latch.countDown();
	}
	
	
	public static String getCount() {
		return count;
	}
}
