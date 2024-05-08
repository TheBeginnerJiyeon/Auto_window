package com.multi.jdbc.b_basic.view;

import com.multi.jdbc.b_basic.model.dao.MemberDAO;

import javax.swing.*;

public class MemberUITest2 {
	
	public static void main(String[] args) { //회원탙퇴 페이지
		
		
		String id = JOptionPane.showInputDialog("아이디 입력");
		
		
		MemberDAO dao = new MemberDAO();
		dao.delete(id);
	
	
	
	
	
	}




}
