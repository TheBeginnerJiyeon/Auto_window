package com.multi.b_app01;

import javax.swing.*;
import java.util.Arrays;

public class Exec05 {
	public static void main(String[] args) {
		
		String[] names = {"블랙핑크", "유재석", "아이유", "이효리", "비"};
		
		int[] count = {0, 0, 0, 0, 0};
		
		for (int i = 0; i < 10; i++) {
			String choice = JOptionPane.showInputDialog("투표할 사람 번호 입력 0)블랙핑크, 1)유재석, 2)아이유, 3)이효리, 4)비");
			
			int ch2 = Integer.parseInt(choice);
			
			if (ch2 == 0) {
				count[ch2]++;
			} else if (ch2 == 1) {
				count[ch2]++;
			} else if (ch2 == 2) {
				count[ch2]++;
			} else if (ch2 == 3) {
				count[ch2]++;
			} else if (ch2 == 4) {
				count[ch2]++;
			} else {
				System.out.println("i 값: " + i);
				System.out.println("0-4이 숫자 입력!");
				i--;
			}
			
		}
		
		int sum = 0;
		for (int i : count) {
			sum += i;
		}
		System.out.println("총 " + sum + "번 진행");
		
		for (int i = 0; i < count.length; i++) {
			System.out.println(i + "번은 " + count[i] + "입니다");
			
		}
		
		int max = count[0];
		
		for (int i = 1; i < count.length; i++) {
			if (count[i] > max) {
				max = count[i];
			}
		}
		System.out.println("최대값은 " + max + "입니다");
		
		for (int i = 1; i < count.length; i++) {
			if (count[i] == max) {
				System.out.println(i + "번째 " + names[i]
						+ "가 가장 큽니다.");
			}
		}
		
		System.out.println(Arrays.toString(count)); //[0, 10, 0, 0, 0]
		
		
		// 최대 투표 수를 찾습니다.stream
		int max1 = Arrays.stream(count).max().orElse(-1);
		
		
		
		
	}
	
	
}
