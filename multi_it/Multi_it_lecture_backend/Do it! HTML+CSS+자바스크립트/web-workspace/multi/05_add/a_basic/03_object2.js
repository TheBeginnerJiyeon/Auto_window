/* 01_Object-constructor-function (Object 생성자 함수)
객체 리터럴에 의한 객체 생성
*/


const student1 = {
    name: '안지연',
    age: 29
};

const student2 = {
    name: '하이',
    age: 30
};


// 생성자에 의한 객체 생성
function Student(name, age) {
    this.name = name; // 네임 프로퍼티
    this.age = age;
    this.getInfo = function () {
        return `${this.name}(은)는 ${this.age}세입니다.`;
    }

};

//객체생성
const student3= new Student('사나',20);
const student4= new Student('로운',25);

//객체 값 출력, 메서드 호출
console.log(student3.getInfo());
console.log(student3.name);



/* 02_instance-creation-process(인스턴스 생성 과정) */
function StudentNew(name, age) {
    // 1. 암묵적으로 인스턴스가 생성되고 this에 바인딩 되는 과정이 런타임 이전에 실행된다.
    console.log(this); // StudentNew {}
    // 2. this에 바인딩 되어 있는 인스턴스를 초기화 한다.
    this.name = name;
    this.age = age;
    this.getInfo = function() {
        return `${this.name}(은)는 ${this.age}세입니다.`;
    }
    // 3. 완성된 인스턴스가 바인딩 된 this가 암묵적으로 반환된다.
    // 만약 명시적으로 객체를 반환하면 암묵적인 this 반환이 무시된다.
    // return {};
    // 하지만 명시적으로 원시 값을 반환하면 원시 값 반환은 무시되고 암묵적으로 this가 반환된다.
    // return 1; >> 이거 무시하고 암묵적으로 this가 반환된다.
    // 생성자 내부에서 return은 생략하는 것이 기본이다. 
}

// 인스턴스 생성
const student = new StudentNew('홍길동', 20);
console.log(student);
// StudentNew {}
// StudentNew { name: '홍길동', age: 20, getInfo: [Function (anonymous)] }

console.log("----------------------------------------------------------------");

// 이 함수가 new 연산자와 함께 호출되지 않았다면 new.target은 undefined이다.
console.log(new.target);
if(!new.target) {
    console.log(`new.target= ${new.target}`);
    // new 연산자와 함께 생성자 함수를 재귀 호출하여 생성 된 인스턴스를 반환한다. [Function: Dog]
    return new Dog(name, age);
    // ReferenceError: Dog is not defined
    // at Object.<anonymous> 03_object2.js:67:5) >> dog 함수를 만들어서 비교해보려면 아래방법으로   

}

function Dog(name, age) {
    // 이 함수가 new 연산자와 함께 호출되지 않았다면 new.target은 undefined이다.
    console.log(new.target);
    if(!new.target) {
        console.log(`new.target= ${new.target}`);
        // new 연산자와 함께 생성자 함수를 재귀 호출하여 생성 된 인스턴스를 반환한다. [Function: Dog]
        return new Dog(name, age);
    }
    this.name = name;
    this.age = age;
}

// 대부분의 빌트인 생성자 함수(Object, String, Number, Boolean, Date, RegExp, ...)는
// new 연산자와 함께 호출 되었는지를 확인한 후 적절한 값을 반환한다.
const obj = Object();   
console.log(obj);   // new 연산자 없이 잘 동작한다. 이 안에 체크하는 것들이 보통 들어와있는 것이어서 오류를 체크한다.

/* 
function Dog(name, age) {
    if (!new.target) {
        // If Dog is called without new, create a new instance with new
        console.log(`new.target= ${new.target}`);
        return new Dog(name, age);
    }
    // Initialize properties
    this.name = name;
    this.age = age;
  }
  
  // Test the Dog constructor without new
  const myDog = Dog('Buddy', 3);
  console.log(myDog); 
  // new.target= undefined
  // Output: Dog { name: 'Buddy', age: 3 }
  
  // Test the Dog constructor with new
  const myDog2 = new Dog('Buddy2', 6);
  console.log(myDog2); 
  //Dog { name: 'Buddy2', age: 6 } */
