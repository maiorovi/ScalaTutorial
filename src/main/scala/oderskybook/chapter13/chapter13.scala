package oderskybook

package object chapter13 {
  def showFruit(fruit:Fruit): Unit = {
    import fruit._
    println(s"${name} ${color}")
  }
}
