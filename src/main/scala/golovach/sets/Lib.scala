package golovach.sets

object Lib {
  type BigIntSet =  Int => Boolean

  implicit class Wrapper[A](p0:A => Boolean) {
    def |(p1:A => Boolean):A => Boolean = (x:A) => p0(x) | p1(x)
    def &(p1:A => Boolean):A => Boolean = (x:A) => p0(x) & p1(x)
    def ?(x:A):Boolean = p0(x)

  }
}

object Demo extends App {
  import Lib._

  val set0: BigIntSet = _ > 10
  val set1: BigIntSet = _ < 20
  val set2: BigIntSet = _ % 2 == 0

  val finalSet = (set0 & set1) | set2

  finalSet ? 42
  finalSet ? 43
}
