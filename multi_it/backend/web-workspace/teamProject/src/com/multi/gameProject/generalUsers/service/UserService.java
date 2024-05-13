package com.multi.gameProject.generalUsers.service;

import com.multi.gameProject.common.JDBCTemplate;
import com.multi.gameProject.generalUsers.model.userDAO.UserDao;
import com.multi.gameProject.generalUsers.model.userDTO.UserDto;

import javax.swing.*;
import java.sql.Connection;

public class UserService {
	
	private final UserDao userDao;
	private static Connection conn = JDBCTemplate.getConnection();
	
	public UserService() {
		
		// 다오의 메서드를 쓰기위해 사용하는 다오를 미리 선언, 초기화한다.
		userDao = new UserDao();
		
		// 로그인된 상태의 dto를 가지고 다니며 필요할 때 써먹는다
		UserDto loginDto;
		
	}
	
	
	public void insertUser(String userId, String pw, String name, int age, String tel, String email) {
		
		UserDto newUser = new UserDto();
		newUser.setUser_Id(userId);
		newUser.setPw(pw);
		newUser.setName(name);
		newUser.setAge(age);
		newUser.setTel(tel);
		newUser.setEmail(email);
		
		
		
		int result = userDao.insertUser(conn, newUser);
		
		if (result > 0) {
			JOptionPane.showMessageDialog(null, "회원가입 성공!!");
		}else {
			JOptionPane.showMessageDialog(null, "회원가입 실패!! 아이디 중복 또는 아이디, 비번 값 미기입일 수 있으니 확인 바랍니다.");
		}
		
	}
	
	public UserDto userLogin(String userId, String userPw) {
		
		UserDto loginDto = new UserDto();
		
		loginDto = userDao.userLogin(conn, userId, userPw);
		
		if (loginDto != null) {
			// 로그인 성공 시 로그인 정보를 전역으로 선언했으므로 늘 그 정보를 이용할 수 있다.
			// 로그인은 성공하면 afterloginpage로 이동한다.
			JOptionPane.showMessageDialog(null, "로그인 성공!!");
			
		}
		
		
		return loginDto;
		
	}
	
	public void updateUser(String userId, String pw, String name, int age, String tel, String email) {
		
		UserDto updatedUser = new UserDto();
		
		updatedUser.setUser_Id(userId);
		updatedUser.setPw(pw);
		updatedUser.setName(name);
		updatedUser.setAge(age);
		updatedUser.setTel(tel);
		updatedUser.setEmail(email);
		
		int result = userDao.updateUser(conn, updatedUser);
		
		if (result > 0) {
			JOptionPane.showMessageDialog(null, "회원정보 수정 성공!!");
		}else {
			JOptionPane.showMessageDialog(null, "회원정보 수정 실패!!");
		}
		
		
	}
}
