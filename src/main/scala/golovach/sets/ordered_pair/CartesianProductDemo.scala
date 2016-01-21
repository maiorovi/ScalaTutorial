package golovach.sets.ordered_pair

object CartesianProductDemo extends App {

  //the best solution for my opinion is for-comprehensions
  def cartesianProduct[A,B](set0:Set[A], set1:Set[B]):Set[(A,B)] = for (elem0 <- set0; elem1 <- set1) yield (elem0, elem1)

  //lets try implement more functional solution
  def funcCartesianProduct[A,B](set0:Set[A], set1:Set[B]):Set[(A,B)] = set0.flatMap( elem0 => set1.map( elem1 => (elem0, elem1)))

  val set0 = Set(0,1,2,3)
  val set1 = Set("A","B")

  println(cartesianProduct(set0, set1).mkString(", "))


}
