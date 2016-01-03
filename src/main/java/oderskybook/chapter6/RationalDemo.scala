package oderskybook.chapter6

object RationalDemo extends App {
  val rational = new Rational(5, 3)
  val that = new Rational(6, 3)

  println(rational * that)
  println(rational.lessThan(that))
  println(rational.max(that))
  println(rational * 2)
  println(2 * rational)
}
