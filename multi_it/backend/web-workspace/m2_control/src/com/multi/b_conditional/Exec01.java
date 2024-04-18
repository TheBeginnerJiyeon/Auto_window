package com.multi.b_conditional;

public class Exec01 {
	public static void main(String[] args) {
		int jumsu = 88;
		String result=""; /*변수를 선언할 때 처음부터 초기화를 해주자*/
		
		if (jumsu >= 90) {
			result = "A학점";
		} else if (jumsu >= 85) {
			result = "B+학점";
		} else if (jumsu >= 80) {
			result = "B학점";
		} else {
			result="C학점";
		}
		
		if (jumsu >= 90) {
			result = "A학점";
		} else if (jumsu >= 80) {
			result = "B학점";
		}  else {
			result="C학점";
		}
		
		if (jumsu%10>=5 && jumsu>=80 || jumsu==100) {
			result+="+";
			System.out.println("result = " + result);
			
		}
		
		System.out.println("당신의 점수는 " + result);
		
		
	}
}
