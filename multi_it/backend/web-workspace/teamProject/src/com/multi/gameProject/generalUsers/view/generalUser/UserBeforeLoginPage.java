package com.multi.gameProject.generalUsers.view.generalUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 참고로 메뉴 클릭하면 해당 페이지를 setVisible(true)로 나머지는 setVisible(false)로 바꾸면 마치 페이지 이동처럼 창 전환이 된다고 합니다.
// JTABLE

public class UserBeforeLoginPage {
	private JFrame f;
	private Font font1 = new Font("굴림", Font.BOLD, 50);
	private Font font2 = new Font("굴림", Font.BOLD, 20);
	private JPanel headerP;
	
	private JButton menuBtn1=new JButton("초기화면");
	private JButton menuBtn2=new JButton("회원가입");
	private JButton menuBtn3=new JButton("로그인");
	private JButton menuBtn4=new JButton("제출");
	
	private JPanel midP1=new JPanel();
	private JPanel midP2=new JPanel();
	private JPanel midP3=new JPanel();
	
	private JPanel footerP;
	
	public UserBeforeLoginPage() {
		f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600, 800);
		f.setTitle("코마에 사칙연산 게임");
		
		initHeaderP();
		initMidP1();
		initMidP2();
		initMidP3();
		initFooterP();
		
		f.add(headerP, BorderLayout.PAGE_START);
		f.add(midP1, BorderLayout.CENTER);
		f.add(footerP, BorderLayout.PAGE_END);
		
		menuBtn1.setVisible(false);
		menuBtn2.setVisible(true);
		menuBtn3.setVisible(true);
		menuBtn4.setVisible(false);
		
