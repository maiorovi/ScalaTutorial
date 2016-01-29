package golovach.functions.partial_functions.eta_expansion

// 1. eta expansion: 'method' => 'function'
// 2. explicit vs implicit eta expansion
object Demo1 extends App {

  //explicit
  val f: (Int => Int) = m //target typing use (Int => Int)
  val f1 = m _ // partial application

  f1(5)


  // implicit eta expansion
  set(m)
  val list0 = List(0,1,2,3) filter p map m // (2,3,4)

  def m(x:Int):Int = x + 1
  def p(x:Int):Boolean = x > 0
  def set(f:Int => Int) = ???
}
