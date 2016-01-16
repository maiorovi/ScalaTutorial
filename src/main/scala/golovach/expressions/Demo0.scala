package golovach.expressions

// 'classic' expressions
object Demo0 extends App {
  // literal
  val x = 0
  val x1 = "ABC"

  //operators over literals
  val y = 10 / 5 + 12 / 6 + 5

  //mix of method calls
  val z = List(1,2,3) filter { _ > 0 } map { _ * 2 }

  //new instance construction
  val q = new Integer(5)
}
