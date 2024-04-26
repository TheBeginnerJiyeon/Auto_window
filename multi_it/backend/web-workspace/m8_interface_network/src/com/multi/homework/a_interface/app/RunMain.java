package com.multi.homework.a_interface.app;

import com.multi.homework.a_interface.controller.SingerController;
import com.multi.homework.a_interface.dto.BeanFactory;

import java.util.ArrayList;

public class RunMain {
	public static void main(String[] args) {
		
		SingerController sc = new SingerController();
		ArrayList<ArrayList> list = sc.inputMember();
		BeanFactory bf = new BeanFactory();
		bf.getBean(list);
		
		
		
		
		
		
	}
}
