package com.multi.homework.a_interface.controller;

import java.util.ArrayList;
import java.util.Scanner;

public class SingerController {
	
	private static ArrayList<ArrayList> list = new ArrayList(); //그룹이름, 이름, 성별, 나이
	
	public ArrayList<ArrayList> inputMember() {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("*걸그룹 멤버 생성을 시작합니다*");
			System.out.println();
			
			String gName = "";
			while (true){
				System.out.print("1. 그룹의 이름을 입력하세요. (Ex. TWICE / NEWJEANS) : ");
				gName = sc.nextLine();
				if (gName.toUpperCase().equals("TWICE") || gName.toUpperCase().equals("NEWJEANS")) {
					break;
				}else{
					System.out.println("이름을 맞는 철자의 영어로 입력해주세요.");
					continue;
				}
			}
			
			System.out.println();
			
			System.out.print("2. 멤버의 이름을 입력하세요. : ");
			String name = sc.nextLine();
			System.out.println();
			
			System.out.print("3. 멤버의 성별을 입력하세요. (Ex.여자 / 남자) : ");
			String gender = sc.nextLine();
			System.out.println();
			
			int age=0;
			while (true) {
				System.out.print("4. 멤버의 숫자 나이를 입력하세요. : ");
				String o = sc.nextLine();
				try {
					age = Integer.parseInt(o);
					
				} catch (Exception e) {
					System.out.println();
					System.out.println("숫자를 입력해주세요.");
					System.out.println();
					continue;
				}
				System.out.println();
				break;
			}
			
			
			ArrayList list2 = new ArrayList();
			list2.add(gName);
			list2.add(name);
			list2.add(gender);
			list2.add(age);
			list.add(list2);
			System.out.println("지금까지 입력된 값은 : "+ list);
			
			
			System.out.println("5. 생성기를 종료합니까? (Ex.yes / no) : ");
			String out = sc.nextLine();
			if (out.toLowerCase().equals("yes")) {
				System.out.println();
				return list;
			}
			
		}
		
		
	}
	
	
}
