package com.multi.b_classuse;

import com.multi.a_classmake.BrickMold;

public class House {
	public static void main(String[] args) {
		
		
		BrickMold brickMold1 = new BrickMold();
		
		brickMold1.setX(10);
		brickMold1.setY(20);
		System.out.println(brickMold1.getX() + "\t" + brickMold1.getY());
		
		brickMold1.stack();
		
		System.out.println(brickMold1.toString());
		
		
		BrickMold brickMold2 = new BrickMold();
		
		brickMold2.setX(30);
		brickMold2.setY(40);
		System.out.println(brickMold2.getX() + "\t" + brickMold2.getY());
		
		brickMold2.stack();
		
		System.out.println(brickMold2.toString());
		
		
		
		
	}
	
	
}
