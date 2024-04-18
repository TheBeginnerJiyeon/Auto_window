package com.multi.b_conditional;

import javax.swing.*;

public class Exec03 {
	public static void main(String[] args) {
		
		//dialog로 5번 띄어서 ok>긍정, no>부정, etc> 기타
		// ok가 몇회, no가 몇회, etc 몇회
		
		int ok = 0;
		int no = 0;
		int etc = 0;
		
		for (int i = 0; i < 5; i++) { // 지역변수 i는 블럭 내에서만 쓴다.
			String input = JOptionPane.showInputDialog("ok)긍정, no)부정, etc)기타");
			if (input.equals("ok")) {
				ok++; // 단항으로 ++(후위연산) 쓰는 것 가능하다. 대입이 아니므로 ++a와 결과는 같은 것
				System.out.println("긍정");
			} else if (input.equals("no")) {
				no++;
				System.out.println("부정");
			} else {
				etc++;
				System.out.println("기타");
			}
		}
		
		System.out.println("총 횟수는~" + "\n" + "OK가 " + ok + "회, NO가 " + no + "회, ETC가 " + etc + "회");
		System.out.println("긍정횟수: " + ok + "회");
		System.out.println("부정횟수: " + no + "회");
		System.out.println("잘 모르겠음횟수: " + etc + "회");
		
		
	}
	
	
}
