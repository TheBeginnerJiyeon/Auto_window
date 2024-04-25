package com.multi.b_thread;

import java.util.Scanner;

public class Run1 {
	
	public static void main(String[] args) {
		
		CounterThread ct = new CounterThread();
		ct.start();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아무 값이나 입력!!");
		String input = sc.nextLine();
		
		System.out.println("input : " + input);
		
		ct.interrupt();
		
		
		
		
	}
	
	
}
