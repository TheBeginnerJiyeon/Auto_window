package com.multi.b_app01;

import java.util.Random;

public class Exec06 {
	public static void main(String[] args) {
		
		// 1. 답안지, 대답안 공간만들어라.
		int[] correct = new int[990];
		int[] mine = new int[990];
		
		
		// 2. 랜덤하게 만들어주는 부품을 만들어라.
		// 3. 990번 반복해서 답안지, 대답안에 숫자를 넣어라.
		//    1~4 범위
		
		Random random = new Random();
		
		for (int i = 0; i < 990; i++) {
			correct[i] = random.nextInt(4) + 1;
			mine[i] = random.nextInt(4) + 1;
		}
		
		// 4. 같은 인덱스끼리 990번 비교
		//    비교하다가 숫자가 동일하면 점수를 1늘려주세요.
		// 5. 내 점수 프린트!
		int result = 0;
		for (int i = 0; i < 990; i++) {
			if (correct[i] == mine[i]) {
				result++;
			} else {
				continue;
			}
		}
		
		System.out.println("result : " + result);
		
	}
	
}
	
	
	
	

