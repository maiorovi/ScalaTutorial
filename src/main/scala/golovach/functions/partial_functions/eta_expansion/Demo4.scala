package golovach.functions.partial_functions.eta_expansion

// (Int, Int)Int  to (Int, Int) => Int
object Demo4 extends App {
  def m(k:Int, l:Int) = k + l

//  val f = m
  val f1:(Int,Int) => Int = m

  val f2 = m _
  val f3 = m(_, _)
}
