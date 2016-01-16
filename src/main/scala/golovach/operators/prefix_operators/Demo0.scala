package golovach.operators.prefix_operators

// scala has only for predefined prefix operators
// prefix operators +, -, ~, !
object Demo0 extends App {
  val x0 = +I(5)
  val x1 = -I(5)
  val x2 = ~I(5)
  val x3 = !I(5)
}

case class I(val k:Int) {
  def unary_+():I = new I(2*k)
  def unary_-():I = new I(3*k)
  def unary_~():I = new I(4*k)
  def unary_!():I = new I(5*k)
}
