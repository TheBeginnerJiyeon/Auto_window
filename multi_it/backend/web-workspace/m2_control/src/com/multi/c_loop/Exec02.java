package com.multi.c_loop;

import javax.swing.*;

public class Exec02 {
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("계속 돕니다.");
			String choice = JOptionPane.showInputDialog("계속 하실래요? y)yes or n)no");
			
			if (choice.equals("n") || choice.equals("no")) {
				System.out.println("프로그램을 종료합니다.");
				/*System.exit(0); //종료합니다*/
				break;
				/*return; // java: unreachable statement*/
			}
			
		}
		
		System.out.println("나 출력되니???"); //break 일 때는 while만 돌린다
		// return(블럭을 넘어서 함수/메서드(main) 강제종료), system.exit(0)도 전부 프로그램을 아예 종료하려고 해서 에러가 뜬다!! java: unreachable statement
		// 블럭만 빠져나가려면 break를 써주자.
		
		
		
		
		
		
		
		
		
		
	}
	
}
