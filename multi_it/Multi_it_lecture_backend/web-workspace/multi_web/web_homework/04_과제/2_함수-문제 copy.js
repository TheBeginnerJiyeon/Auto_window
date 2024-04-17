// 2-1

const num1 = 40;
const num2 = 20;
function min(a, b) {
    if (a <= b){
        return a;
    } else if (a > b) {
        return b;
    }
}
function max(a, b) {
    if (a >= b){
        return a;
    } else if (a < b) {
        return b;
    }
}

min=min(num1,num2);
max=max(num1,num2);
console.log(`최소값 : ${min}`);
console.log(`최대값 : ${max}`);


// 2-2

function pow(x, n){
    if (n >= 1 && n % 1==0) {
        return x**n;
    } else {
        return `${n}은 양의 정수이어야 합니다.`
    }
}

console.log(pow(2,-3));



// 2-3

const num3 = 40;
const num4 = 60;
let min1= (a, b) => (a <= b)? a : b
let max1= (a, b) => (a >= b)? a : b


let min_val=min1(num3,num4);
let max_val=max1(num3,num4);
console.log(`최소값 : ${min_val}`);
console.log(`최대값 : ${max_val}`);