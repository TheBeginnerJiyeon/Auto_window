-- CONNECTION: url=jdbc:oracle:thin:@//localhost:1521/XE


-- New script in ROOT.
-- Connection Type: dev 
-- Url: jdbc:mysql://localhost:3306/
-- workspace : C:\Users\dkswl\OneDrive\Documents\code_upload\Auto_window\multi_it\backend\db\db1
-- Date: 2024. 5. 10.
-- Time: 오전 11:01:11

-- mysql scott 찾기

GRANT ALL PRIVILEGES ON *.* TO 'scott'@%;
-- Public Key Retrieval is not allowed : 커넥션 세팅에서 고칠 것!!


USE scott;

DROP TABLE MEMBER;

CREATE TABLE member(
	NO int AUTO_INCREMENT PRIMARY KEY
	id varchar(10),
	pw varchar(10),
	name varchar(10),
	tel varchar(10),
	CREATE_date timestamp

);


INSERT INTO MEMBER
values(NULL, 'id1', 1, '리사','010',now());

COMMIT;



USE scott;

DROP TABLE MEMBER;
CREATE TABLE member(
	no INT AUTO_INCREMENT PRIMARY KEY,
	id varchar(10),
	pw varchar(10),
	name varchar(10),
	tel varchar(10),
	create_date timestamp

);


INSERT INTO MEMBER
VALUES(NULL,'m01', '1', '리사', '010',NOW());


COMMIT;

SELECT * FROM MEMBER;









