package com.multi.b_conditional;

import javax.swing.*;

public class Exec07 {
	public static void main(String[] args) {
		
		//1~100
		int target = (int) (Math.random() * 100 + 1);
		// 이전 코드 int random=7;
		System.out.println(target);
		int no = 0;
		int count = 0;
		
		while (true) {
			String answer = JOptionPane.showInputDialog("추측해보세요");
			int num_ans = Integer.parseInt(answer);
			count++;
			if (target == num_ans) {
				System.out.println("정답입니다!!");
				break;
			} else if (num_ans > target) {
				System.out.println("숫자가 너무 큽니다");
				no++;
				
			} else if (num_ans < target) {
				System.out.println("숫자가 너무 작습니다");
				no++;
			}
			
		}
		
		System.out.println("총 " + count + "번 시도, " + no + "번 틀렸습니다.");
		
	}
}
