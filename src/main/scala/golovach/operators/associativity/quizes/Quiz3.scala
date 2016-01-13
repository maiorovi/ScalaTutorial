package golovach.operators.associativity.quizes

object Quiz3 extends App {
  C(0) ::: C(1) +++ C(2) ::: C(3)
  println()
  (C(0) ::: C(1)) +++ C(2) ::: C(3)
  println()
  C(0) ::: C(1) +++ (C(2) ::: C(3))
  println()
  (C(0) ::: C(1)) +++ (C(2) ::: C(3))
  println()
  (C(0) ::: C(1) +++ C(2)) ::: C(3)
  println()
  C(0) +++ C(1) ::: C(2) +++ C(3)
  println()
  C(0) +++ (C(1) ::: C(2)) +++ C(3)
  println()
  (C(0) +++ C(1) ::: C(2)) +++ C(3)
  println()
  C(0) +++ (C(1) ::: C(2) +++ C(3))
  println()
  C(0) +++ ((C(1) ::: C(2)) +++ C(3))
}

case class C(value: Int) {
  def :::(that: C): C = {
    print(this.value) // THIS!
    that              // THAT!
  }
  def +++(that: C): C = {
    print(this.value) // THIS!
    that              // THAT!
  }
}