-- CONNECTION: url=jdbc:oracle:thin:@//DESKTOP-MD0C8U4:1521/STR

-- New script in STR.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//DESKTOP-MD0C8U4:1521/STR
-- workspace : C:\Users\dkswl\OneDrive\Documents\code_upload\Auto_window\multi_it\backend\db\db1
-- Date: 2024. 5. 3.
-- Time: 오후 2:18:54


-- 오라클 계정생성 system 으로 연결후 생성하고 권한주기 
/*create user scott identified by tiger;*/

/*grant connect, resource, dba TO scott;*/

/*사용자 계정.테이블명*/

/*SELECT * FROM HR.EMPLOYEES;

ALTER USER hr IDENTIFIED BY hr;

--계정 수정, 언락
ALTER USER hr ACCOUNT UNLOCK;*/


/*CREATE USER apple
IDENTIFIED BY 1234;*/

/*
SELECT * FROM ALL_USERS;

GRANT CONNECT, resource, dba TO apple;
*/

CREATE USER apple
IDENTIFIED BY 1234;
/*SELECT * FROM ALL_USERS;*/

GRANT CONNECT, resource, dba TO apple;


/*계정삭제 --CASCADE해주어야 계정과 관련된 데이터가 모두 삭제됨.

DROP USER apple;

SELECT * FROM ALL_USERS;*/
















