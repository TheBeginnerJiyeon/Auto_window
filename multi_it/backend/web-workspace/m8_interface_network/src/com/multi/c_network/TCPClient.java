package com.multi.c_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
	
	public static void main(String[] args) throws IOException {
		// 1. 클라이언트의 입장에서 서버의 ip와 port를 알아야한다
		
		
		for (int i = 0; i < 100; i++) {
			
			// 2. 서버의 ip주소와 포트를 매개변수로 하여 클라이언트용 소켓 객체 형성
			
			Socket socket = new Socket("localhost", 9200);
			// ip주소를 알면 바로 숫자로 넣어도 됨. "172.30.1.28".  port
			
			
			
			// 3. 서버와 통신할 스트림 오픈
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String data = bufferedReader.readLine();
			
			System.out.println("서버에서 받은 데이터 " + data);
			
			
		}
		
		
	}
	
	
}
