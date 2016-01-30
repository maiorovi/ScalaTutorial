package golovach.functions.partial_functions.eta_expansion


// (Int)Int convert to Int => Int
object Demo3 extends App {
  def m(k:Int) = k + 1

  //val f0 = m // missing argument for method m
  val f1:Int => Int = m

  val f2 = m _  // partially applied
  val f3 = m(_) // partially applied
}
