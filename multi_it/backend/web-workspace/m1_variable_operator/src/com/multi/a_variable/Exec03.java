package com.multi.a_variable; //패키지는 소문자로

import javax.swing.*;

public class Exec03 { //클래스는 첫글자는 대문자, 나머지는 소문자. pascal case
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("이름입력");
		// 파라미터 없을 때는 null을 넣어주자
		System.out.println("당신의 이름은 " + name + "이시군요!!");
		
		JOptionPane.showInputDialog("당신의 이름은" + name + "이시군요!!");
		
		
	}// CTRL SHIFT Z :실행 후로 다시 돌림.  CTRL Z : 되돌리기
	// CTRL ALT L : 포맷 자동 정렬  CTRL SHIFT / : 주석처리
}

