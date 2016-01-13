package golovach.operators


object Demo2 extends App {
  var map0 = Map("France" -> "Paris")
  map0 += "Japan" -> "Tokyo"

  //explicit syntax
  var map1:Map[String,String] = Map.apply("France" -> "Paris")
  map0.+=(new ArrowAssoc("Japan").->("Tokyo"))
}
