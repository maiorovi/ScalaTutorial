package golovach.oop.constructors

import investigation.Reflector

object DemoPerson1 extends App{
  Reflector.reflect(new Person1(50).getClass)
  val person: Person1 = new Person1(40);

  person.age

  person.age = 60
}
