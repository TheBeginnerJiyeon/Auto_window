package com.multi.a_casting;

import java.util.ArrayList;

public class Casting {
	public static void main(String[] args) {
		// primitive(원시적인, 가공되지 않은) data
		//  기본형 데이터, 원시 데이터
		//<-> derived (파생된, 가공된) data
		//  참조형 데이터, 파생 데이터
		// 크기에 대한 것을 고려해야함.
		//정수 byte(1)->short(2)->int(4)->long(8)
		
		byte a = 100; //-128~127
		int b = a; //기본형 복사
		//int(큰) <- byte(작): 자동형변환
		
		int c = 120;
		byte d = (byte) c;
		//byte(작) <- int(큰): 강제형변환
		
		byte e = 100;
		
		
		// 참조형 형변환
		//상속관계에서만 형변환(Casting,캐스팅) 가능
		//Car(부모, 수퍼), Truck(자식, 서브)
		//클래스간의 대소비교할 때는 개념적으로 접근
		//부모클래스가 크고, 자식클래스가 작다
		
		
		ArrayList list = new ArrayList();
		
		list.add("로운");
		list.add(100); // 업캐스팅
		list.add(11.22);
		list.add(true);
		list.add('A');
		list.add(new Info());
		
		System.out.println(list.toString());
		
		Object str = list.get(0);
		System.out.println(str);
		System.out.println(str.getClass().getName());
		
		String str1=(String) list.get(0);
		System.out.println(str1);
		
		Object int1=list.get(1);
		System.out.println(int1);
		
		Integer int2=(Integer) list.get(1);// Object --->(downcasting) Integer
		System.out.println(int2);
		
		int num = (Integer) list.get(1); // Object --->(downcasting) Integer ----> (auto unboxing) int
		
		if(str1 instanceof String){
			System.out.println("String  맞음");
		}
		
		if(str1 instanceof String){
			System.out.println("String  맞음");
		}
		
		
		
		
		
		
	}
}
