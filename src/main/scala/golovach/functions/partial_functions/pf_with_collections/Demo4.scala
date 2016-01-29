package golovach.functions.partial_functions.pf_with_collections

object Demo4 {
  // list in scala is also partial functions. because list transforms index to some value

  // example
  val list:PartialFunction[Int, String] = List("one","two","three")

  // sequences is also partial functions

  val seq:PartialFunction[Int, String] = Seq("q","b","c")
}
