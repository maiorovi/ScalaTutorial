package main.scala.golovach._14

object Demo2_for_for extends App {
  //for-comprehension case
  //original
  for (k <- List(1,2,3,4); p <- List(1,2,3,4))
    yield k*p

  //translated
  List(1,2,3,4).flatMap( k => List(1,2,3,4).map(p => k * p))

  //for-loop
  //original
  for(k <-List(1,2,3,4); p <- List(1,2,3,4) ) {
    println(k+p)
  }

  //translated
  List(1,2,3,4).foreach( k => List(1,2,3,4).foreach(p => k+p))
}
