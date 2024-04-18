package com.multi.c_loop;

public class Exec01 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			
		}
		
		
		for (int i = 0; i < 3; i++) {
			System.out.print("★" + "\n");
			
		}
		
		/*while (true){
			System.out.println("반갑습니다.");
			
		} 무한루프*/
		
		
		int start = 1;
		int end = 5;
		int add = 1;
		while (start <= end) {
			System.out.println("찍어보기");
			start++;
		}
		
		//1부터 10까지 while
		
		start = 1;
		end = 10;
		add = 1;
		while (start <= end) {
			System.out.println(start);
			start += add;
			
		}
		
		start = 1;
		end = 10;
		add = 1;
		while (start <= end) {
			System.out.print(start);
			start += add;
			
		}
		
		int sum = 0;
		
		System.out.println();
		
		start = 1;
		end = 10;
		add = 1;
		while (start <= end) {
			System.out.print(start);
			
			sum += start;
			start += add;
			System.out.println("sum=" + sum);
		}
		System.out.println();
		
		
		sum = 0;
		for (int num1 = 1; num1 <= 10; num1++) {
			sum += num1;
		}
		System.out.println(sum);
		
		
		//100번 돌면서 짝수만 세기
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum2++;
			} else {
				continue;
			}
			
		}
		System.out.println(sum2);
		
		
		//continue. 3의 배수일 때 생략
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				System.out.print(i);
			} else if (i % 3 == 0) {
				continue;
			}
			
		}
		
		
		System.out.println("\n");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				break; // 1,2
			}
			System.out.print(i);
			
		}
		
		
		
		
		
		
		
	}
}
