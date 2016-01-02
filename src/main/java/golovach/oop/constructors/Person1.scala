package golovach.oop.constructors

class Person1(_age:Int) {
  var age: Int = _age
}


// The construction shown in class Person1 is so popular that there is
// a shorthand for this construction

class PersonShortHand(val age: Int)

// in this case we get the following
// 1. primary constructor with one parameter age:Int
// 2. field age:Int
// 3. value to field age:Int will be set in primary constructor