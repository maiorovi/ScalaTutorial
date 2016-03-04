package main.scala.golovach.chapter_12

//Tuples are heterogenus containers
// while list a homogenus
object Demo0 extends App {

  val x0 = ("Mike", 43, ("Cat", 21))

  val x1 = Tuple3("Mike", 43, ("Cat", 21))

  val x2 = new Triple("Mike", 43, ("Cat", 21))

  val x3:Triple[String, Int, Tuple2[String, Int]] = new Triple("Mike", 43, ("Cat", 21))

}
