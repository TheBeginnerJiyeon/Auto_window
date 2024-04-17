// # 1-1

// if

var grade = "손님"
var authority_list=["글 읽기", ", 글 쓰기", ", 글 삭제"]
var authority=""

if (grade == "손님") {
    for(let i=0; i<1; i++) {
        authority+=authority_list[i]
    }
}else if (grade == "일반회원"){
    for(let i=0; i<2; i++) {
        authority+=authority_list[i]
    }
}else if(grade =="운영자"){
    for(let i=0; i<3; i++) {
        authority+=authority_list[i]
    }
}

console.log(grade + "의 경우 " + authority + "가 가능합니다.");


// 삼항문

var grade = "손님"
var authority_list=["글 읽기", "글 쓰기", "글 삭제"];
var authority="";

authority=
    (grade === "손님")?authority_list[0]
    :(grade === "일반회원")?authority_list.slice(0,2).join(",")
    :(grade === "운영자")?authority_list.slice(0,3).join(","):"";

console.log(grade + "의 경우 " + authority + "가 가능합니다.");


//1-2 switch문

var Browser="Opea";
switch(Browser) {
    case "Edge":
        console.log("Edge를 사용하고 계시네요!")
        break;
    case "Chrome","Firefox","Safari","Opera":
        console.log("저희 서비스가 지원하는 브라우저를 사용하고 계시네요.")
        break;  
    default:
        console.log("현재 페이지가 괜찮아 보이길 바랍니다!")
        break;
}

// 1-3. 반복문

let number=0
let i=0
while (i<10) {
    console.log('number' + (i+1));
    i++
}



