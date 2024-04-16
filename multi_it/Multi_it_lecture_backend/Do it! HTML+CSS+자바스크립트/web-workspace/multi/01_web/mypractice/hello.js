function Dog(name, age) {
  if (!new.target) {
      // If Dog is called without new, create a new instance with new
      console.log(`new.target= ${new.target}`);
      /* return new Dog(name, age); */
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
//Dog { name: 'Buddy2', age: 6 }
