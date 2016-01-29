package golovach.functions.partial_functions.pf_with_collections

object Demo3 extends App {

  //the same will work with collect
  println(List(0,1,2).collect {case 1 => "One"
  case 2 => "Two"
  })

  // it is easy to filter from generic collection instances of specific type using collect
  //filters only String
  println(List(0,"*",2,"Egm") collect { case x:String => x})

  //maps in scala is actually partial functions. so we can code like this

  println(List(0,1,2,"Egor","Maiorov","*") collect Map("Egor" -> 25, "Maiorov" -> 35, "*" -> 5))

}
