package com.multi.practice.collectionFramework;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		
		Map<String, String> map=new Hashtable<String, String>();
		
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		
		Scanner scanner=new Scanner(System.in);
		
		while (true){
			System.out.println("아이디 비밀번호 입력");
			System.out.print("아ㅣ이디:");
			String id=scanner.nextLine();
			
			System.out.print("비빌먼호:");
			String password=scanner.nextLine();
			
			if(map.containsKey(id)){
				if(map.get(id).equals(password)){
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호 불일치");
				}
			}else {
				System.out.println("아이디 존재 안 함");
			}
		}
		
		
		
		
	}
}
