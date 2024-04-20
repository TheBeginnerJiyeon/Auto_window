package com.multi.a_array;

public class Exec03 {
	public static void main(String[] args) {
		
		String[] names = new String[2];
		
		names[0] = "jy";
		
		names[1] = "제니";
		
		// for each
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println("개수: " + names.length);
		

		String[] names2;
		names2 = new String[]{"ab","b"};
		
		System.out.println(names2[0].length());
		System.out.println();
		
		//1
		int[] ints=new int[200];
		ints[0]=1000;
		ints[1]=2000;
		ints[2]=3000;
		ints[199]=5000;
		for(int i:ints){
			System.out.print(i);
		}
		
		//2
		double[] dbs=new double[300];
		dbs[0]=10.1;
		dbs[1]=20.2;
		dbs[2]=30.2;
		dbs[299]=50.5;
		for(double d:dbs){
			System.out.print(d);
		}
		System.out.println();
		//3
		String[] places={"한국","프랑스","미국","일본","중국"};
		char[] colors={'p','r','b','s','p'};
		double[] heights={167.5, 187.1,192.0,165,170};
		
		for(String s:places){
			System.out.println(s);
		}
		
		for(char c:colors){
			System.out.println(c);
		}
		
		for(double h:heights){
			System.out.println(h);
		}
		
		
		
		
		
		
		
	}
	
	
}
