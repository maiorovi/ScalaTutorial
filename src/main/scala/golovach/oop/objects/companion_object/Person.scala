package golovach.oop.objects.companion_object

import investigation.Reflector

class Person(var age: Int, val name:String)

object Person {
  val DefaultAge:Int = 45
  val DefaultName:String = "Mike"

  def apply(name:String, age:Int) = new Person(age, name)
}

object Demo extends App {
  Person.apply("Mike", 45)
  Person("Mike", 45)

  Reflector.reflect(Person.getClass)
}

