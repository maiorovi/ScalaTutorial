package golovach.sets

object Demo0 extends App {
  val set0:Set[Int] = Set(1,2,3,4)
  val set1:Set[Int] = Set(3,2,4)

  //contains
  val res0:Boolean = set0.contains(0)
  val res1:Boolean = set1(2)

  //union
  val res2:Set[Int] = set0.union(set1)
  val res3:Set[Int] = set0 | set1

  //intersect
  val res4:Set[Int] = set0.intersect(set1)
  val resr5:Set[Int] = set0 & set1

  //use elem
  //external form
  for(elem  <- set0) {
    println(elem)
  }

  set0.foreach(println)


}
