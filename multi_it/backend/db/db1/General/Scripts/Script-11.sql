-- CONNECTION: url=jdbc:oracle:thin:@//localhost:1521/XE
-- New script in HR.
-- Connection Type: dev 
-- Url: jdbc:oracle:thin:@//localhost:1521/XE
-- workspace : C:\Users\dkswl\OneDrive\Documents\code_upload\Auto_window\multi_it\backend\db\db1
-- Date: 2024. 5. 13.
-- Time: 오후 7:26:01


-- 2. EMPLOYEE_ID70년대 생이면서 성별이 여자이고,
--    성이 Cambrault씨인 직원들의 사원명, 사원번호 , 부서명, 직급명을 조회하시오.
-- ANSI 표준

SELECT * FROM EMPLOYEES;

SELECT
	*
FROM 
	EMPLOYEES 
WHERE 
	FIRST_NAME = 'Cambrault'
	AND 






-- 3. 가장 급여가 적은 직원의 사번, 사원명,
--    SAL, 부서명, 직급명을 조회하시오.
-- ANSI 표준




-- 4. 이름에 'sa'자가 들어가는 직원들의
-- 사번, 사원명, 부서명을 조회하시오.
-- ANSI 표준




-- 5. IT팀에 근무하는 사원명,
--    직급명, 부서코드, 부서명을 조회하시오.
-- ANSI표준



-- 6. COMMISSION_PCT 를 받는 직원들의 사원명,
--    COMMISSION_PCT , 부서명, 근무지역명을 조회하시오.
-- ANSI표준




-- 7. 부서코드가 10인 직원들의 사원명,
--    직급명, 부서명, 근무지역명을 조회하시오.
-- ANSI 표준



-- 8.United States of America(US) Canada(CA)에 근무하는 직원들의
--    사원명, 부서명, 지역명, 국가명을 조회하시오.
-- ANSI 표준



-- 9. 같은 부서에 근무하는 직원들의 사원명, 부서코드,
--     동료이름을 조회하시오.self join 사용
-- ANSI 표준



-- 10. COMMISSION_PCT가 없는 직원들 중에서 직급코드가
--     FI_ACCOUNT와 IT_PROG인 직원들의 사원명, 직급명, 급여를 조회하시오.
--     단, join과 IN 사용할 것
-- ANSI 표준













