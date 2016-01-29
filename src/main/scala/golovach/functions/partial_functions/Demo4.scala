package golovach.functions.partial_functions

object Demo4 {
  val f:PartialFunction[Int,String] = {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
  }

  f.runWith(println)(1) // it looks like runWith is just composition of the following form f.runWith(println) == println . f

}
