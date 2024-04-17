//4-1

const str = '사과,바나나,당근,김밥,치즈,떡볶이,햄버거,환타,사이다,콜라,고양이,강아지';

function findWord(str, word) {
  let index=str.split(',').indexOf(word).toString()

  if (arguments.length<2 || arguments.length>3){
    return "결과를 확인할 수 없습니다."
  }else if (index == "-1") {
    return `${word}는 배열에 존재하지 않습니다`
  }else{
    return `${word}는 배열 index ${parseInt(index)}번째에 있습니다.`
  }  
}
console.log(findWord(str, '고양이'));     
console.log(findWord(str, '샌드위치'));  
console.log(findWord(str)); 


//4-2

function filterRange(arr, a, b) {
  for(let i=0; i<arr.length; i++) {
    if (arr[i] <a || arr[i] > b) {
      arr.splice(i,1)
    }
  }
}

const arr = [5, 3, 8, 1, 10, 4];

filterRange(arr, 1, 5); 

console.log(arr); 

//4-3
let numbers = [20, 100, 37, 54, 88, 9];
let strings = ['wow', 'js', 'party', 'hello'];

numbers.sort((a,b)=>a-b)
strings.sort().reverse()

console.log(numbers)
console.log(strings)


//4-4


function Student(firstName, lastName, score){
  this.firstName = firstName;
  this.lastName = lastName;
  this.score = score;
}

const studentList = [
  new Student('길동', '홍', 60),
  new Student('보고', '장', 70),
  new Student('관순', '유', 80)
];



function sortFromScore (arr) {	
  arr.sort((a,b)=>b.score-a.score)
}

function makeFullName(arr){

  function add_name(x){
    return x.lastName + x.firstName
  }
  full_names=arr.map(add_name)
  return full_names
}

sortFromScore(studentList);
console.log(studentList);
console.log(makeFullName(studentList));