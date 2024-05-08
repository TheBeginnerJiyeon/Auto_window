package com.multi.pcGames.thread;

import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class RewardThread extends Thread {
	
	
	private JFrame f;
	private JTextArea t;
	private JTextArea t2;
	private JTextPane p;
	private JScrollPane j;
	
	private Date start;
	private Date now;
	private int spentTime;
	private String[] urlStr = {"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQgpfsC-Wgov3BWiwo7ok2tKnuaFQ7W-BkVGFzJMl8sKQ&s", "https://media.istockphoto.com/id/1363405148/vector/crossed-sword.jpg?s=612x612&w=0&k=20&c=V3EJvgiArkHBX-3WpbTKHezCznr0EeMgI8vqcL8MZ38=", "https://www.shutterstock.com/image-vector/chinese-folklore-dragon-suitable-new-600nw-2311376525.jpg", "https://adc-us.com/wp-content/uploads/2021/07/splashing-water-from-glass-SBI-300913811-1.jpg"};
	
	
	@Override
	public void run() {
		
		
		// 1. 접속 보상 스레드를 나타내는 창 추가
		f = new JFrame("피시방 접속 보상창");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		f.setSize(500, 1000);
		f.setResizable(false);
		
		// 텍스트 에어리어에 시간 추가
		t = new JTextArea();
		t.setBounds(10, 30, 470, 100);
		f.add(t);
		t.setEditable(false);
		
		// 보상 추가
		t2 = new JTextArea();
		t2.setBounds(10, 150, 470, 300);
		f.add(t2);
		t2.setEditable(false);
		
		// 스크롤바가 생기는 jscrollpane에 jtextpane을 넣는 이미지 추가
		p = new JTextPane();
		
		j = new JScrollPane(p);
		j.setBounds(10, 480, 470, 400);
		
		f.add(j);
		
		// 시간이 업데이트 되는 스레드의 윈도우 창이 계속 포커스 되는 것을 막아 입력을 편하게 할 수 있다
		f.setFocusableWindowState(false);
		
		f.setVisible(true);
		
		
		// 2. 시간 변경 및 보상 추가
		start = new Date();
		while (true) {
			now = new Date();
			spentTime = (int) (now.getTime() - start.getTime()) / 1000;
			String content = "현재 시각: " + now + "\n" + "경과 시간: " + spentTime + "\n";
			t.setText(content);
			
			if (spentTime == 3) {
				t2.append("3초 경과!! 초보 사냥꾼 선물이 주어집니다." + "\n");
				addImg(0);
				
			} else if (spentTime == 5) {
				t2.append("5초 경과!! 중급 사냥꾼 선물이 주어집니다." + "\n");
				addImg(1);
			} else if (spentTime == 7) {
				t2.append("7초 경과!! 고급 사냥꾼 선물이 주어집니다." + "\n");
				addImg(2);
			} else if (spentTime >= 10 && spentTime % 5 == 0) {
				t2.append("초보 물약 1개를 선물받았습니다." + "\n");
				addImg(3);
			}
			
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("강제 종료합니다...");
			}
		}
		
		
	}
	
	
	// 스크롤바가 생기는 이미지 넣기
	public void addImg(int num) {
		URL imgUrl = null;
		try {
			imgUrl = new URL(urlStr[num]);
			ImageIcon icon = new ImageIcon(imgUrl);
			Image img = icon.getImage();
			Image chImg = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
			ImageIcon chIcon = new ImageIcon(chImg);
			p.insertIcon(chIcon);
			f.setVisible(true);
			
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
		
		
	}
	
}
