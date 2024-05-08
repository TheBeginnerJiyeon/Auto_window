package com.multi.lambda.practice;

import java.util.Arrays;
import java.util.List;

public class main {
	
	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("John", "Sarah", "Mark", "Emily", "David");

// Filtering and printing names starting with 'M'
		names.stream()
				.filter(name -> name.startsWith("M"))
				.forEach(System.out::println);
		
		
	}
	
}
