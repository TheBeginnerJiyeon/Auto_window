package com.multi.c_network.Model;

import com.multi.c_network.View.MyFrame;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Messenger {
	// RUN >> 상단 런 뒤의 EDIT (CONFIFURATION) >> MODIFY OPTIONS >>  MULTIPLE INSTANCES >> 런 여러번 눌러서 여러개의 인스턴스 생성 가능해짐
	private MyFrame f;
	private DatagramSocket socket;
	private InetAddress address = null;
	private final int MP ;
	private final int OTHMP ;
	
	public Messenger(int myPort, int otherPort) throws UnknownHostException {
		this.MP = myPort;
		this.OTHMP = otherPort;
		
		try {
			address = InetAddress.getByName("127.0.0.1");
			socket = new DatagramSocket(myPort);
			
			f = new MyFrame(address, otherPort, socket);
			
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public MyFrame getMyFrame() {
		// TODO Auto-generated method stub
		return f;
	}



}
