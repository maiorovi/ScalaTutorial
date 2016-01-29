package golovach.functions.partial_functions

object Demo3 extends App {
  val f:PartialFunction[Int,String] = {case 1 => "One"} // domain of this function is {1}
  val g:PartialFunction[Int,String] = {case 2 => "Two"} // domain of this function is {2}
  val h:PartialFunction[Int,String] = {case 3 => "Three"} // domain of this function is {3}


  val y:PartialFunction[Int,String] = f orElse g orElse h // domain of this function is {1,2,3}

  println("f(2)= " + (f applyOrElse (2, (x:Int) => "<undefined>")))
  println("g(1)" +  (g applyOrElse (1, (x:Int) => "<undefined>")))


  println("y(1)= " + y(1))
  println("y(2)= " + y(2))
  println("y(3)= " + y(3))

}
