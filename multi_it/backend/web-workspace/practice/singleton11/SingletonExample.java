package com.multi.practice.singleton11;

public class SingletonExample {
	public static void main(String[] args) {
		
		/*Singletone obj1= new Singletone();
		Singletone obj2= new Singletone();
		'Singletone()' has private access in 'com.multi.practice.singleton.Singletone'*/
		
		Singletone obj1= Singletone.getInstance();
		Singletone obj2= Singletone.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 Singleton 객체입니다");
		}else {
			System.out.println("다른 Singleton 객체입니다");}
	}
	
}




