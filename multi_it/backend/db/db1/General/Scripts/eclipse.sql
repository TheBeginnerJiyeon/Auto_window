-- CONNECTION: url=jdbc:oracle:thin:@//DESKTOP-MD0C8U4:1521/STR


-- New script in STR 2.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//DESKTOP-MD0C8U4:1521/STR
-- workspace : C:\Users\dkswl\OneDrive\Documents\code_upload\Auto_window\multi_it\backend\db\db1
-- Date: 2024. 5. 3.
-- Time: 오후 6:12:28


CREATE TABLE USERS(
	ID VARCHAR(12) PRIMARY KEY,
	PASSWORD VARCHAR2(12) NOT NULL,
	NAME VARCHAR2(30) NOT NULL,
	ROLE VARCHAR2(6) NOT NULL


);

INSERT INTO USERS(ID, PASSWORD, NAME, ROLE) 
VALUES('guest1', 'guest123','방문자','ADMIN1');
INSERT INTO USERS(ID, PASSWORD, NAME, ROLE) 
VALUES('guest2', 'guest123','방문자','ADMIN2');
INSERT INTO USERS(ID, PASSWORD, NAME, ROLE) 
VALUES('guest3', 'guest123','방문자','ADMIN3');
INSERT INTO USERS(ID, PASSWORD, NAME, ROLE) 
VALUES('guest4', 'guest123','방문자','ADMIN4');

SELECT * FROM USERS;

DELETE FROM USERS;

DROP table users cascade;

UPDATE USERS SET NAME='수정', ROLE='USER' WHERE ROLE='ADMIN4';

DELETE USERS WHERE ID='guest4';

INSERT INTO users values('guset2', '123','jy','hi');
INSERT INTO users values('guset3', '123','jy','hi');

SELECT  * FROM users WHERE ROLE='ADMIN2';


