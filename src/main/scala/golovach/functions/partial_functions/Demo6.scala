package golovach.functions.partial_functions

object Demo6 extends App {

  //how is lifting done
  // here is partial function
  val f:PartialFunction[Int,String] = {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
  }

  //after lifting the same function will become

  val g:Int => Option[String] = {
    case 1 => Some("One")
    case 2 => Some("Two")
    case 3 => Some("Three")
    case _ => None
  }


}
