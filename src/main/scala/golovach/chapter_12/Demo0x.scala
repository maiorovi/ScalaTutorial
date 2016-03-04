package main.scala.golovach.chapter_12

/**
  * Created by Egor on 26.02.2016.
  */
object Demo0x extends App {

  val x = ("Mike", 45)
  val y = ("Mike", 45)

  println(x.equals(y))
  println(x.hashCode() == y.hashCode())
  println(x.toString())

  println(x eq y)


}
