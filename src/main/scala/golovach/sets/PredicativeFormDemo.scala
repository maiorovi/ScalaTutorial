package golovach.sets

object PredicativeFormDemo extends App {

  def contains[A](set: A => Boolean, elem:A) = set(elem)
  def union[A](p1: A => Boolean, p2: A => Boolean ):A => Boolean = (x:A) => p1(x) | p2(x)
  def intersect[A](p1: A => Boolean, p2: A => Boolean):A => Boolean = (x:A) => p1(x) & p2(x)


  //example
  val set0: Int => Boolean = _ > 10
  val set1: Int => Boolean = _ < 20
  val set2: Int => Boolean = _ % 2 == 0

  val set = union(intersect(set0, set1), set2)

  println(set(42))
  println(set(43))

}
