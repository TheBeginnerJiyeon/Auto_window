package com.multi.jdbc.b_basic.view;

import com.multi.jdbc.b_basic.model.dao.MemberDAO;
import com.multi.jdbc.b_basic.model.dto.MemberDTO;

import javax.swing.*;

public class MemberUITest5 {
	
	public static void main(String[] args) { //회원 1명 검색
		
		
		String id = JOptionPane.showInputDialog("아이디 입력");
		String pw = JOptionPane.showInputDialog("패스워드 입력");
		
		MemberDAO dao = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(Integer.parseInt(id));
		memberDTO.setPw(pw);
		
		MemberDTO rsDto = dao.logIn(memberDTO);
		
		System.out.println(rsDto);
		
		// 어떤 경우에 로그인 실패로 출력
		
		if (rsDto == null) {
			System.out.println("로그인 실패입니다.");
		} else {
			// else 로그인 성공
			System.out.println("로그인 성공");
			
		}
		
		
	}
	
	
}
