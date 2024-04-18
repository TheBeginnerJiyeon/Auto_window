package com.multi.c_loop;

import java.util.Random;

public class Exec03 {
	public static void main(String[] args) {
		/* java.util.Random 클래스 */
		/* java.util.Random 클래스의 nextInt() 메소드를 이용한 난수 발생
		 * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환 */
		
		/* 원하는 범위의 난수를 구하는 공식
		 * random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값
		 * */
		
		Random random = new Random(); // 함수 설명 읽는 법 알아보기
		int rNum1 = random.nextInt(10);
		System.out.println("0부터 9까지의 난수가 랜덤한 수: " + rNum1);
		
		int rNum2 = random.nextInt(10) + 1;
		System.out.println("1부터 10까지의 난수가 랜덤한 수: " + rNum2);
		
		
		//20~45
		
		int rNum3 = random.nextInt(26) + 20; //bound값 포함 안함!!(exclusive) >> 그래서 0부터의 총 갯수라고 생각합시다.
		System.out.println(rNum3);
		
		
		//-128~127
		int rNum4 = random.nextInt(256) - 128;
		System.out.println(rNum4);
		
		
		
		
		/* 난수의 활용 */
		/* Math.random()을 이용해 발생한 난수는 0부터 1전까지의 실수 범위의 난수값을 반환한다.
		 * 필요에 따라 정수 형태의 값을 원하는 범위 만큼 발생시켜야 하는 경우들이 존재하는데
		 * 필요한 범위까지의 난수를 발생시켜보자.
		 * */
		
		/* 원하는 범위의 난수를 구하는 공식
		 * (int) (Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값 */
		
		int rNum5 = (int) (Math.random() * 10);
		// math.random: 0.0(포함)~1(미포함!!) ~0.99999...
		// 10곱하면 0.0~ 9.99999
		System.out.println(rNum5);
		
		//1~10
		int rNum6 = (int) (Math.random() * 10) + 1;
		System.out.println(rNum6);
		
		
		//10~15
		int rNum7 = (int) (Math.random() * 6) + 10;
		System.out.println(rNum7);
		
		
		//-128~127
		int rNum8 = (int) (Math.random() * 256) - 128;
		System.out.println(rNum8); //마지막 1은 포함 안되니까 256-128-1(그 앞까지)!! 이라고 생각합시다.
		
		
		
		
		
	}
}