		midP1.setVisible(true);
		
		
		f.setVisible(true);
	}
	
	private void initHeaderP() {
		headerP = new JPanel(); // 위
		headerP.setBackground(new Color(40, 60, 79));
		headerP.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0)); // 여백(=padding)
		
		menuBtn1.setFont(font2);
		menuBtn2.setFont(font2);
		menuBtn3.setFont(font2);
		
		menuBtn1.setBackground(new Color(63, 228, 192));
		menuBtn2.setBackground(new Color(63, 228, 192));
		menuBtn3.setBackground(new Color(63, 228, 192));
		
		headerP.add(menuBtn1);
		headerP.add(menuBtn2);
		headerP.add(menuBtn3);
		headerP.add(menuBtn4);
		
		// 1. 초기화면 버튼
		menuBtn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				f.add(midP1, BorderLayout.CENTER);
				
				menuBtn1.setVisible(false);
				menuBtn2.setVisible(true);
				menuBtn3.setVisible(true);
				menuBtn4.setVisible(false);
				
				midP1.setVisible(true);
				midP2.setVisible(false);
				midP3.setVisible(false);
				
				f.setVisible(true);
			}
		});
		
		
		// 2: 회원가입 버튼
		menuBtn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				f.add(midP2, BorderLayout.CENTER);
				
				menuBtn1.setVisible(true);
				menuBtn2.setVisible(false);
				menuBtn3.setVisible(true);
				menuBtn4.setVisible(true);
				
				midP1.setVisible(false);
				midP2.setVisible(true);
				midP3.setVisible(false);
				
				
				f.setVisible(true);
				
				
			}
			
			
		});
		
		
		// 3: 로그인 버튼
		menuBtn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				f.add(midP3, BorderLayout.CENTER);
				
				
				menuBtn1.setVisible(true);
				menuBtn2.setVisible(true);
				menuBtn3.setVisible(false);
				menuBtn4.setVisible(false);
				
				midP1.setVisible(false);
				midP2.setVisible(false);
				midP3.setVisible(true);
				
				
				f.setVisible(true);
			}
		});
		
		
	}
	
	private void initMidP1() {

		midP1.setBackground(new Color(40, 60, 79));
		midP1.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0)); // 여백(=padding)
		
		JLabel titleL = new JLabel("코마에 사칙연산 게임");
		titleL.setFont(font1);
		titleL.setForeground(Color.white);
		titleL.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0)); // 여백(=padding)
		midP1.add(titleL);
		
		ImageIcon icon = new ImageIcon("img/img.png");
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		JLabel mainImg = new JLabel(changeIcon);
		midP1.add(mainImg);
		
	}
	
	
	private void initMidP2() {

		midP2.setBackground(new Color(40, 60, 79));
		midP2.setBorder(BorderFactory.createEmptyBorder(50, 10, 0, 10)); // 여백(=padding)
		midP2.setLayout(new GridLayout(6, 2, 10, 10));
		
		
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
		
		midP2.add(idLabel);
		midP2.add(idField);
		midP2.add(pwLabel);
		midP2.add(pwField);
		midP2.add(nameLabel);
		midP2.add(nameField);
		midP2.add(ageLabel);
		midP2.add(ageField);
		midP2.add(telLabel);
		midP2.add(telField);
		midP2.add(emailLabel);
		midP2.add(emailField);
		
		
	}
	
	
	private void initMidP3() {

		midP3.setBackground(new Color(40, 60, 79));
		midP3.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10)); // 여백(=padding)
		midP3.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		JLabel titleL = new JLabel("로그인 화면");
		titleL.setFont(font1);
		titleL.setForeground(Color.BLACK);
		titleL.setOpaque(true);
		GridBagConstraints gbcTitleL = new GridBagConstraints();
		
		gbcTitleL.gridx = 0;
		gbcTitleL.gridy = 0;
		gbcTitleL.anchor = GridBagConstraints.WEST;
		gbcTitleL.insets.set(5, 5, 5, 5);
		gbcTitleL.gridwidth = 2;
		gbcTitleL.fill = GridBagConstraints.HORIZONTAL;
		midP3.add(titleL, gbcTitleL);
		
		
		JLabel idLabel = new JLabel("ID");
		idLabel.setFont(font2);
		idLabel.setOpaque(true);
		GridBagConstraints gbcIdLabel = new GridBagConstraints();
		gbcIdLabel.gridy = 1;
		gbcIdLabel.insets.set(5, 5, 5, 5);
		midP3.add(idLabel, gbcIdLabel);
		
		JTextField idField = new JTextField(20);
		GridBagConstraints gbcIdField = new GridBagConstraints();
		gbcIdField.gridx = 1;
		gbcIdField.insets.set(5, 5, 5, 5);
		midP3.add(idField, gbcIdField);
		
		
		JLabel pwLabel = new JLabel("PW");
		pwLabel.setFont(font2);
		pwLabel.setOpaque(true);
		GridBagConstraints gbcPwLabel = new GridBagConstraints();
		gbcPwLabel.anchor = GridBagConstraints.WEST;
		gbcPwLabel.gridx = 0;
		gbcPwLabel.gridy = 2;
		midP3.add(pwLabel, gbcPwLabel);
		
		JTextField pwField = new JTextField(20);
		GridBagConstraints gbcPwField = new GridBagConstraints();
		gbcPwField.gridx = 1;
		midP3.add(pwField, gbcPwField);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.setFont(font2);
		loginBtn.setBackground(new Color(63, 228, 192));
		GridBagConstraints gbcLoginBtn = new GridBagConstraints();
		gbcLoginBtn.gridx = 0;
		gbcLoginBtn.gridy = 3;
		gbcLoginBtn.gridwidth = 2;
		gbcLoginBtn.fill = gbcLoginBtn.HORIZONTAL;
		gbcLoginBtn.insets.set(5, 5, 5, 5);
		midP3.add(loginBtn, gbcLoginBtn);
		
		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserAfterLoginHomePage home = new UserAfterLoginHomePage();
				
				// 로그인이 문제 없으면
				
				f.dispose();
			}
		});
		
		
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(font2);
		textArea.setRows(10);
		GridBagConstraints gbcTextArea = new GridBagConstraints();
		gbcTextArea.gridx = 0;
		gbcTextArea.gridy = 4;
		gbcTextArea.gridwidth = 2;
		gbcTextArea.insets.set(5, 5, 5, 5);
		gbcTextArea.fill = gbcTextArea.HORIZONTAL;
		midP3.add(textArea, gbcTextArea);
		
		
	}
	
	
	private void initFooterP() {
		footerP = new JPanel(); // 아래
		footerP.setBackground(new Color(40, 60, 79));
		footerP.setBorder(BorderFactory.createEmptyBorder(0, 0, 100, 0)); // 여백(=padding)
		
		menuBtn4.setFont(font2);
		menuBtn4.setBackground(new Color(63,228,192));
		footerP.add(menuBtn4);
		
		
	}
}
