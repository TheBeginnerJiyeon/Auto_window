package com.multi.jdbc.b_basic.view;

import com.multi.jdbc.b_basic.model.dao.MemberDAO;
import com.multi.jdbc.b_basic.model.dto.MemberDTO;

import javax.swing.*;

public class MemberUITest3 {
	
	public static void main(String[] args) { //회원가입 페이지
		
		
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		String name = JOptionPane.showInputDialog("이름 입력");
		String tel = JOptionPane.showInputDialog("전화번호 입력");
		
		
		MemberDAO dao = new MemberDAO();
		
		MemberDTO memberDto = new MemberDTO();
		
		memberDto.setId(Integer.parseInt(id));
		memberDto.setPw(pw);
		memberDto.setName(name);
		memberDto.setTel(tel);
		
		dao.insert(memberDto);
		
		
		
	
	
	
	
	
	}




}
