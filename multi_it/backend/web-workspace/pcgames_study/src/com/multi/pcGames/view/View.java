package com.multi.pcGames.view;

import com.multi.pcGames.thread.RewardThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;
import java.util.Date;

public class View {
	// 전체 프레임 위 jpanel 전체, 여러 jpanel을 그 위에 배치
	
	private JFrame f;
	
	private JPanel p1;
	private JPanel p2;
	private JPanel p3;
	private JPanel p4;
	private JPanel p5;
	
	private JPanel p;
	
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextArea t5;
	
	// 주소, 데이터그램 소켓
	private InetAddress address;
	private DatagramSocket socket;
	
	private String name;
	private String msg;
	
	// 정수 나의 포트 / 보내는 포트
	private int myPort;
	private int port;
	
	// 박스 레이아웃 화면
	public void view() {
		
		// 피시방 접속화면 만들기
		// jframe 위에 jpanel 하나 올리고, 각각도 하나씩 만들기
		
		//1. jframe
		f = new JFrame("pcGamesGo!!");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.lightGray);
		f.setSize(700, 700);
		
		
		// 2. 접속한 회원의 jpanel 5개
		
		p1 = new JPanel();
		p1.setSize(700, 100);
		p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
		p1.add(new JLabel("접속회원 이름"));
		t1 = new JTextField(20);
		p1.add(t1);
		
		p2 = new JPanel();
		p2.setSize(700, 100);
		p2.setLayout(new BoxLayout(p2, BoxLayout.X_AXIS));
		p2.add(new JLabel("접속회원 IP"));
		t2 = new JTextField(20);
		p2.add(t2);
		
		p3 = new JPanel();
		p3.setSize(700, 100);
		p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
		p3.add(new JLabel("연결할 친구 IP"));
		t3 = new JTextField(20);
		p3.add(t3);
		
		p4 = new JPanel();
		p4.setSize(700, 100);
		p4.setLayout(new BoxLayout(p4, BoxLayout.X_AXIS));
		p4.add(new JLabel("보낼 메세지"));
		t4 = new JTextField(20);
		p4.add(t4);
		
		p5 = new JPanel();
		p5.setSize(700, 100);
		p5.setLayout(new BoxLayout(p5, BoxLayout.X_AXIS));
		p5.add(new JLabel("받은 메세지"));
		t5 = new JTextArea(20, 20);
		p5.add(t5);
		
		// 3. 연결, 전송 버튼 만들기
		
		JButton conBtn = new JButton("연결하기");
		conBtn.setSize(700, 50);
		
		
		JButton tmBtn = new JButton("전송하기");
		tmBtn.setSize(700, 50);
		
		btnConn(conBtn);
		btnEvent(tmBtn);
		
		
		// 4-1.  jpanel에 작은 jpanel들, 버튼 더하기
		
		p = new JPanel();
		p.setBackground(Color.white);
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		
		
		p.add(p1);
		p.add(p2);
		p.add(conBtn);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(tmBtn);
		
		
		// 5. jframe에  큰 jpanel p도 넣기
		
		f.add(p);
		f.pack();
		f.setVisible(true);
		
		
	}
	
	// 연결 버튼 클릭 시 현재 포트 저장됨
	
	public void btnConn(JButton conBtn) {
		conBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 텍스트 가져오기
				
				name = t1.getText();
				String ip1 = t2.getText();
				
				
				// 2. 가져온 나의 ip를 정수로 변경
				myPort = Integer.parseInt(ip1);
				System.out.println("myPort = Integer.parseInt(ip1);" + myPort);
				
				
				// 3. 현재 소켓 정의
				
				// 현재 소켓 정의
				try {
					socket = new DatagramSocket(myPort);
					
				} catch (SocketException ex) {
					throw new RuntimeException(ex);
				}
				
				// 현재 로컬호스트 주소
				try {
					address = InetAddress.getByName("127.0.0.1");
				} catch (UnknownHostException ex) {
					throw new RuntimeException(ex);
				}
				
				conBtn.setText("IP : " + myPort + " 연결됨");
				
				// 이름, IP, 연결 버튼 클릭 등 연결 정보는 수정 비활성화 됨
				t1.setFocusable(false);
				t2.setFocusable(false);
				conBtn.setEnabled(false);
				
				f.setVisible(true);
				
				
			}
		});
		
		
	}
	
	
	// 버튼 클릭 시 해당하는 포트로 메세지를 전송
	public void btnEvent(JButton tmBtn) {
		tmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				// 1. 텍스트 가져오기
				
				name = t1.getText();
				String ip1 = t2.getText();
				String ip2 = t3.getText();
				msg = "IP : " + ip1 + ", " + name + "님께서 보내셨습니다. " + "\n" + t4.getText();
				
				System.out.println(msg);
				
				
				// 2. 가져온 정보 javanet 함수의 파라미터 형식으로 변형
				
				byte[] buf = msg.getBytes();
				int length = buf.length;
				myPort = Integer.parseInt(ip1);
				port = Integer.parseInt(ip2);
				
				
				// 3. 보낼 패킷 정의
				DatagramPacket packet = new DatagramPacket(buf, length, address, port);
				
				
				//4. 보내고 텍스트 없애기
				
				try {
					socket.send(packet);
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
				t3.setText("");
				t4.setText("");
				
				f.setVisible(true);
				
				tmBtn.setText("IP " + port + "에 메세지 전송 완료!");
				t5.append(port + "");
				
				
				f.setVisible(true);
				
			}
			
			
		});
		
	}
	
	
	// 패킷 받기
	
	public void process() throws IOException, InterruptedException {
		// 연결이 시작되고 최초 1번만 새로운 스레드를 시작하기 위해 count 변수 정의
		int count = 0;
		RewardThread rt = new RewardThread();
		rt.setDaemon(true);
		
		while (true) {
			Date now = new Date();
			
			Thread.sleep(3000);
			
			byte[] data = new byte[256];
			
			DatagramPacket packet = new DatagramPacket(data, data.length);
			
			
			if (socket == null) {
				System.out.println("소켓이 아직 열리지 않았습니다..." + now);
				JOptionPane.showMessageDialog(null, "소켓이 아직 열리지 없았습니다..." + now);
				
			} else {
				
				System.out.println("소켓이 열려있습니다!!");
				
				// 소켓이 열려있으므로 리워드 스레드 켜짐
				// 카운트가 0인 최초의 경우만 스레드가 켜져 에러 방지
				if (count == 0) {
					rt.start();
					count++;
				}
				
				
				socket.receive(packet);
				
				t5.append(new String(data) + "\n");
				
				f.setVisible(true);
				
			}
			
			
		}
		
		
	}
	
	
}
