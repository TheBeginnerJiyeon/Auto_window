package com.multi.gameProject.generalUsers.view.generalUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 참고로 메뉴 클릭하면 해당 페이지를 setVisible(true)로 나머지는 setVisible(false)로 바꾸면 마치 페이지 이동처럼 창 전환이 된다고 합니다.
// JTABLE

public class UserAfterLoginHomePage {
	private JFrame f;
	private Font font1 = new Font("굴림", Font.BOLD, 50);
	private Font font2 = new Font("굴림", Font.BOLD, 20);
	
	// 위에 4개 메뉴 버튼
	private JButton myInfoBtn = new JButton("내 정보");
	private JButton shopBtn = new JButton("상점");
	private JButton BoardListBtn = new JButton("게시판");
	private JButton BoardRankingBtn = new JButton("랭킹");
	
	// 내정보에서 버튼 2개
	private JButton editBtn = new JButton("수정");
	private JButton deleteBtn = new JButton("회원탈퇴");
	
	// 밑의 총 7개 버튼. 일부는 화면에 따라 가려진다. 로그아웃 / 글쓰기/ 아이디로 조회/글 수정/홈으로
	private JButton logoutBtn = new JButton("로그아웃");
	private JButton gameBtn = new JButton("게임시작");
	private JButton gameListBtn = new JButton("게임리스트");
	private JButton writeBtn = new JButton("글쓰기");
	private JButton selectByIdBtn = new JButton("아이디로 조회");
	private JButton edit2Btn = new JButton("글 수정");
	private JButton homeBtn= new JButton("홈으로");
	
	
	private JPanel headerP;
	private JPanel midMyInfoP = new JPanel();	
	private JPanel midHomeP = new JPanel();	
	private JPanel footerP;
	
	public UserAfterLoginHomePage() {
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600, 800);
		f.setTitle("코마에 사칙연산 게임");
		
		initHeaderP();
		initMidMyInfo();		
		initHome();
	
		initFooterP();
		
		f.add(headerP, BorderLayout.PAGE_START);
		f.add(midHomeP);
		f.add(footerP, BorderLayout.PAGE_END);
		
		myInfoBtn.setVisible(true);
		shopBtn.setVisible(true);
		BoardListBtn.setVisible(true);
		BoardRankingBtn.setVisible(true);
		
