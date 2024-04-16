/* 멀티캠퍼스 강사 10:12 AM
(base) PS C:\workspace\multi\01_web\05_add\a_basic> node .\01_function.js : 실행할 때는 한칸 띄우고 해당파일명 작성!
hello
(base) PS C:\workspace\multi\01_web\05_add\a_basic> cd ../     :상위 폴더로 올라감       
(base) PS C:\workspace\multi\01_web\05_add> cd ../ 
(base) PS C:\workspace\multi\01_web> cd .\05_add\a_basic\ > cd: 해당폴더로 이동 시 파일 명 쓰고 탭하면 자동 생성함
(base) PS C:\workspace\multi\01_web\05_add\a_basic> */
/*
템플릿 리터럴
ES6부터 도입 된 멀티라인 문자열, 표현식 삽입 등의 편리한 문자열 처리 기능을 제공하는 문자열 표기법이다.
이 때는 작은 따옴표, 큰 따옴표 대신 백틱을 사용해 표현한다.
*/

/* const lastName = '홍';
const firstName = '길동'; */

// 표현식 삽입은 반드시 백틱 내에서 사용해야 한다.
// 일반 문자열에서의 표현식 삽입은 문자열로 취급된다
/* console.log(`제 이름은 ${lastName} ${firstName} 입니다.`); */ /* 백틱을 이용한 스트링 포맷 함수같은 기능!! */

// 함수 선언문

/* function sayHello() { // 이름이 있는 함수 선언
    console.log('hello');
} sayHello(); */
/* 
function hello(name) {
    return `${name}님 안녕하세요?`;
}

//함수호출
console.log(hello('지연'));
 */

// 함수 식별자 구분 예제
// 식별자 hellow2, 이름 hello1 만약 식별자를 작성하지 않으면 내부적으로 식별자를 이름과 같이 만들어서 실행시키고 있던 것
let hello2 = function hello1(name) {
    return `${name}님 안녕하세요~~`;
}

console.log(hello2('홍길동'));