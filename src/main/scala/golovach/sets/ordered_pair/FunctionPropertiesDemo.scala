package golovach.sets.ordered_pair

object FunctionPropertiesDemo extends App {

  // total function
  // + injective
  // -surective
  // -bijective
  def toS: Int => String = k => "" + k

  //not totaly defined => partially defined function
  // + injective
  // + surective
  // - bijective
  def toI: String => Int = s => s.toInt
}
