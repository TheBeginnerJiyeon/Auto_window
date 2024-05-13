-- CONNECTION: url=jdbc:oracle:thin:@//localhost:1521/XE

-- New script in SYSTEM.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : C:\Users\dkswl\OneDrive\Documents\code_upload\Auto_window\multi_it\backend\db\db1
-- Date: 2024. 5. 13.
-- Time: 오후 1:41:38


create user student identified by student;

grant connect, resource, dba to student;



-- 1. 직원의 이름과 이메일, 이메일 길이를 출력하시오
--		  직원명	    이메일		이메일길이
--	ex) 	홍길동 , hong  	  13



-- 2. 2001 AND 2005년에 고용된  직원명과 입사년도, 보너스 값을 출력하시오 
--	그때 보너스 값이 null인 경우에는 0 이라고 출력 되게 만드시오



-- 3. '515' 핸드폰 번호를 사용하지 않는 사람의 수를 출력하시오(뒤에 단위는 명을 붙이시오)



-- 4. 직원명과 입사년월을 2003년 6월 형태로 출력하시오
--	단, 아래와 같이 출력되도록 만들어 보시오
--	    EMP_NAME		HIRE_YY
--	ex) 리사		       1997년 3월



--5 . 부서코드가 50,90인 직원들 중에서 2004년도에 입사한 직원 조회
-- 120(EMPNO)	Matthew Weiss(ENAME)	50(DEPTID)	2004-07-18(HIRE_DATE)  형식으로 출력 



--6 . 직원명, 입사일, 오늘까지의 근무일수 조회 * 주말도 포함 , 소수점 아래는 버림

	
-- 7. 직원들의 입사일로부터 년도만 가지고 각 년도별 입사 인원수를 구하시오
--  아래의 년도에 입사한 인원수를 조회하시오. 마지막으로 전체직원수도 구하시오

--  => to_char, decode, sum 사용
--
--	-------------------------------------------------------------------------
--	 2001년   2002년   2003년   2004년   2005년   2006년   2007년 2008년 전체직원수
--	-------------------------------------------------------------------------




--8. 부서코드가 50이면 총무부, 60이면 기획부, 90이면 영업부로 처리하시오
--   단, 부서코드가 50, 60, 90 인 직원의 정보만 조회함
--  => case 사용
--   부서코드 기준 오름차순 정렬함.



-------------------------------

[BoardUI 등록 버튼 이벤트 작성]

JButton btnNewButton = new JButton("등록");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String title = t2.getText();
                String content = t3.getText();
                int writer = Integer.parseInt(t4.getText());

                BoardDto boardDto = new BoardDto(title, content, writer);
                BoardDao boardDao = new BoardDao();
                boardDao.insert(boardDto);
            }
        });

-----------------------------------

[BoardDao 등록 메소드 작성]

 public void insert(BoardDto boardDto) {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";
            con = DriverManager.getConnection(url, user, password);
            con.setAutoCommit(false);
            String sql = "insert into BBS values (BBS_ID_SEQ.NEXTVAL, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, boardDto.getTitle());
            ps.setString(2, boardDto.getContent());
            ps.setInt(3, boardDto.getWriter());
            int result = ps.executeUpdate();
            if (result >= 1) {
                con.commit();
            }
            else {
                con.rollback();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            if (con != null) {
                try {
                    con.rollback(); // 예외 발생 시 롤백
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            try {
                ps.close(); // 먼저닫기
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }