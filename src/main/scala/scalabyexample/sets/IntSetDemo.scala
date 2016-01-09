package scalabyexample.sets

object IntSetDemo extends App {
  var set:IntSet = new EmptySet
//  println(set)

  set = set.incl(1)
  set = set.incl(2)
  set = set.incl(5)
  set = set.incl(10)
  set = set.incl(15)

  var set1:IntSet = new EmptySet
//  println(set1)
  set1 = set1.incl(1)
  set1 = set1.incl(4)
  set1 = set1.incl(6)
  set1 = set1.incl(5)
  set1 = set1.incl(11)


  println(set.union(set1))
  println(set.intersect(set1))
}
