package oderskybook.chapter10

abstract class Element {
  def contents : Array[String]
  def height: Int = contents.length
  def widht: Int = if (height == 0) 0 else  contents(0).length
}
