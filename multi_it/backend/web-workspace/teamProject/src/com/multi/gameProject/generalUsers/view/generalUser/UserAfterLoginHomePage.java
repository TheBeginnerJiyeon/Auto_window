package com.multi.gameProject.generalUsers.view.generalUser;

import com.multi.gameProject.generalUsers.controller.UserController;
import com.multi.gameProject.generalUsers.model.userDTO.UserDto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 참고로 메뉴 클릭하면 해당 페이지를 setVisible(true)로 나머지는 setVisible(false)로 바꾸면 마치 페이지 이동처럼 창 전환이 된다고 합니다.
// JTABLE

public class UserAfterLoginHomePage {
	
	private UserController controller = new UserController();
	
	// 생성자를 통해 로그인 정보를 받아서 초기화 할 것임
	private UserDto loginDto;
	
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
	private JButton homeBtn = new JButton("홈으로");
	
	
	private JPanel headerP;
	private JPanel midMyInfoP = new JPanel();
	private JPanel midHomeP = new JPanel();
	private JPanel footerP;
	
	// 유저가 로그인 성공한 후의 화면
	public UserAfterLoginHomePage(UserDto loginDto) {
		
		// 로그인 전 화면에서 받은 로그인디티오를 로그인 후 클래스에서 사용하기위해 저장함
		this.loginDto = loginDto;
		
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
				
				logoutBtn.setVisible(true);
				gameBtn.setVisible(false);
				homeBtn.setVisible(true);
				
				
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
		
		
		midMyInfoP.setBackground(new Color(40, 60, 79));
		midMyInfoP.setBorder(BorderFactory.createEmptyBorder(50, 10, 0, 10)); // 여백(=padding)
		midMyInfoP.setLayout(new GridLayout(9, 2, 10, 10));
		
		JLabel idLabel = new JLabel("ID");
		JTextField idField = new JTextField();
		idField.setText(loginDto.getUser_Id());
		
		JLabel pwLabel = new JLabel("PW");
		JTextField pwField = new JTextField();
		pwField.setText(loginDto.getPw());
		
		JLabel coin_CountLabel = new JLabel("COIN_COUNT");
		JTextField coin_CountField = new JTextField();
		coin_CountField.setText(String.valueOf(loginDto.getCoin_Count()));
		coin_CountField.setFocusable(false);
		coin_CountField.setEnabled(false);
		
		JLabel nameLabel = new JLabel("Name");
		JTextField nameField = new JTextField();
		nameField.setText(loginDto.getName());
		
		JLabel ageLabel = new JLabel("Age");
		JTextField ageField = new JTextField();
		ageField.setText(String.valueOf(loginDto.getAge()));
		
		JLabel telLabel = new JLabel("Tel");
		JTextField telField = new JTextField();
		telField.setText(loginDto.getTel());
		
		JLabel emailLabel = new JLabel("Email");
		JTextField emailField = new JTextField();
		emailField.setText(loginDto.getEmail());
		
		JLabel signUpLabel = new JLabel("가입일");
		JTextField signUpField = new JTextField();
		signUpField.setText(String.valueOf(loginDto.getSingup_Date()));
		signUpField.setFocusable(false);
		signUpField.setEnabled(false);
		
		idLabel.setFont(font2);
		idLabel.setOpaque(true);
		pwLabel.setFont(font2);
		pwLabel.setOpaque(true);
		coin_CountLabel.setFont(font2);
		coin_CountLabel.setOpaque(true);
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
		midMyInfoP.add(coin_CountLabel);
		midMyInfoP.add(coin_CountField);
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
		
		// 내정보에서 수정버튼 누르기
		editBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 텍스트 필드의 값을 받아 컨트롤러의 함수의 인자로 전달함
				String user_Id= idField.getText();
				String Pw = pwField.getText();
				String name = nameField.getText();
				int age = Integer.parseInt(ageField.getText());
				String tel = telField.getText();
				String email = emailField.getText();
				
				controller.updateUser(user_Id, Pw, name, age, tel, email);
				
				// 회원가입에 문제 없으면 콘솔에 문제없다고 표시된다
				
				
				
				JOptionPane.showMessageDialog(null, "회원 정보를 수정했습니다!");
			}
		});
		
		
		//
		deleteBtn.setBorderPainted(false);
		deleteBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 여백(=padding)
		deleteBtn.setFont(font2);
		deleteBtn.setBackground(new Color(63, 228, 192));
		midMyInfoP.add(deleteBtn);
		
		deleteBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean answer = (JOptionPane.showConfirmDialog(null, "게시판을 삭제하시겠습니까?") == JOptionPane.YES_OPTION);
				
				if (answer == true) {
					JOptionPane.showMessageDialog(null, "회원을 탈퇴했습니다!!!");
					
				}
				
			}
		});
		
		
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
		
		
		logoutBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean answer = (JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?") == JOptionPane.YES_OPTION);
				if (answer == true) {
					
					// 로그아웃시 로그인되어있던 정보를 없애기 위해 널로 지정함
					loginDto = null;
					UserBeforeLoginPage login = new UserBeforeLoginPage();
					f.dispose();
				}
				
				
			}
		});
		
		
		gameBtn.setBorderPainted(false);
		gameBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 여백(=padding)
		gameBtn.setFont(font2);
		gameBtn.setBackground(new Color(63, 228, 192));
		footerP.add(gameBtn);
		
		
		gameBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "게임 시작!!");
			}
		});
		
		
		homeBtn.setBorderPainted(false);
		homeBtn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 여백(=padding)
		homeBtn.setFont(font2);
		homeBtn.setBackground(new Color(63, 228, 192));
		footerP.add(homeBtn);
		
		homeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				f.remove(midMyInfoP);
				f.add(midHomeP);
				
				midMyInfoP.setVisible(false);
				midHomeP.setVisible(true);
				
				logoutBtn.setVisible(true);
				gameBtn.setVisible(true);
				homeBtn.setVisible(false);
				
				
				f.setVisible(true);
				
				
			}
		});
		
		
	}
}
