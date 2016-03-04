package main.scala.golovach._14

object Demo3 {

  //original
  for(k <- List(0,1,2,3); x = k + k)
    yield k + x

  //translated
  List(0,1,2,3).map( k => {val x = k + k; (k,x)}).map(tpl => tpl._1 + tpl._2 )

  //we can rewrite as follows

  List(0,1,2,3).map( k => {val x = k + k; (k,x)}).map({case (k,x) => k + x })

}
