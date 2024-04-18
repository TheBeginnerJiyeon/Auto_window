package com.multi.c_loop;

import java.util.Scanner;

public class Exec04 {
	public static void main(String[] args) {
	
		int iu=0;
		int you=0;
		int bts=0;
		
		Scanner sc= new Scanner(System.in);
		
		boolean check=true;
		
		while (check){
			System.out.print("입력 1)아이유 2)유재석 3)방탄 4)종료>> ");
			int choice= sc.nextInt();
			
			switch (choice) {
				case 1:
					iu++;
					break;
				case 2:
					you++;
					break;
				case 3:
					bts++;
					break;
				case 4:
					System.out.println("종료합니다.");
					System.out.println("아이유 득표수>>" + iu + "표");
					System.out.println("유재석 득표수>>" + you+"표");
					System.out.println("방탄 득표수>>"+bts+"표");
					check=false;
					break;
					
				default:
					System.out.println("없는 번호입니다.");
				
				
			}
			
			
			
			
			
		}
		
		
		
		
		
	}
}
