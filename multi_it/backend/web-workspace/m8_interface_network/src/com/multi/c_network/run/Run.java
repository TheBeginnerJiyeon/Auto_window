package com.multi.c_network.run;

import com.multi.c_network.Model.Messenger;
import com.multi.c_network.View.MyFrame;

import javax.swing.*;
import java.net.UnknownHostException;

public class Run {
	
	
	public static void main(String[] args) throws UnknownHostException {
		
		int myPort = Integer.parseInt(JOptionPane.showInputDialog("당신의 포트를 입력하세요."));
		int otherPort = Integer.parseInt(JOptionPane.showInputDialog("상대방의 포트를 입력하세요."));
		
		Messenger a = new Messenger(myPort, otherPort);
		
		MyFrame f =a.getMyFrame();
		
		f.process();
		
		
		
	}
}
