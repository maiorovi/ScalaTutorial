package golovach.operators.associativity.quizes

object Quiz2 extends App {
  B(0) +:+ B(1) :+: B(2)
  println()
  B(0) +:+ B(1) +:+ B(2)
  println()
  B(0) :+: B(1) :+: B(2)
  println()
  B(0) :+: B(1) +:+ B(2)
}

case class B(value: Int) {
  def :+:(that: B): B = {
    print(this.value) // THIS!
    that // THAT!
  }

  def +:+(that: B): B = {
    print(this.value) // THIS!
    that // THAT!
  }
}
