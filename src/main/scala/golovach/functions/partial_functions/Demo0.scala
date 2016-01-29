package golovach.functions.partial_functions

object Demo0 extends App {
  // lets define partially applied function

  val f: PartialFunction[Int,String] = {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
  }

  println(f(1))
  println(f(2))
  println(f(3))
  println(f(4))
}
