package com.multi.gameProject.generalUsers.controller;

import com.multi.gameProject.generalUsers.model.userDTO.UserDto;
import com.multi.gameProject.generalUsers.service.UserService;

public class UserController {
	
	private UserService userService = new UserService();
	
	public void insertUser(String userId, String pw, String name, int age, String tel, String email) {
	
	
		userService.insertUser(userId, pw, name, age, tel, email);
		
	
	
	}
	
	public UserDto userLogin(String userId, String userPw) {
		
		UserDto loginDto= userService.userLogin(userId, userPw);
		
		return loginDto;
	}
	// updateUser=UPDATE USERS SET USER_ID=?, PASSWORD = ? ,NAME=?, AGE=?, TEL=?, EMAIL = ? WHERE USER_ID=?
	public void updateUser(String userId, String pw,String name, int age, String tel, String email) {
		
		userService.updateUser(userId, pw, name, age, tel, email);
		
		
		
		
		
	}
}
