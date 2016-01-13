package golovach.operators
// methods with only one argument can be called using infix notation (pointless style)
object Demo0 extends App {
  val x0 = I(5).+(I(6))

  val x1 = I(1) + I(2)
}

case class I(k:Int) {
  def +(that:I):I = I(this.k + that.k)
}
