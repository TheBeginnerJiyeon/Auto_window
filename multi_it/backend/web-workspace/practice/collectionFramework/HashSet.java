package com.multi.practice.collectionFramework;

import java.util.Set;

public class HashSet {
	public static void main(String[] args) {
		
		Set<Member> set=new java.util.HashSet<Member>();
		
		set.add(new Member("홍길동",30));
		
		set.add(new Member("홍길동",30));
		
		System.out.println(set.size());
		
		
		
		
	}
	
	
	
}
