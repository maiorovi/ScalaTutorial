package golovach.functions.partial_functions


//partial function transformation to just function
object Demo5 extends App {
  val f:PartialFunction[Int,String] = {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
  }


  val g:Function1[Int,String] = f // this is bad approach. because we have got following function Int => String | Exception


  //correct approach
  val y:Int => Option[String] = f.lift

  val f1: Int => String = Function.unlift(y)
}
