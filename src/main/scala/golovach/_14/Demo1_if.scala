package main.scala.golovach._14

object Demo1_if extends App {


  for( k <- List(0,1,2,3,4,5); if (k > 0))
    yield k*k



  //this will be mapped to if collection which we iterate has withFilter method
  List(0,1,2,3,4,5).withFilter( _ > 0).map( k => k*k )


  //if there is only filter method in collection it will be used
  List(0,1,2,3,4,5).filter( _ > 0).map( k => k*k )

  //however withFilter is more preferable in general
}
