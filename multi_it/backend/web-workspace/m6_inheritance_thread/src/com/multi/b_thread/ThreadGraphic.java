package com.multi.b_thread;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ThreadGraphic extends JFrame {
	
	/*static ThreadGraphic f;*/
	JLabel count, image, day;
	CounterThread2 count2;
	TimeThread2 day2;
	ImageThread2 image2;
	
	public ThreadGraphic() {
		setSize(800, 500);
		getContentPane().setBackground(Color.green);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		count = new JLabel("카운터");
		image = new JLabel("");
		day = new JLabel("시각");
		Font font = new Font("궁서", Font.BOLD, 30);
		count.setFont(font);
		day.setFont(font);
		
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		
		count2 = new CounterThread2();
		day2 = new TimeThread2();
		image2 = new ImageThread2();
		
		count2.start();
		day2.start();
		image2.start();
		
		setVisible(true);
		
	}

	
	private class CounterThread2 extends Thread {
		
		@Override
		public void run() {
			for (int i = 4; i >= 0; i--) {
				count.setText("카운트 => " + i);
				System.out.println("카운트 => " + i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					dispose();
					System.out.println("종료 CounterThread2");
					
					return;
				}
				
				if (i == 0) {
					JOptionPane.showMessageDialog(null, "사용시간이 다 되었습니다. 퇴실 부탁드립니다.");
					
					// 혹시 같은 JFrame에서 dispose()를 여러번 부르게 되면 오류가 있을까??
					image2.interrupt(); // imagethread의 dispose만 사용함
					
					day2.interrupt(); // timethread의 dispose는 주석처리 /*dispose();*/
					
					
			
					
				}
				
				
			}
			
		}
	}
	
	// timethread의 dispose는 주석처리 /*dispose();*/
	private class TimeThread2 extends Thread {
		
		@Override
		public void run() {
			for (int i = 0; i < 15; i++) {
				Date date = new Date();
				day.setText("현재 시각 : " + date);
				System.out.println("현재 시각 : " + date);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					/*dispose();*/
					System.out.println("종료 TimeThread2");
					
					/*image2.stop();// 스레드 멈춤
					day2.stop(); // 스레드 멈춤*/
				
					return;
				}
			}
			
		}
	}
	
	// imagethread의 dispose만 사용함
	private class ImageThread2 extends Thread {
		
		@Override
		public void run() {
			String[] list = {"1.png", "2.png", "3.png", "4.png", "5.png"};
			String[] list2 = {"1.JPG", "2.JPG", "3.JPG", "4.JPG", "5.JPG"};
			
			for (int i = 0; i < list.length; i++) {
				
				System.out.println();
				System.out.println("이미지 : " + list2[i]);
				ImageIcon imageIcon = new ImageIcon("images/" + list2[i]);
				image.setIcon(imageIcon);
				
				
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					dispose();
					System.out.println("종료 ImageThread2");
					/*image2.stop();// 스레드 멈춤?? 에러 뜬다. 찾아볼 것
					day2.stop(); // 스레드 멈춤*/
					// 'stop()' is deprecated since version 1.2 and marked for removal
					return;
				}
				
				
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		ThreadGraphic f = new ThreadGraphic();
		
		
	}
	
	
}
/*
day2 글자 색이 image2랑 다른데 그쪽에 문제가 있는거 아닐까요?

진수경 진수경 수신자 모두 11:20 AM
저도 지금 똑같이나와요..;^;

하지은 하지은 수신자 모두 11:21 AM
stop이 있으면 저도 같은 오류가 나서 지웠더니 잘됐습니다

김희철_sub 수신자 모두 11:22 AM
지연님 보실때
말한겁니다

사용자 수신자 모두 11:22 AM
		잠시만요

신현철_sub 수신자 모두 11:22 AM
87~88번째 day2 색이 흑백이었어요!

김희철_sub 수신자 모두 11:23 AM
87번 라인 아래쪽에 실행 안된다는 의미의 흐린 색이었습니다
87번에서 에러가 나니까 하위 코드가 흑백처리 된 것 같습니다

진수경 진수경 수신자 모두 11:23 AM
저도 똑같이 나오는데 day2색이 회색으로 뜨고 stop은 둘다 빨간줄이 뜹니다 ;^;

하지은 하지은 수신자 모두 11:23 AM
저도 그랬어요
'stop()' is deprecated since version 1.2 and marked for removal

김희철_sub 수신자 모두 11:24 AM
위에 stop에서 에러나서 그런 것 같습니다
에러나면 그 밑의 코드는 실행이 안되니까
흑백처리시킨 것 같습니다*/
