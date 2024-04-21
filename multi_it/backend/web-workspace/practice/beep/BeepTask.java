package com.multi.practice.beep;

import java.awt.*;

public class BeepTask implements Runnable {
	//Class 'BeepTask' must either be declared abstract or implement abstract method 'run()' in 'Runnable'
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			
			}
		}
		
	}
	
	
}
