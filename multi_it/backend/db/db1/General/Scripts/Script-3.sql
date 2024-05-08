-- CONNECTION: url=jdbc:oracle:thin:@//DESKTOP-MD0C8U4:1521/STR

-- New script in SCOTT.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//DESKTOP-MD0C8U4:1521/STR
-- workspace : C:\Users\dkswl\OneDrive\Documents\code_upload\Auto_window\multi_it\backend\db\db1
-- Date: 2024. 5. 9.
-- Time: 오전 1:46:52


CREATE TABLE MEMBER_TEST(
	USER_NO NUMBER(20), 
	USER_ID VARCHAR2(20) CONSTRAINT PK1 PRIMARY KEY,
	PNO NUMBER(13) CONSTRAINT NT1 NOT NULL,
	GENDER VARCHAR(2) CONSTRAINT CHECK( GENDER IN ('남','여')),
	PHONE NUMBER(20),
	ADDRESS VARCHAR2(20),
	STATUS VARCHAR2(2) CONSTRAINT CHECK( STATUS IN ('Y','N')) NOT NULL
);