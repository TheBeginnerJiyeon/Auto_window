package com.multi.practice.exam10;

public class RunExample {
	public static void main(String[] args) {
		
		String data1=null;
		String data2=null;
		
	/*	try{
			data1=args[0];
			data2=args[1];
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e); // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
			return;
		}finally {
			System.out.println("hey"); // hey
		}*/
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		}catch (NumberFormatException e) {
			System.out.println(e);
			// java.lang.NumberFormatException: Cannot parse null string
			//finally
		}finally {
			System.out.println("finally");
		}
		
	}
	
	
}
