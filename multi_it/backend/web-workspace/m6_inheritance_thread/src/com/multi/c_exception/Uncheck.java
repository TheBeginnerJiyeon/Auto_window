package com.multi.c_exception;

import java.util.Scanner;

public class Uncheck {
	// - 예외(Exception) : 소스 코드 수정으로 해결 가능한 에러
	
	// RuntimeException이란 : 미리 정의 되어 있고 이들이 명시하는 예외 상황은
	//						프로그램의 종료로 이어지는 것이 자연스러운 경우가 많다.
	//						( 예외처리를 통해 프로그램이 종료되지 않게 처리 할 수 있다.)
	
	
	// - 예외 처리 방법
	// 	1. if문 : 간단한 예외 처리시
	//				 (장점은 프로그램이 종료되지 않고 그 예외 상황에 있어서는 if문이
	//				  실행되지 않게 하여 프로그램의 흐름을 조절할 수 있다.)
	//				 (단점은 if문이 너무 자주 혹은 깊이 사용되면 그게 예외 상황을 처리하는 것인지
	//				  프로그램 상의 주 흐름 코드인지가 구분이 안된다.)
	//
	//		2. try-catch문 : 예외상황이 발생할 수 있는 지역에 한해서 예외 처리를 하고
	//						어떻게 처리할지도 결정
	//						a. try블록 안은 하나의 일의 단위(트랜잭션)이다.
	//						   예외 상황이 발생하는 부분
	//						b. catch 블록의 ()안은 try블록 안에서 발생한 예외클래스의
	//						   인스턴스 참조변수값(객체의 주소값)이 넘어온다.(JVM이 해줌)
	//
	//     3. throws : 예외처리를 하지 않고 자신을 호출한 상위 메소드에게 처리를 위임
	//     			main()메소드까지 위임하고 나서도 throws를 하게 되면
	//     			마지막엔 JVM이 예외 처리를 함
	
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException
		System.out.println("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("정수 2 : ");
		int num2 = sc.nextInt();
		
		int result = 0;
		
		/*
		 * * try catch 방법
		 *
		 * try {
		 * 		예외가 발생될 수 있는 구문;
		 *
		 * }catch(발생될예외클래스 매개변수) {
		 * 		해당 예외가 발생되는 경우 처리할 구문;
		 *
		 * }
		 */
		
		/*try {
			result=num1/num2;
			System.out.println("result : "+result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다!");
			e.getStackTrace();
		} catch (Exception e) {
			System.out.println("에러 발생!");
			e.getStackTrace();
		}*/
		
		if (num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다!!!!");
		} else {
			result = num1 / num2;
			System.out.println("result : " + result);
		}
		
		
	}
	
	public void method2() {
		System.out.println("배열의 길이");
		int num = sc.nextInt();
		
		/*try {
			int[] arr = new int[num];
		}catch (Exception e) {
			System.out.println("에러 발생!!");
		}*/
		
		
		if (num <= 0) {
			System.out.println("제대로 양수를 입력해주세요");
		} else {
			int[] arr = new int[num];
		}
		
	}
	
	
	public void method3() {
		
		Object obj = 'a';
		// String str = (String) obj; // ClassCastException :  class java.lang.Character cannot be cast to class java.lang.String .런타임 에러
		
		// String str= String.valueOf(obj); 이렇게 바꿔줘야 한다
		
		try {
			/*String str = (String) obj;*/
			/*String str = String.valueOf(obj);
			int[] arr = new int[2];
			arr[0] = 1;
			arr[1] = 2;*/
			// arr[2]=3;
			
			String str1 = null;
			int len = str1.length(); // NullPointerException
			
			
		} /*catch (ClassCastException e) {
			e.getStackTrace();
			e.getMessage();
			System.out.println("형변환 잘못했습니다. ClassCastException입니다. 다형성 복습, 스트링 메서드 공부");
			
		} catch (IndexOutOfBoundsException e) {
			e.getStackTrace();
			System.out.println("에러발생!! ArrayIndexOutOfBoundsException. 배열 공부하러 가세요.");}*/ catch (ClassCastException |
																								 IndexOutOfBoundsException |
																								 NullPointerException e) {
			e.printStackTrace(); // 유형 + 에러 메세지 + 에러발생 경로
			System.out.println("-------------------------------");
			System.out.println(e.getMessage());// 에러메세지
			System.out.println(e.toString());//유형 +에러메세지
			
			/*-------------------------------
			Cannot invoke "String.length()" because "str1" is null
			java.lang.NullPointerException: Cannot invoke "String.length()" because "str1" is null*/
			// return;
			// System.exit(0);  // 프로그램 강제 종료 시키기
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("여전히 실행하네"); // 리턴이 있어도 파이널리는 무조건 실행!!! 코드 끝은 실행되지 않는다. system.exit(0)에서는 실행되지 않는다!!
		}
		
		System.out.println("코드 끝");
		
		
	}
	
	
}
