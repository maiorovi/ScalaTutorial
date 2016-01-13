package golovach.operators.associativity.quizes

object Quiz1 extends App {
  (A(0):::A(1)):::(A(2):::A(3))
  println()
  A(0):::(A(1):::A(2):::A(3))
  println()
  A(0):::((A(1):::A(2)):::A(3))
  println()
  (A(0):::(A(1):::A(2))):::A(3)
  println()
  ((A(0) ::: A(1)) ::: A(2)) ::: A(3)
}

case class A(value: Int) {
  def :::(that: A):A = {
    print(this.value)
    that
  }
}
