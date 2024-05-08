package com.multi.pcGames.app;

import com.multi.pcGames.view.View;

import java.io.IOException;

public class Run {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		View view = new View();
		view.view();
		view.process();
		
		
	}
	
	
}
