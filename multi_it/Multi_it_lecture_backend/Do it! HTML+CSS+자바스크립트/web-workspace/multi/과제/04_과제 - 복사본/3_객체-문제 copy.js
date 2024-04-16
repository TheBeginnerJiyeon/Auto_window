// 3-1

const calculator = {
  a : 10,
  b : 20,
  sum: function () {return this.a + this.b},
  multi: function () {return this.a * this.b}

};

console.log('합 : ' + calculator.sum())
console.log('곱 : ' + calculator.multi()) 




//3-2

function Calculator(a,b) {
  this.a = a;
  this.b = b;
  this.sum = function () {return this.a + this.b};
  this.multi = function () {return this.a * this.b};
}

const calculator1 = new Calculator(1,4);
const calculator2 = new Calculator(4,6);
console.log('합 : ' + calculator1.sum())
console.log('곱: ' + calculator2.multi()) 