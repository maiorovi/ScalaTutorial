package golovach.functions.partial_functions.eta_expansion

object Demo2 extends App {
  def m(x:Int):Int = x + 1

  // lambda term in haskell, lambda calculus == functional literal in scala
  val f: Int => Int = m
  val f1: Int => Int = x => m(x)

  // in theory f != f1
  // in practice f == f1
}
