package com.multi.b_collection;

import java.util.HashSet;
import java.util.Random;

public class Exec02 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		HashSet lotto=new HashSet();
		
		while (lotto.size()<6) {
			int num= r.nextInt(45)+1;
			if(lotto.contains(num)){
				continue;
			}else{
				lotto.add(r.nextInt(45)+1);
			}
			
			
		}
		System.out.println(lotto);
		
		/*for(int i=0;i<6;i++) {
			int num= (r.nextInt(45)+1);
			System.out.println(num);
			if(lotto.contains(num)){
				i--;
			}else{;
				lotto.add(num);
			}
			
		}
		
		System.out.println(lotto);*/
		
		
		
		
		
	}
}
