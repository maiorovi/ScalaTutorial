package main.scala.golovach._14

object Demo0_foreach extends App {

  // this is for loop not a for-comprehension
  for(k <- List(1,2,3,4)) {
    println(k)
  }

  // this for would be translated to following invocation by the scala compiler

  List(1,2,3,4).foreach(println(_))
  // or without syntactic sugar
  List(1,2,3,4).foreach(x => println(x))

  //this is for comprehension

  for(k <- List(1,2,3,4)) yield k*k

  // this will be translated to

  List(1,2,3,4).map(k => k*k)
  // map can change the contents of collections but not the type of collection


}
