//5-1

/* 5-1.  년, 월, 일을 전달하면 해당 날짜의 요일을 '월', '화', '수', '목', '금', '토', '일' 문자열로 반환해주는 함수 getWeekDay를 만든다. */


function getWeekDay(year, month, date) {

  let today = new Date(year, parseInt(month) - 1, date).getDay()
  let day = new Date(year, month, date)
  console.log(day)

  switch (today) {
    case 0:
      return "일"
    case 1:
      return "월"
    case 2:
      return "화"
    case 3:
      return "수"
    case 4:
      return "목"
    case 5:
      return "금"
    case 6:
      return "토"
  }
}

console.log(getWeekDay(2022, 6, 21));       // 2022년 6월 21일
console.log(getWeekDay(2022, 12, 12));      // 2022년 12월 12일 



//5-2

/* xxxxx초나 흘렀습니다. 시간을 소중히 씁시다^^
xxxxx초 밖에 안 남았습니다. 다시는 오지 않는 오늘입니다^^ */




function getSecondsToday() {
  let now = new Date().getTime()
  let std = new Date().setHours(0, 0, 0, 0)
  return Math.floor((now - std) / 1000)
}

function getSecondsToTomorrow() {
  let now = new Date().getTime()
  let std = new Date().setHours(24, 0, 0, 0)
  return Math.floor((std - now) / 1000)
}

console.log(`${getSecondsToday()}초나 흘렀습니다. 시간을 소중히 씁시다^^`);
console.log(`${getSecondsToTomorrow()}초 밖에 안 남았습니다. 다시는 오지 않는 오늘입니다^^`);



// 5-3


const words = [
  '15',
  'AFC',
  'AAFC',
  'AAAFFCC',
  'AAFCC',
  'BAFC',
  'QWEDFGHJMNB',
  'DFAFCB',
  'ABCDEFC',
  'DADC'
];

function check(words) {
  pattern = /^[A-F]?A+F+C+[A-F]?$/
  let regEx = new RegExp(pattern)

  for (let i = 0; i < words.length; i++) {
    if (regEx.test(words[i])) {
      console.log("Good")
    } else {
      console.log("Infected!")
    }
  }
}

check(words)



// 5-4


function removeChar(arr) {
  for (let i = 0; i < arr.length; i++) {
    while (isNaN(arr[i])) {
      if (isNaN(arr[i][0])) {
        arr[i] = arr[i].slice(1)
        console.log(arr)
      }
      if (isNaN(arr[i])) {
        arr[i] = arr[i].slice(0, -1)
        console.log(arr)
      }
    }

    if (arr[i][0] == "+") {
      arr[i] = arr[i].slice(1)
      console.log(arr)
    }
  }
  return arr;
}



let arr1 = ["1080px", "$100", "+200", "60kg", "6m", "-15"];
console.log(removeChar(arr1));



//5-5

/* ## 5-5. 앞으로 읽어도 거꾸로 읽어도 똑같은 문자인지 판별하는 palindrom 함수를 만든다. */

const list = ['기러기', '토마토', '스위스', '인도인', '별똥별', '유재석'];

list.forEach(item => console.log(palindrom(item)));

function palindrom(str) {
  let half = (str.length + 1) / 2

  for (let i = 0; i < half; i++) {
    if (str[i] == str[str.length - 1 - i]) {
    } else {
      return false
    }  
  }
  return true
}

