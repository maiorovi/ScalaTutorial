package golovach.oop.fields

object Person1Demo extends App {

  val person = new Person1
  // accessor demo
  var age = person.age

  // mutator demo
  person.age = 5

  //parasite mutator
  person.age_$eq(5)

}
