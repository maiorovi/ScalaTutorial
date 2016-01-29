package golovach.functions.partial_functions.pf_with_collections

object Demo0 extends App {
  case class Person(name:String, age:Int)

  List(0,1,2).filter { x => x > 0 }

  val list = List(Person("Mike",45), Person("Sara",14))

  list.filter { p => p.age >= 18}
}
