package com.multi.b_operator;

public class Exec04 {
	
	public static void main(String[] args) {
		
		//비교연산자의 결과가 boolean(논리형!)
		
		// 비교연산자(==, !=, >, >=)
		// *** 비교 결과가 중요(논리형 데이터!! true/false)
		
		//기본형 데이터는 비교연산자를 가지고 비교 가능
		//기본형 데이터가 아니면 비교연산자를 가지고 비교 불가능
		
		System.out.println(1 == 1);
		System.out.println("가".equals("나"));
		System.out.println("가나다" == "가나다"); //true
		System.out.println("가나다" == "가나다라"); //false
		
		String a="123d";
		String b="123d";
		System.out.println(a==b);
		
		/*System.out.println("가나다"=="가나다"); 이게 true 나오는데 왜 그런가요??*/
		
		
		String a1 = "이효리"; //리터럴
		String b1 = "이효리";
		
		String c1= new String("이효리");
		
		System.out.println(a1.hashCode()); //50819704
		System.out.println(b1.hashCode()); // 50819704
		System.out.println(c1.hashCode()); // 50819704
		
		
		System.out.println(System.identityHashCode(a1)); //189568618
		System.out.println(System.identityHashCode(b1)); //189568618
		System.out.println(System.identityHashCode(c1)); //793589513
		
		System.out.println(a1==c1); /*false 아이덴티티 주소값을 비교*/
		
		/*참조변수는 ==가 값이 아니라 주소(아이덴티티 주소)를 비교한다*/
		/*해시코드(값이 같으면  아이덴티티를 같게 변환해준 해시값)는 equals랑 비슷하게 값을 비교하고(값이 같으면 같은 주소로 보냄) 아이덴티티해시코드는 원래 주소를 비교한다고 생각해도 될까요?? 네. ==는 아이덴티티 주소를 비교함*/
		
		
		int x = 200;
		int y = 100;
		System.out.println("일치? " + (x == y));
		System.out.println("불일치? " + (x != y));
		System.out.println("이상? " + (x >= y));
		System.out.println("초과? " + (x > y));
	}
}