package com.multi.homework;

import javax.swing.*;

public class Homework02 {
	//가위바위보
	//213
	int count = 0;
	int win = 0;
	int lose = 0;
	char wanna = 'n';
	
	void close() {
		char wanna1 = JOptionPane.showInputDialog("종료하실래요? y/n" + "\n").charAt(0);
		wanna = wanna1;
	}
	
	
	void draw() {
		count++;
		JOptionPane.showMessageDialog(null, (win) + " " + lose + "\n" + "무승부" + "\n");
		close();
		
	}
	
	void wins() {
		count++;
		win++;
		JOptionPane.showMessageDialog(null, (win) + " " + lose + "\n" + " 내가 승" + "\n");
		
		close();
	}
	
	void lose() {
		count++;
		lose++;
		JOptionPane.showMessageDialog(null, (win) + " " + lose + "\n" + "컴퓨터 승" + "\n");
		
		close();
	}
	
	public static void main(String[] args) {
		
		Homework02 home = new Homework02();
		
		while (home.wanna == 'n') {
			int com = (int) Math.round(Math.random() * 2);
			String me = JOptionPane.showInputDialog("(0이면 가위,1이면 바위, 2이면 보)");
			
			try {
				int me1 = Integer.parseInt(me);
				
				if (me1 == com) {
					home.draw();
				} else if (me1 == 0 && com == 1 || me1 == 1 && com == 2 || me1 == 2 && com == 0) {
					home.lose();
				} else if (me1 == 0 && com == 2 || me1 == 1 && com == 0 || me1 == 2 && com == 1) {
					home.wins();
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "0-2 숫자를 입력하세요!!");
				continue;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "종료합니다.");
		JOptionPane.showMessageDialog(null, "전체 " + home.count + "중에 승리한 수는 " + home.win);
		
		
	}
}
