package golovach.functions.partial_functions

object Demo2 extends App {

  val f:PartialFunction[Int,String] = {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
  }

  //lets try applyOrElse
  val default = (x:Int) => "<undefined>"

  println("f(4)=" + (f applyOrElse (4, default)))
  println("f(2)=" + (f applyOrElse (2, default)))


  // we will get compilation error if this type is missing PartialFunction[Int,String]
    val default1:PartialFunction[Int,String] = {case x => "<undefined1>"}


  println("f(4)=" + (f orElse( default1))(4))
  println("f(2)=" + (f orElse (default1))(2))

}