		logoutBtn.setVisible(true);
		gameBtn.setVisible(true);
		homeBtn.setVisible(false);
		
		
		f.setVisible(true);
	}
	
	private void initHeaderP() {
		headerP = new JPanel(); // 위
		headerP.setBackground(new Color(40, 60, 79));
		headerP.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0)); // 여백(=padding)
		
		myInfoBtn.setFont(font2);
		shopBtn.setFont(font2);
		BoardListBtn.setFont(font2);
		BoardRankingBtn.setFont(font2);
		
		myInfoBtn.setBackground(new Color(63, 228, 192));
		shopBtn.setBackground(new Color(63, 228, 192));
		BoardListBtn.setBackground(new Color(63, 228, 192));
		BoardRankingBtn.setBackground(new Color(63, 228, 192));
		
		headerP.add(myInfoBtn);
		headerP.add(shopBtn);
		headerP.add(BoardListBtn);
		headerP.add(BoardRankingBtn);
		
		// 내 정보 버튼
		myInfoBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				f.remove(midHomeP);
				f.add(midMyInfoP);
				
				System.out.println(1);
				
				midMyInfoP.setVisible(true);
			
				midHomeP.setVisible(false);
				
				
				f.setVisible(true);
			}
		});
		
		
	}
	
	// 홈화면
	private void initHome() {
		midHomeP = new JPanel(); // 가운데
		midHomeP.setBackground(new Color(40, 60, 79));
		midHomeP.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0)); // 여백(=padding)
		
		JLabel titleL = new JLabel("코마에 사칙연산 게임");
		titleL.setFont(font1);
		titleL.setForeground(Color.white);
		titleL.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0)); // 여백(=padding)
		midHomeP.add(titleL);
		
		ImageIcon icon = new ImageIcon("img/img.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel mainImg = new JLabel(changeIcon);
		midHomeP.add(mainImg);
		
	}
	
	// 내 정보
	private void initMidMyInfo() {
		
		f.add(midMyInfoP, BorderLayout.CENTER);
		
		logoutBtn.setVisible(true);
		gameBtn.setVisible(false);
		homeBtn.setVisible(true);
		
		
		midMyInfoP.setBackground(new Color(40, 60, 79));
		midMyInfoP.setBorder(BorderFactory.createEmptyBorder(50, 10, 0, 10)); // 여백(=padding)
		midMyInfoP.setLayout(new GridLayout(8, 2, 10, 10));
		
		JLabel idLabel = new JLabel("ID");
		JTextField idField = new JTextField();
		
		JLabel pwLabel = new JLabel("PW");
		JTextField pwField = new JTextField();
		
		JLabel nameLabel = new JLabel("Name");
		JTextField nameField = new JTextField();
		
		JLabel ageLabel = new JLabel("Age");
		JTextField ageField = new JTextField();
		
		JLabel telLabel = new JLabel("Tel");
		JTextField telField = new JTextField();
		
		JLabel emailLabel = new JLabel("Email");
		JTextField emailField = new JTextField();
		
		JLabel signUpLabel = new JLabel("가입일");
		JTextField signUpField = new JTextField();
		
		idLabel.setFont(font2);
		idLabel.setOpaque(true);
		pwLabel.setFont(font2);
		pwLabel.setOpaque(true);
		nameLabel.setFont(font2);
		nameLabel.setOpaque(true);
		ageLabel.setFont(font2);
		ageLabel.setOpaque(true);
		telLabel.setFont(font2);
		telLabel.setOpaque(true);
		emailLabel.setFont(font2);
		emailLabel.setOpaque(true);
		signUpLabel.setFont(font2);
		signUpLabel.setOpaque(true);
		
		
		midMyInfoP.add(idLabel);
		midMyInfoP.add(idField);
		midMyInfoP.add(pwLabel);
		midMyInfoP.add(pwField);
		midMyInfoP.add(nameLabel);
		midMyInfoP.add(nameField);
		midMyInfoP.add(ageLabel);
		midMyInfoP.add(ageField);
		midMyInfoP.add(telLabel);
		midMyInfoP.add(telField);
		midMyInfoP.add(emailLabel);
		midMyInfoP.add(emailField);
		midMyInfoP.add(signUpLabel);
		midMyInfoP.add(signUpField);
		
		editBtn.setBorderPainted(false);
		editBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 여백(=padding)
		editBtn.setFont(font2);
		editBtn.setBackground(new Color(63, 228, 192));
		midMyInfoP.add(editBtn);
		
		//
		deleteBtn.setBorderPainted(false);
		deleteBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 여백(=padding)
		deleteBtn.setFont(font2);
		deleteBtn.setBackground(new Color(63, 228, 192));
		midMyInfoP.add(deleteBtn);
		
		
		
		
		
	}
	
	
	
	
	private void initFooterP() {
		footerP = new JPanel(); // 아래
		footerP.setBackground(new Color(40, 60, 79));
		footerP.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0)); // 여백(=padding)
		
		logoutBtn.setBorderPainted(false);
		logoutBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 여백(=padding)
		logoutBtn.setFont(font2);
		logoutBtn.setBackground(new Color(63, 228, 192));
		footerP.add(logoutBtn);
		
		gameBtn.setBorderPainted(false);
		gameBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 여백(=padding)
		gameBtn.setFont(font2);
		gameBtn.setBackground(new Color(63, 228, 192));
		footerP.add(gameBtn);
		
		
		homeBtn.setBorderPainted(false);
		homeBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 여백(=padding)
		homeBtn.setFont(font2);
		homeBtn.setBackground(new Color(63, 228, 192));
		footerP.add(homeBtn);
		
		
	}
}
