package com.multi.b_conditional;

import java.util.Date;
//챗 지피티
public class SimpleDateFormat {
	public static void main(String[] args) {
		
		// Create a SimpleDateFormat object with the desired date format
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		// Get the current date and time
		Date currentDate = new Date();
		
		// Format the date and time using the SimpleDateFormat object
		String formattedDate = sdf.format(currentDate);
		System.out.println("Formatted Date and Time: " + formattedDate);
		
		
		
		
		
		// Parsing a date string into a Date object
		String dateString = "2024-04-17 12:30:45";
		try {
			Date parsedDate = sdf.parse(dateString);
			System.out.println("Parsed Date: " + parsedDate);
		} catch (Exception e) {
			System.out.println("Error parsing date: " + e.getMessage());
		}
		
		
	}
	
}
