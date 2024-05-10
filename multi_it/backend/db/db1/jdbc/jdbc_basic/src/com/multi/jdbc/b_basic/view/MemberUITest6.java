package com.multi.jdbc.b_basic.view;

import com.multi.jdbc.b_basic.model.dao.MemberDAO;
import com.multi.jdbc.b_basic.model.dto.MemberDTO;

import java.util.Scanner;

public class MemberUITest6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID / TEL 순으로 입력하세요.");
		
		String id = sc.next();
		
		String tel = sc.next();
		
		MemberDAO memberDAO = new MemberDAO();
		
		MemberDTO memberDTO = new MemberDTO();
		
		memberDTO.setId(Integer.parseInt(id));
		memberDTO.setTel(tel);
		
		memberDAO.update(memberDTO);
		
		// if(rsDto == null) {
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
