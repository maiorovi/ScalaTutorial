package golovach.functions.partial_functions

object Demo1 extends App {

  //lets write un shugared version of partial function
  new PartialFunction[Int,String] {
    override def isDefinedAt(x: Int): Boolean = x match {
      case 1 | 2 | 3 => true
      case _ => false
    }


    override def apply(v1: Int): String = v1 match {
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
    }

  }
}
