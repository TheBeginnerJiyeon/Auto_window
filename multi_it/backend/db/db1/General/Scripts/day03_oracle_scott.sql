-- CONNECTION: url=jdbc:oracle:thin:@//DESKTOP-MD0C8U4:1521/STR



-- New script in SYSTEM.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//DESKTOP-MD0C8U4:1521/STR
-- workspace : C:\Users\dkswl\OneDrive\Documents\code_upload\Auto_window\multi_it\backend\db\db1
-- Date: 2024. 5. 8.
-- Time: 오전 9:34:34

-- DML 기본 연습

SELECT * FROM emp;

-- DISTINCT 중복을 제거해서 SELECT 절에서 딱 한번만 쓸 수 있다

SELECT DISTINCT DEPTNO FROM EMP;


SELECT DISTINCT DEPTNO, JOB FROM EMP;
SELECT DISTINCT COMM, JOB FROM EMP;


SELECT ENAME, SAL *12 AS YEARSAL, SAL*12-(SAL * 0.03*12)  AS REALSAL FROM EMP;


SELECT * 
FROM EMP
ORDER BY SAL DESC;



-- 부서 30,  사번으로 내림차순

SELECT * 
FROM EMP 
WHERE DEPTNO =30
ORDER BY EMPNO DESC;


SELECT *
FROM EMP
WHERE DEPTNO=30 OR JOB='SALESMAN';



/*@ 비교 연산자
-> 표현식 사이의 관계를 비교하기 위해 사용하고, 비교 결과는 논리 결과중에 하나
(TRUE/FALSE/NULL)가 됨
-> 단, 비교하는 두 컬럼 값/표현식은 서로 동일한 데이터 타입이어야 함

	연산자			설명
	=			같다
	>,<			크다/작다
	>=,=<			크거나 같다/작거나 같다
	<>,!=,^=		같지 않다
	BETWEEN AND		특정 범위에 포함되는지 비교
	LIKE / NOT LIKE		문자 패턴 비교
	IS NULL / IS NOT NULL	NULL 여부 비교
	IN / NOT IN		비교 값 목록에 포함/미포함 되는지 여부 비교
	
	* <> 작거나 크다 즉, 같지 않다!*/

SELECT *
FROM EMP
WHERE SAL >=1000
ORDER BY ENAME;

SELECT *
FROM EMP
WHERE SAL !=3000
ORDER BY ENAME;

SELECT *
FROM EMP
WHERE JOB = 'SALESMAN' OR JOB = 'MANAGER';

SELECT * --OR
FROM EMP
WHERE JOB IN ('SALESMAN', 'MANAGER' );

SELECT * 
FROM EMP
WHERE JOB NOT IN ('SALESMAN', 'MANAGER' );



-- BETWEEN AND사용
-- 컬럼명 BETWEEN 하한값 AND 상한값  
-- 하한값 이상 상한값 이하의 값
-- 비교하려는 값이 지정한 범위 (상한값 하한값 의 경계를 포함)

SELECT *
FROM EMP
WHERE SAL NOT BETWEEN 2000 AND 3000;



--LIKE 연산자: 문자 패턴이 일치하는 값을 조회 할때 사용 
--컬럼명 LIKE '문자패턴'
--문자패턴  : '글자%'(글자로 시작하는 값)
--           '%글자%'(글자가 포함된 값)
--           '%글자'(글자로 끝나는 값)


/*'%' 와 '_' 와일드 카드 로 사용할수있다 
와일드 카드 : 아무거나 대체해서 사용할수 있는 것 
_: 한문자
%:모든것
*/


SELECT *
FROM EMP
WHERE ENAME LIKE '%L%';


SELECT *
FROM EMP
WHERE ENAME LIKE 'L%';

SELECT *
FROM EMP
WHERE ENAME LIKE '%L';


SELECT *
FROM EMP
WHERE ENAME LIKE '_L%';


--ESCAPE 
--LIKE '%[문자][실제문자로인식시킬문자]%' ESCAPE '[문자]



Insert into SCOTT.EMP
   (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO)
 Values
   (7001, 'SMIT_SU', 'CLERK', 7902, 
    TO_DATE('12/17/1980 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 800, 20);
   
Insert into SCOTT.EMP
   (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
 Values
   (7002, 'ALLE_SU', 'SALESMAN', 7698, 
    TO_DATE('02/20/1981 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 1600, 300, 30);
   
Insert into SCOTT.EMP
   (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
 Values
   (7003, 'WAR_SU', 'SALESMAN', 7698, 
    TO_DATE('02/22/1981 00:00:00', 'MM/DD/YYYY HH24:MI:SS'), 1250, 500, 30);



COMMIT;


SELECT * 
FROM EMP
WHERE ENAME LIKE '___@_%' ESCAPE '@'
;

SELECT *
FROM EMP
WHERE COMM IS NOT NULL;


INSERT INTO SCOTT.EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES(100, '1', '1', 0, '2022-01-01', 0, 0, 10);

INSERT INTO SCOTT.EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES(300, '1', '1', 0, TO_DATE('2022/01/01', 'YYYY/MM/DD'), 0, 0, 10);

INSERT INTO SCOTT.EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES(400, '1', '1', 0, TO_DATE(SYSDATE), 0, 0, 10); --2024-02-13 00:00:00.000

INSERT INTO SCOTT.EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
VALUES(500, '1', '1', 0, SYSDATE, 0, 0, 10);-- 2024-02-13 14:21:38.000

COMMIT;

SELECT * 
FROM EMP
ORDER BY HIREDATE DESC;

DROP TABLE "MEMBER";

CREATE TABLE MEMBER (
	ID NUMBER PRIMARY KEY,
	PW VARCHAR2(10), 
	NAME VARCHAR2(10),
	TEL VARCHAR2(10),
	CREAT_DATE DATE
	
);














