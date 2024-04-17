package com.multi.a_sequential;

import java.util.Scanner;

public class Exec01 {
	
	public static void main(String[] args) {
		
		/*
		 *  java.util.Scanner 클래스는 이미 제공되는 클래스이다.
		 *  이 Scanner라는 클래스가 가지고 있는 메소드를 이용해서 키보드로 값을 입력받을 것이다.
		 *  우리가 어떤 클래스에 있는 메소드를 사용하고자 할 때
		 *  클래스 생성 -> 메소드 호출 했었다. 그러면 Scanner 클래스에 작성되어있는 메소드를 호출하고자 한다면
		 *  얘도 생성 후 실행해야된다.
		 *
		 // next() : 띄어쓰기로 구분
		 // nextLine() : 줄바꿈으로 구분
		 // next() 값만 읽어오고 엔터는 버퍼에 남아있다.
		 // next() 바로 다음에 nextLine()이 있을시 버퍼에 남아있는 엔터 line을 읽어온다. >> 오류 발생
		 * * 이름 : 멀티 캠퍼스
		입력받은 이름은 : 멀티입니다.
		이름 : 입력받은 이름은 :  캠퍼스입니다.
		 // next(), nextXXX() 메소드 뒤에 nextLine() 메소드를 한번 더 사용해서 버퍼에 남아있는 엔터를 실행시켜주면됨.
		 * 
		 
		 
		 //문자열 입력 받을때 --> sc.nextLine();
		 //정수형 입력 받을때 --> sc.nextInt();
		 //실수형 입력 받을때 --> sc.nextDouble();
		 
		 //sc.nextChar();-> 존재하지 않는다. charAt : 문자열에서 지정된 위치에 있는 문자 하나만 뽑아내는 기능을 함.
		 //이때 위치는 제일 앞문자가 0 부터 시작해서 1씩 증가~
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println("입력받은 이름은 : " + name + "입니다.");
		sc.nextLine(); // 엔터로 인한 오류 제거위해 한번 더 써주자. 값은 저장할 필요 없어서 변수 안 쓴다
		
		
		//여기서부터
		System.out.print(" 이름2 : ");
		String name2 = sc.nextLine();
		System.out.println("입력받은 이름2은 : " + name2 + "입니다.");
		
		
		System.out.print("소속 : ");
		String com = sc.nextLine();
		System.out.println("입력받은 소속은 : " + com + "입니다.");
		
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		age += 1;
		System.out.println("입력받은 나이는 : " + age + "입니다.");
		
		
	}
	
	
}
