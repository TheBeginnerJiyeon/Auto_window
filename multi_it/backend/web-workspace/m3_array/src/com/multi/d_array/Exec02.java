package com.multi.d_array;

import java.util.Arrays;

public class Exec02 {
	public static void main(String[] args) {
		
		int[][] seat = new int[3][5];
		//배열을 선언순간 공간이 할당!
		//seat: 참조형변수(주소)
		System.out.println(Arrays.toString(seat));
		// [[I@b4c966a, [I@2f4d3709, [I@4e50df2e] 각각의 행의 주소값이다
		//   0	1	2	3	4
		//0	 0	0	0	0	0  
		//1	 0	0	0	0	0
		//2	 0	0	0	0	0
		
		// 0,0=1
		// 0,4=1
		
		seat[0][0] = 1;
		seat[0][4] = 1;
		seat[2][4] = 1;
		
		for(int i=0;i<seat.length;i++){
			for(int j=0;j<seat[i].length;j++){
				System.out.print(seat[i][j]+" ");
			}
			System.out.println();
		}
		// 1 0 0 0 1
		// 0 0 0 0 0
		// 0 0 0 0 1
		
		
		
		int[][] seat2 = new int[3][]; // 열 크기는 선언 안해도 된다!!
		//2차원 배열은 1차원 배열을 연결!
		int[] s1 = {1, 2, 3};
		int[] s2 = {1, 2, 3, 4};
		int[] s3 = {1, 2, 3, 4, 5};
		
		seat2[0]=s1;
		seat2[1]=s2;
		seat2[2]=s3;
		
		for(int i=0;i<seat2.length;i++){
			for(int j=0;j<seat2[i].length;j++){
				System.out.print(seat2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
