package golovach.oop.fields

/**
  * Created by egor on one/2/16.
  */
object PersonDemo extends App {
    val person:Person0 =  new Person0

  // getter == accessor
  val age = person.age

  // mutator == setter
  person.age = 2

  //parasite mutators
  person.age_$eq(45)
  person.age_=(5)


  //mutators age_= equal to age_$eq construction
}
